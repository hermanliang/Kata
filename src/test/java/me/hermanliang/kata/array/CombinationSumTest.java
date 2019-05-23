package me.hermanliang.kata.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CombinationSumTest {

  @Test
  public void combinationSum1_1() {
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
  public void combinationSum1_2() {
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

  @Test
  public void combinationSum2_1() {
    int[] candidates = {10, 1, 2, 7, 6, 1, 5};
    int target = 8;
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(1, 7),
        Arrays.asList(1, 2, 5),
        Arrays.asList(2, 6),
        Arrays.asList(1, 1, 6));
    List<List<Integer>> output = new CombinationSum().combinationSum2(candidates, target);
    for (List<Integer> item : expected) {
      assertTrue(output.contains(item));
      output.remove(item);
    }
    assertTrue(output.isEmpty());
  }

  @Test
  public void combinationSum2_2() {
    int[] candidates = {2, 5, 2, 1, 2};
    int target = 5;
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(1, 2, 2),
        Collections.singletonList(5));
    List<List<Integer>> output = new CombinationSum().combinationSum2(candidates, target);
    for (List<Integer> item : expected) {
      assertTrue(output.contains(item));
      output.remove(item);
    }
    assertTrue(output.isEmpty());
  }
}