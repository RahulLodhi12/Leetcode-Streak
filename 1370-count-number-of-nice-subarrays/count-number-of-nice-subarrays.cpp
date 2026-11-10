class Solution {
public:
    //Approach 1: Sliding Window
    int numberOfSubarrays(vector<int>& nums, int k) {
        //SAME Logic of Q. 930 Binary Subarrays with SUM
        //[count subarrays with sum<=k] - [count subarrays with sum<=(k-1)]
        return slidingWindow(nums,k) - slidingWindow(nums,k-1);
    }

    int slidingWindow(vector<int>& nums, int k){
        int n=nums.size();
        int i=0,j=0,res=0,sum=0;
        while(j<n){
            sum+=(nums[j]%2);

            while(sum>k){
                sum-=(nums[i]%2);
                i++;
            }
            if(sum<=k){
                res+=(j-i+1);
            }
            j++;
        }

        return res;
    }
};