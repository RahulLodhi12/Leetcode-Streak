class Solution {
    public int maxProduct(int n) {
        //approach 1: O(n) space, O(nlogn) time
        ArrayList<Integer> lst = new ArrayList<>();
        
        while(n!=0){
            int d = n%10;
            lst.add(d);
            n=n/10;
        }
        
        Collections.sort(lst);
        
        int len = lst.size();
        
        return lst.get(len-1)*lst.get(len-2);
    }
}