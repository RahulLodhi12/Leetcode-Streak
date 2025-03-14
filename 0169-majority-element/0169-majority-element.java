class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int i: nums){
            mpp.put(i,mpp.getOrDefault(i,0)+1);
            if(mpp.get(i) > (n/2)) return i;
        }

        return -1;
    }
}