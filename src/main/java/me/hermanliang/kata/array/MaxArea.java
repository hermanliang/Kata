package me.hermanliang.kata.array;

/**
 * @see <a href="https://leetcode.com/problems/container-with-most-water/description/">
 * https://leetcode.com/problems/container-with-most-water/description/</a>
 */
public class MaxArea {

    /**
     * 11. Container With Most Water [Medium]
     * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
     * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
     * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
     * <p>
     * Note: You may not slant the container and n is at least 2.
     *
     * @param heights water heights
     * @return
     */
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int maxArea = 0;
        while (end > start) {
            maxArea = Math.max(Math.min(heights[start], heights[end]) * (end - start), maxArea);
            if (heights[start] == heights[end]) {
                start++;
                end--;
            } else if (heights[start] > heights[end]) {
                end--;
            } else {
                start++;
            }
        }
        return maxArea;
    }
}
