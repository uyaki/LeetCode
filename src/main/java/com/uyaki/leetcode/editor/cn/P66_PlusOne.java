//给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = [1,2,3]
//输出：[1,2,4]
//解释：输入数组表示数字 123。
// 
//
// 示例 2： 
//
// 
//输入：digits = [4,3,2,1]
//输出：[4,3,2,2]
//解释：输入数组表示数字 4321。
// 
//
// 示例 3： 
//
// 
//输入：digits = [0]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= digits.length <= 100 
// 0 <= digits[i] <= 9 
// 
// Related Topics 数组 数学 👍 820 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 加一
 */
public class P66_PlusOne{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P66_PlusOne().new Solution();
	 }
	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
		// 不要使用转成数字运算再转成数组的方法，会越界
		// 是否进位+1
		int tmp = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (i == digits.length - 1) {
				if (digits[i] + 1 > 9) {
					tmp = 1;
					digits[i] = digits[i] + 1 - 10;
				} else {
					digits[i] = digits[i] + 1;
				}

			} else {
				if (digits[i] + tmp > 9) {
					digits[i] = digits[i] + tmp - 10;
					tmp = 1;
				} else {
					digits[i] = digits[i] + tmp;
					tmp = 0;
				}
			}
		}

		if (tmp == 1) {
			int[] res = new int[digits.length + 1];
			res[0] = tmp;
			for (int i = 1; i < res.length; i++) {
				res[i] = digits[i - 1];
			}
			return res;
		}
		return digits;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
