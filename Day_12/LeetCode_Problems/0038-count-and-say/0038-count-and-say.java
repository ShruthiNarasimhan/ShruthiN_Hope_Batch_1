class Solution {
    public String countAndSay(int n) {
        String result="1";
        for(int i=1;i<n;i++)
        {
            result=generate(result);
        }
        return result;
    }
    public String generate(String result)
    {
        StringBuilder sb=new StringBuilder();
        char current=result.charAt(0);
        int count=1;
        for(int i=1;i<result.length();i++)
        {
            if(result.charAt(i)==current)
            {
                count++;
            }
            else{
                 sb.append(count).append(current);
                current=result.charAt(i);
                count=1;
            }
        }
        sb.append(count).append(current);
        return sb.toString();
    }
}