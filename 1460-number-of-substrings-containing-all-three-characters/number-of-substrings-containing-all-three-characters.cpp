class Solution {
public:
    int numberOfSubstrings(string s) {
        int n = s.length();
        int i = 0, j = 0, res = 0;
        map<char, int> mpp;
        while (i < n and j < n) {
            mpp[s[j]]++;
            while (mpp.size() == 3) {
                res += (n - j);
                if (mpp.contains(s[i])) {
                    mpp[s[i]]--;
                    if (mpp[s[i]] == 0)
                        mpp.erase(s[i]);
                }
                i++;
            }
            j++;
        }

        return res;
    }
};