class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] freq = new int[n+1];

        for(int i=0;i<n;i++){
            freq[nums[i]]++;
            if(freq[nums[i]] >= 2){
                return nums[i];
            }
        }

        return -1;
    }
}