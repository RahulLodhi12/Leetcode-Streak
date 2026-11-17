class Solution {
public:
    int findTargetSumWays(vector<int>& nums, int target) {
        //Same Logic as Count Subset with given difference(GfG)
        int n=nums.size();
        int total=0;
        for(int i: nums){
            total+=i;
        }
        if(target-total>0 or (total+target)<0) return 0;
        cout<<total<<" ";
        if((total+target)%2==1) return 0;
        int k = (total+target)/2; //count subset with given sum(k)
        if(k<0) return 0;
        return solve(n,nums,k);
    }
    int solve(int n, vector<int>& nums, int k){
        //base case
        if(k==0 and n==0){
            return 1;
        }
        if(n==0){
            return 0;
        }

        if(nums[n-1]<=k){
            return solve(n-1,nums,k-nums[n-1]) + solve(n-1,nums,k);
        }
        return solve(n-1,nums,k);
    }
};