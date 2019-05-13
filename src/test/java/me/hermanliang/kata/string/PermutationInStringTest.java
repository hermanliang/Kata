package me.hermanliang.kata.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermutationInStringTest {

  @Test
  public void checkInclusion1() {
    String s1 = "ab";
    String s2 = "eidbaooo";
    boolean expected = true;
    assertEquals(expected, new PermutationInString().checkInclusion(s1, s2));
  }

  @Test
  public void checkInclusion2() {
    String s1 = "ab";
    String s2 = "eidboaoo";
    boolean expected = false;
    assertEquals(expected, new PermutationInString().checkInclusion(s1, s2));
  }
}