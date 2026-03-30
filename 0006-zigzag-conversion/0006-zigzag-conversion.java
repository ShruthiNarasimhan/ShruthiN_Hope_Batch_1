class Solution {
    public String convert(String s, int numRows) {
       if(s.length()<numRows||numRows==1)
       {
        return s;
       }
       List<Character>[] rows=new ArrayList[numRows];
       for(int i=0;i<numRows;i++)
       {
        rows[i]=new ArrayList<>();
       }
       int currRow=0;
       boolean flag=false;
       for(char c:s.toCharArray())
       {
        rows[currRow].add(c);
        if(currRow==0||currRow==numRows-1)
            flag=!flag;
            currRow+=flag?1:-1;
       }
       StringBuilder result=new StringBuilder();
       for(List<Character> row:rows)
       {
        for(char c:row)
        {
            result.append(c);
        }
       }
       return result.toString();

    }
}