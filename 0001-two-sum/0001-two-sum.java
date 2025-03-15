class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        HashMap<Integer,Integer> mpp = new HashMap<>(); //<element,idx>

        for(int i=0;i<n;i++){
            int rem = target - nums[i];
            if(mpp.containsKey(rem)){
                ans[0]=i;
                ans[1]=mpp.get(rem);
                return ans;
            }
            mpp.put(nums[i],i);
        }
        return ans; //never executed!
    }
}