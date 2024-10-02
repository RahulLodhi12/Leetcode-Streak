class Solution {
public:
    vector<int> arrayRankTransform(vector<int>& arr) {
        vector<int> A = arr;
        sort(A.begin(),A.end());
        unordered_map<int,int> mpp;

        for(int it: A){
            mpp.emplace(it,mpp.size()+1);
        }

        for(int i=0;i<A.size();i++){
            A[i] = mpp[arr[i]];
        }
        return A;
    }
};