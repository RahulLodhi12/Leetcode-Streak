class Solution {
    public int findFirst(int[] nums, int x){
        int n=nums.length;

        int s=0,e=n-1;
        int idx=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]>x){
                e=m-1;
            }
            else if(nums[m]<x){
                s=m+1;
            }
            else{
                idx=m;
                e=m-1;
            }
        }
        return idx;
    }
    public int findLast(int[] nums, int x){
        int n=nums.length;

        int s=0,e=n-1;
        int idx=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]>x){
                e=m-1;
            }
            else if(nums[m]<x){
                s=m+1;
            }
            else{
                idx=m;
                s=m+1;
            }
        }
        return idx;
    }
    public int[] searchRange(int[] nums, int x) {
        int first = findFirst(nums,x);

        int last = findLast(nums,x);

        return new int[]{first,last};
    }
}