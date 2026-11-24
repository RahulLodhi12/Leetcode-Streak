class Solution {
public:
    int longestCommonSubsequence(string s1, string s2) {
        int n=s1.length();
        int m=s2.length();
        vector<vector<int>> dp;
        dp.assign(n+1,vector<int>(m+1,-1));
        return solve(s1,s2,n,m,dp);
    }
    int solve(string& s1, string& s2, int n, int m, vector<vector<int>>& dp){
        //base case
        if(n==0) return 0;
        if(m==0) return 0;

        //provide
        if(dp[n][m]!=-1) return dp[n][m];

        if(s1[n-1]==s2[m-1]){
            return dp[n][m] = 1 + solve(s1,s2,n-1,m-1,dp);
        }

        int op1 = solve(s1,s2,n,m-1,dp);
        int op2 = solve(s1,s2,n-1,m,dp);

        return dp[n][m] = max(op1,op2);
    }
};