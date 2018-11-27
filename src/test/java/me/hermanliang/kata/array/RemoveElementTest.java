package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RemoveElementTest {

    @Test
    public void removeElement1() {
        int val = 3;
        int[] nums = {3, 2, 2, 3};
        int[] expected = {2, 2};
        int len = new RemoveElement().removeElement(nums, val);
        assertEquals(expected.length, len);
        int[] verify = new int[len];
        System.arraycopy(nums, 0, verify, 0, len);
        assertArrayEquals(expected, verify);
    }

    @Test
    public void removeElement2() {
        int val = 2;
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int[] expected = {0, 1, 3, 0, 4};
        int len = new RemoveElement().removeElement(nums, val);
        assertEquals(expected.length, len);
        int[] verify = new int[len];
        System.arraycopy(nums, 0, verify, 0, len);
        assertArrayEquals(expected, verify);
    }
}