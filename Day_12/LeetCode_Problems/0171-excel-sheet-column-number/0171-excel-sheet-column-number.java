class Solution {
    public int titleToNumber(String columnTitle) {
        int n=0;
        for(char ch:columnTitle.toCharArray())
        {
            n*=26;
            n+=ch-'A'+1;
        }
        return n;
    }
}