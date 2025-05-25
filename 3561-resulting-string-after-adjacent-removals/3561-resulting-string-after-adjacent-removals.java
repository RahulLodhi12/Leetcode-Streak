class Solution {
    public String resultingString(String s) {
        Stack<Character> stack = new Stack<>();

        int n = s.length();

        for(int i=0;i<n;i++){
            char curr = s.charAt(i);
            if( (!stack.isEmpty() && Math.abs(stack.peek() - curr)==1) || (!stack.isEmpty() && Math.abs(stack.peek() - curr)==25)){
                stack.pop();
            }
            else stack.push(curr);
        }

        StringBuilder ans = new StringBuilder(); //StringBuilder is faster than StringBuffer and String
        for(char ch: stack) ans.append(ch);

        return ans.toString();
    }
}