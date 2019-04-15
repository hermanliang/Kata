package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskSchedulerTest {

  @Test
  public void leastInterval() {
    char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
    int n = 2;
    int expected = 8;
    // Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.
    assertEquals(expected, new TaskScheduler().leastInterval(tasks, n));
  }
}