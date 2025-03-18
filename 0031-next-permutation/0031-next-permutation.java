class Solution {
    public void reverse(int[] nums, int i, int j){
        while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n=nums.length;

        //step 1: find prefix, iterate from back
        int bp=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){ //breaking-point element
                bp=i;
                break;
            }
        }

        if(bp==-1){
            reverse(nums,0,n-1);
            return;
        }


        //step 2: swap bp element with just > bp element
        for(int j=n-1;j>bp;j--){
            if(nums[j] > nums[bp]){
                int t = nums[j];
                nums[j] = nums[bp];
                nums[bp] = t;
                break;
            }
        }

        //step 3: reverse the rest element from 'bp+1' to 'n-1' idx
        reverse(nums,bp+1,n-1);
    }
}