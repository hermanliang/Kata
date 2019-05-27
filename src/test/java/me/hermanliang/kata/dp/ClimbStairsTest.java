package me.hermanliang.kata.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClimbStairsTest {

  @Test
  public void climbStairs1() {
    int n = 2;
    int expected = 2;
    assertEquals(expected, new ClimbStairs().climbStairs(n));
  }

  @Test
  public void climbStairs2() {
    int n = 3;
    int expected = 3;
    assertEquals(expected, new ClimbStairs().climbStairs(n));
  }
}