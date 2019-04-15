package me.hermanliang.kata.array;

/**
 * @see <a href="https://leetcode.com/problems/product-of-array-except-self/description/">
 * https://leetcode.com/problems/product-of-array-except-self/description/</a>
 */
public class ProductArray {

  /**
   * 238. Product of Array Except Self [Medium]
   * <p>
   * Given an array nums of n integers where n > 1,  return an array output such that output[i] is
   * equal to the product of all the elements of nums except nums[i].
   * <p>
   * Example:
   * <p>
   * Input:  [1,2,3,4] Output: [24,12,8,6] Note: Please solve it without division and in O(n).
   * <p>
   * Follow up: Could you solve it with constant space complexity? (The output array does not count
   * as extra space for the purpose of space complexity analysis.)
   *
   * @param nums an integer array
   * @return output array
   */
  public int[] productExceptSelf(int[] nums) {
    int[] output = new int[nums.length];
    output[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      output[i] = output[i - 1] * nums[i - 1];
    }
    int right = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      output[i] *= right;
      right *= nums[i];
    }
    return output;
  }
}
