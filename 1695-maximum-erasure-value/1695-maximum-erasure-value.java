class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer,Integer> mpp = new HashMap<>();

        int i=0;
        int j=0;
        int n = nums.length;
        int sum=0;
        int maxi=-1;
        while(j<n){
            if(!mpp.containsKey(nums[j])){
                sum+=nums[j];
                mpp.put(nums[j],1);
            }
            else{
                maxi = Math.max(maxi,sum);
                while(nums[i]!=nums[j]){
                    sum-=nums[i];
                    mpp.remove(nums[i]);
                    i++;
                }
                sum-=nums[i];
                mpp.remove(nums[i]);
                i++;

                sum+=nums[j];
                mpp.put(nums[j],1);
            }
            j++;
        }
        maxi=Math.max(maxi,sum);

        return maxi;

    }
}