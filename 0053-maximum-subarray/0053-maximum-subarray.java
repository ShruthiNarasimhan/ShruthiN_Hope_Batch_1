class Solution {
    public int maxSubArray(int[] arr) {
         int max=arr[0];
         int sum=0;
         for(int num:arr)
         {
             sum+=num;
             max= sum>max?sum:max;
             sum=sum<0?0:sum;
         }
         return max;
    }
}