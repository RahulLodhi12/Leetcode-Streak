class Solution {
    public static void combinationSum2_optimal(int[] arr, List<Integer> temp, int i, int n, int target, int sum, List<List<Integer>> ans){
        //base case
        if(sum==target){
            ans.add(new ArrayList<>(temp)); //O(k), because we are putting a ds into another ds
            return;
        }

        for(int k=i;k<n;k++){
            if(k>i && arr[k]==arr[k-1]) continue;
            if(sum+arr[k]>target) break;

            temp.add(arr[k]);
            combinationSum2_optimal(arr,temp,k+1,n,target,sum+arr[k],ans);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int k) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;

        Arrays.sort(arr);
        combinationSum2_optimal(arr,temp,0,n,k,0,ans);

        return ans;
    }
}