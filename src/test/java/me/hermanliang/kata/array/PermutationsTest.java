package me.hermanliang.kata.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PermutationsTest {

  @Test
  public void permute() {
    int[] nums = {1, 2, 3};
    List<List<Integer>> output = new Permutations().permute(nums);
    assertEquals(6, output.size());
    verifyPermutations(nums, output);
  }

  @Test
  public void permuteUnique() {
    int[] nums = {1, 1, 2};
    List<List<Integer>> output = new Permutations().permuteUnique(nums);
    assertEquals(3, output.size());
    verifyPermutations(nums, output);
  }

  private void verifyPermutations(int[] nums, List<List<Integer>> output) {
    Set<String> visited = new HashSet<>();
    for (List<Integer> integers : output) {
      StringBuilder sb = new StringBuilder();
      int[] array = new int[integers.size()];
      for (int i = 0; i < integers.size(); i++) {
        sb.append("#").append(integers.get(i));
        array[i] = integers.get(i);
      }
      Arrays.sort(array);
      assertArrayEquals(nums, array);
      assertFalse(visited.contains(sb.toString()));
      visited.add(sb.toString());
    }
  }
}