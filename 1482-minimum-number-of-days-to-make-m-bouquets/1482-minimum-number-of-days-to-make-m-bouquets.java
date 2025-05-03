class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int dmin=Integer.MAX_VALUE;
        int dmax=Integer.MIN_VALUE;

        for(int i: bloomDay){
            dmin = Math.min(i,dmin);
            dmax = Math.max(i,dmax);
        }

        int s=dmin,e=dmax;
        int ans=-1;
        while(s<=e){
            int mid = s + (e-s)/2; //d

            int b=0;
            int cnt=0;
            for(int i: bloomDay){
                if(i<=mid){
                    cnt++;
                }
                else{
                    cnt=0;
                }

                if(cnt==k){
                    b++;
                    cnt=0;
                }
            }
            if(b>=m){
                ans = mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}