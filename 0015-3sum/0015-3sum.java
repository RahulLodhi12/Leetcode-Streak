class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            Set<Integer> mpp = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -(nums[i]+nums[j]);

                if(mpp.contains(third)){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(third);
                    Collections.sort(res);
                    st.add(res);
                }

                mpp.add(nums[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}