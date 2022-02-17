//在一个 n x n 的国际象棋棋盘上，一个骑士从单元格 (row, column) 开始，并尝试进行 k 次移动。行和列是 从 0 开始 的，所以左上单元格
//是 (0,0) ，右下单元格是 (n - 1, n - 1) 。 
//
// 象棋骑士有8种可能的走法，如下图所示。每次移动在基本方向上是两个单元格，然后在正交方向上是一个单元格。 
//
// 
//
// 每次骑士要移动时，它都会随机从8种可能的移动中选择一种(即使棋子会离开棋盘)，然后移动到那里。 
//
// 骑士继续移动，直到它走了 k 步或离开了棋盘。 
//
// 返回 骑士在棋盘停止移动后仍留在棋盘上的概率 。 
//
// 
//
// 示例 1： 
//
// 
//输入: n = 3, k = 2, row = 0, column = 0
//输出: 0.0625
//解释: 有两步(到(1,2)，(2,1))可以让骑士留在棋盘上。
//在每一个位置上，也有两种移动可以让骑士留在棋盘上。
//骑士留在棋盘上的总概率是0.0625。
// 
//
// 示例 2： 
//
// 
//输入: n = 1, k = 0, row = 0, column = 0
//输出: 1.00000
// 
//
// 
//
// 提示: 
//
// 
// 1 <= n <= 25 
// 0 <= k <= 100 
// 0 <= row, column <= n 
// 
// Related Topics 动态规划 👍 246 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 骑士在棋盘上的概率
 */
public class P688_KnightProbabilityInChessboard {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P688_KnightProbabilityInChessboard().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double knightProbability(int n, int k, int row, int column) {
            int[][] dirs = {{-2, -1}, {-2, 1}, {2, -1}, {2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}};
            // dp[step][i][j] 骑士从棋盘上的点 (i, j) 出发，走了 step 步时仍然留在棋盘上的概率。
            // 当点 (i, j) 不在棋盘上时 dp[step][i][j] = 0
            // 当点 (i, j) 在棋盘上且 step = 0 时 dp[step][i][j] = 1
            // 对于其他情况，dp[step][i][j]= 1/8 * ∑(di,dj) dp[step−1][i+di][j+dj]
            // 其中(di,dj) 表示走法对坐标的偏移量，具体为 (-2, -1),(-2,1),(2,-1),(2,1),(-1,-2),(-1,2),(1,-2),(1,2) 共 8 种。
            double[][][] dp = new double[k + 1][n][n];
            for (int step = 0; step <= k; step++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (step == 0) {
                            dp[step][i][j] = 1;
                        } else {
                            for (int[] dir : dirs) {
                                int di = i + dir[0], dj = j + dir[1];
                                if (di >= 0 && di < n && dj >= 0 && dj < n) {
                                    dp[step][i][j] += dp[step - 1][di][dj] / 8;
                                }
                            }
                        }
                    }
                }
            }
            return dp[k][row][column];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
