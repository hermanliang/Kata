package me.hermanliang.kata;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSum() {
        int[] expected = {0, 1};
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        Assert.assertArrayEquals(expected, new TwoSum().twoSum(numbers, target));
    }
}