class Solution {
    public double myPow(double x, int n) {
        double ans=1;

        long p=n;
        long orgPow=n;
        if(orgPow<0){
            p=-p;
        }

        while(p>0){ //reducing power
            if(p%2==0){ //even
                x=x*x;
                p=p/2;
            }
            else{ //odd
                ans=ans*x;
                p--;
            }
        }

        if(orgPow<0) return 1/ans;

        return ans;
    }
}