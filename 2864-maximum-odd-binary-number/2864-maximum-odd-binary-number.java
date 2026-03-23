class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] c=s.toCharArray();
        Arrays.sort(c);
        int len=c.length;
        int ones=0;
        int i=0;
        for(char ch:c)
        {
            if(ch=='1')
            ones++;
        }
        for(int j=len-2;j>=0&&i<ones-1;j--)
        {
            if(c[j]=='1')
            {
            char temp=c[j];
            c[j]=c[i];
            c[i]=temp;
            i++;
            }
        }
        String str = String.valueOf(c); 
        return str;
    }
}









