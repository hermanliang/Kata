package me.hermanliang.kata.array;

/**
 * @see <a href="https://leetcode.com/problems/maximum-subarray/">
 * https://leetcode.com/problems/maximum-subarray/</a>
 */
public class MaxSubArray {

    /**
     * 53. Maximum Subarray [Easy]
     * <p>
     * Given an integer array nums, find the contiguous subarray (containing at least one number)
     * which has the largest sum and return its sum.
     * <p>
     * Example:
     * <p>
     * Input: [-2,1,-3,4,-1,2,1,-5,4],
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     * Follow up:
     * <p>
     * If you have figured out the O(n) solution, try coding another solution using the
     * divide and conquer approach, which is more subtle.
     *
     * @param nums an integer array
     * @return largest sum of subarray
     */
    public int maxSubArray(int[] nums) {
        // dp[i]: max sum of sub array which end with nums[i]
        // which must >= nums[i]
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            // dp = [-2, 1, -2, 4, 3, 5, 6, 1, 5]
            // if dp[i - 1] < 0, it is a negative effect on sum of sub array
            // so treat nums[i] as the start of sub array
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
