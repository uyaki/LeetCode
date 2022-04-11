//给你一个整数 n ，统计并返回各位数字都不同的数字 x 的个数，其中 0 <= x < 10ⁿ 。
// 
// 
// 
//
// 示例 1： 
//
// 
//输入：n = 2
//输出：91
//解释：答案应为除去 11、22、33、44、55、66、77、88、99 外，在 0 ≤ x < 100 范围内的所有数字。 
// 
//
// 示例 2： 
//
// 
//输入：n = 0
//输出：1
// 
// 
// 
//
// 
//
// 提示： 
//
// 
// 0 <= n <= 8 
// 
// Related Topics 数学 动态规划 回溯 👍 234 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 统计各位数字都不同的数字个数
 */
public class P357_CountNumbersWithUniqueDigits{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P357_CountNumbersWithUniqueDigits().new Solution();
	 }
	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
		if (n == 0) {
			return 1;
		}
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 10;
		for (int i = 2; i <= n ; i++) {
			//dp[i-1]-dp[i-2]的意思是我们上一次较上上一次多出来的各位不重复的数字。
			// 以n=3为例，n=2已经计算了0-99之间不重复的数字了，我们需要判断的是100-999之间不重复的数字，
			// 那也就只能用10-99之间的不重复的数去组成三位数，而不能使用0-9之间的不重复的数，
			// 因为他们也组成不了3位数。而10-99之间不重复的数等于dp[2]-dp[1]。
			//当i=2时，说明之前选取的数字只有 1位，那么我们只要与这一位不重复即可，
			// 所以其实有 9*(10-1)种情况（比如1，后面可以跟0,2,3,4,5,6,7,8,9）。
			//当i=3时，说明之前选取的数字有2位，那么我们需要与2位不重复，所以剩余的
			//有 8*（10-2）种（比如12，后面可以跟0,3,4,5,6,7,8,9）
			dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - 2]) * (10 - (i - 1));
		}
		return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
