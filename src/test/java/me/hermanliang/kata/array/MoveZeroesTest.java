package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MoveZeroesTest {

    @Test
    public void moveZeroes() {
        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        new MoveZeroes().moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }
}