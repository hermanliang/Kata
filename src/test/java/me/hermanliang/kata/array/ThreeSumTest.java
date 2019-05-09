package me.hermanliang.kata.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class ThreeSumTest {

  @Test
  public void threeSum() {
    int[] numbers = {-1, 0, 1, 2, -1, -4};
    List<Integer> expected1 = Arrays.asList(-1, 0, 1);
    List<Integer> expected2 = Arrays.asList(-1, -1, 2);
    List<List<Integer>> result = new ThreeSum().threeSum(numbers);
    assertEquals(2, result.size());
    List<Integer> list1 = new ArrayList<>(result.get(0));
    List<Integer> list2 = new ArrayList<>(result.get(1));
    Collections.sort(list1);
    Collections.sort(list2);
    assertNotEquals(list1, list2);
    assertTrue(list1.equals(expected1) || list1.equals(expected2));
    assertTrue(list2.equals(expected1) || list2.equals(expected2));
  }

  @Test
  public void threeSumClosest() {
    int[] numbers = {-1, 2, 1, -4};
    int target = 1;
    int expected = 2;
    assertEquals(expected, new ThreeSum().threeSumClosest(numbers, target));
  }

  @Test
  public void threeSumSmaller() {
    int[] nums = {-2, 0, 1, 3};
    int target = 2;
    int expected = 2;
    assertEquals(expected, new ThreeSum().threeSumSmaller(nums, target));
  }
}