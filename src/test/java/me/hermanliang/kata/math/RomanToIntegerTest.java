package me.hermanliang.kata.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

  @Test
  public void romanToInt1() {
    assertEquals(3, new RomanToInteger().romanToInt("III"));
  }

  @Test
  public void romanToInt2() {
    assertEquals(4, new RomanToInteger().romanToInt("IV"));
  }

  @Test
  public void romanToInt3() {
    assertEquals(9, new RomanToInteger().romanToInt("IX"));
  }

  @Test
  public void romanToInt4() {
    assertEquals(58, new RomanToInteger().romanToInt("LVIII"));
  }

  @Test
  public void romanToInt5() {
    assertEquals(1994, new RomanToInteger().romanToInt("MCMXCIV"));
  }
}