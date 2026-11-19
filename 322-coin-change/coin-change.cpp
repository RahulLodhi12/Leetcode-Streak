class Solution {
public:
    int dp[13][10001];
    int coinChange(vector<int>& coins, int amount) {
        int n=coins.size();
        memset(dp,-1,sizeof(dp));
        int res = solve(n,coins,amount);
        return res ==10001 ? -1: res;
    }
    int solve(int n, vector<int>& coins, int amount){
        //base case
        if(amount==0){
            return 0;
        }
        if(n==0){
            return 10001;
        }

        //provide
        if(dp[n][amount]!=-1) return dp[n][amount];

        int take=INT_MAX;
        int skip=INT_MAX;
        if(coins[n-1]<=amount){
            take = 1 + solve(n,coins,amount-coins[n-1]);
        }
        skip = solve(n-1,coins,amount);

        return dp[n][amount] = min(take,skip);
    }
};