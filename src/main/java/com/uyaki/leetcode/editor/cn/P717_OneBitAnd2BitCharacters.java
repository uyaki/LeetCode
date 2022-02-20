//有两种特殊字符： 
//
// 
// 第一种字符可以用一个比特 0 来表示 
// 第二种字符可以用两个比特(10 或 11)来表示、 
// 
//
// 给定一个以 0 结尾的二进制数组 bits ，如果最后一个字符必须是一位字符，则返回 true 。 
//
// 
//
// 示例 1: 
//
// 
//输入: bits = [1, 0, 0]
//输出: true
//解释: 唯一的编码方式是一个两比特字符和一个一比特字符。
//所以最后一个字符是一比特字符。
// 
//
// 示例 2: 
//
// 
//输入: bits = [1, 1, 1, 0]
//输出: false
//解释: 唯一的编码方式是两比特字符和两比特字符。
//所以最后一个字符不是一比特字符。
// 
//
// 
//
// 提示: 
//
// 
// 1 <= bits.length <= 1000 
// bits[i] == 0 or 1 
// 
// Related Topics 数组 👍 246 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 1比特与2比特字符
 */
public class P717_OneBitAnd2BitCharacters{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P717_OneBitAnd2BitCharacters().new Solution();
	 }
	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
		//第一种字符一定以 0 开头，第二种字符一定以 1 开头。
		// 从左到右遍历
		//如果 bits[i]=0，说明遇到了第一种字符，将 i 的值增加 1；
		// 如果 bits[i]=1，说明遇到了第二种字符，可以跳过 bits[i+1]
		// （注意题目保证 bits 一定以 0 结尾，所以 bits[i] 一定不是末尾比特，因此 bits[i+1] 必然存在），将 i 的值增加 2。
		// 若遍历到 i=n−1，那么说明最后一个字符一定是第一种字符。
		int n = bits.length, i = 0;
		while (i < n - 1) {
			i += bits[i] + 1;
		}
		return i == n - 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
