class Solution {
    public void sortColors(int[] nums) {
        int j,temp=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            int min_ind=i;
            for(j=i+1;j<n;j++)
            {
                if(nums[j]<nums[min_ind])
                min_ind=j;
            }
             temp=nums[i];
        nums[i]=nums[min_ind];
        nums[min_ind]=temp;
        
        }

    }
}