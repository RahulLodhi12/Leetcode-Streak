class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int i: nums){
            mpp.put(i,mpp.getOrDefault(i,0)+1);
        }

        int sum=0;
        int largeNeg=Integer.MIN_VALUE;
        int posCnt=0;
        for(Map.Entry<Integer,Integer> i: mpp.entrySet()){
            if(i.getKey()<0){
                largeNeg = Math.max(largeNeg,i.getKey());
            }
            else{
                posCnt++;
                sum+=i.getKey();
            }
        }
        if(posCnt>0 && sum==0) return sum;

        return sum==0 ? largeNeg : sum;
    }
}