class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i=0,j=0;

        HashMap<Character,Integer> mpp = new HashMap<>();
        int maxi=0;

        //Consider this Ex: s="abcbcabbd"  O/P: 3

        while(j<n){
            char ch = s.charAt(j);

            while(mpp.containsKey(ch)){ //check still s[j] exist in map
                mpp.remove(s.charAt(i));
                i++;
            }

            mpp.put(ch,1);
            maxi=Math.max(maxi,mpp.size());
            j++;
        }

        return maxi;
    }
}