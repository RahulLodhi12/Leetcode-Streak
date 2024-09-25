class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        int mini = INT_MAX;
        int maxPro = 0;
        for(int i=0;i<n;i++){
            if(prices[i]<mini){
                mini = prices[i];
            }
            int pro = prices[i] - mini;
            if(pro>maxPro){
                maxPro = pro;
            }
        }
        return maxPro;
    }
};