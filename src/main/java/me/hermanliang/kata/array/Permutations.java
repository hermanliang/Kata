package me.hermanliang.kata.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/permutations/description/">
 * https://leetcode.com/problems/permutations/description/</a>
 * @see <a href="https://leetcode.com/problems/permutations-ii/">
 * https://leetcode.com/problems/permutations-ii/</a>
 * @see <a href="https://leetcode.com/problems/next-permutation/">
 * https://leetcode.com/problems/next-permutation/</a>
 */
public class Permutations {

  /**
   * 46. Permutations [Medium]
   * <p>
   * Given a collection of distinct integers, return all possible permutations.
   * <p>
   * Example:
   * <p>
   * Input: [1,2,3] Output: [ [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1] ]
   *
   * @param nums an integer array
   * @return all possible permutations
   */
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ret = new ArrayList<>();
    permute(ret, nums, new ArrayList<>());
    return ret;
  }

  private void permute(List<List<Integer>> ret, int[] nums, List<Integer> list) {
    if (nums.length == list.size()) {
      ret.add(new ArrayList<>(list));
    }
    for (int n : nums) {
      if (list.contains(n)) continue;
      list.add(n);
      permute(ret, nums, list);
      list.remove(list.size() - 1);
    }
  }

  /**
   * 47. Permutations II [Medium]
   * <p>
   * Given a collection of numbers that might contain duplicates, return all possible unique
   * permutations.
   * <p>
   * Example:
   * <p>
   * Input: [1,1,2] Output: [ [1,1,2], [1,2,1], [2,1,1] ]
   *
   * @param nums an integer array
   * @return all possible unique permutations
   */
  public List<List<Integer>> permuteUnique(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> ret = new ArrayList<>();
    permute(ret, new ArrayList<>(), new boolean[nums.length], nums);
    return ret;
  }

  private void permute(List<List<Integer>> ret, List<Integer> list, boolean[] used, int[] nums) {
    if (list.size() == nums.length) {
      ret.add(new ArrayList<>(list));
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      if (used[i]) continue;
      if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
      list.add(nums[i]);
      used[i] = true;
      permute(ret, list, used, nums);
      list.remove(list.size() - 1);
      used[i] = false;
    }
  }

  /**
   * 31. Next Permutation [Medium]
   *
   * Implement next permutation, which rearranges numbers into the lexicographically next greater
   * permutation of numbers.
   *
   * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie,
   * sorted in ascending order).
   *
   * The replacement must be in-place and use only constant extra memory.
   *
   * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in
   * the right-hand column.
   *
   * 1,2,3 → 1,3,2
   *
   * 3,2,1 → 1,2,3
   *
   * 1,1,5 → 1,5,1
   */
  public void nextPermutation(int[] nums) {
    int i = nums.length - 2;
    while (i >= 0 && nums[i + 1] <= nums[i]) {
      i--;
    }
    if (i >= 0) {
      int j = nums.length - 1;
      while (j > i && nums[j] <= nums[i]) {
        j--;
      }
      swap(nums, i, j);
    }
    reverse(nums, i + 1);
  }

  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }

  private void reverse(int[] nums, int start) {
    int end = nums.length - 1;
    while (end > start) {
      swap(nums, start, end);
      end--;
      start++;
    }
  }
}
