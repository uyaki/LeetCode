//给定一个 row x col 的二维网格地图 grid ，其中：grid[i][j] = 1 表示陆地， grid[i][j] = 0 表示水域。 
//
// 网格中的格子 水平和垂直 方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。 
//
// 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿
//的周长。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
//输出：16
//解释：它的周长是上面图片中的 16 个黄色的边 
//
// 示例 2： 
//
// 
//输入：grid = [[1]]
//输出：4
// 
//
// 示例 3： 
//
// 
//输入：grid = [[1,0]]
//输出：4
// 
//
// 
//
// 提示： 
//
// 
// row == grid.length 
// col == grid[i].length 
// 1 <= row, col <= 100 
// grid[i][j] 为 0 或 1 
// 
// Related Topics 深度优先搜索 广度优先搜索 数组 矩阵 👍 476 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 岛屿的周长
 */
public class P463_IslandPerimeter {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P463_IslandPerimeter().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int islandPerimeter(int[][] grid) {
            if (grid == null || grid.length == 0) {
                return 0;
            }
            boolean[][] visited = new boolean[grid.length][grid[0].length];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1 && !visited[i][j]) {
                        // 题目限制只有一个岛屿，计算一个即可
                        return dfs(grid, i, j, visited);
                    }
                }
            }
            return 0;
        }

        /**
         * 将岛屿的周长中的边分为两类
         * 1. 与网格边界相邻的周长，
         * 2. 与海洋格子相邻的周长。
         */
        private int dfs(int[][] grid, int row, int col, boolean[][] visited) {
            // 判断 base case：如果坐标 (row, col) 超出了网格范围，对应与网格边界相邻的周长。
            if (!(row >= 0 && row < grid.length && col >= 0 && col < grid[0].length)) {
                return 1;
            }
            // 当前坐标是海洋，对应与海洋格子相邻的周长。
            if (grid[row][col] == 0) {
                return 1;
            }
            // 已经遍历过的不用再遍历
            if (visited[row][col]) {
                return 0;
            }
            visited[row][col] = true;
            // 4个方向
            return dfs(grid, row - 1, col, visited)
                    + dfs(grid, row + 1, col, visited)
                    + dfs(grid, row, col - 1, visited)
                    + dfs(grid, row, col + 1, visited);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
