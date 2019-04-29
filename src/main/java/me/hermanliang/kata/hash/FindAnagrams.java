package me.hermanliang.kata.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/find-all-anagrams-in-a-string/">
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/</a>
 */
public class FindAnagrams {

  /**
   * 438. Find All Anagrams in a String [Easy]
   *
   * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
   *
   * Strings consists of lowercase English letters only and the length of both strings s and p will
   * not be larger than 20,100.
   *
   * The order of output does not matter.
   *
   * Example 1:
   *
   * Input:
   *
   * s: "cbaebabacd" p: "abc"
   *
   * Output: [0, 6]
   *
   * Explanation:
   *
   * The substring with start index = 0 is "cba", which is an anagram of "abc".
   *
   * The substring with start index = 6 is "bac", which is an anagram of "abc".
   *
   * Example 2:
   *
   * Input:
   *
   * s: "abab" p: "ab"
   *
   * Output: [0, 1, 2]
   *
   * Explanation:
   *
   * The substring with start index = 0 is "ab", which is an anagram of "ab".
   *
   * The substring with start index = 1 is "ba", which is an anagram of "ab".
   *
   * The substring with start index = 2 is "ab", which is an anagram of "ab".
   *
   * @param s s string
   * @param p p string
   * @return start indices of p's anagrams in s
   */
  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> list = new ArrayList<>();
    if (p.isEmpty()) return list;
    if (p.length() > s.length()) return list;
    Map<Character, Integer> map = getFeature(p);
    int count = 0;
    int left = 0;
    for (int right = 0; right < s.length(); right++) {
      char c = s.charAt(right);
      if (map.containsKey(c)) {
        if (map.get(c) > 0) count++;
        map.put(c, map.get(c) - 1);
      }
      while (count == p.length()) {
        if (right - left + 1 == p.length()) {
          list.add(left);
        }
        char l = s.charAt(left);
        if (map.containsKey(l)) {
          map.put(l, map.get(l) + 1);
          if (map.get(l) > 0) count--;
        }
        left++;
      }
    }
    return list;
  }

  private Map<Character, Integer> getFeature(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    return map;
  }
}
