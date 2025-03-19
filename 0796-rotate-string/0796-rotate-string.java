class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;

        //step 1: concate
        goal = goal+goal;
        
        //step 2: use 'contains' method of java (in C++, we can use 'find' method)
        return goal.contains(s);
    }
}