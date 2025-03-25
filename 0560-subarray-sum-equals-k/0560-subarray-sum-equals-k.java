class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        
        HashMap<Integer,Integer> mpp = new HashMap<>(); //map<prefixSum,count>

        mpp.put(0,1); //if prefix sum equals to 'k'

        int cnt=0;
        int prefixSum=0;
        for(int i: nums){
            prefixSum+=i;
            if(mpp.containsKey(prefixSum-k)){
                cnt+=mpp.get(prefixSum-k);
            }
            mpp.put(prefixSum,mpp.getOrDefault(prefixSum,0)+1);
        }

        return cnt;
        /*
        Why Sliding Window Not Works Here:
        nums = [1,2,-3,1,2,-3] k=0
        Here Two Subarray A=[1,2,-3] and B=[1,2,-3] with sum=0
        Sliding Window algo will take these 2 subarray into account.
        But whole array also has sum=0, and Here Sliding Window Algo fails.
        */
    }
}