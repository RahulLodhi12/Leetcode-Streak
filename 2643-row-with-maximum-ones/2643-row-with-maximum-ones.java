class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];
        int idx=-1;
        int maxCnt=-1;

        int n = mat.length;
        int m = mat[0].length;

        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    cnt++;
                }
            }
            if(cnt>maxCnt){
                maxCnt=cnt;
                idx=i;
            }
        }

        ans[0]=idx;
        ans[1]=maxCnt;

        return ans;
    }
}