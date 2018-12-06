package me.hermanliang.kata.math;

/**
 * @see <a href="https://leetcode.com/problems/add-binary/description/">
 * https://leetcode.com/problems/add-binary/description/</a>
 */
public class AddBinary {

    /**
     * 67. Add Binary [Easy]
     * <p>
     * Given two binary strings, return their sum (also a binary string).
     * <p>
     * The input strings are both non-empty and contains only characters 1 or 0.
     * <p>
     * Example 1:
     * <p>
     * Input: a = "11", b = "1"
     * Output: "100"
     * Example 2:
     * <p>
     * Input: a = "1010", b = "1011"
     * Output: "10101"
     *
     * @param a binary string a
     * @param b binary string b
     * @return a + b
     */
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += (a.charAt(i--) - '0');
            if (j >= 0) sum += (b.charAt(j--) - '0');
            carry = sum / 2;
            sum %= 2;
            sb.insert(0, sum);
        }
        if (carry > 0) {
            sb.insert(0, carry);
        }
        return sb.toString();
    }
}
