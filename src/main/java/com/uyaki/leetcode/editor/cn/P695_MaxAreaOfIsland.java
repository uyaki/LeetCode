//给你一个大小为 m x n 的二进制矩阵 grid 。 
//
// 岛屿 是由一些相邻的 1 (代表土地) 构成的组合，这里的「相邻」要求两个 1 必须在 水平或者竖直的四个方向上 相邻。你可以假设 grid 的四个边缘都
//被 0（代表水）包围着。 
//
// 岛屿的面积是岛上值为 1 的单元格的数目。 
//
// 计算并返回 grid 中最大的岛屿面积。如果没有岛屿，则返回面积为 0 。 
//
// 
//
// 示例 1： 
//
// 
//输入：grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,
//0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,
//0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
//输出：6
//解释：答案不应该是 11 ，因为岛屿只能包含水平或垂直这四个方向上的 1 。
// 
//
// 示例 2： 
//
// 
//输入：grid = [[0,0,0,0,0,0,0,0]]
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 50 
// grid[i][j] 为 0 或 1 
// 
// Related Topics 深度优先搜索 广度优先搜索 并查集 数组 矩阵 👍 618 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 岛屿的最大面积
 */
public class P695_MaxAreaOfIsland {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P695_MaxAreaOfIsland().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            if (grid == null || grid.length == 0) {
                return 0;
            }
            int ans = 0;
            boolean[][] visited = new boolean[grid.length][grid[0].length];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1 && !visited[i][j]) {
                        int area = dfs(grid, i, j, visited);
                        ans = Math.max(ans, area);
                    }
                }
            }
            return ans;
        }

        private int dfs(int[][] grid, int row, int col, boolean[][] visited) {
            // 判断 base case：如果坐标 (row, col) 超出了网格范围，直接返回
            if (!(row >= 0 && row < grid.length && col >= 0 && col < grid[0].length)) {
                return 0;
            }
            // 如果当前坐标已经被标记，或者是海洋，直接返回
            if (visited[row][col] || grid[row][col] == 0) {
                return 0;
            }
            visited[row][col] = true;
            // 4个方向
            return 1 + dfs(grid, row - 1, col, visited)
                    + dfs(grid, row + 1, col, visited)
                    + dfs(grid, row, col - 1, visited)
                    + dfs(grid, row, col + 1, visited);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
