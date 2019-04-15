package me.hermanliang.kata.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/group-anagrams/description/">
 * https://leetcode.com/problems/group-anagrams/description/</a>
 */
public class Anagrams {

  /**
   * 49. Group Anagrams [Medium]
   * <p>
   * Given an array of strings, group anagrams together.
   * <p>
   * Example:
   * <p>
   * Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"],
   * ["nat","tan"], ["bat"] ] Note:
   * <p>
   * All inputs will be in lowercase. The order of your output does not matter.
   *
   * @param strs array of strings
   * @return list of group anagrams
   */
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String key = new String(chars);
      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }
      map.get(key).add(str);
    }
    return new ArrayList<>(map.values());
  }
}
