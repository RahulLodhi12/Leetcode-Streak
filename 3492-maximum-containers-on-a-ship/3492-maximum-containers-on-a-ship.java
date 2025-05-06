class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int totalCells = n*n;
        int totalWeight = totalCells*w;

        while(totalWeight > maxWeight){
            totalCells--;
            totalWeight = totalCells*w;
        }

        return totalCells;
    }
}