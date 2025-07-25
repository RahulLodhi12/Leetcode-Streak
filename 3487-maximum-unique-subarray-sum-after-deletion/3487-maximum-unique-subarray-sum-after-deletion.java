class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> st = new TreeSet<>();

        for(int i: nums){
            st.add(i);
        }

        int sum=0;
        int neg=-1;
        int zero=0;
        for(int i: st){
            if(i>0){
                sum+=i;
            }
            else if(i<0){
                neg=i;
            }
            else if(i==0){
                zero++;
            }
        }

        if(sum==0 && zero>0) return 0;

        return sum==0?neg:sum;
    }
}