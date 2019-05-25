package me.hermanliang.kata.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqrtTest {

  @Test
  public void mySqrt1() {
    int x = 4;
    int expected = 2;
    assertEquals(expected, new Sqrt().mySqrt(x));
  }

  @Test
  public void mySqrt2() {
    int x = 8;
    int expected = 2;
    assertEquals(expected, new Sqrt().mySqrt(x));
  }
}