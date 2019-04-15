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

  @Test
  public void checkSubarraySum1() {
    int[] nums = {23, 2, 4, 6, 7};
    int k = 6;
    boolean expected = true;
    // Explanation: Because [2, 4] is a continuous subarray of size 2 and sums up to 6.
    assertEquals(expected, new SubarraySum().checkSubarraySum(nums, k));
  }

  @Test
  public void checkSubarraySum2() {
    int[] nums = {23, 2, 6, 4, 7};
    int k = 6;
    boolean expected = true;
    // Explanation: Because [23, 2, 6, 4, 7] is an continuous subarray of size 5 and sums up to 42.
    assertEquals(expected, new SubarraySum().checkSubarraySum(nums, k));
  }
}