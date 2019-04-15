package me.hermanliang.kata.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/valid-sudoku/description/">
 * https://leetcode.com/problems/valid-sudoku/description/</a>
 */
public class ValidSudoku {

  /**
   * 36. Valid Sudoku [Medium]
   * <p>
   * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according
   * to the following rules:
   * <p>
   * Each row must contain the digits 1-9 without repetition. Each column must contain the digits
   * 1-9 without repetition. Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9
   * without repetition.
   * <p>
   * A partially filled sudoku which is valid.
   * <p>
   * The Sudoku board could be partially filled, where empty cells are filled with the character
   * '.'.
   * <p>
   * Example 1:
   * <p>
   * Input: [ ["5","3",".",".","7",".",".",".","."], ["6",".",".","1","9","5",".",".","."],
   * [".","9","8",".",".",".",".","6","."], ["8",".",".",".","6",".",".",".","3"],
   * ["4",".",".","8",".","3",".",".","1"], ["7",".",".",".","2",".",".",".","6"],
   * [".","6",".",".",".",".","2","8","."], [".",".",".","4","1","9",".",".","5"],
   * [".",".",".",".","8",".",".","7","9"] ] Output: true Example 2:
   * <p>
   * Input: [ ["8","3",".",".","7",".",".",".","."], ["6",".",".","1","9","5",".",".","."],
   * [".","9","8",".",".",".",".","6","."], ["8",".",".",".","6",".",".",".","3"],
   * ["4",".",".","8",".","3",".",".","1"], ["7",".",".",".","2",".",".",".","6"],
   * [".","6",".",".",".",".","2","8","."], [".",".",".","4","1","9",".",".","5"],
   * [".",".",".",".","8",".",".","7","9"] ] Output: false Explanation: Same as Example 1, except
   * with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left
   * 3x3 sub-box, it is invalid. Note:
   * <p>
   * A Sudoku board (partially filled) could be valid but is not necessarily solvable. Only the
   * filled cells need to be validated according to the mentioned rules. The given board contain
   * only digits 1-9 and the character '.'. The given board size is always 9x9.
   *
   * @param board a Sudoku board
   * @return is valid Sudoku
   */
  public boolean isValidSudoku(char[][] board) {
    Map<String, Set<Integer>> map = new HashMap<>();
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        char c = board[i][j];
        if (c == '.') continue;
        int digit = c - '0';
        String rowKey = "r" + i;
        String colKey = "c" + j;
        String boxKey = "b" + (i / 3) + (j / 3);
        if (!map.containsKey(rowKey)) map.put(rowKey, new HashSet<>());
        if (!map.containsKey(colKey)) map.put(colKey, new HashSet<>());
        if (!map.containsKey(boxKey)) map.put(boxKey, new HashSet<>());
        if (map.get(rowKey).contains(digit)) {
          return false;
        } else {
          map.get(rowKey).add(digit);
        }
        if (map.get(colKey).contains(digit)) {
          return false;
        } else {
          map.get(colKey).add(digit);
        }
        if (map.get(boxKey).contains(digit)) {
          return false;
        } else {
          map.get(boxKey).add(digit);
        }
      }
    }
    return true;
  }
}
