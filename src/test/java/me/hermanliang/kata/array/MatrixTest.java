package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MatrixTest {

    @Test
    public void setZeroes1() {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int[][] expected = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        new Matrix().setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            assertArrayEquals(expected[i], matrix[i]);
        }
    }


    @Test
    public void setZeroes2() {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        int[][] expected = {
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0}
        };
        new Matrix().setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            assertArrayEquals(expected[i], matrix[i]);
        }
    }

}