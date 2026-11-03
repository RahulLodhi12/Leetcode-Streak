class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n=s.length();
        int i=0,j=0,len=0,res=0;
        set<char> st;

        while(j<n){
            st.insert(s[j]);

            while(j-i+1 > st.size()){ 
                if(s[i]!=s[j]) st.erase(s[i]);
                i++;
            }

            if(j-i+1 == st.size()){
                len = j-i+1;
                res = max(len,res);
            }

            j++;
        }

        return res;
    }
};