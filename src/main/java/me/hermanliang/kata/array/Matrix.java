package me.hermanliang.kata.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/set-matrix-zeroes/">
 * https://leetcode.com/problems/set-matrix-zeroes/</a>
 */
public class Matrix {

    /**
     * 73. Set Matrix Zeroes [Medium]
     * <p>
     * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * [
     * [1,1,1],
     * [1,0,1],
     * [1,1,1]
     * ]
     * Output:
     * [
     * [1,0,1],
     * [0,0,0],
     * [1,0,1]
     * ]
     * Example 2:
     * <p>
     * Input:
     * [
     * [0,1,2,0],
     * [3,4,5,2],
     * [1,3,1,5]
     * ]
     * Output:
     * [
     * [0,0,0,0],
     * [0,4,5,0],
     * [0,3,1,0]
     * ]
     * Follow up:
     * <p>
     * A straight forward solution using O(mn) space is probably a bad idea.
     * A simple improvement uses O(m + n) space, but still not the best solution.
     * Could you devise a constant space solution?
     *
     * @param matrix a matrix
     */
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0 && !rows.contains(i) && !cols.contains(j)) {
                    rows.add(i);
                    cols.add(j);
                    setRowZeroes(matrix, i, rows, cols);
                    setColZeroes(matrix, j, rows, cols);
                }
            }
        }
    }

    private void setRowZeroes(int[][] matrix, int row, Set<Integer> rows, Set<Integer> cols) {
        for (int i = 0; i < matrix[row].length; i++) {
            if (matrix[row][i] == 0 && !cols.contains(i)) {
                cols.add(i);
                setColZeroes(matrix, i, rows, cols);
            } else {
                matrix[row][i] = 0;
            }
        }
    }

    private void setColZeroes(int[][] matrix, int col, Set<Integer> rows, Set<Integer> cols) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] == 0 && !rows.contains(i)) {
                rows.add(i);
                setRowZeroes(matrix, i, rows, cols);
            } else {
                matrix[i][col] = 0;
            }
        }
    }
}
