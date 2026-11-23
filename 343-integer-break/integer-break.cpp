class Solution {
public:
    int integerBreak(int n) {
        return solve(n,n,0);
    }
    int solve(int k, int n, int cnt){
        //base case
        if(n==0){
            if(cnt>=2) return 1;
            return 0;
        }
        if(k==0) return 0;

        int take=1,skip=1;
        if(k<=n){
            take = k*solve(k,n-k,cnt+1);
        }
        skip = solve(k-1,n,cnt);

        return max(take,skip);
    }
};