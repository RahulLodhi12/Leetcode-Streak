class Solution {
    public boolean isPrime(int n){
        if(n==1) return false;
        if(n==2) return true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        int n=nums.length;

        Arrays.sort(nums);

        int cnt=1;

        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                cnt++;
            }
            else if(cnt!=1){
                if(isPrime(cnt)) return true;
            }
        }

        if(isPrime(cnt)) return true;

        return false;
    }
}