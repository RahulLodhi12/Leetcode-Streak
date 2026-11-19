class Solution {
public:
    int dp[301][5001];
    int change(int amount, vector<int>& coins) {
        int n=coins.size();
        memset(dp,-1,sizeof(dp));
        return solve(n,coins,amount);
    }
    int solve(int n, vector<int>& coins, int amount){
        //base case
        if(amount==0){
            return 1;
        }
        if(n==0) return 0;

        //provide
        if(dp[n][amount]!=-1) return dp[n][amount];

        int take=0,skip=0;
        if(coins[n-1]<=amount){
            take = solve(n,coins,amount-coins[n-1]);
        }
        skip = solve(n-1,coins,amount);

        return dp[n][amount] = (take+skip);
    }
};