package me.hermanliang.kata.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HammingDistanceTest {

  @Test
  public void hammingDistance() {
    int x = 1;
    int y = 4;
    int expected = 2;
    assertEquals(expected, new HammingDistance().hammingDistance(x, y));
  }
}