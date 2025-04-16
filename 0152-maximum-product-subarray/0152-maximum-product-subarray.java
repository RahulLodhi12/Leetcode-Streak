class Solution {
    public int maxProduct(int[] nums) {
        //Observations
        //1. All +ve
        //2. even number -ve
        //3. odd number -ve ->(prefix-suffix divide, means eliminate 1 -ve number)
        //4. if zero number

        int pre=1;
        int suf=1;
        int n = nums.length;
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(pre==0){
                pre=1;
            }

            pre*=nums[i];

            ans=Math.max(ans,pre);
        }

        for(int i=n-1;i>=0;i--){
            if(suf==0){
                suf=1;
            }

            suf*=nums[i];

            ans=Math.max(ans,suf);
        }

        return ans;
    }
}