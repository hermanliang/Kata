package me.hermanliang.kata.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class FourSumTest {

  @Test
  public void fourSum() {
    int[] nums = {1, 0, -1, 0, -2, 2};
    int target = 0;
    List<List<Integer>> output = new FourSum().fourSum(nums, target);

    List<Integer> expected1 = Arrays.asList(-1, 0, 0, 1);
    List<Integer> expected2 = Arrays.asList(-2, -1, 1, 2);
    List<Integer> expected3 = Arrays.asList(-2, 0, 0, 2);
    assertEquals(3, output.size());
    List<Integer> list1 = new ArrayList<>(output.get(0));
    List<Integer> list2 = new ArrayList<>(output.get(1));
    List<Integer> list3 = new ArrayList<>(output.get(2));
    Collections.sort(list1);
    Collections.sort(list2);
    Collections.sort(list3);
    assertNotEquals(list1, list2);
    assertNotEquals(list2, list3);
    assertNotEquals(list1, list3);
    assertTrue(list1.equals(expected1) ||
        list1.equals(expected2) ||
        list1.equals(expected3));
    assertTrue(list2.equals(expected1) ||
        list2.equals(expected2) ||
        list2.equals(expected3));
    assertTrue(list3.equals(expected1) ||
        list3.equals(expected2) ||
        list3.equals(expected3));
  }
}