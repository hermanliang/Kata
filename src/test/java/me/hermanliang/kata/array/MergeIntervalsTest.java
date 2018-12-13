package me.hermanliang.kata.array;

import me.hermanliang.kata.util.Interval;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MergeIntervalsTest {

    @Test
    public void merge1() {
        List<Interval> intervals = Arrays.asList(
                new Interval(1, 3),
                new Interval(2, 6),
                new Interval(8, 10),
                new Interval(15, 18)
        );
        Interval interval1 = new Interval(1, 6);
        Interval interval2 = new Interval(8, 10);
        Interval interval3 = new Interval(15, 18);
        List<Interval> output = new MergeIntervals().merge(intervals);
        assertEquals(3, output.size());
        for (Interval interval : output) {
            switch (interval.start) {
                case 1:
                    assertEquals(interval1, interval);
                    interval1 = null;
                    break;
                case 8:
                    assertEquals(interval2, interval);
                    interval2 = null;
                    break;
                case 15:
                    assertEquals(interval3, interval);
                    interval3 = null;
                    break;
                default:
                    fail();
            }
        }
    }

    @Test
    public void merge2() {
        List<Interval> intervals = Arrays.asList(
                new Interval(1, 4),
                new Interval(4, 5)
        );
        List<Interval> output = new MergeIntervals().merge(intervals);
        assertEquals(1, output.size());
        assertEquals(new Interval(1, 5), output.get(0));
    }
}