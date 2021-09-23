//给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。 
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
//输入: numRows = 5
//输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// 
//
// 示例 2: 
//
// 
//输入: numRows = 1
//输出: [[1]]
// 
//
// 
//
// 提示: 
//
// 
// 1 <= numRows <= 30 
// 
// Related Topics 数组 动态规划 👍 582 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 */
public class P118_PascalsTriangle {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            // dp[0][0]=1
            // dp[1][0]=1 ,dp[1][1] = 1
            // if y==0&y==x then dp[x][y] = 1
            // else then dp[x][y] = dp[x-1][y-1]+dp[x-1][y]
            List<List<Integer>> ans = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                List<Integer> currentLine = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        currentLine.add(1);
                    } else {
                        currentLine.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                    }
                }
                ans.add(currentLine);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
