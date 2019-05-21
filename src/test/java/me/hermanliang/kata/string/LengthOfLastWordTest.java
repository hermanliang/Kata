package me.hermanliang.kata.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthOfLastWordTest {

  @Test
  public void lengthOfLastWord() {
    String s = "Hello World";
    int expected = 5;
    assertEquals(expected, new LengthOfLastWord().lengthOfLastWord(s));
  }
}