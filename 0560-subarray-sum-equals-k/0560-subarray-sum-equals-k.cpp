class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> mpp; //<sum,cnt>
        int sum=0;
        mpp[0]=1; //sum=0, cnt=1
        int cnt=0;
        for(int i=0;i<nums.size();i++){
            sum+=nums[i]; //prefix sum
            if(mpp.find(sum-k)!=mpp.end()){
                cnt+=mpp[sum-k];
            }
            mpp[sum]++;
        }
        return cnt;
    }
};