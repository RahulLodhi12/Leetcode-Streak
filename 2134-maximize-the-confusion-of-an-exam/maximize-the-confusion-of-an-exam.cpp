class Solution {
public:
    int maxConsecutiveAnswers(string answerKey, int k) {
        int n=answerKey.length();
        int i=0,j=0,res=0,maxi=0;
        map<char,int> mpp;

        while(j<n){
            char ch = answerKey[j];
            mpp[ch-'A']++;
            maxi=max(maxi,mpp[ch-'A']);
            int cnt = (j-i+1) - maxi; //counting characters which can be fliped.
            if(cnt<=k){
                res = max(res,j-i+1);
            }
            else if(cnt>k){
                char c = answerKey[i];
                mpp[c-'A']--;
                maxi=max(maxi,mpp[c-'A']);
                i++;
            }
            j++;
        }
        return res;
    }
};