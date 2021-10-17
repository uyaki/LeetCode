//给你一个 正 整数 num ，输出它的补数。补数是对该数的二进制表示取反。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：num = 5
//输出：2
//解释：5 的二进制表示为 101（没有前导零位），其补数为 010。所以你需要输出 2 。
// 
//
// 示例 2： 
//
// 
//输入：num = 1
//输出：0
//解释：1 的二进制表示为 1（没有前导零位），其补数为 0。所以你需要输出 0 。
// 
//
// 
//
// 提示： 
//
// 
// 给定的整数 num 保证在 32 位带符号整数的范围内。 
// num >= 1 
// 你可以假定二进制数不包含前导零位。 
// 本题与 1009 https://leetcode-cn.com/problems/complement-of-base-10-integer/ 相同 
// 
// Related Topics 位运算 👍 230 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 数字的补数
 */
public class P476_NumberComplement {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P476_NumberComplement().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findComplement(int num) {
            //首先找到 num 二进制表示最高位的那个 1，再将这个 1 以及更低的位进行取反
            //如果 num 二进制表示最高位的 1 是第 i(0≤i≤30) 位，那么一定有：2^i ≤ num < 2^(i+1)
            // 1<<i = 2^i
            int highBit = 0;
            for (int i = 1; i <= 30; ++i) {
                if (num >= 1 << i) {
                    highBit = i;
                } else {
                    break;
                }
            }
            //构造掩码 mask = 2^(i+1) - 1，它是一个 i+1 位的二进制数，并且每一位都是 1。我们将 num 与 mask 进行异或运算，即可得到答案
            int mask = highBit == 30 ? 0x7fffffff : (1 << (highBit + 1)) - 1;
            return num ^ mask;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
