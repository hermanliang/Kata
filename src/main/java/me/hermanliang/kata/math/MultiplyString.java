package me.hermanliang.kata.math;

/**
 * @see <a href="https://leetcode.com/problems/multiply-strings/description/">
 * https://leetcode.com/problems/multiply-strings/description/</a>
 */
public class MultiplyString {

    /**
     * 43. Multiply Strings [Medium]
     * <p>
     * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2,
     * also represented as a string.
     * <p>
     * Example 1:
     * <p>
     * Input: num1 = "2", num2 = "3"
     * Output: "6"
     * Example 2:
     * <p>
     * Input: num1 = "123", num2 = "456"
     * Output: "56088"
     * Note:
     * <p>
     * The length of both num1 and num2 is < 110.
     * Both num1 and num2 contain only digits 0-9.
     * Both num1 and num2 do not contain any leading zero, except the number 0 itself.
     * You must not use any built-in BigInteger library or convert the inputs to integer directly.
     *
     * @param num1 number 1
     * @param num2 number 2
     * @return product of num1 and num2
     */
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        // always let num2.length >= num1.length
        if (num2.length() < num1.length()) return multiply(num2, num1);
        //       123
        // x     456
        // ---------
        //       738
        //      6150
        //     49200
        // ---------
        //     56088
        int i = num1.length() - 1;
        String output = "0";
        int exponent = 0;
        while (i >= 0) {
            StringBuilder tmp = new StringBuilder();
            int carry = 0;
            int j = num2.length() - 1;
            while (j >= 0) {
                int product = carry;
                product += (num1.charAt(i) - '0') * (num2.charAt(j--) - '0');
                carry = product / 10;
                tmp.insert(0, product % 10);
            }
            if (carry > 0) {
                tmp.insert(0, carry);
            }
            for (int k = 0; k < exponent; k++) {
                tmp.append("0");
            }
            output = add(output, tmp.toString());
            i--;
            exponent++;
        }
        return output;
    }

    private String add(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += (num1.charAt(i--) - '0');
            if (j >= 0) sum += (num2.charAt(j--) - '0');
            carry = sum / 10;
            sb.insert(0, sum % 10);
        }
        if (carry > 0) {
            sb.insert(0, carry);
        }
        return sb.toString();
    }
}
