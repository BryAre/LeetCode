/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many
 * transactions as you like (i.e., buy one and sell one share of the stock
 * multiple times).
 * 
 * Note: You may not engage in multiple transactions at the same time (i.e., you
 * must sell the stock before you buy again).
 */

class Solution {
    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // checks to see the previous element in the array to see if it is less than
            // current one
            if (prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1];
            // if previous element is in fact lower, then the difference of the elements is
            // added to the total amount of profit to be made during the entirety of the
            // loop iteration.
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] ar = { 7, 1, 3, 0, 5 };
        System.out.print(maxProfit(ar));
        // 3 - 1 = 2
        // 5 - 0 = 5
        // 5 + 2 = 7
    }
}