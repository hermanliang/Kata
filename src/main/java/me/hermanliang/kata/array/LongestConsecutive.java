package me.hermanliang.kata.array;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/longest-consecutive-sequence/">
 * https://leetcode.com/problems/longest-consecutive-sequence/</a>
 */
public class LongestConsecutive {

  /**
   * 128. Longest Consecutive Sequence [Hard]
   * <p>
   * Given an unsorted array of integers, find the length of the longest consecutive elements
   * sequence.
   * <p>
   * Your algorithm should run in O(n) complexity.
   * <p>
   * Example:
   * <p>
   * Input: [100, 4, 200, 1, 3, 2] Output: 4 Explanation: The longest consecutive elements sequence
   * is [1, 2, 3, 4]. Therefore its length is 4.
   *
   * @param nums an integer array
   * @return largest consecutive sequence
   */
  public int longestConsecutive(int[] nums) {
    if (nums == null || nums.length == 0) return 0;
    Arrays.sort(nums);
    int maxLen = 0;
    int len = 1;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i + 1] == nums[i]) continue;
      if (nums[i + 1] - nums[i] == 1) {
        len++;
      } else {
        maxLen = Math.max(maxLen, len);
        len = 1;
      }
    }
    return Math.max(maxLen, len);
  }
}
