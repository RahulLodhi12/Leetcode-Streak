class Solution {
    public void printAllUniqueSubsets_optimal(int[] arr, int i, int n, List<Integer> temp, List<List<Integer>> ans){
        ans.add(new ArrayList<>(temp)); //add every current/temp subset

        //base case
        if(i==n) return;

        for(int k=i;k<n;k++){
            if(k>i && arr[k]==arr[k-1]) continue;

            temp.add(arr[k]);
            printAllUniqueSubsets_optimal(arr,k+1,n,temp,ans);
            temp.remove(temp.size()-1); //backtrack
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums); //sort helps us to deal with duplicates easily.

        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        printAllUniqueSubsets_optimal(nums,0,n,temp,ans);
        
        return ans;
    }
}