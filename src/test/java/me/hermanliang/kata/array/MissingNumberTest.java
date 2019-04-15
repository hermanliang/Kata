package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingNumberTest {

  @Test
  public void missingNumber1() {
    int[] nums = {3, 0, 1};
    int expected = 2;
    assertEquals(expected, new MissingNumber().missingNumber(nums));
  }

  @Test
  public void missingNumber2() {
    int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
    int expected = 8;
    assertEquals(expected, new MissingNumber().missingNumber(nums));
  }
}