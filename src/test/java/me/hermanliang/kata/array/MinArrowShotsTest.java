package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinArrowShotsTest {

  @Test
  public void findMinArrowShots() {
    int[][] points = {
        {10, 16},
        {2, 8},
        {1, 6},
        {7, 12}
    };
    int expected = 2;
    assertEquals(expected, new MinArrowShots().findMinArrowShots(points));
  }
}