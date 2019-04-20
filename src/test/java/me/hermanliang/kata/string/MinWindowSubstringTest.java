package me.hermanliang.kata.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinWindowSubstringTest {

  @Test
  public void minWindow() {
    String s = "ADOBECODEBANC";
    String t = "ABC";
    String expected = "BANC";
    assertEquals(expected, new MinWindowSubstring().minWindow(s, t));
  }
}