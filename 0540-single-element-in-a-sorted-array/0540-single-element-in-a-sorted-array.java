class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        
        int s=1,e=n-2; //change start and end pointer

        while(s<=e){
            int m=s+(e-s)/2;

            //check for single element
            if(nums[m]!=nums[m-1] && nums[m]!=nums[m+1]){
                return nums[m];
            }

            //if 'm' on left part
            if((m%2==0 && nums[m]==nums[m+1]) || (m%2!=0 && nums[m]==nums[m-1])){
                s=m+1;
            
            }//if 'm' on right part
            else if((m%2==0 && nums[m]==nums[m-1]) || (m%2!=0 && nums[m]==nums[m+1])){
                e=m-1;
            }
        }
        return -1;
    }
}