package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortColorsTest {

  @Test
  public void sortColors() {
    int[] nums = {2, 0, 2, 1, 1, 0};
    int[] expected = {0, 0, 1, 1, 2, 2};
    new SortColors().sortColors(nums);
    assertArrayEquals(expected, nums);
  }
}