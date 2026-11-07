class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int n=nums.size();
        int i=0,j=0,res=0,maxi=0;
        map<int,int> mpp;

        while(j<n){
            if(nums[j]==1) mpp[nums[j]]++;
            maxi=max(maxi,mpp[nums[j]]);
            int cnt = (j-i+1) - maxi; //counting 'numbers' which can be fliped.
            if(cnt<=k){
                res = max(res,j-i+1);
            }
            else if(cnt>k){
                mpp[nums[i]]--;

                maxi=max(maxi,mpp[nums[i]]);
                i++;
            }
            j++;
        }
        return res;
    }
};