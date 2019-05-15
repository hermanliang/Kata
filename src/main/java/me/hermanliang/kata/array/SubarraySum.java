package me.hermanliang.kata.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/subarray-sum-equals-k/">
 * https://leetcode.com/problems/subarray-sum-equals-k/</a>
 * @see <a href="https://leetcode.com/problems/continuous-subarray-sum/">
 * https://leetcode.com/problems/continuous-subarray-sum/</a>
 * @see <a href="https://leetcode.com/problems/minimum-size-subarray-sum/">
 * https://leetcode.com/problems/minimum-size-subarray-sum/</a>
 */
public class SubarraySum {

  /**
   * 560. Subarray Sum Equals K [Medium]
   * <p>
   * Given an array of integers and an integer k, you need to find the total number of continuous
   * subarrays whose sum equals to k.
   * <p>
   * Example 1:
   * <p>
   * Input:nums = [1,1,1], k = 2 Output: 2 Note:
   * <p>
   * The length of the array is in range [1, 20,000]. The range of numbers in the array is [-1000,
   * 1000] and the range of the integer k is [-1e7, 1e7].
   *
   * @param nums an integer array
   * @param k target sum
   * @return total number of continuous subarrays
   */
  public int subarraySum(int[] nums, int k) {
    int count = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    int sum = 0;
    for (int n : nums) {
      sum += n;
      if (map.containsKey(sum - k)) {
        count += map.get(sum - k);
      }
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    return count;
  }

  /**
   * 523. Continuous Subarray Sum [Medium]
   * <p>
   * Given a list of non-negative numbers and a target integer k, write a function to check if the
   * array has a continuous subarray of size at least 2 that sums up to the multiple of k, that is,
   * sums up to n*k where n is also an integer.
   * <p>
   * Example 1:
   * <p>
   * Input: [23, 2, 4, 6, 7],  k=6 Output: True Explanation: Because [2, 4] is a continuous subarray
   * of size 2 and sums up to 6. Example 2:
   * <p>
   * Input: [23, 2, 6, 4, 7],  k=6 Output: True Explanation: Because [23, 2, 6, 4, 7] is an
   * continuous subarray of size 5 and sums up to 42. Note:
   * <p>
   * The length of the array won't exceed 10,000. You may assume the sum of all the numbers is in
   * the range of a signed 32-bit integer.
   *
   * @param nums an integer array
   * @param k target integer
   * @return result
   */
  public boolean checkSubarraySum(int[] nums, int k) {
    if (k == 0) {
      for (int n : nums) {
        if (k != n) return false;
      }
      return nums.length > 1;
    }
    for (int i = 0; i < nums.length; i++) {
      int sum = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        sum += nums[j];
        if (sum % k == 0) return true;
      }
    }
    return false;
  }

  /**
   * 209. Minimum Size Subarray Sum [Medium]
   *
   * Given an array of n positive integers and a positive integer s, find the minimal length of a
   * contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
   *
   * Example:
   *
   * Input: s = 7, nums = [2,3,1,2,4,3]
   *
   * Output: 2
   *
   * Explanation: the subarray [4,3] has the minimal length under the problem constraint.
   *
   * Follow up: If you have figured out the O(n) solution, try coding another solution of which the
   * time complexity is O(n log n).
   *
   * @param s target sub-array sum
   * @param nums number array
   * @return min. sub-array length
   */
  public int minSubArrayLen(int s, int[] nums) {
    return 0;
  }
}
