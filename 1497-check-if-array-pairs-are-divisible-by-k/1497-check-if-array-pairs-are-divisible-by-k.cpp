class Solution {
public:
    bool canArrange(vector<int>& arr, int k) {
        unordered_map<int,int> mpp; //<rem,cnt>
        for(int i: arr){
            int rem = i%k;
            mpp[rem]++;
        }

        for(int i=1;i<=k/2;i++){
            int v=k-i;
            if(mpp.find(v)!=mpp.end()){
                if(mpp[v]!=mpp[i]) return false;
            }
            else return false;
        }
        return true;
    }
};