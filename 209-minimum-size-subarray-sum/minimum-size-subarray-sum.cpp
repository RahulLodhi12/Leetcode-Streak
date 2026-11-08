class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int n=nums.size();
        int i=0,j=0,res=n+1,sum=0;

        while(j<n){
            sum+=nums[j];

            while(sum>=target){
                res=min(res,j-i+1);
                sum-=nums[i];
                i++;
            }

            j++;
        }

        return res==n+1 ? 0: res;
    }
};