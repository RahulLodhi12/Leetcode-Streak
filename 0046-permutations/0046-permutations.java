class Solution {
    public void solve(int idx, int n, int[] nums, int[] freq, List<Integer> temp, List<List<Integer>> ans){
        //base case
        if(temp.size()==n){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int k=0;k<n;k++){
            if(freq[k]==0){
                temp.add(nums[k]); //push
                freq[k]=1; //mark
                solve(k+1,n,nums,freq,temp,ans);
                temp.remove(temp.size()-1);
                freq[k]=0; //un-mark
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;

        int[] freq = new int[n];

        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        solve(0,n,nums,freq,temp,ans);

        return ans;
    }
}