package me.hermanliang.kata.array;

import java.util.*;

/**
 * @see <a href="https://leetcode.com/problems/3sum/description/">
 * https://leetcode.com/problems/3sum/description/</a>
 * @see <a href="https://leetcode.com/problems/3sum-closest/description/">
 * https://leetcode.com/problems/3sum-closest/description/</a>
 */
public class ThreeSum {

    /**
     * 15. 3Sum [Medium]
     * <p>
     * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
     * Find all unique triplets in the array which gives the sum of zero.
     * <p>
     * Note:
     * The solution set must not contain duplicate triplets.
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
     * Given an array nums of n integers and an integer target, find three integers in nums such that the sum
     * is closest to target. Return the sum of the three integers. You may assume that each input would have
     * exactly one solution.
     * <p>
     * Example:
     * <p>
     * Given array nums = [-1, 2, 1, -4], and target = 1.
     * <p>
     * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
     *
     * @param nums   number array
     * @param target target
     * @return sum of the three integers closest to target
     */
    public int threeSumClosest(int[] nums, int target) {
        return 0;
    }
}
