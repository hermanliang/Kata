package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SearchRangeTest {

    @Test
    public void searchRange1() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4};
        assertArrayEquals(expected, new SearchRange().searchRange(nums, target));
    }

    @Test
    public void searchRange2() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, new SearchRange().searchRange(nums, target));
    }
}