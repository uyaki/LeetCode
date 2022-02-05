//你要开发一座金矿，地质勘测学家已经探明了这座金矿中的资源分布，并用大小为 m * n 的网格 grid 进行了标注。每个单元格中的整数就表示这一单元格中的黄
//金数量；如果该单元格是空的，那么就是 0。 
//
// 为了使收益最大化，矿工需要按以下规则来开采黄金： 
//
// 
// 每当矿工进入一个单元，就会收集该单元格中的所有黄金。 
// 矿工每次可以从当前位置向上下左右四个方向走。 
// 每个单元格只能被开采（进入）一次。 
// 不得开采（进入）黄金数目为 0 的单元格。 
// 矿工可以从网格中 任意一个 有黄金的单元格出发或者是停止。 
// 
//
// 
//
// 示例 1： 
//
// 输入：grid = [[0,6,0],[5,8,7],[0,9,0]]
//输出：24
//解释：
//[[0,6,0],
// [5,8,7],
// [0,9,0]]
//一种收集最多黄金的路线是：9 -> 8 -> 7。
// 
//
// 示例 2： 
//
// 输入：grid = [[1,0,7],[2,0,6],[3,4,5],[0,3,0],[9,0,20]]
//输出：28
//解释：
//[[1,0,7],
// [2,0,6],
// [3,4,5],
// [0,3,0],
// [9,0,20]]
//一种收集最多黄金的路线是：1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= grid.length, grid[i].length <= 15 
// 0 <= grid[i][j] <= 100 
// 最多 25 个单元格中有黄金。 
// 
// Related Topics 数组 回溯 矩阵 👍 164 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 黄金矿工
 */
public class P1219_PathWithMaximumGold {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1219_PathWithMaximumGold().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private int ans = 0;
        private int[][] grid;

        public int getMaximumGold(int[][] grid) {
            this.grid = grid;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] != 0) {
                        dfs(i, j, 0);
                    }
                }
            }
            return ans;
        }

        private void dfs(int r, int c, int gold) {
            // 判断 base case：如果坐标 (r, c) 超出了网格范围，直接返回
            if (!(r >= 0 && r < grid.length && c >= 0 && c < grid[0].length)) {
                return;
            }
            int cur = grid[r][c];
            // 说明这个格子已经访问过了 或者 没有矿了
            if (cur == 0) {
                return;
            }

            gold += cur;
            ans = Math.max(ans, gold);
            // 回溯前置
            grid[r][c] = 0;
            dfs(r - 1, c, gold);
            dfs(r + 1, c, gold);
            dfs(r, c - 1, gold);
            dfs(r, c + 1, gold);
            // 回溯后置
            grid[r][c] = cur;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
