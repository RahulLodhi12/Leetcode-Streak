class Solution {
    public static void solve(int[] arr, int idx, int n, int len, int k, int sum, List<Integer> temp, List<List<Integer>> ans){
        //base case
        if(idx==n){
            if(temp.size()==len && k==sum){
                ans.add(new ArrayList<>(temp));
                return;
            }
            else{
                return;
            }
        }


        //take
        temp.add(arr[idx]);
        solve(arr,idx+1,n,len,k,sum+arr[idx],temp,ans);

        //skip
        temp.remove(temp.size()-1);
        solve(arr,idx+1,n,len,k,sum,temp,ans);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        //k->size/len
        //n->sum/target
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int arrLen=arr.length;

        solve(arr,0,arrLen,k,n,0,temp,ans);

        return ans;
    }
}