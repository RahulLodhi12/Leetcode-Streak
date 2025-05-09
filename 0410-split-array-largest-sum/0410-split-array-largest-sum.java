class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int maxi=-1;
        int sum=0;
        for(int i: nums){
            maxi=Math.max(maxi,i);
            sum+=i;
        }

        int s=maxi;
        int e=sum;
        int ans=-1;

        while(s<=e){
            int mid = s + (e-s)/2; //minSum
            int cnt=1;
            int total=0;
            for(int i: nums){
                if(total+i<=mid){
                    total+=i;
                }
                else{
                    cnt++;
                    total=i;
                }
            }
            if(cnt<=k){ //ans store here
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }

        return ans;


        //Brute Force Approach:

        // for(int minSum=maxi;minSum<=sum;minSum++){
        //     int cnt=1;
        //     int total=0;
        //     for(int i: nums){
        //         if(total+i<=minSum){
        //             total+=i;
        //         }
        //         else{
        //             cnt++;
        //             total=i;
        //         }
        //     }
        //     if(cnt<=k) return minSum;
        // }

        // return -1;
    }
}