class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;

        int[] temp = new int[n+m];

        int i=0,j=0;
        int k=0;

        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                temp[k++]=nums1[i];
                i++;
            }
            else{
                temp[k++]=nums2[j];
                j++;
            }
        }

        while(i<n){
            temp[k++]=nums1[i++];
        }

        while(j<m){
            temp[k++]=nums2[j++];
        }

        int len = temp.length;

        if(len%2==0){
            double median = (double)(temp[len/2] + temp[(len/2)-1])/2;
            return median;
        }

        return (double)temp[len/2];
    }
}