class Solution {
public:
    long long maximumSubarraySum(vector<int>& nums, int k) {
        int n=nums.size();
        unordered_map<int,int> mpp;
        int i=0;
        int j=0;
        long long sum=0;
        long long maxi=0;
        while(j<n){
            mpp[nums[j]]++;
            sum+=nums[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(mpp.size()==k){
                    maxi=max(maxi,sum);
                }    
                sum-=nums[i];
                mpp[nums[i]]--;
                if(mpp[nums[i]]==0){
                    mpp.erase(nums[i]);
                }
                i++;
                j++;
            }
        }
        return maxi;
    }
};