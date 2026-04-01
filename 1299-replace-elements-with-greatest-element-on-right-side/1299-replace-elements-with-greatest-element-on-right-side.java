class Solution {
    public int[] replaceElements(int[] arr) {
        List<Integer> list=new ArrayList<>();
        int n=arr.length;
        if(n==1)
        {
            return new int[]{-1};
        }
        int max=-1;
        for(int i=n-1;i>=0;i--)
        {
            list.add(max);
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        Collections.reverse(list);
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}