//实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，x⁴
//
// Related Topics 递归 数学 👍 804 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * Pow(x, n)
 */
public class P50_PowxN {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P50_PowxN().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double myPow(double x, int n) {
            long N = n;
            return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
        }

        public double quickMul(double x, long N) {
            double ans = 1.0;
            // 贡献的初始值为 x
            double x_contribute = x;
            // 在对 N 进行二进制拆分的同时计算答案
            while (N > 0) {
                if (N % 2 == 1) {
                    // 如果 N 二进制表示的最低位为 1，那么需要计入贡献
                    ans *= x_contribute;
                }
                // 将贡献不断地平方
                x_contribute *= x_contribute;
                // 舍弃 N 二进制表示的最低位，这样我们每次只要判断最低位即可
                N /= 2;
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
