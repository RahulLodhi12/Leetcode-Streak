class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum=0;

        for(int it: nums){
            sum+=it;
        }
        
        int l=0,r=0;
        for(int i=0;i<n;i++){
            r = sum - nums[i] - l;
            if(l==r) return i;

            l += nums[i];
        }

        return -1;
    }
}