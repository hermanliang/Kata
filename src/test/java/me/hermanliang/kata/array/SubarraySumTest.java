package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubarraySumTest {

    @Test
    public void subarraySum() {
        int[] nums = {1, 1, 1};
        int k = 2;
        int expected = 2;
        assertEquals(expected, new SubarraySum().subarraySum(nums, k));
    }
}