package me.hermanliang.kata.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

  @Test
  public void intToRoman1() {
    assertEquals("III", new IntegerToRoman().intToRoman(3));
  }

  @Test
  public void intToRoman2() {
    assertEquals("IV", new IntegerToRoman().intToRoman(4));
  }

  @Test
  public void intToRoman3() {
    assertEquals("IX", new IntegerToRoman().intToRoman(9));
  }

  @Test
  public void intToRoman4() {
    // C = 100, L = 50, XXX = 30 and III = 3.
    assertEquals("LVIII", new IntegerToRoman().intToRoman(58));
  }

  @Test
  public void intToRoman5() {
    // M = 1000, CM = 900, XC = 90 and IV = 4.
    assertEquals("MCMXCIV", new IntegerToRoman().intToRoman(1994));
  }
}