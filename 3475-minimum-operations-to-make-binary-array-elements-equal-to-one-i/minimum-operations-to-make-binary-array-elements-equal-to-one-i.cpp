class Solution {
public:
    int minOperations(vector<int>& nums) {
        int i,j;
        int n=nums.size();
        for (i=0;i<nums.size();i++) {
            if(nums[i]==0){
                break;
            }
        }

        j=i;
        int flip=0;
        while(j<n and i<n-2){
            if(nums[j]==0){
                nums[j]=1;
                // j++;
            }
            else{
                nums[j]=0;
                // j++;
            }
            if(j-i+1==3){
                flip++;
                while(i<n) {
                    if(nums[i]==0){
                        break;
                    }
                    i++;
                }
                j=i-1;
            }
            j++;
        }

        for(int k: nums){
            cout<<k<<" ";
            if(k==0) return -1;
        }
        return flip;
    }
};