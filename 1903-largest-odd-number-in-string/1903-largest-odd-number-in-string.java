class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        for(int i=n-1;i>=0;i--){
            char ch = num.charAt(i);
            int val = ch-'0'; //check each digit from last
            if(val%2!=0) return num.substring(0,i+1); //if digit is odd return substr. from idx 0.
        }
        return "";
    }
}