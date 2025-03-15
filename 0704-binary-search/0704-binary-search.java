class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int st=0;
        int ed=n-1;

        while(st<=ed){
            int mid = st + (ed-st)/2;
            if(nums[mid]>target){
                ed=mid-1;
            }
            else if(nums[mid]<target){
                st=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}