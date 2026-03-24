class Solution {
    public int balancedStringSplit(String s) {
         int count=0;
        int c=0;
        for(char i:s.toCharArray()){
            if(i=='R'){
                c++;
            }
            if(i=='L'){
                c--;
            }
            if(c==0){
                count++;
            }
        }
        return count;
    }
        
    }