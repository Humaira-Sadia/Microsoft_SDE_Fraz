class Solution 
{
    int a[]={0,0};
    public int[] twoSum(int[] nums, int target) 
    {
       for(int i=0;i<nums.length-1;i++)
        for(int j=i+1;j<nums.length;j++)
        {
            if((nums[i]+ nums[j]) == target){
                a[0]=i;
                a[1]=j;
                break;
                }
        }
        return a;
    }
}