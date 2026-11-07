class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        // return false;
        int n=s2.length(), k=s1.length();
        vector<int> freq1(26);
        for(char ch: s1){
            freq1[ch-'a']++;
        }

        vector<int> freq2(26);

        int i=0,j=0;
        while(j<n){
            char ch = s2[j];
            freq2[ch-'a']++;

            if(j-i+1==k){
                if(freq1==freq2){
                    return true;
                }
                char c = s2[i];
                freq2[c-'a']--;
                i++;
            }

            j++;
        }
        return false;
    }
};