//给定一个正整数，检查它的二进制表示是否总是 0、1 交替出现：换句话说，就是二进制表示中相邻两位的数字永不相同。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 5
//输出：true
//解释：5 的二进制表示是：101
// 
//
// 示例 2： 
//
// 
//输入：n = 7
//输出：false
//解释：7 的二进制表示是：111. 
//
// 示例 3： 
//
// 
//输入：n = 11
//输出：false
//解释：11 的二进制表示是：1011. 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 2³¹ - 1 
// 
// Related Topics 位运算 👍 119 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 交替位二进制数
 */
public class P693_BinaryNumberWithAlternatingBits {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P693_BinaryNumberWithAlternatingBits().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean hasAlternatingBits(int n) {
            // 右移一位再异或运算，结果全为 1
            //  10101
            // ^01010
            // =11111
            // 此时只要证明a是全 1构成，就能证明 n是1010交替
            int a = (n >> 1) ^ n;
            //  100000
            // &011111
            // =000000
            // a与a+1与运算为0，则a是全1构成
            return ((a + 1) & a) == 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
