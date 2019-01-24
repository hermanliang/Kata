package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProductArrayTest {

    @Test
    public void productExceptSelf() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, new ProductArray().productExceptSelf(nums));
    }
}