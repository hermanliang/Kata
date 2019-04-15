package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RemoveDuplicateTest {

  @Test
  public void removeDuplicates1() {
    int[] nums = {1, 1, 2};
    int[] expected = {1, 2};
    int len = new RemoveDuplicate().removeDuplicates(nums);
    assertEquals(expected.length, len);
    int[] verify = new int[len];
    System.arraycopy(nums, 0, verify, 0, len);
    assertArrayEquals(expected, verify);
  }

  @Test
  public void removeDuplicates2() {
    int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int[] expected = {0, 1, 2, 3, 4};
    int len = new RemoveDuplicate().removeDuplicates(nums);
    assertEquals(expected.length, len);
    int[] verify = new int[len];
    System.arraycopy(nums, 0, verify, 0, len);
    assertArrayEquals(expected, verify);
  }
}