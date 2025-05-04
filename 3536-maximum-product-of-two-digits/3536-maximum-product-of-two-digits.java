class Solution {
    public int maxProduct(int n) {
        //approach 2: O(n) time
        int max1=Integer.MIN_VALUE; //largest
        int max2=Integer.MIN_VALUE; //second largest

        while(n!=0){
            int d = n%10;

            if(d>=max1){
                max2 = max1;
                max1 = d;
            }
            else if(d>max2 && d!=max1){
                max2 = d;
            }

            n=n/10;
        }

        System.out.println(max1+" "+max2);

        return max1*max2;
    }
}