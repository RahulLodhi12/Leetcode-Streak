class Solution {
public:
    int dp[1001][1001];
    //SAME Logic as LCS Pattern (Longest Common Subsequence)
    int minimumDeleteSum(string s1, string s2) {
        int n=s1.length();
        int m=s2.length();
        int total=0;
        for(char ch: s1){
            total+=ch;
        }
        for(char ch: s2){
            total+=ch;
        }
        memset(dp,-1,sizeof(dp));
        return total-2*solve(s1,s2,n,m);
    }
    int solve(string& s1, string& s2, int n, int m){
        //base case
        if(n==0 || m==0) return 0;

        //provide
        if(dp[n][m]!=-1) return dp[n][m];

        if(s1[n-1]==s2[m-1]){
            return dp[n][m] = s1[n-1] + solve(s1,s2,n-1,m-1);
        }

        int op1 = solve(s1,s2,n,m-1);
        int op2 = solve(s1,s2,n-1,m);

        return dp[n][m] = max(op1,op2);
    }
};