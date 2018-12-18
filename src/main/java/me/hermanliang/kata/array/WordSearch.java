package me.hermanliang.kata.array;

/**
 * @see <a href="https://leetcode.com/problems/word-search/description/">
 * https://leetcode.com/problems/word-search/description/</a>
 */
public class WordSearch {

    /**
     * 79. Word Search [Medium]
     * <p>
     * Given a 2D board and a word, find if the word exists in the grid.
     * <p>
     * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
     * <p>
     * Example:
     * <p>
     * board =
     * [
     * ['A','B','C','E'],
     * ['S','F','C','S'],
     * ['A','D','E','E']
     * ]
     * <p>
     * Given word = "ABCCED", return true.
     * Given word = "SEE", return true.
     * Given word = "ABCB", return false.
     *
     * @param board 2D board
     * @param word  a word
     * @return the word is exist in the board
     */
    public boolean exist(char[][] board, String word) {
        char c = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == c) {
                    board[i][j] = '#';
                    if (exist(board, word, i, j, 1)) return true;
                    board[i][j] = c;
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] board, String word, int i, int j, int k) {
        if (k == word.length()) {
            return true;
        }
        char c = word.charAt(k++);
        // left
        if (j > 0 && board[i][j - 1] == c) {
            board[i][j - 1] = '#';
            if (exist(board, word, i, j - 1, k)) return true;
            board[i][j - 1] = c;
        }
        // top
        if (i > 0 && board[i - 1][j] == c) {
            board[i - 1][j] = '#';
            if (exist(board, word, i - 1, j, k)) return true;
            board[i - 1][j] = c;
        }
        // right
        if (j < board[0].length - 1 && board[i][j + 1] == c) {
            board[i][j + 1] = '#';
            if (exist(board, word, i, j + 1, k)) return true;
            board[i][j + 1] = c;
        }
        // bottom
        if (i < board.length - 1 && board[i + 1][j] == c) {
            board[i + 1][j] = '#';
            if (exist(board, word, i + 1, j, k)) return true;
            board[i + 1][j] = c;
        }
        return false;
    }
}
