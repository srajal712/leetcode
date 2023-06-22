class Solution {
    public int reverse(int x) 
    {
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        int n=x;
        long sum=0;
        int remainder;
        while(n!=0)
        {
             remainder=n%10;
            sum=sum*10+remainder;
            n=n/10;
            
        }
        if(sum > max || sum < min)
        {
            return 0;
        }
        return (int)sum;
    }
}