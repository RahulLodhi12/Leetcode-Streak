class Solution {
    public int possibleStringCount(String word) {
        Set<Character> st = new HashSet<>();

        int cnt=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(st.contains(ch) && ch==word.charAt(i-1)){
                cnt++;
            }
            else{
                st.add(ch);
            }
        }

        return cnt+1;

    }
}