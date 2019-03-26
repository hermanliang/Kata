package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProfitTest {

    @Test
    public void maxProfit1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 5;
        // Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        // Not 7-1 = 6, as selling price needs to be larger than buying price.
        assertEquals(expected, new MaxProfit().maxProfit(prices));
    }

    @Test
    public void maxProfit2() {
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;
        // In this case, no transaction is done, i.e. max profit = 0.
        assertEquals(expected, new MaxProfit().maxProfit(prices));
    }

    @Test
    public void maxProfitWithMultipleTransactions1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 7;
        assertEquals(expected, new MaxProfit().maxProfitWithMultipleTransactions(prices));
    }

    @Test
    public void maxProfitWithMultipleTransactions2() {
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4;
        assertEquals(expected, new MaxProfit().maxProfitWithMultipleTransactions(prices));
    }

    @Test
    public void maxProfitWithMultipleTransactions3() {
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;
        assertEquals(expected, new MaxProfit().maxProfitWithMultipleTransactions(prices));
    }
}