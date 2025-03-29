class Solution {
    public int[] twoSum(int[] nums, int x) {
        int n=nums.length;
        int s=0,e=n-1;

        while(s<e){
            int sum=nums[s]+nums[e];
            if(sum>x) e--;
            else if(sum<x) s++;
            else return new int[]{s+1,e+1};
        }

        return new int[]{-1,-1};
    }
}