class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        int n=mat.length;
        int m=mat[0].length;
        
        int i=0,j=m-1;
        
        //Starts from mat[0][m-1], because we get row is in decreasing order and the column is in increasing order.
        //But if we starts from mat[0][0], row and column are both sorted in increasing order
        while(i<n && j>=0){
            if(mat[i][j]>x){
                j--;
            }
            else if(mat[i][j]<x){
                i++;
            }
            else{
                return true;
            }
        }
        
        return false;
    }
}