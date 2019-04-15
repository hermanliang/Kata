package me.hermanliang.kata.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

  @Test
  public void reverse1() {
    int input = 123;
    int expected = 321;
    assertEquals(expected, new ReverseInteger().reverse(input));
  }

  @Test
  public void reverse2() {
    int input = -123;
    int expected = -321;
    assertEquals(expected, new ReverseInteger().reverse(input));
  }

  @Test
  public void reverse3() {
    int input = 120;
    int expected = 21;
    assertEquals(expected, new ReverseInteger().reverse(input));
  }
}