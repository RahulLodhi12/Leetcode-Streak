class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int n=nums.size();
        int i=0,j=0,sum=0,res=0;
        map<int,int> mpp;
        mpp[0]=1;
        while(j<n){
            sum+=nums[j];

            if(mpp.count(sum-k)){
                res+=mpp[sum-k]; //### [sum-k] - check this in map.
            }

            mpp[sum]++;

            j++;
        }

        return res;
    }
};