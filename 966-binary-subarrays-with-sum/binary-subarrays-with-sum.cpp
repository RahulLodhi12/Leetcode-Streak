class Solution {
public:
    int numSubarraysWithSum(vector<int>& nums, int goal) {
        //Step 1: [count of subarrays sum<=goal] - [count of subarrays sum<=(goal-1)]
        return slidingWindow(nums,goal) - slidingWindow(nums,goal-1);
    }
    //Step 2: general func. for both flows
    //Same Logic Questions: 713 and 1248
    //713. Subarray Product Less Than K
    //1248. Count Number of Nice Subarrays [Even/Odd -> 0/1]
    int slidingWindow(vector<int>& nums, int goal){
        if(goal<0) return 0;
        int n=nums.size();
        int i=0,j=0,res=0,sum=0;

        while(j<n){
            sum+=nums[j];

            while(i<n and sum>goal){
                sum-=nums[i];
                i++;
            }
            if(sum<=goal){
                res+=(j-i+1);
            }

            j++;
        }
        return res;
    }
};
