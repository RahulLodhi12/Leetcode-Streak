class Solution {
public:
    int dp[1001][1001];
    int lengthOfLongestSubsequence(vector<int>& nums, int target) {
        int n=nums.size();
        memset(dp,-1,sizeof(dp));
        int res = solve(n,nums,target);
        if(res<=0) return -1;
        return res;
    }
    int solve(int n, vector<int>& nums, int target){
        //base case
        if(n==0){
            if(target==0) return 0;
            return INT_MIN;
        }

        //provide
        if(dp[n][target]!=-1) return dp[n][target]; 

        int take=INT_MIN,skip=INT_MIN; //if output is maximum, then take & skip should be minimum
        if(nums[n-1]<=target){
            take = 1 + solve(n-1,nums,target-nums[n-1]);
            skip = solve(n-1,nums,target);
        }
        else{
            skip = solve(n-1,nums,target);
        }

        return dp[n][target] = max(take,skip);
    }
};