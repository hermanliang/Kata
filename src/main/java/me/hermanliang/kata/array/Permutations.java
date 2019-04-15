package me.hermanliang.kata.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/permutations/description/">
 * https://leetcode.com/problems/permutations/description/</a>
 * @see <a href="https://leetcode.com/problems/permutations-ii/">
 * https://leetcode.com/problems/permutations-ii/</a>
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
}
