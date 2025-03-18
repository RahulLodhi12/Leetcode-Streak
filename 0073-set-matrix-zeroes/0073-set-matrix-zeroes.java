class Solution {
    public void setMatrixZero(int[][] mat, int n, int m){
        //step 1: 2 arrays for rows[n] and cols[m]
        int[] rows = new int[n];
        int[] cols = new int[m];

        //step 2: if mat[i][j]==0, then rows[i]=1 and cols[j]=1
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }

        //step 3: set mat[i][j]=0 when rows[i]==1 or cols[j]==1
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rows[i]==1 || cols[j]==1){
                    mat[i][j]=0;
                }
            }
        }
    }

    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        setMatrixZero(matrix,n,m);
    }
}