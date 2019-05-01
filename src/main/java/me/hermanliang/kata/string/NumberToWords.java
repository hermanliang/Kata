package me.hermanliang.kata.string;

/**
 * @see <a href="https://leetcode.com/problems/integer-to-english-words/">
 * https://leetcode.com/problems/integer-to-english-words/</a>
 */
public class NumberToWords {

  private final static String[] thousands = {"", " Thousand", " Million", " Billion"};
  private final static String[] tens =
      {"", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
  private final static String[] digits =
      {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
          "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
          "Nineteen"};

  /**
   * 273. Integer to English Words [Hard]
   *
   * Convert a non-negative integer to its english words representation. Given input is guaranteed
   * to be less than 2^31 - 1.
   *
   * Example 1:
   *
   * Input: 123
   *
   * Output: "One Hundred Twenty Three"
   *
   * Example 2:
   *
   * Input: 12345
   *
   * Output: "Twelve Thousand Three Hundred Forty Five"
   *
   * Example 3:
   *
   * Input: 1234567
   *
   * Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
   *
   * Example 4:
   *
   * Input: 1234567891
   *
   * Output: "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight
   * Hundred Ninety One"
   *
   * @param num number
   * @return number to string
   */
  public String numberToWords(int num) {
    if (num == 0) return "Zero";
    StringBuilder sb = new StringBuilder();
    int t = 0;
    while (num > 0) {
      int h = num % 1000;
      if (h > 0) {
        if (sb.length() > 0) {
          sb.insert(0, " ");
        }
        sb.insert(0, thousands[t]);
        sb.insert(0, hundredsToWords(h));
      }
      t++;
      num /= 1000;
    }
    return sb.toString();
  }

  private String hundredsToWords(int num) {
    StringBuilder sb = new StringBuilder();
    int hundred = num / 100;
    int ten = num % 100;
    if (hundred > 0) {
      sb.append(digits[hundred - 1]).append(" Hundred");
    }
    if (ten == 0) {
      return sb.toString();
    } else if (sb.length() > 0) {
      sb.append(" ");
    }
    if (ten < 20) {
      sb.append(digits[ten - 1]);
    } else {
      int digit = ten % 10;
      sb.append(tens[ten / 10 - 1]);
      if (digit > 0) {
        sb.append(" ").append(digits[digit - 1]);
      }
    }
    return sb.toString();
  }
}
