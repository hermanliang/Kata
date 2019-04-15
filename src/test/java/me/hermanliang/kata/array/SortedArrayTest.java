package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SortedArrayTest {

  @Test
  public void findMedianSortedArrays1() {
    int[] nums1 = {1, 3};
    int[] nums2 = {2};
    assertEquals(2.0, new SortedArray().findMedianSortedArrays(nums1, nums2), 0.1);
  }

  @Test
  public void findMedianSortedArrays2() {
    int[] nums1 = {1, 2};
    int[] nums2 = {3, 4};
    assertEquals(2.5, new SortedArray().findMedianSortedArrays(nums1, nums2), 0.1);
  }

  @Test
  public void findMedianSortedArrays3() {
    int[] nums1 = {};
    int[] nums2 = {2, 3};
    assertEquals(2.5, new SortedArray().findMedianSortedArrays(nums1, nums2), 0.1);
  }

  @Test
  public void merge() {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int m = 3;
    int n = 3;
    int[] nums2 = {2, 5, 6};
    int[] expected = {1, 2, 2, 3, 5, 6};
    new SortedArray().merge(nums1, m, nums2, n);
    assertArrayEquals(expected, nums1);
  }
}