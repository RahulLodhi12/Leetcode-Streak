class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        int n=nums.size();
        int i=0,j=0,len=0,res=0,cnt=0,one=1;

        while(j<n){
            if(nums[j]==0){
                cnt++;
            }
            while(cnt>1){
                if(nums[i]==0){
                    cnt--;
                }
                i++;
            }
            if(cnt==1){
                len=j-i;
                res=max(res,len);
            }
            j++;
        }

        if(cnt==0) return n-1;

        return res;
    }
};