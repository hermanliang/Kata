package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInsertPositionTest {

  @Test
  public void searchInsert1() {
    int[] nums = {1, 3, 5, 6};
    int target = 5;
    int expected = 2;
    assertEquals(expected, new SearchInsertPosition().searchInsert(nums, target));
  }

  @Test
  public void searchInsert2() {
    int[] nums = {1, 3, 5, 6};
    int target = 2;
    int expected = 1;
    assertEquals(expected, new SearchInsertPosition().searchInsert(nums, target));
  }

  @Test
  public void searchInsert3() {
    int[] nums = {1, 3, 5, 6};
    int target = 7;
    int expected = 4;
    assertEquals(expected, new SearchInsertPosition().searchInsert(nums, target));
  }

  @Test
  public void searchInsert4() {
    int[] nums = {1, 3, 5, 6};
    int target = 0;
    int expected = 0;
    assertEquals(expected, new SearchInsertPosition().searchInsert(nums, target));
  }
}