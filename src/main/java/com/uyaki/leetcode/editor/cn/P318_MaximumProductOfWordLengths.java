//给定一个字符串数组 words，找到 length(word[i]) * length(word[j]) 的最大值，并且这两个单词不含有公共字母。你可以认为
//每个单词只包含小写字母。如果不存在这样的两个单词，返回 0。 
//
// 
//
// 示例 1: 
//
// 
//输入: ["abcw","baz","foo","bar","xtfn","abcdef"]
//输出: 16 
//解释: 这两个单词为 "abcw", "xtfn"。 
//
// 示例 2: 
//
// 
//输入: ["a","ab","abc","d","cd","bcd","abcd"]
//输出: 4 
//解释: 这两个单词为 "ab", "cd"。 
//
// 示例 3: 
//
// 
//输入: ["a","aa","aaa","aaaa"]
//输出: 0 
//解释: 不存在这样的两个单词。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= words.length <= 1000 
// 1 <= words[i].length <= 1000 
// words[i] 仅包含小写字母 
// 
// Related Topics 位运算 数组 字符串 👍 201 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * 最大单词长度乘积
 */
public class P318_MaximumProductOfWordLengths {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P318_MaximumProductOfWordLengths().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProduct(String[] words) {
            int maxSum = 0;
            for (int i = 0; i < words.length; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (!hasSameChar(words[i], words[j])) {
                        maxSum = Math.max(maxSum, words[i].length() * words[j].length());
                    }
                }
            }
            return maxSum;
        }

        /**
         * 是否有相同字符
         *
         * @param s1 s1
         * @param s2 s2
         * @return 是否有相同字符结果
         */
        private boolean hasSameChar(String s1, String s2) {
            Set<Character> set = new HashSet<>();
            for (char ch : s1.toCharArray()) {
                set.add(ch);
            }
            for (char ch : s2.toCharArray()) {
                if (set.contains(ch)) {
                    return true;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
