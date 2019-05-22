package me.hermanliang.kata.string;

/**
 * @see <a href="https://leetcode.com/problems/length-of-last-word/">
 * https://leetcode.com/problems/length-of-last-word/</a>
 */
public class LengthOfLastWord {

  /**
   * 58. Length of Last Word [Easy]
   *
   * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return
   * the length of last word in the string.
   *
   * If the last word does not exist, return 0.
   *
   * Note: A word is defined as a character sequence consists of non-space characters only.
   *
   * Example:
   *
   * Input: "Hello World"
   *
   * Output: 5
   *
   * @param s a string
   * @return length of last word
   */
  public int lengthOfLastWord(String s) {
    if (s == null || s.length() == 0) return 0;
    int len = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == ' ') {
        if (len == 0) continue;
        break;
      } else {
        len++;
      }
    }
    return len;
  }
}
