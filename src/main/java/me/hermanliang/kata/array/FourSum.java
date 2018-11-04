package me.hermanliang.kata.array;

import java.util.*;

/**
 * @see <a href="https://leetcode.com/problems/4sum/description/">
 * https://leetcode.com/problems/4sum/description/</a>
 */
public class FourSum {

    /**
     * 18. 4Sum [Medium]
     * <p>
     * Given an array nums of n integers and an integer target, are there elements a, b, c, and d
     * in nums such that a + b + c + d = target? Find all unique quadruplets in the array
     * which gives the sum of target.
     * <p>
     * Note:
     * The solution set must not contain duplicate quadruplets.
     * <p>
     * Example:
     * <p>
     * Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
     * <p>
     * A solution set is:
     * [
     * [-1,  0, 0, 1],
     * [-2, -1, 1, 2],
     * [-2,  0, 0, 2]
     * ]
     *
     * @param nums   number array
     * @param target target
     * @return all unique quadruplets in the array which gives the sum of target
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) return result;
        Map<String, Set<Integer>> map = new HashMap<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 3; i++) {
            for (int j = i + 1; j < len - 2; j++) {
                int first = nums[i];
                int second = nums[j];
                int start = j + 1;
                int end = len - 1;
                String key = String.format("%d;%d", first, second);
                if (!map.containsKey(key)) {
                    map.put(key, new HashSet<>());
                }
                while (end > start) {
                    int sum = first + second + nums[start] + nums[end] - target;
                    if (sum == 0) {
                        if (!map.get(key).contains(nums[start])) {
                            map.get(key).add(nums[start]);
                            result.add(Arrays.asList(first, second, nums[start], nums[end]));
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
        }
        return result;
    }
}
