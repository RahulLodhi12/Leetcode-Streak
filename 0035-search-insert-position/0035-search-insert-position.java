class Solution {
    public int searchInsert(int[] nums, int x) {
        int n=nums.length;
        int s=0,e=n-1;
        int idx=-1;

        while(s<=e){
            int m = s + (e-s)/2;
            if(nums[m] > x){
                e=m-1;
            }
            else if(nums[m] < x){
                s=m+1;
            }
            else{
                return m;
            }
        }

        return s;

    }
}