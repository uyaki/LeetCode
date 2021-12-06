//给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。 
//
// 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。 
//
// 此外，你可以假设该网格的四条边均被水包围。 
//
// 
//
// 示例 1： 
//
// 
//输入：grid = [
//  ["1","1","1","1","0"],
//  ["1","1","0","1","0"],
//  ["1","1","0","0","0"],
//  ["0","0","0","0","0"]
//]
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：grid = [
//  ["1","1","0","0","0"],
//  ["1","1","0","0","0"],
//  ["0","0","1","0","0"],
//  ["0","0","0","1","1"]
//]
//输出：3
// 
//
// 
//
// 提示： 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 300 
// grid[i][j] 的值为 '0' 或 '1' 
// 
// Related Topics 深度优先搜索 广度优先搜索 并查集 数组 矩阵 👍 1437 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 岛屿数量
 */
public class P200_NumberOfIslands {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P200_NumberOfIslands().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0) {
                return 0;
            }
            int m = grid.length, n = grid[0].length;
            boolean[][] visited = new boolean[m][n];
            int ans = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    // 只有 1 且 未被访问过的坐标 需要检索
                    if (grid[i][j] == '1' && !visited[i][j]) {
                        ans++;
                        dfs(grid, i, j, visited);
                    }
                }
            }
            return ans;
        }

        private void dfs(char[][] grid, int row, int col, boolean[][] visited) {
            // 判断 base case：如果坐标 (row, col) 超出了网格范围，直接返回
            if (!(row >= 0 && row < grid.length && col >= 0 && col < grid[0].length)) {
                return;
            }
            // 如果当前坐标已经被标记，或者是海洋，直接返回
            if (visited[row][col] || grid[row][col] == '0') {
                return;
            }
            visited[row][col] = true;
            // 4个方向
            dfs(grid, row - 1, col, visited);
            dfs(grid, row + 1, col, visited);
            dfs(grid, row, col - 1, visited);
            dfs(grid, row, col + 1, visited);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
