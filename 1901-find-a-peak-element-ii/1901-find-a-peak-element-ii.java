class Solution {
    public int maxElement(int[][] nums, int n, int col){
        int maxi=Integer.MIN_VALUE;
        int idx=-1;

        for(int i=0;i<n;i++){
            if(nums[i][col]>maxi){
                maxi=nums[i][col];
                idx=i;
            }
        }

        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int s=0,e=m-1;

        while(s<=e){
            int mid = s + (e-s)/2; //col idx
            int row = maxElement(mat, n, mid); //row idx

            int left = mid-1 >= 0 ? mat[row][mid-1] : -1;
            int right = mid+1 < m ? mat[row][mid+1] : -1;

            if(mat[row][mid] > left && mat[row][mid] > right){
                return new int[]{row,mid};
            }

            if(mat[row][mid] < left){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }

        return new int[]{-1,-1};
    }
}