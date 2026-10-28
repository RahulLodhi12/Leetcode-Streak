class Solution {
public:
    int numOfSubarrays(vector<int>& arr, int k, int threshold) {
        int n=arr.size();
        int i=0,j=0,sum=0,avg=0,cnt=0;
        while(j<n){
            sum+=arr[j];
            if(j-i+1==k){
                avg=sum/k;
                if(avg>=threshold) cnt++;
                sum-=arr[i];
                i++;
            }
            j++;
        }

        return cnt;
    }
};