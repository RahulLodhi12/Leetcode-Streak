class Solution {
public:
    int characterReplacement(string s, int k) {
        int n=s.length();
        int i=0,j=0,res=0,maxi=0;
        map<char,int> mpp;
        while(j<n){
            char ch=s[j];
            mpp[ch-'A']++;
            maxi=max(maxi,mpp[ch-'A']);
            int cnt = j-i+1 - maxi; //count of char. which we can flip

            if(cnt<=k){
                res=max(res,j-i+1);
            }
            else if(cnt>k){
                char c = s[i];
                mpp[c-'A']--;
                i++;
            }
            j++;
        }

        return res;
    }
};