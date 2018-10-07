package me.hermanliang.kata.math;

/**
 * @see <a href="https://leetcode.com/problems/reverse-integer/description/">
 * https://leetcode.com/problems/reverse-integer/description/</a>
 */
public class ReverseInteger {

    /**
     * Given a 32-bit signed integer, reverse digits of an integer.
     *
     * @param input input integer
     * @return reversed integer
     */
    public int reverse(int input) {
        long result = 1;
        String digits = String.valueOf(input);
        StringBuilder container = new StringBuilder();
        if (digits.charAt(0) == '-') {
            result = -1;
            digits = digits.substring(1);
        }
        for (int i = digits.toCharArray().length - 1; i >= 0; i--) {
            container.append(digits.charAt(i));
        }
        result *= Long.parseLong(container.toString());
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }

}
