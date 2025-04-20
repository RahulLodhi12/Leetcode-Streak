class Solution {
    public int maximumPossibleSize(int[] nums) {
        int prev=-1;
        int cnt=0;

        for(int i: nums){
            if(i>=prev){
                cnt++;
                System.out.println("before: "+prev);
                prev=i;
                System.out.println("after: "+prev);
            }
        }

        return cnt;
    }
}