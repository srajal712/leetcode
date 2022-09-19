class Solution {
    public int maxProfit(int[] prices) {
        int buy[]=new int[prices.length];
        int sell[]=new int[prices.length];
        buy[0]=prices[0];
        sell[prices.length-1]=prices[prices.length-1];
        for(int i=1;i<prices.length;i++)
        {
            buy[i]=Math.min(buy[i-1],prices[i]);
        }
        for(int i=prices.length-2;i>=0;i--)
        {
            sell[i]=Math.max(sell[i+1],prices[i]);
        }
        int max=0;
        for(int i=0;i<prices.length;i++){
            max=Math.max(max,sell[i]-buy[i]);
        }
        return max;
    }
}