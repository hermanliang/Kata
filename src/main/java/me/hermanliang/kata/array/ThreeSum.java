package me.hermanliang.kata.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/3sum/description/">
 * https://leetcode.com/problems/3sum/description/</a>
 * @see <a href="https://leetcode.com/problems/3sum-closest/description/">
 * https://leetcode.com/problems/3sum-closest/description/</a>
 * @see <a href="https://leetcode.com/problems/3sum-smaller/">
 * https://leetcode.com/problems/3sum-smaller/</a>
 */
public class ThreeSum {

  /**
   * 15. 3Sum [Medium]
   * <p>
   * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
   * Find all unique triplets in the array which gives the sum of zero.
   * <p>
   * Note: The solution set must not contain duplicate triplets.
   *
   * @param nums number array
   * @return all unique triplets in array which gives the sum of zero
   */
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    if (nums == null || nums.length < 3) return result;
    Map<Integer, Set<Integer>> map = new HashMap<>();
    Arrays.sort(nums);
    int len = nums.length;
    for (int i = 0; i < len - 2; i++) {
      int first = nums[i];
      int start = i + 1;
      int end = len - 1;
      if (!map.containsKey(first)) {
        map.put(first, new HashSet<>());
      }
      while (end > start) {
        int sum = first + nums[start] + nums[end];
        if (sum == 0) {
          if (!map.get(first).contains(nums[start])) {
            map.get(first).add(nums[start]);
            result.add(Arrays.asList(first, nums[start], nums[end]));
          }
          start++;
          end--;
        } else if (sum > 0) {
          end--;
        } else {
          start++;
        }
      }
    }
    return result;
  }

  /**
   * 16. 3Sum Closest [Medium]
   * <p>
   * Given an array nums of n integers and an integer target, find three integers in nums such that
   * the sum is closest to target. Return the sum of the three integers. You may assume that each
   * input would have exactly one solution.
   * <p>
   * Example:
   * <p>
   * Given array nums = [-1, 2, 1, -4], and target = 1.
   * <p>
   * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
   *
   * @param nums number array
   * @param target target
   * @return sum of the three integers closest to target
   */
  public int threeSumClosest(int[] nums, int target) {
    if (nums == null || nums.length < 3) return 0;
    Arrays.sort(nums);
    int len = nums.length;
    int result = Integer.MAX_VALUE;
    for (int i = 0; i < len - 2; i++) {
      int first = nums[i];
      int start = i + 1;
      int end = len - 1;
      while (end > start) {
        int sum = first + nums[start] + nums[end] - target;
        if (sum == 0) {
          return target;
        } else if (sum > 0) {
          end--;
        } else {
          start++;
        }
        if (Math.abs(sum) < Math.abs(result)) {
          result = sum;
        }
      }
    }
    return result + target;
  }

  /**
   * 259. 3Sum Smaller [Medium]
   *
   * Given an array of n integers nums and a target, find the number of index triplets i, j, k with
   * 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.
   *
   * Example:
   *
   * Input: nums = [-2,0,1,3], and target = 2
   *
   * Output: 2
   *
   * Explanation: Because there are two triplets which sums are less than 2:
   *
   * [-2,0,1]
   *
   * [-2,0,3]
   *
   * Follow up: Could you solve it in O(n2) runtime?
   *
   * @param nums number array
   * @param target target
   * @return output
   */
  public int threeSumSmaller(int[] nums, int target) {
    Arrays.sort(nums);
    int count = 0;
    for (int i = 0; i < nums.length - 2; i++) {
      count += twoSumSmaller(nums, target - nums[i], i + 1);
    }
    return count;
  }

  private int twoSumSmaller(int[] nums, int target, int start) {
    int count = 0;
    int left = start;
    int right = nums.length - 1;
    while (left < right) {
      if (nums[left] + nums[right] < target) {
        count += right - left;
        left++;
      } else {
        right--;
      }
    }
    return count;
  }
}
