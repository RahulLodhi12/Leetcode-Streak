class Solution {
    public boolean isPal(String t, int i, int j){
        while(i<j){
            if(t.charAt(i)!=t.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        String t="";

        for(int i=0;i<s.length();i++){
            if(!Character.isLetterOrDigit(s.charAt(i))){ //check for Alpha-numeric
                continue;
            }

            char ch= Character.toLowerCase(s.charAt(i)); //toLowerCase
            t+=ch;
        }

        return isPal(t,0,t.length()-1);
    }
}
