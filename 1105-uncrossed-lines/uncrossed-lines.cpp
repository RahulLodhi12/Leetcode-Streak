class Solution {
public:
    int dp[501][501];
    //SAME LOGIC of LCS Pattern (Longest Common Subsequence)
    int maxUncrossedLines(vector<int>& nums1, vector<int>& nums2) {
        int n=nums1.size();
        int m=nums2.size();
        memset(dp,-1,sizeof(dp));
        return solve(nums1,nums2,n,m);
    }
    int solve(vector<int>& nums1, vector<int>& nums2, int n, int m){
        //base case
        if(n==0 || m==0) return 0;

        //provide
        if(dp[n][m]!=-1) return dp[n][m];

        if(nums1[n-1]==nums2[m-1]){
            return dp[n][m] = 1 + solve(nums1,nums2,n-1,m-1);
        }

        int op1 = solve(nums1,nums2,n,m-1);
        int op2 = solve(nums1,nums2,n-1,m);

        return dp[n][m] = max(op1,op2);
    }
};