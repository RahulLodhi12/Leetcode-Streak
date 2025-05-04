class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        //search space : [1,dmax]
        int dmax=Integer.MIN_VALUE;

        for(int i: nums){
            dmax = Math.max(dmax,i);
        }
        
        int s = 1;
        int e = dmax;
        int ans=-1;
        while(s<=e){
            int mid = s + (e-s)/2; //d
            int sum=0;
            for(int i: nums){
                sum+=Math.ceil((double)i/mid);
            }
            if(sum<=threshold){ //ans is store
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
}