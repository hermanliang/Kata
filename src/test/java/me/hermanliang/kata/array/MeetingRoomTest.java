package me.hermanliang.kata.array;

import me.hermanliang.kata.util.Interval;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeetingRoomTest {

  @Test
  public void minMeetingRooms1() {
    Interval[] intervals = {
        new Interval(0, 30),
        new Interval(5, 10),
        new Interval(15, 20)
    };
    int expected = 2;
    assertEquals(expected, new MeetingRoom().minMeetingRooms(intervals));
  }

  @Test
  public void minMeetingRooms2() {
    Interval[] intervals = {
        new Interval(7, 10),
        new Interval(2, 4)
    };
    int expected = 1;
    assertEquals(expected, new MeetingRoom().minMeetingRooms(intervals));
  }
}