package me.hermanliang.kata.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/combination-sum/description/">
 * https://leetcode.com/problems/combination-sum/description/</a>
 */
public class CombinationSum {

  /**
   * 39. Combination Sum [Medium]
   * <p>
   * Given a set of candidate numbers (candidates) (without duplicates) and a target number
   * (target), find all unique combinations in candidates where the candidate numbers sums to
   * target.
   * <p>
   * The same repeated number may be chosen from candidates unlimited number of times.
   * <p>
   * Note:
   * <p>
   * All numbers (including target) will be positive integers. The solution set must not contain
   * duplicate combinations. Example 1:
   * <p>
   * Input: candidates = [2,3,6,7], target = 7, A solution set is: [ [7], [2,2,3] ] Example 2:
   * <p>
   * Input: candidates = [2,3,5], target = 8, A solution set is: [ [2,2,2,2], [2,3,3], [3,5] ]
   *
   * @param candidates candidates
   * @param target target
   * @return output
   */
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> result = new ArrayList<>();
    Queue<Integer> q1 = new LinkedList<>();
    Queue<List<Integer>> q2 = new LinkedList<>();
    q1.offer(target);
    q2.offer(new ArrayList<>());
    while (!q1.isEmpty()) {
      int t = q1.poll();
      List<Integer> list = q2.poll();
      for (int num : candidates) {
        if (num == t) {
          if (!list.isEmpty() && list.get(list.size() - 1) > num) continue;
          list.add(num);
          result.add(list);
        } else if (t > num) {
          if (!list.isEmpty() && list.get(list.size() - 1) > num) continue;
          q1.offer(t - num);
          List<Integer> l = new ArrayList<>(list);
          l.add(num);
          q2.offer(l);
        }
      }
    }
    return result;
  }
}
