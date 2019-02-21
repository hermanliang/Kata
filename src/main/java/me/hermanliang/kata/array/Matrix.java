package me.hermanliang.kata.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/set-matrix-zeroes/">
 * https://leetcode.com/problems/set-matrix-zeroes/</a>
 * @see <a href="https://leetcode.com/problems/search-a-2d-matrix/">
 * https://leetcode.com/problems/search-a-2d-matrix/</a>
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

    /**
     * 74. Search a 2D Matrix [Medium]
     * <p>
     * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
     * <p>
     * Integers in each row are sorted from left to right.
     * The first integer of each row is greater than the last integer of the previous row.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * matrix = [
     * [1,   3,  5,  7],
     * [10, 11, 16, 20],
     * [23, 30, 34, 50]
     * ]
     * target = 3
     * Output: true
     * Example 2:
     * <p>
     * Input:
     * matrix = [
     * [1,   3,  5,  7],
     * [10, 11, 16, 20],
     * [23, 30, 34, 50]
     * ]
     * target = 13
     * Output: false
     *
     * @param matrix a matrix
     * @param target search target
     * @return does the matrix has target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) return false;
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        int start = 0;
        int end = m * n - 1;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            int row = mid / n;
            int col = mid % n;
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] > target) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
}
