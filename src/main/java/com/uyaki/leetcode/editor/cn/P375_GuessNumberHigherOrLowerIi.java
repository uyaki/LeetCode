//我们正在玩一个猜数游戏，游戏规则如下： 
//
// 我从 1 到 n 之间选择一个数字，你来猜我选了哪个数字。 
//
// 每次你猜错了，我都会告诉你，我选的数字比你的大了或者小了。 
//
// 然而，当你猜了数字 x 并且猜错了的时候，你需要支付金额为 x 的现金。直到你猜到我选的数字，你才算赢得了这个游戏。 
//
// 示例: 
//
// n = 10, 我选择了8.
//
//第一轮: 你猜我选择的数字是5，我会告诉你，我的数字更大一些，然后你需要支付5块。
//第二轮: 你猜是7，我告诉你，我的数字更大一些，你支付7块。
//第三轮: 你猜是9，我告诉你，我的数字更小一些，你支付9块。
//
//游戏结束。8 就是我选的数字。
//
//你最终要支付 5 + 7 + 9 = 21 块钱。
// 
//
// 给定 n ≥ 1，计算你至少需要拥有多少现金才能确保你能赢得这个游戏。 
// Related Topics 数学 动态规划 博弈 👍 303 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 猜数字大小 II
 */
public class P375_GuessNumberHigherOrLowerIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P375_GuessNumberHigherOrLowerIi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int getMoneyAmount(int n) {
            // dp[i][j] 表示在 区间[i,j]猜数所需要的花费
            // dp[0][0] = 0
            // 枚举先猜k，则花费k，剩下区间[i,k-1]和[k+1,j]，因为会告诉你大了或小了，所以肯定只选择一个
            // 又因为我们要保证猜对，所以取max{dp[i][k-1],dp[k+1][j]} ，即有：
            // dp[i][j]=min(dp[i][j], k+max(dp[i][k-1],dp[k+1][j]));
            int[][] dp = new int[n + 2][n + 2];
            for (int j = 1; j <= n; j++) {
                for (int i = j - 1; i >= 1; i--) {
                    dp[i][j] = n * n; //初始成极大值
                    for (int k = i; k <= j; k++) {
                        int cost = k + Math.max(dp[i][k - 1], dp[k + 1][j]);
                        dp[i][j] = Math.min(dp[i][j], cost);
                    }
                }
            }
            return dp[1][n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
