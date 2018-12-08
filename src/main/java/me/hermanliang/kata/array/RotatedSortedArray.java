package me.hermanliang.kata.array;

/**
 * @see <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/description/">
 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/</a>
 */
public class RotatedSortedArray {

    /**
     * 33. Search in Rotated Sorted Array [Medium]
     * <p>
     * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
     * <p>
     * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
     * <p>
     * You are given a target value to search. If found in the array return its index, otherwise return -1.
     * <p>
     * You may assume no duplicate exists in the array.
     * <p>
     * Your algorithm's runtime complexity must be in the order of O(log n).
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [4,5,6,7,0,1,2], target = 0
     * Output: 4
     * Example 2:
     * <p>
     * Input: nums = [4,5,6,7,0,1,2], target = 3
     * Output: -1
     *
     * @param nums   a rotated sorted array
     * @param target target value to search
     * @return index
     */
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (end >= start) {
            int middle = start + (end - start) / 2;
            if (nums[start] > nums[middle]) { // left part is not sorted
                if (target >= nums[middle] && target <= nums[end]) {
                    return binarySearch(nums, middle, end, target);
                } else {
                    end = middle - 1;
                }
            } else if (nums[end] < nums[middle]) { // right part is not sorted
                if (target >= nums[start] && target <= nums[middle]) {
                    return binarySearch(nums, start, middle, target);
                } else {
                    start = middle + 1;
                }
            } else { // sorted array
                return binarySearch(nums, start, end, target);
            }
        }
        return -1;
    }

    private int binarySearch(int[] nums, int start, int end, int target) {
        while (end >= start) {
            int middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
