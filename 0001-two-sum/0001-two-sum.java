class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;

        int[] sortArr = Arrays.copyOf(nums,n);

        Arrays.sort(sortArr);
        int i=0,j=n-1;

        while(i<j){
            int val = sortArr[i]+sortArr[j];
            if(val > target){
                j--;
            }
            else if(val < target){
                i++;
            }
            else{
                break;
            }
        }
        int f=-1,s=-1;
        for(int k=0;k<n;k++){
            if(nums[k]==sortArr[i] && f==-1){
                f=k;
            }
            else if(nums[k]==sortArr[j] && s==-1){
                s=k;
            }
        }
        ans[0]=f;
        ans[1]=s;
        return ans;
    }
}