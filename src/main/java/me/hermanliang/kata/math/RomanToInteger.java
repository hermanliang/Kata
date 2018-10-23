package me.hermanliang.kata.math;

/**
 * @see <a href="https://leetcode.com/problems/roman-to-integer/description/">
 * https://leetcode.com/problems/roman-to-integer/description/</a>
 */
public class RomanToInteger {

    /**
     * 13. Roman to Integer
     * <p>
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * <p>
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
     * <p>
     * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
     * <p>
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
     *
     * @param s Roman string
     * @return roman to number
     */
    public int romanToInt(String s) {
        int sum = 0;
        int lastExponent = -1;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'I':
                    sum += 1;
                    lastExponent = 0;
                    break;
                case 'V':
                    if (lastExponent == 0) sum += 3;
                    else sum += 5;
                    lastExponent = 0;
                    break;
                case 'X':
                    if (lastExponent == 0) sum += 8;
                    else sum += 10;
                    lastExponent = 1;
                    break;
                case 'L':
                    if (lastExponent == 1) sum += 30;
                    else sum += 50;
                    lastExponent = 1;
                    break;
                case 'C':
                    if (lastExponent == 1) sum += 80;
                    else sum += 100;
                    lastExponent = 2;
                    break;
                case 'D':
                    if (lastExponent == 2) sum += 300;
                    else sum += 500;
                    lastExponent = 2;
                    break;
                case 'M':
                    if (lastExponent == 2) sum += 800;
                    else sum += 1000;
                    lastExponent = 3;
                    break;
            }
        }
        return sum;
    }
}
