class Solution {
public:
    int numSubarrayProductLessThanK(vector<int>& nums, int k) {
        if(k<=1) return 0;
        int n=nums.size();
        int i=0,j=0,res=0,prod=1;

        while(j<n){
            prod*=nums[j];

            while(prod>=k and i<n){
                prod/=nums[i];
                i++;
            }
            if(prod<k){
                res+=(j-i+1);
            }
            j++;
        }

        return res;
    }
};