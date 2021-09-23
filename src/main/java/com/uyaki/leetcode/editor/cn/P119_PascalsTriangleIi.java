//给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。 
//
// 在「杨辉三角」中，每个数是它左上方和右上方的数的和。 
//
// 
//
// 
//
// 示例 1: 
//
// 
//输入: rowIndex = 3
//输出: [1,3,3,1]
// 
//
// 示例 2: 
//
// 
//输入: rowIndex = 0
//输出: [1]
// 
//
// 示例 3: 
//
// 
//输入: rowIndex = 1
//输出: [1,1]
// 
//
// 
//
// 提示: 
//
// 
// 0 <= rowIndex <= 33 
// 
//
// 
//
// 进阶： 
//
// 你可以优化你的算法到 O(rowIndex) 空间复杂度吗？ 
// Related Topics 数组 动态规划 👍 322 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;
import java.util.List;

/**
 * 杨辉三角 II
 */
public class P119_PascalsTriangleIi {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            // dp[0][0]=1
            // dp[1][0]=1 ,dp[1][1] = 1
            // if y==0&y==x then dp[x][y] = 1
            // else then dp[x][y] = dp[x-1][y-1]+dp[x-1][y]
            // rowIndex是从0开始，所以这里要+1
            Integer[] dp = new Integer[rowIndex + 1];
            Arrays.fill(dp, 1);
            for (int i = 2; i < dp.length; i++) {
                for (int j = i - 1; j > 0; j--) {
                    dp[j] = dp[j] + dp[j - 1];
                }
            }
            return Arrays.asList(dp);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
