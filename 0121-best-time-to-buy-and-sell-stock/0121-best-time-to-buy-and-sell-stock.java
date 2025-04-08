class Solution {
    public int maxProfit(int[] prices) {
        //keeping minimum on left side of array.
        int maxi=0;
        int mini = Integer.MAX_VALUE;

        for(int i: prices){
            mini = Math.min(mini,i);
            int pro = i-mini;
            maxi = Math.max(maxi,pro);
        }
        return maxi;
    }
}