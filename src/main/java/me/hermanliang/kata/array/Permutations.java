package me.hermanliang.kata.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/permutations/description/">
 * https://leetcode.com/problems/permutations/description/</a>
 */
public class Permutations {

    /**
     * 46. Permutations [Medium]
     * <p>
     * Given a collection of distinct integers, return all possible permutations.
     * <p>
     * Example:
     * <p>
     * Input: [1,2,3]
     * Output:
     * [
     * [1,2,3],
     * [1,3,2],
     * [2,1,3],
     * [2,3,1],
     * [3,1,2],
     * [3,2,1]
     * ]
     *
     * @param nums an integer array
     * @return all possible permutations
     */
    public List<List<Integer>> permute(int[] nums) {
        return permute(nums, new ArrayList<>());
    }

    private List<List<Integer>> permute(int[] nums, List<Integer> list) {
        List<List<Integer>> ret = new ArrayList<>();
        if (nums.length == list.size()) {
            ret.add(list);
            return ret;
        }
        for (int n : nums) {
            if (list.contains(n)) continue;
            List<Integer> l = new ArrayList<>(list);
            l.add(n);
            ret.addAll(permute(nums, l));
        }
        return ret;
    }
}
