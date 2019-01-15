package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestElementTest {

    @Test
    public void findKthLargest1() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int expected = 5;
        assertEquals(expected, new LargestElement().findKthLargest(nums, k));
    }

    @Test
    public void findKthLargest2() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int expected = 4;
        assertEquals(expected, new LargestElement().findKthLargest(nums, k));
    }
}