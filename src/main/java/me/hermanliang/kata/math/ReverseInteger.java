package me.hermanliang.kata.math;

/**
 * @see <a href="https://leetcode.com/problems/reverse-integer/description/">
 * https://leetcode.com/problems/reverse-integer/description/</a>
 */
public class ReverseInteger {

    /**
     * 7. Reverse Integer
     * <p>
     * Given a 32-bit signed integer, reverse digits of an integer.
     *
     * @param input input integer
     * @return reversed integer
     */
    public int reverse(int input) {
        long result = 0;
        while (input != 0) {
            int pop = input % 10;
            input /= 10;
            result = result * 10 + pop;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
        }
        return (int) result;
    }

}
