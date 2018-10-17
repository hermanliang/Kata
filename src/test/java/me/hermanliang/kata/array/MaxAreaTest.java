package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxAreaTest {

    @Test
    public void maxArea() {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        assertEquals(expected, new MaxArea().maxArea(heights));
    }
}