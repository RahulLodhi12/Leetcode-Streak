class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();
        
        for(String word: words){
            int n=word.length();
            String temp="";
            for(int i=0;i<n;i++){
                char ch = word.charAt(i);
                if(ch!=separator){
                    temp+=ch;
                }
                else if(ch==separator){
                    if(temp!="") {
                        ans.add(temp);
                        temp="";
                    }
                }
            }
            //last
            if(temp!=""){
                ans.add(temp);
            }
        }

        return ans;
    }
}