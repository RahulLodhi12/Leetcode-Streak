class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int maxi=-1;
        for(int i: weights){
            sum+=i;
            maxi=Math.max(i,maxi);
        }

        int s=maxi;
        int e=sum;
        int ans=-1;
        while(s<=e){
            int mid = s + (e-s)/2; //cap
            int dcnt=1;
            int w=0;
            for(int i: weights){
                if(w + i>mid){
                    dcnt++; //move to next day
                    w = i; //move to new weight for next day
                }
                else{
                    w += i;
                }

            }
            
            if(dcnt<=days){ //ans is store
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }

        return ans;
    }
}