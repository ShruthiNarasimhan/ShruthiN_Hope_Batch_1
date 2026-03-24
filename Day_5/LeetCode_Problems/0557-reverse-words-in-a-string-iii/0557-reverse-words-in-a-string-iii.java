class Solution {
    public String reverseWords(String s) {
        
         StringBuilder res=new StringBuilder();
        String[] words=s.split(" ");
        for(String r:words){
            StringBuilder tmp=new StringBuilder(r);
            res.append(tmp.reverse()).append(" ");
        }
        return res.toString().trim();
    }
}