//给你一个整数 n ，请你在无限的整数序列 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...] 中找出并返回第 n 位数字。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：3
// 
//
// 示例 2： 
//
// 
//输入：n = 11
//输出：0
//解释：第 11 位数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是 0 ，它是 10 的一部分。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 2³¹ - 1 
// 
// Related Topics 数学 二分查找 👍 191 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 第 N 位数字
 */
public class P400_NthDigit {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P400_NthDigit().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findNthDigit(int n) {
            //1. 1位数共有 9 = 9·1个, 数的范围是1~9;

            //2.2位数共有 90 = 9·10个, 数的范围是10~99;

            //3.3位数共有 900 = 9·10·10个, 数的范围是100~999
            if (n < 10) {
                return n;
            }
            //len表示当前数(十进制)的位数, weigh表示当前位的权重(10^i)...
            int len = 1, weigh = 1;
            while (n > (long) 9 * weigh * len) {
                n -= 9 * weigh * len;
                len++;
                weigh *= 10;
            }
            // curNum是含有所找digit的那个数, 整个数列的第一个数是1
            int curNum = (n - 1) / len + weigh;
            int resDigit = 0;
            // 从低位向高位移动扫描, 根据离末位的偏移量找到所找的数字
            for (int i = (n - 1) % len; i < len; i++) {
                resDigit = curNum % 10;
                curNum /= 10;
            }
            return resDigit;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
