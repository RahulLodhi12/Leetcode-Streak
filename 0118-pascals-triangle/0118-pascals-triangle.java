class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>(i+1);
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    int num = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    row.add(num);
                }
            }
            ans.add(row);
        }

        return ans;
    }
}