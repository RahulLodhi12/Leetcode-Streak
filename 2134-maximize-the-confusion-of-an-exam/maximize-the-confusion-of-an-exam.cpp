class Solution {
public:
    int maxConsecutiveAnswers(string answerKey, int k) {
        int n = answerKey.length();
        int i = 0, j = 0, len = 0, res1 = 0, res2=0, cntT = 0,cntF=0;
        while (j < n) {
            if(answerKey[j]=='F'){
                cntF++;
            }
            if(cntF<=k && cntT==0){
                len = j - i + 1;
                res1 = max(res1, len);
            }
            while(cntF-k==1){
                    if(answerKey[i]=='F'){
                        cntF--;
                        // if(cntF==0) break;
                    }
                    i++;
                }            
            j++;
        }
        int ans = max(res1,res2);
        i = 0, j = 0, len = 0, res1 = 0, res2=0, cntT = 0,cntF=0;
        while (j < n) {
            if(answerKey[j]=='T'){
                cntT++;
            }
            if(cntT<=k && cntF==0){
                len = j - i + 1;
                res2 = max(res2, len);
            }
            while(cntT-k==1){
                    if(answerKey[i]=='T'){
                        cntT--;
                        // if(cntF==0) break;
                    }
                    i++;
                }            
            j++;
        }
        ans = max(ans,res2);

        return ans;
    }
};