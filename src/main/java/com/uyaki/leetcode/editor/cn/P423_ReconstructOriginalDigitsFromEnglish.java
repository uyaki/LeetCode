//给你一个字符串 s ，其中包含字母顺序打乱的用英文单词表示的若干数字（0-9）。按 升序 返回原始的数字。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "owoztneoer"
//输出："012"
// 
//
// 示例 2： 
//
// 
//输入：s = "fviefuro"
//输出："45"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁵ 
// s[i] 为 ["e","g","f","i","h","o","n","s","r","u","t","w","v","x","z"] 这些字符之一 
// s 保证是一个符合题目要求的字符串 
// 
// Related Topics 哈希表 数学 字符串 👍 74 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.HashMap;

/**
 * 从英文中重建数字
 */
public class P423_ReconstructOriginalDigitsFromEnglish {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P423_ReconstructOriginalDigitsFromEnglish().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String originalDigits(String s) {
            // "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
            // 偶数是具有特殊字母的，对应字母出现一次，就说明这个数字出现了1次
            // z : 0
            // w: 2
            // u: 4
            // x: 6
            // g: 8
            // 此时移除拼接单词需要的字母，剩下的字符用于拼接奇数
            // 又因为1、3、5、7 都有特殊的字符（排除偶数之后）
            // o: 1
            // r: 3
            // f: 5
            // s: 7
            // 此时移除拼接单词需要的字母，剩下的字符用于统计数字 nine：9
            // 此时只需统计字母 ‘i’
            // 为了简化，偶数移除拼接字符时，只需移除 o、r、f、s、i
            // 奇数移除字符时，只需移除 i。到统计9的时候，i的个数就是9的个数
            HashMap<Character, Integer> map = new HashMap<>();
            for (char ch : s.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            // 每个数字出现的次数,默认都出现0次
            int[] count = new int[10];

            // 偶数 even
            //  char[] even = new char[]{'z', 'w', 'u', 'x', 'g' };
            count[0] = map.getOrDefault('z', 0);
            count[2] = map.getOrDefault('w', 0);
            count[4] = map.getOrDefault('u', 0);
            count[6] = map.getOrDefault('x', 0);
            count[8] = map.getOrDefault('g', 0);

            // 基数 old
            // char[] old = new char[]{'o', 'r', 'f', 's', 'i' };
            // 含o的偶数，zero:0 two:2 four:4
            count[1] = map.getOrDefault('o', 0) - count[0] - count[2] - count[4];
            // 含r的偶数，zero:0 four:4
            count[3] = map.getOrDefault('r', 0) - count[0] - count[4];
            // 含f的偶数，four:4
            count[5] = map.getOrDefault('f', 0) - count[4];
            // 含s的偶数，six:6
            count[7] = map.getOrDefault('s', 0) - count[6];
            // 含i的偶数，six:6 eight:8 ,含i 的奇数 five:5
            count[9] = map.getOrDefault('i', 0) - count[6] - count[8] - count[5];
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < count.length; i++) {
                for (int j = 0; j < count[i]; j++) {
                    stringBuilder.append(i);
                }
            }
            return stringBuilder.toString();
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
