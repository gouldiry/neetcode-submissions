class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int currPrice = prices[0];
        for(int i = 0; i < prices.length; i++){
            if(currPrice > prices[i]){
                currPrice = prices[i];
            }
            profit = Math.max(profit, prices[i] - currPrice);
        }
        return profit;
    }
}
