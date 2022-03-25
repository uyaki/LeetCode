//给定一个整数 n ，返回 n! 结果中尾随零的数量。 
//
// 提示 n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：0
//解释：3! = 6 ，不含尾随 0
// 
//
// 示例 2： 
//
// 
//输入：n = 5
//输出：1
//解释：5! = 120 ，有一个尾随 0
// 
//
// 示例 3： 
//
// 
//输入：n = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= n <= 10⁴ 
// 
//
// 
//
// 进阶：你可以设计并实现对数时间复杂度的算法来解决此问题吗？ 
// Related Topics 数学 👍 634 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 阶乘后的零
 */
public class P172_FactorialTrailingZeroes {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P172_FactorialTrailingZeroes().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int trailingZeroes(int n) {
			// 1. 末尾的0怎么来的？
			// 两个数相乘末尾有0，则这两个数中必有因子2和5
			// 2. 问题转换为：N!最多可以分解出多少个因子2和5
			// 由于每个偶数都能分解出因子2，即因子2肯定被因子5多
			// 3. 问题转换为：N!最多可以分解出多少个因子5
            int ans = 0;
            while (n != 0) {
                n /= 5;
                ans += n;
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
