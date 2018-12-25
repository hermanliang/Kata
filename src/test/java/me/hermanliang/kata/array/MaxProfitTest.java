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
}