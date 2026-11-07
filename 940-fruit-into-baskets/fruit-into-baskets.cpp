class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        int n=fruits.size();
        int i=0,j=0,res=0,maxi=0;
        map<int,int> mpp;

        while(j<n){
            mpp[fruits[j]]++;
            if(mpp.size()==2 or mpp.size()==1){
                res = max(res,j-i+1);
            }
            else if(mpp.size()>2){
                mpp[fruits[i]]--;
                if(mpp[fruits[i]]==0) mpp.erase(fruits[i]);
                i++;
            }
            j++;
        }
        return res;
    }
};