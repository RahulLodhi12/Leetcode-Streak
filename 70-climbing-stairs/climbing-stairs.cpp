class Solution {
public:
    int dp[46];
    int climbStairs(int n) {
        memset(dp,-1,sizeof(dp));
        return solve(n);
    }
    int solve(int n){
        //base case
        if(n<0) return 0;
        if(n==0) return 1;

        //provide
        if(dp[n]!=-1) return dp[n];

        return dp[n] = solve(n-1)+solve(n-2);
    }
};