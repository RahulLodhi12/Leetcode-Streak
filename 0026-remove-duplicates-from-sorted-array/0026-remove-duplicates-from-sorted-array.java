class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        //two pointers: swap items if [i] and [j] are different.
        int i=0;
        for(int j=1;j<n;j++){
            if(nums[i]!=nums[j]){
                i++;
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            }
        }
        return i+1;
    }
}