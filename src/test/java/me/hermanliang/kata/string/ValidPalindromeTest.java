package me.hermanliang.kata.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidPalindromeTest {

  @Test
  public void isPalindrome1() {
    String s = "A man, a plan, a canal: Panama";
    boolean expected = true;
    assertEquals(expected, new ValidPalindrome().isPalindrome(s));
  }

  @Test
  public void isPalindrome2() {
    String s = "race a car";
    boolean expected = false;
    assertEquals(expected, new ValidPalindrome().isPalindrome(s));
  }

  @Test
  public void validPalindrome1() {
    String s = "aba";
    boolean expected = true;
    assertEquals(expected, new ValidPalindrome().validPalindrome(s));
  }

  @Test
  public void validPalindrome2() {
    String s = "abca";
    boolean expected = true;
    assertEquals(expected, new ValidPalindrome().validPalindrome(s));
  }
}