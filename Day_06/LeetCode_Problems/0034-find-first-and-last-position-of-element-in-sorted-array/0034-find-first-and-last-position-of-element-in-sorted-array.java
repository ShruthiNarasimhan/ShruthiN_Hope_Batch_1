class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new  int[2];
        int i=0;
        while(i<nums.length&&nums[i]!=target) i++;
        res[0]=i;
        while(i<nums.length&&nums[i]==target) i++;
        res[1]=i-1;
        if(res[0]>=nums.length||nums[res[0]]!=target){
            res[0]=-1;
        res[1]=-1;
        }
        return res;
    }
}