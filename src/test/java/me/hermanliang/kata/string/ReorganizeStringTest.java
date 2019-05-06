package me.hermanliang.kata.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReorganizeStringTest {

  @Test
  public void reorganizeString1() {
    String S = "aab";
    String expected = "aba";
    assertEquals(expected, new ReorganizeString().reorganizeString(S));
  }

  @Test
  public void reorganizeString2() {
    String S = "aaab";
    String expected = "";
    assertEquals(expected, new ReorganizeString().reorganizeString(S));
  }
}