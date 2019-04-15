package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestConsecutiveTest {

  @Test
  public void longestConsecutive() {
    int[] nums = {100, 4, 200, 1, 3, 2};
    int expected = 4;
    assertEquals(expected, new LongestConsecutive().longestConsecutive(nums));
  }
}