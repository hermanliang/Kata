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
        int max = nums[len - 1];
        if (4 * nums[0] > target || 4 * max < target) return result;
        for (int i = 0; i < len - 3; i++) {
            int first = nums[i];
            if (i > 0 && first == nums[i - 1]) continue;
            if (first + 3 * max < target) continue;
            if (first * 4 > target) continue;
            for (int j = i + 1; j < len - 2; j++) {
                int second = nums[j];
                if (j > i + 1 && second == nums[j - 1]) continue;
                if (second + 2 * max < target - first) continue;
                if (second * 3 > target - first) continue;
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
