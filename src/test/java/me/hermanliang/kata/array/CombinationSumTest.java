package me.hermanliang.kata.array;

import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CombinationSumTest {

    @Test
    public void combinationSum1() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        Set<String> visited = new HashSet<>();
        List<List<Integer>> output = new CombinationSum().combinationSum(candidates, target);
        assertEquals(2, output.size());
        for (List<Integer> integers : output) {
            Collections.sort(integers);
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for (Integer integer : integers) {
                sb.append("#").append(integer);
                sum += integer;
            }
            assertEquals(target, sum);
            assertFalse(visited.contains(sb.toString()));
            visited.add(sb.toString());
        }
    }

    @Test
    public void combinationSum2() {
        int[] candidates = {2, 3, 5};
        int target = 8;
        Set<String> visited = new HashSet<>();
        List<List<Integer>> output = new CombinationSum().combinationSum(candidates, target);
        assertEquals(3, output.size());
        for (List<Integer> integers : output) {
            Collections.sort(integers);
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for (Integer integer : integers) {
                sb.append("#").append(integer);
                sum += integer;
            }
            assertEquals(target, sum);
            assertFalse(visited.contains(sb.toString()));
            visited.add(sb.toString());
        }
    }
}