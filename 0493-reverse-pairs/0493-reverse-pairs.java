class Solution {
    public void merge(int[] nums, int l, int m, int h){
        ArrayList<Integer> temp = new ArrayList<>();
        int i=l;
        int j=m+1;

        while(i<=m && j<=h){
            if(nums[i]<=nums[j]){
                temp.add(nums[i]);
                i++;
            }
            else{
                temp.add(nums[j]);
                j++;
            }
        }

        while(i<=m){
            temp.add(nums[i]);
            i++;
        }

        while(j<=h){
            temp.add(nums[j]);
            j++;
        }

        int p=0;
        for(int k=l;k<=h;k++){
            nums[k]=temp.get(p);
            p++;
        }
    }
    public int cntReversePairs(int[] nums, int l, int m, int h){
        int cnt=0;
        int j=m+1;
        for(int i=l;i<=m;i++){
            while(j<=h && nums[i]>(long)2*nums[j]){
                j++;
            }
            cnt += (j-(m+1));
        }
        return cnt;
    }
    public int mergeSort(int[] nums, int l, int h){
        int count=0;
        if(l>=h) return count; //base case

        int m = (l+h)/2;

        count += mergeSort(nums,l,m); //divide
        count += mergeSort(nums,m+1,h); //divide

        count += cntReversePairs(nums,l,m,h);

        merge(nums,l,m,h); //merge

        return count;
    }
    public int reversePairs(int[] nums) {
        int n=nums.length;
        return mergeSort(nums,0,n-1);
    }
}