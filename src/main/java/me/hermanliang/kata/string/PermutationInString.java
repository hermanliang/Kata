package me.hermanliang.kata.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/permutation-in-string/">
 * https://leetcode.com/problems/permutation-in-string/</a>
 */
public class PermutationInString {

  /**
   * 567. Permutation in String [Medium]
   *
   * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of
   * s1. In other words, one of the first string's permutations is the substring of the second
   * string.
   *
   * Example 1:
   *
   * Input: s1 = "ab" s2 = "eidbaooo"
   *
   * Output: True
   *
   * Explanation: s2 contains one permutation of s1 ("ba").
   *
   * Example 2:
   *
   * Input:s1= "ab" s2 = "eidboaoo"
   *
   * Output: False
   *
   * Note:
   *
   * The input strings only contain lower case letters. The length of both given strings is in range
   * [1, 10,000].
   *
   * @param s1 s1
   * @param s2 s2
   * @return return true if s2 contains the permutation of s1
   */
  public boolean checkInclusion(String s1, String s2) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s1.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    int count = 0;
    int left = 0;
    for (int right = 0; right < s2.length(); right++) {
      char r = s2.charAt(right);
      if (map.containsKey(r)) {
        if (map.get(r) > 0) count++;
        map.put(r, map.get(r) - 1);
      }
      while (count == s1.length()) {
        if (right - left + 1 == s1.length()) return true;
        char l = s2.charAt(left);
        if (map.containsKey(l)) {
          map.put(l, map.get(l) + 1);
          if (map.get(l) > 0) count--;
        }
        left++;
      }
    }
    return false;
  }
}
