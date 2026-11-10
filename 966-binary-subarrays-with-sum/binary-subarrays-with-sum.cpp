class Solution {
public:
    int numSubarraysWithSum(vector<int>& nums, int goal) {
        return slidingWindow(nums,goal) - slidingWindow(nums,goal-1);
    }
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
        cout<<res<<endl;
        return res;
    }
};