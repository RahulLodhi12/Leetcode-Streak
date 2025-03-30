class Solution {
    public boolean search(int[] nums, int x) {
        int n=nums.length;
        int s=0,e=n-1;

        while (s<=e){
            int m = s + (e-s)/2;

            //check if x at 'm', must be 1st statement
            if(nums[m]==x){
                return true;
            }

            //check if 's','m','e' points to same elements
            if(nums[s]==nums[m] && nums[m]==nums[e]){
                s++;
                e--;
                continue;
            }

            if(nums[s]<=nums[m]){ //left is sorted
                if(x>=nums[s] && x<=nums[m]){ //x present b/w 's' and 'm'
                    e=m-1;
                }
                else{
                    s=m+1;
                }
            }
            else{ //right is sorted
                if(x>=nums[m] && x<=nums[e]){ //x present b/w 's' and 'm'
                    s=m+1;
                }
                else{
                    e=m-1;
                }
            }
        }

        return false;
    }
}