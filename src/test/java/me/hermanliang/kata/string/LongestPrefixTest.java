package me.hermanliang.kata.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPrefixTest {

  @Test
  public void longestCommonPrefix1() {
    String[] strs = {"flower", "flow", "flight"};
    assertEquals("fl", new LongestPrefix().longestCommonPrefix(strs));
  }

  @Test
  public void longestCommonPrefix2() {
    String[] strs = {"dog", "racecar", "car"};
    // There is no common prefix among the input strings
    assertEquals("", new LongestPrefix().longestCommonPrefix(strs));
  }
}