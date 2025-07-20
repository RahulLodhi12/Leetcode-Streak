class Solution {
    public boolean checkDivisibility(int n) {
        int s1=0;
        int s2=1;
        int num=n;
        while(n>0){
            int d = n%10;
            s1+=d;
            s2*=d;
            n=n/10;
        }

        int sum = s1+s2;

        return num%sum==0;
    }
}