package me.hermanliang.kata.math;

/**
 * @see <a href="https://leetcode.com/problems/divide-two-integers/description/">
 * https://leetcode.com/problems/divide-two-integers/description/</a>
 */
public class DivideInteger {

    /**
     * 29. Divide Two Integers [Medium]
     * <p>
     * Given two integers dividend and divisor, divide two integers without using multiplication,
     * division and mod operator.
     * <p>
     * Return the quotient after dividing dividend by divisor.
     * <p>
     * The integer division should truncate toward zero.
     * <p>
     * Example 1:
     * <p>
     * Input: dividend = 10, divisor = 3
     * Output: 3
     * Example 2:
     * <p>
     * Input: dividend = 7, divisor = -3
     * Output: -2
     * Note:
     * <p>
     * Both dividend and divisor will be 32-bit signed integers.
     * The divisor will never be 0.
     * Assume we are dealing with an environment which could only store integers within the 32-bit signed
     * integer range: [−2^31,  2^31 − 1]. For the purpose of this problem, assume that your function returns
     * 2^31 − 1 when the division result overflows.
     *
     * @param dividend dividend
     * @param divisor  divisor
     * @return quotient
     */
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        // overflow case
        if (divisor == -1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
        if (dividend == divisor) return 1;
        if (divisor == 1) {
            return dividend;
        } else if (divisor == -1) {
            return -dividend;
        }
        if (dividend >= 0 && divisor > 0) return getQuotient(-dividend, -divisor);
        if (dividend >= 0 && divisor < 0) return -getQuotient(-dividend, divisor);
        if (dividend < 0 && divisor > 0) return -getQuotient(dividend, -divisor);
        if (dividend < 0 && divisor < 0) return getQuotient(dividend, divisor);

        return -1; // not possible
    }

    private int getQuotient(int dividend, int divisor) {
        int quotient = 0;
        while (dividend <= divisor) {
            dividend -= divisor;
            quotient++;
        }
        return quotient;
    }
}
