package me.hermanliang.kata.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/pascals-triangle/">
 * https://leetcode.com/problems/pascals-triangle/</a>
 */
public class PascalTriangle {

    /**
     * 118. Pascal's Triangle [Easy]
     * <p>
     * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
     * <p>
     * <p>
     * In Pascal's triangle, each number is the sum of the two numbers directly above it.
     * <p>
     * Example:
     * <p>
     * Input: 5
     * Output:
     * [
     * [1],
     * [1,1],
     * [1,2,1],
     * [1,3,3,1],
     * [1,4,6,4,1]
     * ]
     *
     * @param numRows number of rows
     * @return a Pascal's Triangle
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> item = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) item.add(1);
                else {
                    List<Integer> prev = result.get(i - 1);
                    item.add(prev.get(j - 1) + prev.get(j));
                }
            }
            result.add(item);
        }
        return result;
    }
}
