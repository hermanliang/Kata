package me.hermanliang.kata.array;

/**
 * @see <a href="https://leetcode.com/problems/move-zeroes/description/">
 * https://leetcode.com/problems/move-zeroes/description/</a>
 */
public class MoveZeroes {

  /**
   * 283. Move Zeroes [Easy]
   * <p>
   * Given an array nums, write a function to move all 0's to the end of it while maintaining the
   * relative order of the non-zero elements.
   * <p>
   * Example:
   * <p>
   * Input: [0,1,0,3,12] Output: [1,3,12,0,0] Note:
   * <p>
   * You must do this in-place without making a copy of the array. Minimize the total number of
   * operations.
   *
   * @param nums an integer array
   */
  public void moveZeroes(int[] nums) {
    int i = 0;
    for (int n : nums) {
      if (n != 0) {
        nums[i++] = n;
      }
    }
    while (i < nums.length) {
      nums[i++] = 0;
    }
  }
}
