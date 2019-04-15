package me.hermanliang.kata.math;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/single-number/">
 * https://leetcode.com/problems/single-number/</a>
 * @see <a href="https://leetcode.com/problems/single-number-ii/">
 * https://leetcode.com/problems/single-number-ii/</a>
 */
public class SingleNumber {

  /**
   * 136. Single Number [Easy]
   * <p>
   * Given a non-empty array of integers, every element appears twice except for one. Find that
   * single one.
   * <p>
   * Note:
   * <p>
   * Your algorithm should have a linear runtime complexity. Could you implement it without using
   * extra memory?
   * <p>
   * Example 1:
   * <p>
   * Input: [2,2,1] Output: 1 Example 2:
   * <p>
   * Input: [4,1,2,1,2] Output: 4
   *
   * @param nums an integer array
   * @return the single number
   */
  public int singleNumber(int[] nums) {
    int result = 0;
    for (int n : nums) {
      result ^= n;
    }
    return result;
  }

  /**
   * 137. Single Number II [Medium]
   * <p>
   * Given a non-empty array of integers, every element appears three times except for one, which
   * appears exactly once. Find that single one.
   * <p>
   * Note:
   * <p>
   * Your algorithm should have a linear runtime complexity. Could you implement it without using
   * extra memory?
   * <p>
   * Example 1:
   * <p>
   * Input: [2,2,3,2] Output: 3 Example 2:
   * <p>
   * Input: [0,1,0,1,0,1,99] Output: 99
   *
   * @param nums an integer array
   * @return the single number
   */
  public int singleNumberWithThree(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i += 3) {
      if (nums[i] != nums[i + 1]) return nums[i];
    }
    return nums[nums.length - 1];
  }
}
