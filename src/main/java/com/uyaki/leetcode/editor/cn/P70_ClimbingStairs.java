//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 注意：给定 n 是一个正整数。 
//
// 示例 1： 
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶 
//
// 示例 2： 
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
// 
// Related Topics 记忆化搜索 数学 动态规划 👍 1889 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 爬楼梯
 */
public class P70_ClimbingStairs {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int climbStairs(int n) {
            //假设dp(1) = 1;
            //dp(2) = 2;
            //第n个台阶只能冲第n-1和第n-2个台阶上来，所有有
            // dp(n) = dp(n-1)+dp(n-2)
            // 由于n是正整数，d(2) = dp(1) +dp(0)，所以dp[0] = 1
            int[] dp = new int[n + 1];
            Arrays.fill(dp, 0);
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            // n>=64时，结果会溢出int的最大值
            return dp[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
