import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        int n=nums.length;
        int[] arr=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(target==nums[i]+nums[j])
                {
                    arr[0]=i;
                    arr[1]=j;
                  return arr;
                }
                
            }
        }
        return arr;
    }
}