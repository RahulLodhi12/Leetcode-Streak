class Solution {
    public static void solve(int[] arr, List<Integer> temp, int idx, int n, Set<List<Integer>> ans){
        //base case
        if(idx==n){
            ans.add(new ArrayList<>(temp));
            return;
        }

        //take
        temp.add(arr[idx]);
        solve(arr,temp,idx+1,n,ans);

        //skip
        temp.remove(temp.size()-1);
        solve(arr,temp,idx+1,n,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        List<Integer> temp = new ArrayList<>();
        Set<List<Integer>> ans = new HashSet<>();

        solve(nums,temp,0,n,ans);
        
        return new ArrayList<>(ans);
    }
}