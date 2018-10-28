package me.hermanliang.kata.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ThreeSumTest {

    @Test
    public void threeSum() {
        int[] numbers = {-1, 0, 1, 2, -1, -4};
        List<Integer> expected1 = Arrays.asList(-1, 0, 1);
        List<Integer> expected2 = Arrays.asList(-1, -1, 2);
        List<List<Integer>> result = new ThreeSum().threeSum(numbers);
        assertEquals(2, result.size());
        List<Integer> list1 = new ArrayList<>(result.get(0));
        List<Integer> list2 = new ArrayList<>(result.get(1));
        Collections.sort(list1);
        Collections.sort(list2);
        assertNotEquals(list1, list2);
        assertTrue(list1.equals(expected1) || list1.equals(expected2));
        assertTrue(list2.equals(expected1) || list2.equals(expected2));
    }
}