//你的任务是计算 aᵇ 对 1337 取模，a 是一个正整数，b 是一个非常大的正整数且会以数组形式给出。 
//
// 
//
// 示例 1： 
//
// 
//输入：a = 2, b = [3]
//输出：8
// 
//
// 示例 2： 
//
// 
//输入：a = 2, b = [1,0]
//输出：1024
// 
//
// 示例 3： 
//
// 
//输入：a = 1, b = [4,3,3,8,5,2]
//输出：1
// 
//
// 示例 4： 
//
// 
//输入：a = 2147483647, b = [2,0,0]
//输出：1198
// 
//
// 
//
// 提示： 
//
// 
// 1 <= a <= 2³¹ - 1 
// 1 <= b.length <= 2000 
// 0 <= b[i] <= 9 
// b 不含前导 0 
// 
// Related Topics 数学 分治 👍 190 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 超级次方
 */
public class P372_SuperPow {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P372_SuperPow().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        static final int MOD = 1337;

		public int superPow(int a, int[] b) {
			// 乘法在取模的意义下满足分配律
			// (a⋅b) mod m=[(a mod m)⋅(b mod m)] mod m
			int ans = 1;
			// 设 a 的幂次为 n。根据题意，n 从最高位到最低位的所有数位构成了数组 b。记数组 b 的长度为 m，有
			// n = m-1 ∑ i=0 ( 10^(m-1-i) * b_i )
			// 由于 a^(x+y) = a^x * a^y 且 a^(x*y)= (a^x)^y
			// 有 a^n = m-1 ∏ i=0 ( a^(10^(m-1-i)*b_i) ) =  m-1 ∏ i=0 ( (a^(10^(m-1-i))^b_i )
			// a^10^k = a^(10^(k-1)*10) =( a^10^(k-1) )^10
			// 可以从a^1开始，递推计算出 a^10^k
			// 代码实现时，可以从 b_{m-1} 开始倒序计算
			for (int i = b.length - 1; i >= 0; --i) {
				ans = (int) ((long) ans * pow(a, b[i]) % MOD);
				a = pow(a, 10);
			}
			return ans;
		}

		/**
		 * 见P50快速幂
		 *
		 * @param x
		 * @param n
		 * @return
		 */
		public int pow(int x, int n) {
			// 乘法在取模的意义下满足分配律
			// (a⋅b) mod m=[(a mod m)⋅(b mod m)] mod m
			int res = 1;
			while (n != 0) {
				if (n % 2 != 0) {
					res = (int) ((long) res * x % MOD);
				}
				x = (int) ((long) x * x % MOD);
				n /= 2;
			}
			return res;
		}
    }
//leetcode submit region end(Prohibit modification and deletion)

}
