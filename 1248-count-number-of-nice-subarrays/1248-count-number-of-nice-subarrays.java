class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer> mpp = new HashMap<>();
        //map<oddCnt,seeCnt> means odd no. ka count itne baar dekha hai.
        mpp.put(0,1); //this means "1" sub-array whose odd-cnt is 1
        //e.g. mpp.put(2,2) this means "2" sub-array whose odd-cnt is 2

        int n=nums.length;
        int oddCnt=0;
        int res=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==1){
                oddCnt++;
            }
            mpp.put(oddCnt,mpp.getOrDefault(oddCnt,0)+1);

            if(mpp.containsKey(oddCnt-k)){
                res+=mpp.get(oddCnt-k);
            }
        }

        return res;
    }
}