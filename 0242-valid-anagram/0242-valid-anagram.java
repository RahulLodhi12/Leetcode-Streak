class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++; //increment
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            freq[ch-'a']--; //decrement
        }

        for(int i: freq){ //check the freq array
            if(i!=0) return false;
        }
        return true;
    }
}