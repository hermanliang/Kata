package me.hermanliang.kata.array;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/task-scheduler/">
 * https://leetcode.com/problems/task-scheduler/</a>
 */
public class TaskScheduler {

  /**
   * 621. Task Scheduler [Medium]
   * <p>
   * Given a char array representing tasks CPU need to do. It contains capital letters A to Z where
   * different letters represent different tasks.Tasks could be done without original order. Each
   * task could be done in one interval. For each interval, CPU could finish one task or just be
   * idle.
   * <p>
   * However, there is a non-negative cooling interval n that means between two same tasks, there
   * must be at least n intervals that CPU are doing different tasks or just be idle.
   * <p>
   * You need to return the least number of intervals the CPU will take to finish all the given
   * tasks.
   * <p>
   * <p>
   * <p>
   * Example:
   * <p>
   * Input: tasks = ["A","A","A","B","B","B"], n = 2 Output: 8 Explanation: A -> B -> idle -> A -> B
   * -> idle -> A -> B.
   *
   * @param tasks tasks
   * @param n at least n intervals
   * @return least number of intervals
   */
  public int leastInterval(char[] tasks, int n) {
    int interval = 0;
    int[] jobs = new int[26];
    for (char c : tasks) {
      jobs[c - 'A']++;
    }
    Arrays.sort(jobs);
    while (jobs[25] > 0) {
      for (int i = 0; i <= n; i++) {
        if (jobs[25] == 0) break;
        if (i < 26 && jobs[25 - i] != 0) {
          jobs[25 - i]--;
        }
        interval++;
      }
      Arrays.sort(jobs);
    }
    return interval;
  }
}
