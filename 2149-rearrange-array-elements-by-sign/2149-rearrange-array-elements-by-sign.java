class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        //two pointer: [posIdx] for '+ve' numbers and [negIdx] for '-ve' numbers 
        int posIdx=0;
        int negIdx=1;
        int i=0;
        while(i<n){
            if(nums[i]>0){
                ans[posIdx]=nums[i];
                posIdx+=2;
            }
            else{
                ans[negIdx]=nums[i];
                negIdx+=2;
            }
            i++;
        }
        return ans;
    }
}