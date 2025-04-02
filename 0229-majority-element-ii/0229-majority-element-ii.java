class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int m=n/3;

        List<Integer> lst = new ArrayList<>();
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int i: nums){
            mpp.put(i,mpp.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> it: mpp.entrySet()){
            if(it.getValue()>m){
                lst.add(it.getKey());
            }
        }

        return lst;
    }
}