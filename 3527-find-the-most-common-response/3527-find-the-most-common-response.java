class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String,Integer> mpp = new TreeMap<>();
        
        for(List<String> str: responses){
            Set<String> stt = new HashSet<>();
            for(String s: str){

                if(stt.contains(s)){
                    continue;
                }
                
                mpp.put(s,mpp.getOrDefault(s,0)+1);
                stt.add(s);
            }
        }
        
        String ans="";
        int maxCnt=-1;
        
        for(Map.Entry<String, Integer> it: mpp.entrySet()){
            // System.out.println(it.getKey());
            if(it.getValue()>maxCnt){
                maxCnt=it.getValue();
                ans=it.getKey();
            }
        }
        return ans;
    }
}