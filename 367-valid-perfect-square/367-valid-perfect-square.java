class Solution
{
    public boolean isPerfectSquare(int num)
    {
        long mid,left=1,right=num;
        
        while(left<=right)
        {
            mid=left+(right-left)/2;
            if(mid*mid==num)
            {
                return true;
            }
            else if(mid*mid <num)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return false;
    }
}