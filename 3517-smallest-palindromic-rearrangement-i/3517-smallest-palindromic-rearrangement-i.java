class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int t=n/2;
        String half=s.substring(0,t);

        //part-1
        char[] halfArr = half.toCharArray();
        Arrays.sort(halfArr);
        String halfStr = new String(halfArr); //part-1

        //part-2
        String rev = new StringBuilder(halfStr).reverse().toString();//part-2

        if(n%2!=0){ //odd
            halfStr+=s.charAt(t);
        }

        return halfStr+rev;
    }
}