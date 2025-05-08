class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;

        for(int i: nums){
            sum+=i;
        }

        int cnt=0;
        while(sum%k!=0){
            sum--;
            cnt++;
        }

        return cnt;
    }
}