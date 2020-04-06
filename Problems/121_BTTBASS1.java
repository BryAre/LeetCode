/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * If you were only permitted to complete at most one transaction (i.e., buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 * 
 * Note that you cannot sell a stock before you buy one.
 */

class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0, profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit += prices[i] - prices[i - 1]; // compare the difference between the current element and previous one.
            profit = Math.max(profit, 0); // check to see that its greater than 0
            maxProfit = Math.max(maxProfit, profit); // check which is larger.

        }

        return maxProfit;
    }
}