package me.hermanliang.kata.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import me.hermanliang.kata.util.Interval;

/**
 * @see <a href="https://leetcode.com/problems/meeting-rooms-ii/">
 * https://leetcode.com/problems/meeting-rooms-ii/</a>
 */
public class MeetingRoom {

  /**
   * 253. Meeting Rooms II [Medium]
   * <p>
   * Given an array of meeting time intervals consisting of start and end times
   * [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.
   * <p>
   * Example 1:
   * <p>
   * Input: [[0, 30],[5, 10],[15, 20]] Output: 2 Example 2:
   * <p>
   * Input: [[7,10],[2,4]] Output: 1
   *
   * @param intervals time intervals
   * @return minimum rooms
   */
  public int minMeetingRooms(Interval[] intervals) {
    Arrays.sort(intervals, new Comparator<Interval>() {
      public int compare(Interval i1, Interval i2) {
        return i1.start - i2.start;
      }
    });
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    int minEndTime = 0;
    for (Interval interval : intervals) {
      if (!queue.isEmpty() && interval.start >= minEndTime) {
        queue.poll();
      }
      queue.offer(interval.end);
      minEndTime = queue.peek();
    }
    return queue.size();
  }
}
