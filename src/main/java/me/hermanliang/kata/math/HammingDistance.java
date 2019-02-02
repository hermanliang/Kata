package me.hermanliang.kata.math;

/**
 * @see <a href="https://leetcode.com/problems/hamming-distance/description/">
 * https://leetcode.com/problems/hamming-distance/description/</a>
 */
public class HammingDistance {

    /**
     * 461. Hamming Distance [Easy]
     * <p>
     * The Hamming distance between two integers is the number of positions at which the
     * corresponding bits are different.
     * <p>
     * Given two integers x and y, calculate the Hamming distance.
     * <p>
     * Note:
     * 0 ≤ x, y < 231.
     * <p>
     * Example:
     * <p>
     * Input: x = 1, y = 4
     * <p>
     * Output: 2
     * <p>
     * Explanation:
     * 1   (0 0 0 1)
     * 4   (0 1 0 0)
     *        ↑   ↑
     * <p>
     * The above arrows point to positions where the corresponding bits are different.
     *
     * @param x x
     * @param y y
     * @return Hamming distance between x and y
     */
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += (z >> i & 1);
        }
        return count;
    }
}
