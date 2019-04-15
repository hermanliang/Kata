package me.hermanliang.kata.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleNumberTest {

  @Test
  public void singleNumber1() {
    int[] nums = {2, 2, 1};
    int expected = 1;
    assertEquals(expected, new SingleNumber().singleNumber(nums));
  }

  @Test
  public void singleNumber2() {
    int[] nums = {4, 1, 2, 1, 2};
    int expected = 4;
    assertEquals(expected, new SingleNumber().singleNumber(nums));
  }

  @Test
  public void singleNumberWithThree1() {
    int[] nums = {2, 2, 3, 2};
    int expected = 3;
    assertEquals(expected, new SingleNumber().singleNumberWithThree(nums));
  }

  @Test
  public void singleNumberWithThree2() {
    int[] nums = {0, 1, 0, 1, 0, 1, 99};
    int expected = 99;
    assertEquals(expected, new SingleNumber().singleNumberWithThree(nums));
  }
}