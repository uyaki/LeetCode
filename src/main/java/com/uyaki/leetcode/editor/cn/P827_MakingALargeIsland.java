//给你一个大小为 n x n 二进制矩阵 grid 。最多 只能将一格 0 变成 1 。 
//
// 返回执行此操作后，grid 中最大的岛屿面积是多少？ 
//
// 岛屿 由一组上、下、左、右四个方向相连的 1 形成。 
//
// 
//
// 示例 1: 
//
// 
//输入: grid = [[1, 0], [0, 1]]
//输出: 3
//解释: 将一格0变成1，最终连通两个小岛得到面积为 3 的岛屿。
// 
//
// 示例 2: 
//
// 
//输入: grid = [[1, 1], [1, 0]]
//输出: 4
//解释: 将一格0变成1，岛屿的面积扩大为 4。 
//
// 示例 3: 
//
// 
//输入: grid = [[1, 1], [1, 1]]
//输出: 4
//解释: 没有0可以让我们变成1，面积依然为 4。 
//
// 
//
// 提示： 
//
// 
// n == grid.length 
// n == grid[row].length 
// 1 <= n <= 500 
// grid[row][col] 为 0 或 1 
// 
// Related Topics 深度优先搜索 广度优先搜索 并查集 数组 矩阵 👍 124 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 最大人工岛
 */
public class P827_MakingALargeIsland {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P827_MakingALargeIsland().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private int n;
        // 几号岛屿多大
        private int[] areas;
        // 岛屿编号
        private int islandNo = 2;
        // 坐标是否已标记
        boolean[][] visited;
        // 水域坐标
        int[][] water;
        // 水域下标
        int waterIndex = -1;

        /**
         * 求最大人工岛
         *
         * @param grid grid
         * @return 最大值
         */
        public int largestIsland(int[][] grid) {
            if (grid == null || grid.length == 0) {
                return 0;
            }

            this.n = grid.length;
            // 避开编号0,1
            this.areas = new int[n * n + 2];
            this.visited = new boolean[n][n];
            this.water = new int[n * n][2];
            // 给岛编号，同时收录水域
            codeGrid(grid);
            // 全是陆地
            if (waterIndex == -1) {
                return n * n;
            }
            // 全是水
            if (waterIndex == n * n) {
                return 1;
            }
            int ans = 0;
            while (waterIndex >= 0) {
                int row = water[waterIndex][0];
                int col = water[waterIndex][1];
                int curArea = 0;
                int no1 = neighborsIslandNo(grid, row + 1, col);
                curArea += areas[no1];

                int no2 = neighborsIslandNo(grid, row - 1, col);
                if (no2 != no1) {
                    curArea += areas[no2];
                }
                int no3 = neighborsIslandNo(grid, row, col - 1);
                if (no3 != no1 && no3 != no2) {
                    curArea += areas[no3];
                }
                int no4 = neighborsIslandNo(grid, row, col + 1);
                if (no4 != no1 && no4 != no2 && no4 != no3) {
                    curArea += areas[no4];
                }
                ans = Math.max(ans, curArea);
                waterIndex--;
            }
            // 补上造陆的那一块
            return ans + 1;
        }
        /**
         * 给地图编码
         *
         * @param grid grid
         */
        private void codeGrid(int[][] grid) {
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    if (!visited[row][col]) {
                        if (grid[row][col] == 0) {
                            markWater(row, col);
                        } else if (grid[row][col] == 1) {
                            // 因为在dfs中，会修改grid[row][col]的值，所以需要判断grid[row][col] == 1
                            this.areas[islandNo] = dfs(grid, row, col, islandNo);
                            islandNo++;
                        }
                    }
                }
            }
        }
        /**
         * 计算面积并标记坐标
         *
         * @param grid     grid
         * @param row      row
         * @param col      col
         * @param islandNo 岛屿编号
         * @return 面积
         */
        private int dfs(int[][] grid, int row, int col, int islandNo) {
            // 判断 base case：如果坐标 (row, col) 超出了网格范围，直接返回
            if (!inGrid(row, col) || visited[row][col]) {
                return 0;
            }
            // 如果当前坐标已经被标记，或者是海洋，直接返回
            if (grid[row][col] == 0) {
                markWater(row, col);
                return 0;
            }
            visited[row][col] = true;
            // 将岛屿的值替换成对应的岛屿编号
            grid[row][col] = islandNo;
            // 4个方向
            return 1 + dfs(grid, row - 1, col, islandNo)
                    + dfs(grid, row + 1, col, islandNo)
                    + dfs(grid, row, col - 1, islandNo)
                    + dfs(grid, row, col + 1, islandNo);
        }
        /**
         * 岛屿的编号
         *
         * @param grid grid
         * @param row  row
         * @param col  col
         * @return 岛屿的编号 ,如果是水，返回 0
         */
        private int neighborsIslandNo(int[][] grid, int row, int col) {
            if (inGrid(row, col)) {
                return grid[row][col];
            }
            return 0;
        }
        /**
         * 标记水域的坐标
         *
         * @param row row
         * @param col col
         */
        private void markWater(int row, int col) {
            visited[row][col] = true;
            waterIndex++;
            water[waterIndex][0] = row;
            water[waterIndex][1] = col;
        }
        /**
         * 当前坐标是否在图中
         *
         * @param row row
         * @param col col
         * @return 当前坐标是否在图中
         */
        private boolean inGrid(int row, int col) {
            return row >= 0 && row < n && col >= 0 && col < n;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
