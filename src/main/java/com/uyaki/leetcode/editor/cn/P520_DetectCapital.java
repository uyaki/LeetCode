//我们定义，在以下情况时，单词的大写用法是正确的： 
//
// 
// 全部字母都是大写，比如 "USA" 。 
// 单词中所有字母都不是大写，比如 "leetcode" 。 
// 如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。 
// 
//
// 给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：word = "USA"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：word = "FlaG"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= word.length <= 100 
// word 由小写和大写英文字母组成 
// 
// Related Topics 字符串 👍 164 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 检测大写字母
 */
public class P520_DetectCapital {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P520_DetectCapital().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean detectCapitalUse(String word) {
            // 条件2、3可以合并成，无论首字母是否大写，后面的字母都是小写
            return word.equals(word.toUpperCase())||word.substring(1).equals(word.substring(1).toLowerCase());
        }
        public boolean detectCapitalUse2(String word) {
            String allUpper = word.toUpperCase();
            String allLower = word.toLowerCase();
            String firstUpper = allUpper.charAt(0) + allLower.substring(1);
            return word.equals(allUpper) || word.equals(allLower) || word.equals(firstUpper);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
