class Solution {
public:
    int characterReplacement(string s, int k) {
        int n=s.length();
        int i=0,j=0,cnt=0,len=0,res=0,maxi=0;
        map<char,int> mpp;
        while(j<n){
            // int mini=n+1;
            char ch=s[j];
            mpp[ch-'A']++;
            // int mini=n+1;
            // for(auto& m: mpp){
            //     mini = min(mini,m.second);
            // }
            maxi=max(maxi,mpp[ch-'A']);
            int cnt = j-i+1 - maxi;


            if(cnt<=k){
                res=max(res,j-i+1);
                // cout<<res<<endl;
            }
            else if(cnt>k){
                char c = s[i];
                mpp[c-'A']--;
                // maxi=max(maxi,mpp[c-'A']);
                i++;
            }

            j++;
        }

        // for(int m: freq){
        //     cout<<m<<" ";
        // }
        // if(k==0) return maxi;
        return res;
    }
};