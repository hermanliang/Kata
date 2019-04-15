package me.hermanliang.kata.math;

/**
 * @see <a href="https://leetcode.com/problems/integer-to-roman/description/">
 * https://leetcode.com/problems/integer-to-roman/description/</a>
 */
public class IntegerToRoman {

  private static final String[] ones = {"I", "X", "C", "M"};
  private static final String[] fives = {"V", "L", "D"};

  /**
   * 12. Integer to Roman [Medium]
   * <p>
   * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
   * <p>
   * Symbol       Value I             1 V             5 X             10 L             50 C
   *    100 D             500 M             1000 For example, two is written as II in Roman numeral,
   * just two one's added together. Twelve is written as, XII, which is simply X + II. The number
   * twenty seven is written as XXVII, which is XX + V + II.
   * <p>
   * Roman numerals are usually written largest to smallest from left to right. However, the numeral
   * for four is not IIII. Instead, the number four is written as IV. Because the one is before the
   * five we subtract it making four. The same principle applies to the number nine, which is
   * written as IX. There are six instances where subtraction is used:
   * <p>
   * I can be placed before V (5) and X (10) to make 4 and 9. X can be placed before L (50) and C
   * (100) to make 40 and 90. C can be placed before D (500) and M (1000) to make 400 and 900. Given
   * an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to
   * 3999.
   *
   * @param number input number
   * @return Roman string
   */
  public String intToRoman(int number) {
    StringBuilder sb = new StringBuilder();
    int exponent = 0;
    while (number > 0) {
      int digit = number % 10;
      sb.insert(0, digitToRoman(digit, exponent));
      number /= 10;
      exponent++;
    }
    return sb.toString();
  }

  private String digitToRoman(int digit, int exponent) {
    switch (digit) {
      case 1:
        return ones[exponent];
      case 2:
        return ones[exponent] + ones[exponent];
      case 3:
        return ones[exponent] + ones[exponent] + ones[exponent];
      case 4:
        return ones[exponent] + fives[exponent];
      case 5:
        return fives[exponent];
      case 6:
        return fives[exponent] + ones[exponent];
      case 7:
        return fives[exponent] + ones[exponent] + ones[exponent];
      case 8:
        return fives[exponent] + ones[exponent] + ones[exponent] + ones[exponent];
      case 9:
        return ones[exponent] + ones[exponent + 1];
    }
    return "";
  }
}
