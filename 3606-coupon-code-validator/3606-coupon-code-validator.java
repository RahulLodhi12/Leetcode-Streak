class Pair<U, V> {
    public U first;
    public V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> ans = new ArrayList<>();
        
        List<Pair<String,String>> lst = new ArrayList<>();

        int n=code.length;

        for(int i=0;i<n;i++){
            String c = code[i];
            String bl = businessLine[i];
            if(c.matches("[a-zA-Z0-9_]+") && isActive[i] && !bl.equals("invalid")){
                lst.add(new Pair(c,bl));
            }
        }

        System.out.println(lst.size());
        for(Pair<String,String> p: lst){
            System.out.println(p.first + " " + p.second);
        }

        lst.sort((a,b)->{
            if(a.second.equals(b.second)){
                return a.first.compareTo(b.first);
            }
            return a.second.compareTo(b.second);
        });

        for(Pair<String,String> p: lst){
            // System.out.println(p.first + " " + p.second);
            ans.add(p.first);
        }

        return ans;
    }
}