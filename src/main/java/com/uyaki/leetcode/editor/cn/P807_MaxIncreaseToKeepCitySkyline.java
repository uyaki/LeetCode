//在二维数组grid中，grid[i][j]代表位于某处的建筑物的高度。 我们被允许增加任何数量（不同建筑物的数量可能不同）的建筑物的高度。 高度 0 也被认
//为是建筑物。 
//
// 最后，从新数组的所有四个方向（即顶部，底部，左侧和右侧）观看的“天际线”必须与原始数组的天际线相同。 城市的天际线是从远处观看时，由所有建筑物形成的矩形的
//外部轮廓。 请看下面的例子。 
//
// 建筑物高度可以增加的最大总和是多少？ 
//
// 
//例子：
//输入： grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
//输出： 35
//解释： 
//The grid is:
//[ [3, 0, 8, 4], 
//  [2, 4, 5, 7],
//  [9, 2, 6, 3],
//  [0, 3, 1, 0] ]
//
//从数组竖直方向（即顶部，底部）看“天际线”是：[9, 4, 8, 7]
//从水平水平方向（即左侧，右侧）看“天际线”是：[8, 7, 9, 3]
//
//在不影响天际线的情况下对建筑物进行增高后，新数组如下：
//
//gridNew = [ [8, 4, 8, 7],
//            [7, 4, 7, 7],
//            [9, 4, 8, 7],
//            [3, 3, 3, 3] ]
// 
//
// 说明: 
//
// 
// 1 < grid.length = grid[0].length <= 50。 
// grid[i][j] 的高度范围是： [0, 100]。 
// 一座建筑物占据一个grid[i][j]：换言之，它们是 1 x 1 x grid[i][j] 的长方体。 
// 
// Related Topics 贪心 数组 矩阵 👍 132 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 保持城市天际线
 */
public class P807_MaxIncreaseToKeepCitySkyline {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P807_MaxIncreaseToKeepCitySkyline().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了83.37%的用户
     * 内存消耗：37.8 MB, 在所有 Java 提交中击败了95.15%的用户
     */
    class Solution {
        public int maxIncreaseKeepingSkyline(int[][] grid) {
            // 题目中，1 < grid.length = grid[0].length <= 50 所以是个 n*n的数组
            int n = grid.length;
            // 求天际线
            int[][] sky = new int[2][n];
            for (int i = 0; i < n; i++) {
                int max1 = 0;
                int max2 = 0;
                for (int j = 0; j < n; j++) {
                    max1 = Math.max(max1, grid[j][i]);
                    max2 = Math.max(max2, grid[i][j]);
                }
                // 竖直方向最大值
                sky[0][i] = max1;
                // 水平方向的最大值。
                sky[1][i] = max2;
            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ans += Math.min(sky[0][j], sky[1][i])  - grid[i][j] ;
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
