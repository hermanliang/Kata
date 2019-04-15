package me.hermanliang.kata.array;

/**
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/</a>
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/">
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/</a>
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/">
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/</a>
 */
public class MaxProfit {

  /**
   * 121. Best Time to Buy and Sell Stock [Easy]
   * <p>
   * Say you have an array for which the ith element is the price of a given stock on day i.
   * <p>
   * If you were only permitted to complete at most one transaction (i.e., buy one and sell one
   * share of the stock), design an algorithm to find the maximum profit.
   * <p>
   * Note that you cannot sell a stock before you buy one.
   * <p>
   * Example 1:
   * <p>
   * Input: [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price =
   * 6), profit = 6-1 = 5. Not 7-1 = 6, as selling price needs to be larger than buying price.
   * Example 2:
   * <p>
   * Input: [7,6,4,3,1] Output: 0 Explanation: In this case, no transaction is done, i.e. max profit
   * = 0.
   *
   * @param prices prices
   * @return max profit
   */
  public int maxProfit(int[] prices) {
    int profit = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int price : prices) {
      if (price < minPrice) {
        minPrice = price;
      } else {
        profit = Math.max(profit, price - minPrice);
      }
    }
    return profit;
  }

  /**
   * 122. Best Time to Buy and Sell Stock II [Easy]
   * <p>
   * Say you have an array for which the ith element is the price of a given stock on day i.
   * <p>
   * Design an algorithm to find the maximum profit. You may complete as many transactions as you
   * like (i.e., buy one and sell one share of the stock multiple times).
   * <p>
   * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the
   * stock before you buy again).
   * <p>
   * Example 1:
   * <p>
   * Input: [7,1,5,3,6,4] Output: 7 Explanation: Buy on day 2 (price = 1) and sell on day 3 (price =
   * 5), profit = 5-1 = 4. Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3
   * = 3. Example 2:
   * <p>
   * Input: [1,2,3,4,5] Output: 4 Explanation: Buy on day 1 (price = 1) and sell on day 5 (price =
   * 5), profit = 5-1 = 4. Note that you cannot buy on day 1, buy on day 2 and sell them later, as
   * you are engaging multiple transactions at the same time. You must sell before buying again.
   * Example 3:
   * <p>
   * Input: [7,6,4,3,1] Output: 0 Explanation: In this case, no transaction is done, i.e. max profit
   * = 0.
   *
   * @param prices prices
   * @return max profit with multiple transactions
   */
  public int maxProfitWithMultipleTransactions(int[] prices) {
    int maxprofit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i - 1]) {
        maxprofit += prices[i] - prices[i - 1];
      }
    }
    return maxprofit;
  }

  /**
   * 123. Best Time to Buy and Sell Stock III [Hard]
   * <p>
   * Say you have an array for which the ith element is the price of a given stock on day i.
   * <p>
   * Design an algorithm to find the maximum profit. You may complete at most two transactions.
   * <p>
   * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the
   * stock before you buy again).
   * <p>
   * Example 1:
   * <p>
   * Input: [3,3,5,0,0,3,1,4] Output: 6 Explanation: Buy on day 4 (price = 0) and sell on day 6
   * (price = 3), profit = 3-0 = 3. Then buy on day 7 (price = 1) and sell on day 8 (price = 4),
   * profit = 4-1 = 3. Example 2:
   * <p>
   * Input: [1,2,3,4,5] Output: 4 Explanation: Buy on day 1 (price = 1) and sell on day 5 (price =
   * 5), profit = 5-1 = 4. Note that you cannot buy on day 1, buy on day 2 and sell them later, as
   * you are engaging multiple transactions at the same time. You must sell before buying again.
   * Example 3:
   * <p>
   * Input: [7,6,4,3,1] Output: 0 Explanation: In this case, no transaction is done, i.e. max profit
   * = 0.
   *
   * @param prices prices
   * @return max profit with two transactions
   */
  public int maxProfitWithTwoTransactions(int[] prices) {
    int max = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      int price = prices[i];
      if (price < minPrice) {
        minPrice = price;
      } else {
        max = Math.max(max, price - minPrice + maxProfit(prices, i + 1));
      }
    }
    return max;
  }

  private int maxProfit(int[] prices, int start) {
    int max = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = start; i < prices.length; i++) {
      int price = prices[i];
      if (price < minPrice) {
        minPrice = price;
      } else {
        max = Math.max(max, price - minPrice);
      }
    }
    return max;
  }
}
