class Solution {
    public static void solve(int[] arr, List<Integer> temp, int idx, int n, int k, int sum, List<List<Integer>> ans){
        //base case
        if(idx==n){
            if(sum==k){
                ans.add(new ArrayList<>(temp));
                return;
            }
            else{
                return;
            }
        }

        //take
        if(sum+arr[idx]<=k){
            temp.add(arr[idx]); //push
            solve(arr,temp,idx,n,k,sum+arr[idx],ans);
            temp.remove(temp.size()-1); //pop
        }

        //skip
        solve(arr,temp,idx+1,n,k,sum,ans);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        solve(candidates,temp,0,n,target,0,ans);

        return ans;
    }
}