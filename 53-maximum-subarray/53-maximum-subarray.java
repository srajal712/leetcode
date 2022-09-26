class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int res=nums[0];
        int max=nums[0];
        if(n==0) return 0;
        if(n==1) return nums[0];
        for(int i=1;i<n;i++){
            max=Math.max(max+nums[i],nums[i]);
            res=Math.max(res,max);
        }
        return res ;
    }
}