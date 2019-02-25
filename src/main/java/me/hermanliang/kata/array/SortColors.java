package me.hermanliang.kata.array;

/**
 * @see <a href="https://leetcode.com/problems/sort-colors/">
 * https://leetcode.com/problems/sort-colors/</a>
 */
public class SortColors {

    /**
     * 75. Sort Colors [Medium]
     * <p>
     * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the
     * same color are adjacent, with the colors in the order red, white and blue.
     * <p>
     * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
     * <p>
     * Note: You are not suppose to use the library's sort function for this problem.
     * <p>
     * Example:
     * <p>
     * Input: [2,0,2,1,1,0]
     * Output: [0,0,1,1,2,2]
     * Follow up:
     * <p>
     * A rather straight forward solution is a two-pass algorithm using counting sort.
     * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number
     * of 0's, then 1's and followed by 2's.
     * Could you come up with a one-pass algorithm using only constant space?
     *
     * @param nums an integer array
     */
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 0; i < count[0]; i++) {
            nums[i] = 0;
        }
        for (int i = 0; i < count[1]; i++) {
            nums[i + count[0]] = 1;
        }
        for (int i = 0; i < count[2]; i++) {
            nums[i + count[0] + count[1]] = 2;
        }
    }
}
