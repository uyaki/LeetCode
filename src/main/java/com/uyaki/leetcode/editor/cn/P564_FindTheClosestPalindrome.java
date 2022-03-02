//给定一个表示整数的字符串 n ，返回与它最近的回文整数（不包括自身）。如果不止一个，返回较小的那个。 
//
// “最近的”定义为两个整数差的绝对值最小。 
//
// 
//
// 示例 1: 
//
// 
//输入: n = "123"
//输出: "121"
// 
//
// 示例 2: 
//
// 
//输入: n = "1"
//输出: "0"
//解释: 0 和 2是最近的回文，但我们返回最小的，也就是 0。
// 
//
// 
//
// 提示: 
//
// 
// 1 <= n.length <= 18 
// n 只由数字组成 
// n 不含前导 0 
// n 代表在 [1, 10¹⁸ - 1] 范围内的整数 
// 
// Related Topics 数学 字符串 👍 190 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 寻找最近的回文数
 */
public class P564_FindTheClosestPalindrome {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P564_FindTheClosestPalindrome().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String nearestPalindromic(String n) {
            //分别计算出以下每一种可能的方案对应的回文整数，在其中找到与原数最近且不等于原数的数即为答案。
            //
            //1. 用原数的前半部分替换后半部分得到的回文整数。
            //2. 用原数的前半部分加一后的结果替换后半部分得到的回文整数。
            //3. 用原数的前半部分减一后的结果替换后半部分得到的回文整数。
            //4. 为防止位数变化导致构造的回文整数错误，因此直接构造 999…999 和 100…001 作为备选答案。
            long selfNumber = Long.parseLong(n), ans = -1;
            List<Long> candidates = getCandidates(n);
            for (long candidate : candidates) {
                if (candidate != selfNumber) {
                    if (ans == -1 ||
                            Math.abs(candidate - selfNumber) < Math.abs(ans - selfNumber) ||
                            Math.abs(candidate - selfNumber) == Math.abs(ans - selfNumber) && candidate < ans) {
                        ans = candidate;
                    }
                }
            }
            return Long.toString(ans);
        }

        private List<Long> getCandidates(String n) {
            int len = n.length();
            List<Long> candidates = new ArrayList<Long>() {{
                add((long) Math.pow(10, len - 1) - 1);
                add((long) Math.pow(10, len) + 1);
            }};
            long selfPrefix = Long.parseLong(n.substring(0, (len + 1) / 2));
            for (long i = selfPrefix - 1; i <= selfPrefix + 1; i++) {
                StringBuffer sb = new StringBuffer();
                String prefix = String.valueOf(i);
                sb.append(prefix);
                StringBuffer suffix = new StringBuffer(prefix).reverse();
                sb.append(suffix.substring(len & 1));
                String candidate = sb.toString();
                candidates.add(Long.parseLong(candidate));
            }
            return candidates;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
