package me.hermanliang.kata.math;

/**
 * @see <a href="https://leetcode.com/problems/plus-one/description/">
 * https://leetcode.com/problems/plus-one/description/</a>
 */
public class PlusOne {

    /**
     * 66. Plus One [Easy]
     * <p>
     * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
     * <p>
     * The digits are stored such that the most significant digit is at the head of the list,
     * and each element in the array contain a single digit.
     * <p>
     * You may assume the integer does not contain any leading zero, except the number 0 itself.
     * <p>
     * Example 1:
     * <p>
     * Input: [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * Example 2:
     * <p>
     * Input: [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     *
     * @param digits an array to represent a integer
     * @return an array which plus one to the integer
     */
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        int carry = 1;
        while (carry > 0 && index >= 0) {
            int last = digits[index] + carry;
            carry = last / 10;
            digits[index--] = last % 10;
        }
        if (carry > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        } else {
            return digits;
        }
    }
}
