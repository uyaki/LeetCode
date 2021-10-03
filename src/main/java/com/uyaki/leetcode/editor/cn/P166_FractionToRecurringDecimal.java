//给定两个整数，分别表示分数的分子 numerator 和分母 denominator，以 字符串形式返回小数 。 
//
// 如果小数部分为循环小数，则将循环的部分括在括号内。 
//
// 如果存在多个答案，只需返回 任意一个 。 
//
// 对于所有给定的输入，保证 答案字符串的长度小于 10⁴ 。 
//
// 
//
// 示例 1： 
//
// 
//输入：numerator = 1, denominator = 2
//输出："0.5"
// 
//
// 示例 2： 
//
// 
//输入：numerator = 2, denominator = 1
//输出："2"
// 
//
// 示例 3： 
//
// 
//输入：numerator = 2, denominator = 3
//输出："0.(6)"
// 
//
// 示例 4： 
//
// 
//输入：numerator = 4, denominator = 333
//输出："0.(012)"
// 
//
// 示例 5： 
//
// 
//输入：numerator = 1, denominator = 5
//输出："0.2"
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= numerator, denominator <= 2³¹ - 1 
// denominator != 0 
// 
// Related Topics 哈希表 数学 字符串 👍 303 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 分数到小数
 */
public class P166_FractionToRecurringDecimal{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P166_FractionToRecurringDecimal().new Solution();
	 }
	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
		long numeratorLong = (long) numerator;
		long denominatorLong = (long) denominator;
		if (numeratorLong % denominatorLong == 0) {
			return String.valueOf(numeratorLong / denominatorLong);
		}

		StringBuffer sb = new StringBuffer();
		if (numeratorLong < 0 ^ denominatorLong < 0) {
			sb.append('-');
		}

		// 整数部分
		numeratorLong = Math.abs(numeratorLong);
		denominatorLong = Math.abs(denominatorLong);
		long integerPart = numeratorLong / denominatorLong;
		sb.append(integerPart);
		sb.append('.');

		// 小数部分
		StringBuffer fractionPart = new StringBuffer();
		Map<Long, Integer> remainderIndexMap = new HashMap<Long, Integer>();
		long remainder = numeratorLong % denominatorLong;
		int index = 0;
		while (remainder != 0 && !remainderIndexMap.containsKey(remainder)) {
			remainderIndexMap.put(remainder, index);
			remainder *= 10;
			fractionPart.append(remainder / denominatorLong);
			remainder %= denominatorLong;
			index++;
		}
		if (remainder != 0) { // 有循环节
			int insertIndex = remainderIndexMap.get(remainder);
			fractionPart.insert(insertIndex, '(');
			fractionPart.append(')');
		}
		sb.append(fractionPart.toString());

		return sb.toString();
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
