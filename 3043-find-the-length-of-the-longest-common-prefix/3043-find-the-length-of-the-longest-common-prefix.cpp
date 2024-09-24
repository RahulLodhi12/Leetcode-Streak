class Solution {
public:
    int longestCommonPrefix(vector<int>& arr1, vector<int>& arr2) {
        unordered_set<int> ps; //prefixSet

        for(int n: arr1){
            while(n>0){
                ps.insert(n);
                n/=10;
            }
        }

        int res=0;
        for(int n: arr2){
            while(n>0){
                if(ps.count(n)){
                    //no. of digits = log10(num)+1 -> formula
                    int d = log10(n)+1;
                    res=max(res,d);
                }
                n/=10;
            }
        }

        return res;
    }
};