class Solution {
public:
    int dp[101][10001];
    int numSquares(int n) {
        memset(dp,-1,sizeof(dp));
        return solve(1,n);
    }
    int solve(int k, int n){
        //base case
        if(n==0) return 0;
        if(k*k>n) return 10001; //no possible ans.

        //provide
        if(dp[k][n]!=-1) return dp[k][n];

        int take=0,skip=0;
        if((long)k*k<=n){
            take = 1 + solve(k,n-k*k);
        }
        skip = solve(k+1,n);

        return dp[k][n] = min(take,skip);
    }
};