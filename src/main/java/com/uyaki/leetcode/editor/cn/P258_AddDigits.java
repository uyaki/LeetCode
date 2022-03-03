//给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。 
//
// 
//
// 示例 1: 
//
// 
//输入: num = 38
//输出: 2 
//解释: 各位相加的过程为：
//38 --> 3 + 8 --> 11
//11 --> 1 + 1 --> 2
//由于 2 是一位数，所以返回 2。
// 
//
// 示例 1: 
//
// 
//输入: num = 0
//输出: 0 
//
// 
//
// 提示： 
//
// 
// 0 <= num <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你可以不使用循环或者递归，在 O(1) 时间复杂度内解决这个问题吗？ 
// Related Topics 数学 数论 模拟 👍 454 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 各位相加
 */
public class P258_AddDigits {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P258_AddDigits().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int addDigits(int num) {
            // 设 abc
            // s1 = a *100 + b*10 + c
            // s2 = a + b + c = s - 99 * a  - 9 * b
            // s1 - s2 = 99 * a - 9 * b
            // num 不是 9 的倍数时，其数根即为 num 除以 9 的余数。
            // num 是 9 的倍数时
            // 如果 num=0，则其数根是 0
            // 如果 num>0，则各位相加的结果大于 0，其数根也大于 0，因此其数根是 9
            return (num - 1) % 9 + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
