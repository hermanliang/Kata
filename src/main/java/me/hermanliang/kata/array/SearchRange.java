package me.hermanliang.kata.array;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/">
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/</a>
 */
public class SearchRange {

    /**
     * 34. Find First and Last Position of Element in Sorted Array [Medium]
     * <p>
     * Given an array of integers nums sorted in ascending order, find the starting and ending position
     * of a given target value.
     * <p>
     * Your algorithm's runtime complexity must be in the order of O(log n).
     * <p>
     * If the target is not found in the array, return [-1, -1].
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [5,7,7,8,8,10], target = 8
     * Output: [3,4]
     * Example 2:
     * <p>
     * Input: nums = [5,7,7,8,8,10], target = 6
     * Output: [-1,-1]
     *
     * @param nums   a sorted integer array
     * @param target target
     * @return starting end ending position of the target value
     */
    public int[] searchRange(int[] nums, int target) {
        int[] output = new int[2];
        Arrays.fill(output, -1);
        int start = 0;
        int end = nums.length - 1;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                output[0] = searchStart(nums, target, start, mid);
                output[1] = searchEnd(nums, target, mid, end);
                break;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return output;
    }

    private int searchStart(int[] nums, int target, int start, int end) {
        if (end == 0 || nums[end - 1] != target) return end;
        end--;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return searchStart(nums, target, start, mid);
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private int searchEnd(int[] nums, int target, int start, int end) {
        if (start == (nums.length - 1) || nums[start + 1] != target) return start;
        start++;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return searchEnd(nums, target, mid, end);
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
