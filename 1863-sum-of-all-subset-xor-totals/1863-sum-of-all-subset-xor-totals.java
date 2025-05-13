class Solution {
    public int solve(int[] nums, int idx, int xor, int n){
        //base case
        if(idx==n){
            return xor;
        }

        //take
        int take = solve(nums,idx+1,xor^nums[idx],n);

        //skip
        int skip = solve(nums,idx+1,xor,n);

        return take + skip; //return the sum of xor's of all subsets
    }
    public int subsetXORSum(int[] nums) {
        int n=nums.length;

        return solve(nums,0,0,n);
    }
}