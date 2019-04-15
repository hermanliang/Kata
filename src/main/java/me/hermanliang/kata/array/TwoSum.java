package me.hermanliang.kata.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/two-sum/description/">
 * https://leetcode.com/problems/two-sum/description/</a>
 */
public class TwoSum {

  /**
   * 1. Two Sum [Easy]
   * <p>
   * Given an array of integers, return indices of the two numbers such that they add up to a
   * specific target. You may assume that each input would have exactly one solution, and you may
   * not use the same element twice.
   *
   * @param numbers array of integers
   * @param target target
   * @return indices of the two numbers
   */
  public int[] twoSum(int[] numbers, int target) {
    int[] ret = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      if (map.containsKey(target - numbers[i])) {
        ret[0] = map.get(target - numbers[i]);
        ret[1] = i;
        break;
      } else {
        map.put(numbers[i], i);
      }
    }
    return ret;
  }
}
