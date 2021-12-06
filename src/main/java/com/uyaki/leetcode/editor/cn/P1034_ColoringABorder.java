//给你一个大小为 m x n 的整数矩阵 grid ，表示一个网格。另给你三个整数 row、col 和 color 。网格中的每个值表示该位置处的网格块的颜色
//。 
//
// 当两个网格块的颜色相同，而且在四个方向中任意一个方向上相邻时，它们属于同一 连通分量 。 
//
// 连通分量的边界 是指连通分量中的所有与不在分量中的网格块相邻（四个方向上）的所有网格块，或者在网格的边界上（第一行/列或最后一行/列）的所有网格块。 
//
// 请你使用指定颜色 color 为所有包含网格块 grid[row][col] 的 连通分量的边界 进行着色，并返回最终的网格 grid 。 
//
// 
//
// 示例 1： 
//
// 
//输入：grid = [[1,1],[1,2]], row = 0, col = 0, color = 3
//输出：[[3,3],[3,2]] 
//
// 示例 2： 
//
// 
//输入：grid = [[1,2,2],[2,3,2]], row = 0, col = 1, color = 3
//输出：[[1,3,3],[2,3,3]] 
//
// 示例 3： 
//
// 
//输入：grid = [[1,1,1],[1,1,1],[1,1,1]], row = 1, col = 1, color = 2
//输出：[[2,2,2],[2,1,2],[2,2,2]] 
//
// 
//
// 提示： 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 50 
// 1 <= grid[i][j], color <= 1000 
// 0 <= row < m 
// 0 <= col < n 
// 
//
// 
// Related Topics 深度优先搜索 广度优先搜索 数组 矩阵 👍 31 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 边界着色
 */
public class P1034_ColoringABorder {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1034_ColoringABorder().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] colorBorder(int[][] grid, int row, int col, int color) {
            // 连通分量的边界定义:
            // 1. 值和初始值init相同；
            // 2. 它的邻居节点满足：处理过的个数+值为init的个数之和小于 4；
            int m = grid.length, n = grid[0].length;
            //当前节点是否被访问过
            boolean[][] visited = new boolean[m][n];
            //边界点
            List<int[]> borders = new ArrayList<>();
            int originalColor = grid[row][col];
            visited[row][col] = true;
            dfs(grid, row, col, visited, borders, originalColor);
            for (int i = 0; i < borders.size(); i++) {
                int x = borders.get(i)[0], y = borders.get(i)[1];
                grid[x][y] = color;
            }
            return grid;
        }

        /**
         * @param grid          原始矩阵
         * @param x             当前坐标x
         * @param y             当前坐标y
         * @param visited       访问记录
         * @param borders       边界点
         * @param originalColor 基础颜色
         */
        private void dfs(int[][] grid, int x, int y, boolean[][] visited, List<int[]> borders, int originalColor) {
            int m = grid.length, n = grid[0].length;
            boolean isBorder = false;
            // 4个方向
            int[][] direc = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
            for (int i = 0; i < 4; i++) {
                int nx = direc[i][0] + x, ny = direc[i][1] + y;
                if (!(nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] == originalColor)) {
                    isBorder = true;
                } else if (!visited[nx][ny]) {
                    // 如果不是边界点，标记它被访问过，以他为起点查找边界点
                    visited[nx][ny] = true;
                    dfs(grid, nx, ny, visited, borders, originalColor);
                }
            }
            if (isBorder) {
                borders.add(new int[]{x, y});
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
