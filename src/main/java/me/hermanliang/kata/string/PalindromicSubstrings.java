package me.hermanliang.kata.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/palindromic-substrings/description/">
 * https://leetcode.com/problems/palindromic-substrings/description/</a>
 */
public class PalindromicSubstrings {

  /**
   * 647. Palindromic Substrings [Medium]
   * <p>
   * Given a string, your task is to count how many palindromic substrings in this string.
   * <p>
   * The substrings with different start indexes or end indexes are counted as different substrings
   * even they consist of same characters.
   * <p>
   * Example 1:
   * <p>
   * Input: "abc" Output: 3 Explanation: Three palindromic strings: "a", "b", "c". Example 2:
   * <p>
   * Input: "aaa" Output: 6 Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
   * Note:
   * <p>
   * The input string length won't exceed 1000.
   *
   * @param s a string
   * @return number of palindromic substrings in the string
   */
  public int countSubstrings(String s) {
    Set<String> visited = new HashSet<>();
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      int left = i;
      int right = i;
      while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        count++;
        left--;
        right++;
      }
      left = i;
      right = i + 1;
      while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        count++;
        left--;
        right++;
      }
    }
    return count;
  }
}
