class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();

        //step 1: add item to Set
        for(int i: nums){
            st.add(i);
        }

        int maxi=0;
        
        //step 2: check for starting no. then calculate the longest seq. (reason for check the starting no. is to give 'cnt' variable a extra block for re-assigning cnt=1 for some other sequence)
        for(int i: st){
            if(!st.contains(i-1)){ //if starting number
                int cnt=1;
                int x=i+1;
                while(st.contains(x)){
                    cnt++;
                    x++;
                }
                maxi=Math.max(maxi,cnt);
            }
        }

        return maxi;

    }
}