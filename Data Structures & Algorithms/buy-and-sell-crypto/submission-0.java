class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];      // lowest price seen so far → best day to buy
        int maxProfit = 0;     // best profit found so far

        for (int i = 1; i < prices.length; i++) { // ✅ start from i=1, day 0 already stored
            // Step 1: is today cheaper than any day before? → update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];   // ✅ found a cheaper day to buy → update
            }
            int profit = prices[i] - minPrice;  // if I sell TODAY, what's my profit?
            if (profit > maxProfit) {
                maxProfit = profit; // ✅ better profit found → update
            }
            // Step 2: if I sell today, is profit better than maxProfit? → update maxProfit
        }

        return maxProfit;
    }
}
