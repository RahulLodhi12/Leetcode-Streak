class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double> st = new HashSet<>();
        Arrays.sort(nums);
        int i=0,j=nums.length-1;

        while(i<j){
            double avg = (double)(nums[i]+nums[j])/2;
            st.add(avg);
            i++;
            j--;
        }
        return st.size();
    }
}