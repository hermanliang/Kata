package me.hermanliang.kata.util;

public class Interval {

  public int start;
  public int end;

  public Interval() {
    this.start = 0;
    this.end = 0;
  }

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Interval) {
      Interval interval = (Interval) obj;
      return this.start == interval.start && this.end == interval.end;
    }
    return super.equals(obj);
  }
}

