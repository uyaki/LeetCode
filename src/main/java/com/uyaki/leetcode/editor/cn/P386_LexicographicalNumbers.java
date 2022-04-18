//给你一个整数 n ，按字典序返回范围 [1, n] 内所有整数。 
//
// 你必须设计一个时间复杂度为 O(n) 且使用 O(1) 额外空间的算法。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 13
//输出：[1,10,11,12,13,2,3,4,5,6,7,8,9]
// 
//
// 示例 2： 
//
// 
//输入：n = 2
//输出：[1,2]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 5 * 10⁴ 
// 
// Related Topics 深度优先搜索 字典树 👍 333 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 字典序排数
 */
public class P386_LexicographicalNumbers{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P386_LexicographicalNumbers().new Solution();
	 }
	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> lexicalOrder(int n) {
		List<Integer> ans = new ArrayList<>();
		int num = 1;
		for (int i = 0; i < n; i++) {
			ans.add(num);
			if (num * 10 <= n) {
				num *= 10;
			} else {
				while (num % 10 == 9 || num + 1 > n) {
					num /= 10;
				}
				num++;
			}
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
