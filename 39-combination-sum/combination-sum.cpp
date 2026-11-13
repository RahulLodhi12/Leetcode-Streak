class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> ans;
        vector<int> temp;
        int n = candidates.size();
        solve(n,candidates,target,temp,ans);
        return ans;
    }

    void solve(int n, vector<int>& candidates, int target, vector<int>& temp, vector<vector<int>>& ans){
        //base case
        if(target==0 and n==0){
            ans.push_back(temp);
            return;
        }
        if(n==0) return;

        //take
        if(candidates[n-1]<=target){
            temp.push_back(candidates[n-1]);
            solve(n,candidates,target-candidates[n-1],temp,ans);
            temp.pop_back();
        }

        //skip
        solve(n-1,candidates,target,temp,ans);
    }
};