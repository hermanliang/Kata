package me.hermanliang.kata.math;

/**
 * @see <a href="https://leetcode.com/problems/string-to-integer-atoi/description/">
 * https://leetcode.com/problems/string-to-integer-atoi/description/</a>
 */
public class StringToInteger {

    /**
     * 8. String to Integer (atoi) [Medium]
     * <p>
     * Implement atoi which converts a string to an integer.
     * <p>
     * The function first discards as many whitespace characters as necessary until
     * the first non-whitespace character is found. Then, starting from this character,
     * takes an optional initial plus or minus sign followed by as many numerical
     * digits as possible, and interprets them as a numerical value.
     * <p>
     * The string can contain additional characters after those that form the integral
     * number, which are ignored and have no effect on the behavior of this function.
     * <p>
     * If the first sequence of non-whitespace characters in str is not a valid
     * integral number, or if no such sequence exists because either str is empty
     * or it contains only whitespace characters, no conversion is performed.
     * <p>
     * If no valid conversion could be performed, a zero value is returned.
     * <p>
     * Note:
     * <p>
     * Only the space character ' ' is considered as whitespace character.
     * Assume we are dealing with an environment which could only store integers
     * within the 32-bit signed integer range: [−2^31,  2^31 − 1]. If the numerical
     * value is out of the range of representable values, INT_MAX (2^31 − 1) or
     * INT_MIN (−2^31) is returned.
     *
     * @param input input string
     * @return convert string to integer
     */
    public int myAtoi(String input) {
        long output = 0;
        boolean isValid = false;
        boolean isNegative = false;
        for (char c : input.toCharArray()) {
            if (!isValid) {
                if (c == ' ') continue;
                if (c == '-') {
                    isValid = true;
                    isNegative = true;
                } else if (c == '+') {
                    isValid = true;
                } else if (c >= '0' && c <= '9') {
                    isValid = true;
                    output = output * 10 + (c - '0');
                } else {
                    break;
                }
            } else {
                if (c >= '0' && c <= '9') {
                    output = output * 10 + (c - '0');
                    if (isNegative && -output < Integer.MIN_VALUE) {
                        output = Integer.MIN_VALUE;
                        break;
                    } else if (!isNegative && output > Integer.MAX_VALUE) {
                        output = Integer.MAX_VALUE;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return (int) (output * (isNegative ? -1 : 1));
    }
}
