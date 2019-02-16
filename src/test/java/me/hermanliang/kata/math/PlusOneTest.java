package me.hermanliang.kata.math;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {

    @Test
    public void plusOne1() {
        // The array represents the integer 123.
        int[] digits = {1, 2, 3};
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, new PlusOne().plusOne(digits));
    }

    @Test
    public void plusOne2() {
        // The array represents the integer 4321.
        int[] digits = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};
        assertArrayEquals(expected, new PlusOne().plusOne(digits));
    }
}