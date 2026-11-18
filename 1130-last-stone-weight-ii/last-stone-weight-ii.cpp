class Solution {
public:
    //Same Logic: Minimum Sum Partition Difference
    int dp[31][3001];
    int lastStoneWeightII(vector<int>& stones) {
        int n=stones.size();
        int total=0;
        for(int i: stones){
            total+=i;
        }
        memset(dp,-1,sizeof(dp));
        return solve(n,stones,0,total);
    }
    int solve(int n, vector<int>& stones, int sum, int total){
        //base case
        if(n==0){
            //s2: total-2*s1
            return abs(total-2*sum);
        }

        //provide
        if(dp[n][sum]!=-1) return dp[n][sum];

        int take = solve(n-1,stones,sum+stones[n-1],total); //s1
        int skip = solve(n-1,stones,sum,total);

        return dp[n][sum] = min(take,skip);
    }
};