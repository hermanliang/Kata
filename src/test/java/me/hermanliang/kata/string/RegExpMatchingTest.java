package me.hermanliang.kata.string;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegExpMatchingTest {

  @Test
  public void isMatch1() {
    String string = "aa";
    String pattern = "a";
    // "a" does not match the entire string "aa".
    assertFalse(new RegExpMatching().isMatch(string, pattern));
  }

  @Test
  public void isMatch2() {
    String string = "aa";
    String pattern = "a*";
    // '*' means zero or more of the precedeng element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
    assertTrue(new RegExpMatching().isMatch(string, pattern));
  }

  @Test
  public void isMatch3() {
    String string = "ab";
    String pattern = ".*";
    // ".*" means "zero or more (*) of any character (.)".
    assertTrue(new RegExpMatching().isMatch(string, pattern));
  }

  @Test
  public void isMatch4() {
    String string = "aab";
    String pattern = "c*a*b";
    // c can be repeated 0 times, a can be repeated 1 time. Therefore it matches "aab".
    assertTrue(new RegExpMatching().isMatch(string, pattern));
  }

  @Test
  public void isMatch5() {
    String string = "mississippi";
    String pattern = "mis*is*p*.";
    assertFalse(new RegExpMatching().isMatch(string, pattern));
  }
}