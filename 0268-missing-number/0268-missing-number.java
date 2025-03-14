class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int x=0;
        int j=0;
        for(int i: nums){
            x^=i^j;
            j++;
        }
        x^=n;
        return x;
    }
}