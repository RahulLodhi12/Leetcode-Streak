class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int n=s.length();
        int k=p.length();
        
        int[] pHash = new int[26];
        int[] sHash = new int[26];

        for(int i=0;i<k;i++){
            pHash[p.charAt(i)-'a']++;
        }

        //sliding window - fixed type
        int i=0,j=0;
        while(j<n){
            sHash[s.charAt(j)-'a']++;
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(Arrays.equals(pHash,sHash)){
                    ans.add(i);
                }
                sHash[s.charAt(i)-'a']--;
                i++;
                j++;
            }
        }

        return ans;
    }
}