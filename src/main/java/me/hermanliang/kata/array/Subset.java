package me.hermanliang.kata.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/subsets/description/">
 * https://leetcode.com/problems/subsets/description/</a>
 */
public class Subset {

    /**
     * 78. Subsets [Medium]
     * <p>
     * Given a set of distinct integers, nums, return all possible subsets (the power set).
     * <p>
     * Note: The solution set must not contain duplicate subsets.
     * <p>
     * Example:
     * <p>
     * Input: nums = [1,2,3]
     * Output:
     * [
     * [3],
     * [1],
     * [2],
     * [1,2,3],
     * [1,3],
     * [2,3],
     * [1,2],
     * []
     * ]
     *
     * @param nums an array
     * @return all possible subsets of the array
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> container = new ArrayList<>();
        subsets(container, new ArrayList<>(), 0, nums);
        return container;
    }

    private void subsets(List<List<Integer>> container, List<Integer> holder, int index, int[] nums) {
        if (index == nums.length) {
            container.add(holder);
            return;
        }
        subsets(container, new ArrayList<>(holder), index + 1, nums);
        int n = nums[index];
        holder.add(n);
        subsets(container, new ArrayList<>(holder), index + 1, nums);
    }
}
