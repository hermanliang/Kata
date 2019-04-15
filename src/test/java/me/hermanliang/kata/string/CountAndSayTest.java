package me.hermanliang.kata.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountAndSayTest {

  @Test
  public void countAndSay1() {
    int n = 1;
    String expected = "1";
    assertEquals(expected, new CountAndSay().countAndSay(n));
  }

  @Test
  public void countAndSay2() {
    int n = 4;
    String expected = "1211";
    assertEquals(expected, new CountAndSay().countAndSay(n));
  }
}