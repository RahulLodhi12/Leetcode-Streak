class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int s=0,e=n-1; //low=0, high=n-1

        while(s<=e){
            int mid = s + (e-s)/2;
            
            int missing = arr[mid] - (mid+1); //missing numbers

            if(missing<k){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }

        return k + e + 1; //equals to arr[high] + 'more', here 'more' is 'k-missing'
        
    }
}