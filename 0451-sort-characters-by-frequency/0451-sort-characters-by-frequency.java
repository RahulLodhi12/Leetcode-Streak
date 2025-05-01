class Pair{
    char first;
    int second;
    Pair(char first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public String frequencySort(String s) {
        //Code similar to: 1636. Sort Array by Increasing Frequency
        HashMap<Character,Integer> mpp = new HashMap<>();

        for(char ch: s.toCharArray()){
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }

        ArrayList<Pair> vec = new ArrayList<>();

        for(Map.Entry<Character,Integer> it: mpp.entrySet()){
            vec.add(new Pair(it.getKey(),it.getValue()));
        }

        Collections.sort(vec,(a,b)->{
            return b.second - a.second;
        });

        String ans="";

        for(int i=0;i<vec.size();i++){
            while(vec.get(i).second>0){
                ans+=vec.get(i).first;
                vec.get(i).second--;
            }
        }

        return ans;
    }
}