class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxProfit = 0;

        // two pointer, but we only move one side
        while(r < prices.length){
            if(prices[l] < prices[r]){
                int currentP = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, currentP);
            }else{
                l = r;
            }
            r++;
        }

        return maxProfit;
        
    }
}
