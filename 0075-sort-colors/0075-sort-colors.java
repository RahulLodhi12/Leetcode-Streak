class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0;
        int mid=0; //moving pointer
        int high=n-1;

        while(mid<=high){
            if(nums[mid]==0){
                int t=nums[mid];
                nums[mid]=nums[low];
                nums[low]=t;
                mid++; 
                low++; //both 'low' and 'mid' starting from idx 0 (same idx)
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                int t=nums[mid];
                nums[mid]=nums[high];
                nums[high]=t;
              //mid++; //if both 'high' and 'mid' starting from same idx i.e 'n-1'
                high--; 
            }
        }
    }
}