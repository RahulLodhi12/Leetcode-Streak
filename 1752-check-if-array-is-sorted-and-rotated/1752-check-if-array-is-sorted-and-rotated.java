class Solution {
    public boolean check(int[] nums) {
        int p=0; //breaking point
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i%n] > nums[(i+1)%n]){ //% for first and last element, i.e cyclic
                p++;
                if(p>1) return false;
            }
        }
        return true;
    }
}