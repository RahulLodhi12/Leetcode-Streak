class Solution {
    public void moveZeroes(int[] nums) {
        //two pointer: [i] for zero and [j] for non-zero
        int i=0;
        for(int p=0;p<nums.length;p++){
            if(nums[p]==0){
                i=p;
                break;
            }
        }

        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==0 && nums[j]!=0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
            }
        }
    }
}