class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int j=0;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        while(j<n){
            sum+=nums[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(sum>maxi){
                    maxi=sum;
                }
                sum-=nums[i];
                i++;
                j++;
            }
        }
        return (double)maxi/k;
    }
}