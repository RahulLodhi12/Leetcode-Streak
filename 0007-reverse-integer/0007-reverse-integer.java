class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            int d=x%10;
            rev=rev*10+d;
            if(rev<(long)Math.pow(-2,31) || rev>(long)Math.pow(2,31)-1) return 0;
            x=x/10;
        }
        return (int)rev;
    }
}