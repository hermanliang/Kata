package me.hermanliang.kata.array;

/**
 * @see <a href="https://leetcode.com/problems/number-of-islands/description/">
 * https://leetcode.com/problems/number-of-islands/description/</a>
 */
public class NumberOfIslands {

    /**
     * 200. Number of Islands [Medium]
     * <p>
     * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
     * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
     * You may assume all four edges of the grid are all surrounded by water.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * 11110
     * 11010
     * 11000
     * 00000
     * <p>
     * Output: 1
     * Example 2:
     * <p>
     * Input:
     * 11000
     * 11000
     * 00100
     * 00011
     * <p>
     * Output: 3
     *
     * @param grid a 2D grid map
     * @return number of islands
     */
    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    wipeIsland(grid, i, j);
                }
            }
        }
        return islands;
    }

    private void wipeIsland(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0') return;

        grid[i][j] = '0';
        wipeIsland(grid, i + 1, j);
        wipeIsland(grid, i - 1, j);
        wipeIsland(grid, i, j + 1);
        wipeIsland(grid, i, j - 1);
    }
}
