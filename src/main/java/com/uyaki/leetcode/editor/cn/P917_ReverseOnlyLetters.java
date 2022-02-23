//给你一个字符串 s ，根据下述规则反转字符串： 
//
// 
// 所有非英文字母保留在原有位置。 
// 所有英文字母（小写或大写）位置反转。 
// 
//
// 返回反转后的 s 。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：s = "ab-cd"
//输出："dc-ba"
// 
//
// 
// 
//
// 示例 2： 
//
// 
//输入：s = "a-bC-dEf-ghIj"
//输出："j-Ih-gfE-dCba"
// 
//
// 
// 
//
// 示例 3： 
//
// 
//输入：s = "Test1ng-Leet=code-Q!"
//输出："Qedo1ct-eeLg=ntse-T!"
// 
//
// 
//
// 提示 
//
// 
// 1 <= s.length <= 100 
// s 仅由 ASCII 值在范围 [33, 122] 的字符组成 
// s 不含 '\"' 或 '\\' 
// 
// Related Topics 双指针 字符串 👍 155 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 仅仅反转字母
 */
public class P917_ReverseOnlyLetters {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P917_ReverseOnlyLetters().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseOnlyLetters(String s) {
            int n = s.length();
            int left = 0, right = n - 1;
            char[] chs = s.toCharArray();
            while (true) {
                while (left < right && !Character.isLetter(s.charAt(left))) {
                    // 判断左边是否扫描到字母
                    left++;
                }
                while (right > left && !Character.isLetter(s.charAt(right))) {
					// 判断右边是否扫描到字母
                    right--;
                }
                if (left >= right) {
                    break;
                }
                swap(chs, left, right);
                left++;
                right--;
            }
            return new String(chs);
        }

        private void swap(char[] chs, int left, int right) {
            char temp = chs[left];
            chs[left] = chs[right];
            chs[right] = temp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
