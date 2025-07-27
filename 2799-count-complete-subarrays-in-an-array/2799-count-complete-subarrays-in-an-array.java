class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int i: nums){
            st.add(i);
        }
        int distinct = st.size();

        int i=0;
        int j=0;
        int n=nums.length;
        Map<Integer,Integer> mpp = new HashMap<>();
        int cnt=0;
        while(j<n){
            mpp.put(nums[j],mpp.getOrDefault(nums[j],0)+1);
            
            while(mpp.size()==distinct){
                cnt+=n-j;
                mpp.put(nums[i],mpp.get(nums[i])-1);
                if(mpp.get(nums[i])==0){
                    mpp.remove(nums[i]);
                }

                i++;
            }

            j++;
        }

        return cnt;

    }
}