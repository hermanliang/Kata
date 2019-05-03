package me.hermanliang.kata.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import me.hermanliang.kata.util.Interval;

/**
 * @see <a href="https://leetcode.com/problems/meeting-rooms/">
 * https://leetcode.com/problems/meeting-rooms/</a>
 * @see <a href="https://leetcode.com/problems/meeting-rooms-ii/">
 * https://leetcode.com/problems/meeting-rooms-ii/</a>
 */
public class MeetingRoom {

  /**
   * 252. Meeting Rooms [Easy]
   *
   * Given an array of meeting time intervals consisting of start and end times
   * [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.
   *
   * Example 1:
   *
   * Input: [[0,30],[5,10],[15,20]]
   *
   * Output: false
   *
   * Example 2:
   *
   * Input: [[7,10],[2,4]]
   *
   * Output: true
   *
   * NOTE: input types have been changed on April 15, 2019. Please reset to default code definition
   * to get new method signature.
   *
   * @param intervals time intervals
   * @return could attend all meetings
   */
  public boolean canAttendMeetings(Interval[] intervals) {
    if (intervals.length <= 1) return true;
    Arrays.sort(intervals, new Comparator<Interval>() {
      public int compare(Interval i1, Interval i2) {
        return i1.start - i2.start;
      }
    });
    for (int i = 0; i < intervals.length - 1; i++) {
      if (intervals[i].end > intervals[i + 1].start) return false;
    }
    return true;
  }

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
