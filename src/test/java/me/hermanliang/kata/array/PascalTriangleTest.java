package me.hermanliang.kata.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PascalTriangleTest {

    @Test
    public void generate() {
        int numRows = 5;
        List<List<Integer>> result = new PascalTriangle().generate(numRows);
        List<List<Integer>> expected = Arrays.asList(
                Collections.singletonList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1));
        assertEquals(5, result.size());
        assertEquals(expected, result);
    }
}