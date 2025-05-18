class Solution {
    public void solve(int idx, String digits, int n, HashMap<Character,String> mpp, List<Character> temp, List<String> ans){
        //base case
        if(temp.size()==n){
            StringBuilder sb = new StringBuilder();
            for(Character ch: temp){
                sb.append(ch);
            }
            String curr = sb.toString();
            ans.add(curr);
            return;
        }

        char ch = digits.charAt(idx);
        String s = mpp.get(ch);
        int k = s.length();

        for(int i=0;i<k;i++){
            temp.add(s.charAt(i));
            solve(idx+1,digits,n,mpp,temp,ans);
            temp.remove(temp.size()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        if(n==0) return new ArrayList<>();
        
        List<Character> temp = new ArrayList<>();
        List<String> ans = new ArrayList<>();


        //Map
        HashMap<Character,String> mpp = new HashMap<>();
        mpp.put('2',"abc");
        mpp.put('3',"def");
        mpp.put('4',"ghi");
        mpp.put('5',"jkl");
        mpp.put('6',"mno");
        mpp.put('7',"pqrs");
        mpp.put('8',"tuv");
        mpp.put('9',"wxyz");

        solve(0,digits,n,mpp,temp,ans);

        return ans;
    }
}