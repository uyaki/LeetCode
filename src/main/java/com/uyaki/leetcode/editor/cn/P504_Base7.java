//给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。 
//
// 
//
// 示例 1: 
//
// 
//输入: num = 100
//输出: "202"
// 
//
// 示例 2: 
//
// 
//输入: num = -7
//输出: "-10"
// 
//
// 
//
// 提示： 
//
// 
// -10⁷ <= num <= 10⁷ 
// 
// Related Topics 数学 👍 157 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 七进制数
 */
public class P504_Base7{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P504_Base7().new Solution();
	 }
	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convertToBase7(int num) {
		if (num == 0) {
			return "0";
		}
		int abs = Math.abs(num);
		StringBuilder sb = new StringBuilder();
		while (abs > 0) {
			sb.append(abs % 7);
			abs /= 7;
		}
		if (num < 0) {
			sb.append("-");
		}
		return sb.reverse().toString();
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
