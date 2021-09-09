//给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？返回满足题意的二叉搜索树的种数。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：5
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 19 
// 
// Related Topics 树 二叉搜索树 数学 动态规划 二叉树 👍 1311 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 不同的二叉搜索树
 */
public class P96_UniqueBinarySearchTrees {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 假设n个节点存在二叉排序树的个数是G(n)，
         * 令f(i)为以i为根的二叉搜索树的个数
         * <p>
         * 即有:G(n) = f(1) + f(2) + f(3) + f(4) + ... + f(n)
         * <p>
         * n为根节点，当i为根节点时，
         * 其左子树节点个数为[1,2,3,...,i-1]，
         * 右子树节点个数为[i+1,i+2,...n]，
         * 所以当i为根节点时，其左子树节点个数为i-1个，右子树节点为n-i，
         * <p>
         * 即f(i) = G(i-1)*G(n-i),
         * 上面两式可得:G(n) = G(0)*G(n-1)+G(1)*G(n-2)+...+G(n-1)*G(0)
         *
         * @param n 节点个数
         * @return 树的数量
         */
        public int numTrees(int n) {
            //初始状态
            if (n < 2) return 1;
            int[] dp = new int[n + 1];
            Arrays.fill(dp, 0);
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    dp[i]  += dp[j] * dp[i - j - 1];
                }
            }
            return dp[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
