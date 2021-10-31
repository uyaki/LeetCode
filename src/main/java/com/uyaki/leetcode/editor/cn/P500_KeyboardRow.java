//给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。键盘如下图所示。 
//
// 美式键盘 中： 
//
// 
// 第一行由字符 "qwertyuiop" 组成。 
// 第二行由字符 "asdfghjkl" 组成。 
// 第三行由字符 "zxcvbnm" 组成。 
// 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：words = ["Hello","Alaska","Dad","Peace"]
//输出：["Alaska","Dad"]
// 
//
// 示例 2： 
//
// 
//输入：words = ["omk"]
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：words = ["adsdf","sfd"]
//输出：["adsdf","sfd"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 20 
// 1 <= words[i].length <= 100 
// words[i] 由英文字母（小写和大写字母）组成 
// 
// Related Topics 数组 哈希表 字符串 👍 173 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 键盘行
 */
public class P500_KeyboardRow {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P500_KeyboardRow().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] findWords(String[] words) {
            String[] bases = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
            List<String> list = new ArrayList<>();
            for (String word : words) {
                String lowerCaseWord = word.toLowerCase();
                char ch = lowerCaseWord.charAt(0);
                int index = 0;
                for (int i = 0; i < bases.length; i++) {
                    if (bases[i].contains(String.valueOf(ch))) {
                        index = i;
                        break;
                    }
                }
                boolean bool = true;
                for (int i = 1; i < lowerCaseWord.length(); i++) {
                    if (!bases[index].contains(String.valueOf(lowerCaseWord.charAt(i)))) {
                        bool = false;
                        break;
                    }
                }
                if (bool) {
                    list.add(word);
                }
            }
            return list.toArray(new String[0]);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
