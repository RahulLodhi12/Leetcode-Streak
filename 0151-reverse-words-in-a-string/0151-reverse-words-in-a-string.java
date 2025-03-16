class Solution {
    public String reverseWords(String s) {
        String ans="";
        int n=s.length();
        int i=n-1;
        String temp="";
        while(i>=0){
            char ch = s.charAt(i);
            if(ch==' ' && temp==""){ //ignoring leading spaces only, no need to handle trailing spaces
                i--;
                continue;
            }
            else if(ch!=' '){
                temp=ch+temp;
            }
            else if(ch==' '){
                if(ans!=""){
                    ans = ans + ' ' + temp;
                }
                else if(ans==""){
                    ans=temp;
                }
                temp="";
            }
            i--;
        }
        if(temp!=""){
            if(ans!=""){
                ans = ans + ' ' + temp;
            }
            else if(ans==""){
                ans=temp;
            }
        }

        return ans;
    }
}