class Solution {
public:
    bool rotateString(string s, string goal) {
        if(s.size()!=goal.size()) return false;
        string g = goal+goal;
        int n=s.size();
        for(int i=0;i<g.size();i++){
            string sub = g.substr(i,n);
            if(sub==s) return true;
        }
        return false;
    }
};