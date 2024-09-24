class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> ans;
        int n = nums.size();
        int f = n/3;

        unordered_map<int,int> mpp;

        for(int it: nums){
            mpp[it]++;
        }

        for(auto it: mpp){
            if(it.second > f){
                ans.push_back(it.first);
            }
        }

        return ans;
    }
};