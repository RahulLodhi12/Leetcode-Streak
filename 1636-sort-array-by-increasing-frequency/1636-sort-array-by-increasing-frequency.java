class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        
        for(int i: nums){
            mpp.put(i,mpp.getOrDefault(i,0)+1);
        }
        
        ArrayList<Pair> vec = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> i: mpp.entrySet()){
            vec.add(new Pair(i.getKey(),i.getValue()));
        }
        
        Collections.sort(vec,(a,b)->{
           if(a.second==b.second){
               return b.first - a.first; //dec. -> big - small OR Integer.compare(big, small)
           } 
           return a.second - b.second; //inc. -> small - big OR Integer.compare(small, big) 
        });
        
        // ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int[] ans = new int[n];
        int k=0;
        for(int i=0;i<vec.size();i++){
            while(vec.get(i).second>0){
                // ans.add(vec.get(i).first);
                ans[k++] = vec.get(i).first;
                vec.get(i).second--;
            }
        }
        
        return ans;
    }
}