class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        int s=0,e=n-1;

        //Note: Select any sorted part(left or right), pick the min. and eliminate it.

        while(s<=e){
            int m = s+(e-s)/2;

            //check is search space array is not rotated, but sorted
            if(nums[s]<=nums[e]){
                ans=Math.min(ans,nums[s]);
                return ans;
            }

            if(nums[s]<=nums[m]){//left is sorted
                ans=Math.min(ans,nums[s]);
                s=m+1;
            }
            else{//right is sorted
                ans=Math.min(ans,nums[m]);
                e=m-1;
            }
        }

        return ans;
    }
}