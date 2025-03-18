class Solution {
    public void reverse(int[] arr, int i, int j){
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }

    public void rotateMatrix(int[][] mat, int n){
        //step 1: Transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }

        //step 2: Reverse each row
        for(int i=0;i<n;i++){
            reverse(mat[i],0,n-1);
        }
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        rotateMatrix(matrix,n);
    }
}