class Solution {
    public int findClosest(int x, int y, int z) {
        int xdiff=Math.abs(x-z);
        int ydiff=Math.abs(y-z);

        if(xdiff==ydiff) return 0;
        return xdiff > ydiff ? 2 : 1;
    }
}