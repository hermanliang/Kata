package me.hermanliang.kata.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class SubsetTest {

    @Test
    public void subsets() {
        // expected result
        // [
        //  [3],
        //  [1],
        //  [2],
        //  [1,2,3],
        //  [1,3],
        //  [2,3],
        //  [1,2],
        //  []
        // ]
        int[] nums = {1, 2, 3};
        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);

        List<List<Integer>> output = new Subset().subsets(nums);
        assertEquals(8, output.size());

        Set<String> set = new HashSet<>();
        for (List<Integer> integers : output) {
            StringBuilder sb = new StringBuilder();
            for (Integer integer : integers) {
                assertTrue(list.contains(integer));
                sb.append("#").append(integer);
            }
            assertFalse(set.contains(sb.toString()));
            set.add(sb.toString());
        }
    }
}