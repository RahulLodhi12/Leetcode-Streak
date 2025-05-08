class Solution {
    public boolean isNonDecreasing(List<Integer> lst){
        for(int i=0;i<lst.size()-1;i++){
            if(lst.get(i) > lst.get(i+1)) return false;
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        int n=nums.length;

        List<Integer> lst = new ArrayList<>();
        for(int i: nums){
            lst.add(i);
        }

        int ops=0;

        while(!isNonDecreasing(lst)){ //increasing
            int minSum=Integer.MAX_VALUE;
            int minIdx=-1;

            for(int i=0;i<lst.size()-1;i++){
                int sum = lst.get(i) + lst.get(i+1);
                if(sum<minSum){
                    minSum=sum;
                    minIdx=i;
                }
            }

            int pairSum = lst.get(minIdx) + lst.get(minIdx+1);
            lst.set(minIdx,pairSum);
            lst.remove(minIdx+1);
            ops++;
        }

        return ops;
    }
}