package me.hermanliang.kata.string;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/reorganize-string/">
 * https://leetcode.com/problems/reorganize-string/</a>
 */
public class ReorganizeString {

  /**
   * 767. Reorganize String [Medium]
   *
   * Given a string S, check if the letters can be rearranged so that two characters that are
   * adjacent to each other are not the same.
   *
   * If possible, output any possible result.  If not possible, return the empty string.
   *
   * Example 1:
   *
   * Input: S = "aab"
   *
   * Output: "aba"
   *
   * Example 2:
   *
   * Input: S = "aaab"
   *
   * Output: ""
   *
   * Note:
   *
   * S will consist of lowercase letters and have length in range [1, 500].
   *
   * @param S input string
   * @return reorganized string
   */
  public String reorganizeString(String S) {
    char[] array = new char[26];
    for (char c : S.toCharArray()) {
      array[c - 'a'] += 100;
    }
    for (int i = 0; i < 26; i++) array[i] += i;
    Arrays.sort(array);
    StringBuilder sb = new StringBuilder();
    while (array[25] / 100 > 0) {
      if (array[25] / 100 > 1 && array[24] / 100 == 0) return "";
      int i = 0;
      while (i < 2 && array[25 - i] / 100 > 0) {
        sb.append((char) (array[25 - i] % 100 + 'a'));
        array[25 - i] -= 100;
        i++;
      }
      Arrays.sort(array);
    }
    return sb.toString();
  }
}
