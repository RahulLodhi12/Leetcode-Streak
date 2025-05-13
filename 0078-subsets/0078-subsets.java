class Solution {
    public void solve(int[] nums, int idx, int n, List<Integer> temp, List<List<Integer>> ans){
        //base case
        if(idx==n){
            ans.add(new ArrayList<>(temp));
            return;
        }

        //take
        temp.add(nums[idx]);
        solve(nums,idx+1,n,temp,ans);

        //skip
        temp.remove(temp.size()-1);
        solve(nums,idx+1,n,temp,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        solve(nums,0,n,temp,ans);

        return ans;
    }
}