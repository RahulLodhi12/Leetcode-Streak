class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi = Integer.MIN_VALUE;

        for(int i: piles){
            maxi = Math.max(i,maxi);
        }

        int s=1,e=maxi;
        int ans=-1;
        while(s<=e){
            int m = s + (e-s)/2; //k
            int total=0; //total hours
            for(int i: piles){
                total += Math.ceil((double)i/m);
            }

            if(total<=h){
                ans = m;
                e=m-1;
            }
            else{
                s=m+1;
            }
        }

        return ans;
    }
}