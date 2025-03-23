class Solution {
    public double minimumAverage(int[] nums) {
        double mini= Double.MAX_VALUE;
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            double avg = (double)(nums[i]+nums[j])/2;
            mini = Math.min(mini,avg);
            i++;
            j--;
        }
        return mini;
    }
}