package me.hermanliang.kata.math;

/**
 * @see <a href="https://leetcode.com/problems/palindrome-number/description/">
 * https://leetcode.com/problems/palindrome-number/description/</a>
 */
public class PalindromeNumber {

  /**
   * 9. Palindrome Number [Easy]
   * <p>
   * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same
   * backward as forward. Follow up: Could you solve it without converting the integer to a string?
   *
   * @param input input number
   * @return is a palindrome or not
   */
  public boolean isPalindrome(int input) {
    if (input < 0) return false;
    if (input == 0) return true;
    int end = (int) Math.log10(input);
    if (end == 0) return true;
    int start = 0;
    while (end > start) {
      int d1 = input / (int) Math.pow(10, end--) % 10;
      int d2 = input / (int) Math.pow(10, start++) % 10;
      if (d1 != d2) return false;
    }
    return true;
  }
}
