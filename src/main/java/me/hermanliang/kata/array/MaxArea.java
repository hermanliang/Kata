package me.hermanliang.kata.array;

/**
 * @see <a href="https://leetcode.com/problems/container-with-most-water/description/">
 * https://leetcode.com/problems/container-with-most-water/description/</a>
 */
public class MaxArea {

    /**
     * 11. Container With Most Water
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
            int a1 = heights[start];
            int an = heights[end];
            int level = Math.min(a1, an);
            int area = level * (end - start);
            maxArea = Math.max(area, maxArea);
            if (a1 == an) {
                start++;
                end--;
            } else if (a1 > an) {
                end--;
            } else {
                start++;
            }
        }
        return maxArea;
    }
}
