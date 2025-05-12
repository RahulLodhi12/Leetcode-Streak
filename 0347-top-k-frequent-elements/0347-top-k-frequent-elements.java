class Pair{
    int first;
    int second;

    Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mpp = new HashMap<>();

        for(int i: nums){
            mpp.put(i,mpp.getOrDefault(i,0)+1);
        }

        ArrayList<Pair> vec = new ArrayList<>();

        for(Map.Entry<Integer,Integer> it: mpp.entrySet()){
            vec.add(new Pair(it.getKey(),it.getValue()));
        }

        Collections.sort(vec,(a,b)->{
            return b.second - a.second; //decreasing, FOR increaing use -> (a - b)
        });

        int[] ans = new int[k];
        int p=0;
        for(int i=0;i<vec.size();i++){
            if(k>0){
                ans[p++]=vec.get(i).first;
                k--;
            }
        }

        return ans;
    }
}