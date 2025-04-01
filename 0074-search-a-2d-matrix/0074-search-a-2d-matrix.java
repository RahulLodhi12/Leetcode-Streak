class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        int n=mat.length;
        int m=mat[0].length;
        int size=n*m;
        if(size==1 && mat[0][0]==x) return true;
        if(size==1 && mat[0][0]!=x) return false;

        int s=0,e=size-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            
            int i=mid/m; //row
            int j=mid%m; //col

            if(mat[i][j]==x) {
                return true;
            }
            else if(mat[i][j]>x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }
        return false;
    }
}