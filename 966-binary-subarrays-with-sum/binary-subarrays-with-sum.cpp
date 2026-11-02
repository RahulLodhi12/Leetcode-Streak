class Solution {
public:
    int numSubarraysWithSum(vector<int>& nums, int goal) {
        int n = nums.size();
        int i = 0, j = 0, sum = 0, cnt = 0, zero=0;
        //count of prefix zeroes - no effect on sum/goal.
        while(j < n){
            sum+=nums[j];
            
            while(i<j and (nums[i]==0 or sum>goal)){ //shrink window --> 'i' pointer
                if(nums[i]==0){
                    zero++;
                }
                else{
                    zero=0; //reset
                }
                sum-=nums[i];
                i++;
            }

            if(sum==goal){
                cnt+=1;
                cnt+=zero;
            }
            j++;
        }
        return cnt;
    }

    int prefixZero(vector<int> nums, int i, int j){
        int zero=0;
        while(i<j){
            if(nums[i]==0){
                zero++;
            }
            else{
                break;
            }
        }
        return zero;
    }
};