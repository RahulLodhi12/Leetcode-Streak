class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane's Algorithm - Maximum Subarray Sum
        //Intuition: If sum<0, then sum=0
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i: nums){
            sum+=i;
            maxSum = Math.max(maxSum,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}