class Solution {
    private int[] dp=new int[31];
    public int fib(int N)
    {
     if(N <=1)
         return N;
     if(N==2)
         return 1;
     memoize(N);
        return dp[N];
    }
    public int memoize(int N)
    {
        if(dp[N]!=0)
            return dp[N];
        if(N<3)
            return 1;
        else
            dp[N]=memoize(N-1)+memoize(N-2);
        return memoize(N);
    }
}