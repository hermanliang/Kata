package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotatedSortedArrayTest {

    @Test
    public void search1() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int expected = 4;
        assertEquals(expected, new RotatedSortedArray().search(nums, target));
    }

    @Test
    public void search2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int expected = -1;
        assertEquals(expected, new RotatedSortedArray().search(nums, target));
    }

    @Test
    public void searchWithDuplicate1() {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        boolean expected = true;
        assertEquals(expected, new RotatedSortedArray().searchWithDuplicate(nums, target));
    }

    @Test
    public void searchWithDuplicate2() {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 3;
        boolean expected = false;
        assertEquals(expected, new RotatedSortedArray().searchWithDuplicate(nums, target));
    }
}