class Solution {
    public int solve(int n){
        //base case
        if(n==0 || n==1) return n;

        return solve(n-1) + solve(n-2);
    }
    public int fib(int n) {
        return solve(n);
    }
}