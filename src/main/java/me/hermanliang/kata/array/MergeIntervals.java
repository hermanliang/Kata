package me.hermanliang.kata.array;

import me.hermanliang.kata.util.Interval;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/merge-intervals/description/">
 * https://leetcode.com/problems/merge-intervals/description/</a>
 */
public class MergeIntervals {

    /**
     * 56. Merge Intervals [Medium]
     * <p>
     * Given a collection of intervals, merge all overlapping intervals.
     * <p>
     * Example 1:
     * <p>
     * Input: [[1,3],[2,6],[8,10],[15,18]]
     * Output: [[1,6],[8,10],[15,18]]
     * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
     * Example 2:
     * <p>
     * Input: [[1,4],[4,5]]
     * Output: [[1,5]]
     * Explanation: Intervals [1,4] and [4,5] are considerred overlapping.
     *
     * @param intervals intervals
     * @return merged intervals
     */
    public List<Interval> merge(List<Interval> intervals) {
        // sort the interval list by start
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        // use a linked list as data structure
        LinkedList<Interval> output = new LinkedList<>();
        for (Interval interval : intervals) {
            if (output.isEmpty()) {
                output.addLast(interval);
            } else {
                if (interval.start <= output.getLast().end) {
                    // if present interval.start <= last interval.end,
                    // update last interval.end by max interval.end between present and last
                    output.getLast().end = Math.max(interval.end, output.getLast().end);
                } else {
                    output.addLast(interval);
                }
            }
        }
        return output;
    }
}
