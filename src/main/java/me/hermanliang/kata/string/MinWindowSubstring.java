package me.hermanliang.kata.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/minimum-window-substring/">
 * https://leetcode.com/problems/minimum-window-substring/</a>
 */
public class MinWindowSubstring {

  /**
   * 76. Minimum Window Substring [Hard]
   *
   * Given a string S and a string T, find the minimum window in S which will contain all the
   * characters in T in complexity O(n).
   *
   * Example:
   *
   * Input: S = "ADOBECODEBANC", T = "ABC"
   *
   * Output: "BANC"
   *
   * Note:
   *
   * If there is no such window in S that covers all characters in T, return the empty string "".
   *
   * If there is such window, you are guaranteed that there will always be only one unique minimum
   * window in S.
   */
  public String minWindow(String s, String t) {
    Map<Character, Integer> map = getFeature(t);
    int count = 0;
    int left = 0;
    int minLen = Integer.MAX_VALUE;
    int minLeft = 0;
    for (int right = 0; right < s.length(); right++) {
      char c = s.charAt(right);
      if (map.containsKey(c)) {
        if (map.get(c) > 0) count++;
        map.put(c, map.get(c) - 1);
      }
      while (count == t.length()) {
        if ((right - left + 1) < minLen) {
          minLen = right - left + 1;
          minLeft = left;
        }
        char l = s.charAt(left);
        if (map.containsKey(l)) {
          map.put(l, map.get(l) + 1);
          if (map.get(l) > 0) count--;
        }
        left++;
      }
    }
    if (minLeft + minLen > s.length()) return "";
    return s.substring(minLeft, minLeft + minLen);
  }

  private Map<Character, Integer> getFeature(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    return map;
  }
}
