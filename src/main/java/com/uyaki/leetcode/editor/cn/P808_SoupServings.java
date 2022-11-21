//有 A 和 B 两种类型 的汤。一开始每种类型的汤有 n 毫升。有四种分配操作： 
//
// 
// 提供 100ml 的 汤A 和 0ml 的 汤B 。 
// 提供 75ml 的 汤A 和 25ml 的 汤B 。 
// 提供 50ml 的 汤A 和 50ml 的 汤B 。 
// 提供 25ml 的 汤A 和 75ml 的 汤B 。 
// 
//
// 当我们把汤分配给某人之后，汤就没有了。每个回合，我们将从四种概率同为 0.25 的操作中进行分配选择。如果汤的剩余量不足以完成某次操作，我们将尽可能分配。
//当两种类型的汤都分配完时，停止操作。 
//
// 注意 不存在先分配 100 ml 汤B 的操作。 
//
// 需要返回的值： 汤A 先分配完的概率 + 汤A和汤B 同时分配完的概率 / 2。返回值在正确答案 10⁻⁵ 的范围内将被认为是正确的。 
//
// 
//
// 示例 1: 
//
// 
//输入: n = 50
//输出: 0.62500
//解释:如果我们选择前两个操作，A 首先将变为空。
//对于第三个操作，A 和 B 会同时变为空。
//对于第四个操作，B 首先将变为空。
//所以 A 变为空的总概率加上 A 和 B 同时变为空的概率的一半是 0.25 *(1 + 1 + 0.5 + 0)= 0.625。
// 
//
// 示例 2: 
//
// 
//输入: n = 100
//输出: 0.71875
// 
//
// 
//
// 提示: 
//
// 
// 0 <= n <= 10⁹ 
// 
// Related Topics 数学 动态规划 概率与统计 👍 127 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 分汤
 */
public class P808_SoupServings {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P808_SoupServings().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private double[][] f = new double[200][200];

        public double soupServings(int n) {
            // dp[i][j] = 表示汤 A 和汤 B 分别剩下 i和 j 份时所求的概率值
            // (4,0)(3,1)(2,2)(1,3)
            // dp[i][j] = 0.25 * (dp[i-4][j] + dp[i-3][j-1] + dp[i-2][j-2]+dp[i-1][j-3])
            // 当 i>0,j=0时，A没分配完，A永远无法分配完，所以dp[i][j] = 0
            // 当 i=0,j=0时,AB同时分配完概率1.0，汤A分配完概率0，dp[i][j]=1/2=0.5
            // 当 i=0,j>0时，A先分配完概率1.0 ,所以dp[i][j] = 1.0;
            //在 n=4800 时，结果为 0.999994994426，而题目要求的精度为 10^−5
            //并且随着 n 的增大，结果越来越接近 1，因此，当 n>4800时，直接返回 1 即可。
            //(n+24)/25 是做了向上取整
            return n > 4800 ? 1 : dfs((n + 24) / 25, (n + 24) / 25);
        }

        public double dfs(int i, int j) {
            if (i <= 0 && j <= 0) {
                return 0.5;
            }
            if (i <= 0) {
                return 1.0;
            }
            if (j <= 0) {
                return 0;
            }
            if (f[i][j] > 0) {
                return f[i][j];
            }
            double ans = 0.25 * (dfs(i - 4, j) + dfs(i - 3, j - 1) + dfs(i - 2, j - 2) + dfs(i - 1, j - 3));
            f[i][j] = ans;
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
