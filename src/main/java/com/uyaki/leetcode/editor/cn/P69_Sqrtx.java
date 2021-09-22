//给你一个非负整数 x ，计算并返回 x 的 平方根 。 
//
// 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。 
//
// 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 4
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：x = 8
//输出：2
//解释：8 的平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= x <= 2³¹ - 1 
// 
// Related Topics 数学 二分查找 👍 773 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * x 的平方根
 */
public class P69_Sqrtx {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int mySqrt(int x) {
            if (x == 0) {
                return 0;
            }
            if (x == 1) {
                return 1;
            }
            return mySqrt(x, 0, x);
        }

        private int mySqrt(int x, int start, int end) {
            if (start > end) {
                return end;
            }
            int mid = (start + end) / 2;
            //使用mid * mid < x会导致堆栈溢出
            if (x / mid > mid) {
                return mySqrt(x, mid + 1, end);
            } else if (x / mid < mid) {
                return mySqrt(x, start, mid - 1);
            } else {
                return mid;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
