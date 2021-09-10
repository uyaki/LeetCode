//给你一个字符串 s，找到 s 中最长的回文子串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 示例 3： 
//
// 
//输入：s = "a"
//输出："a"
// 
//
// 示例 4： 
//
// 
//输入：s = "ac"
//输出："a"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母（大写和/或小写）组成 
// 
// Related Topics 字符串 动态规划 👍 4069 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 最长回文子串
 */
public class P5_LongestPalindromicSubstring {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() < 1) {
                return "";
            }
            int start = 0;
            int end = 0;
            for (int i = 1; i < s.length(); i++) {
                //中心是单个字符
                int length1 = getLongestPalindrome(s, i, i);
                //中心是两个字符
                int length2 = getLongestPalindrome(s, i, i + 1);
                int length = Math.max(length1, length2);
                if (length > end - start) {
                    start = i - (length - 1) / 2;
                    end = i + (length) / 2;
                }
            }
            //substring 是[a,b)区间
            return s.substring(start, end + 1);
        }

        private int getLongestPalindrome(String s, int left, int right) {
            int tempLeft = left;
            int tempRight = right;
            while (tempLeft >= 0 && tempRight < s.length() && s.charAt(tempLeft) == s.charAt(tempRight)) {
                tempLeft--;
                tempRight++;
            }
            return tempRight - tempLeft - 1;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
