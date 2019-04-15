package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSubArrayTest {

  @Test
  public void maxSubArray() {
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int expected = 6;
    assertEquals(expected, new MaxSubArray().maxSubArray(nums));
  }
}