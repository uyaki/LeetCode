//给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。 
//
// 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：text = "nlaebolko"
//输出：1
// 
//
// 示例 2： 
//
// 
//
// 输入：text = "loonbalxballpoon"
//输出：2
// 
//
// 示例 3： 
//
// 输入：text = "leetcode"
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 10^4 
// text 全部由小写英文字母组成 
// 
// Related Topics 哈希表 字符串 计数 👍 97 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;

/**
 * “气球” 的最大数量
 */
public class P1189_MaximumNumberOfBalloons{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1189_MaximumNumberOfBalloons().new Solution();
	 }
	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxNumberOfBalloons(String text) {
		int[] count = new int[26];
		for (char ch : text.toCharArray()) {
			count[ch - 'a']++;
		}
		int[] balloon = new int[]{count[1], count[0], count[11] / 2, count[14] / 2, count[13]};
		return Arrays.stream(balloon).min().getAsInt();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
