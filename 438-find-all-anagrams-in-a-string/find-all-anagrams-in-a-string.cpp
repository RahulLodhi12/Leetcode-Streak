class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        vector<int> freq(26);
        vector<int> check(26);

        for (char ch : p) {
            freq[ch - 'a']++;
        }

        int n = s.length();
        int i = 0, j = 0, k = p.length();

        vector<int> res;
        while (j < n) {
            char ch = s[j];

            check[ch - 'a']++;
            cout << ch - 'a' << check[ch - 'a'] << endl;

            if (j - i + 1 == k) {
                if (check == freq) {
                    res.push_back(i);
                }
                char c = s[i];
                check[c - 'a']--;
                i++;
            }
            j++;
        }

        return res;
    }
};