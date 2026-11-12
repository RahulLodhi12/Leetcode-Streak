class Solution {
public:
    int dp[201][20001];
    bool canPartition(vector<int>& nums) {
        int n=nums.size();
        int sum=0;
        for(int i: nums){
            sum+=i;
        }
        //odd-case
        if(sum%2==1) return false; //for all cases.

        //even-case
        sum=sum/2;
        memset(dp,-1,sizeof(dp));
        //Same Logic as 'Subset Sum Problem' - GfG problem hai yeh
        return solve(n,nums,sum);
    }
    bool solve(int n, vector<int> nums, int sum){
        //base
        if(n<=0 or sum<0) return false;
        if(n==0 and sum>0) return false;
        if(sum==0) return true;

        //provide
        if(dp[n][sum]!=-1) return dp[n][sum];

        //take or skip - both choices
        if(nums[n-1]<=sum) //to avoid TLE
            return dp[n][sum] = solve(n-1,nums,sum-nums[n-1]) or solve(n-1,nums,sum);
        //only skip
        return dp[n][sum] = solve(n-1,nums,sum);
    }
};
