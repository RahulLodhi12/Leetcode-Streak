class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;

        int idx1=(n+m)/2;
        int idx2=idx1-1;

        int k=0; //index
        int i=0,j=0;

        int el1=-1,el2=-1;//answers

        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                if(k==idx1) el1 = nums1[i];
                if(k==idx2) el2 = nums1[i];
                i++;
                k++;
            }
            else{
                if(k==idx1) el1 = nums2[j];
                if(k==idx2) el2 = nums2[j];
                j++;
                k++;
            }
        }

        while(i<n){
            if(k==idx1) el1 = nums1[i];
            if(k==idx2) el2 = nums1[i];
            i++;
            k++;
        }

        while(j<m){
            if(k==idx1) el1 = nums2[j];
            if(k==idx2) el2 = nums2[j];
            j++;
            k++;
        }

        // System.out.println(el1+" "+el2);

        if((n+m)%2==0) return (double)(el1+el2)/2;

        return el1;
    }
}