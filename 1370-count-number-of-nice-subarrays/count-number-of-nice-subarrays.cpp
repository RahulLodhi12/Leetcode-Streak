class Solution {
public:
    //Approach 2: Hashing/Counting
    int numberOfSubarrays(vector<int>& nums, int k) {
        //SAME Logic as: Subarray sum equals to K
        //NOTE: check [sum - k] in hashing/map, where 'sum' is we'r calculating and k is given
        int n=nums.size();
        int i=0,j=0,res=0,sum=0;
        map<int,int> mpp;
        mpp[0]=1;
        while(j<n){
            if(nums[j]%2==1){
                sum+=(nums[j]%2);
            } 
            mpp[sum]++;

            if(mpp.count(sum-k)){
                res+=mpp[sum-k];
            }

            j++;
        }
        return res;
    }
};