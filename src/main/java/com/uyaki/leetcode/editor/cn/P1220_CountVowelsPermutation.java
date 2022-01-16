//给你一个整数 n，请你帮忙统计一下我们可以按下述规则形成多少个长度为 n 的字符串： 
//
// 
// 字符串中的每个字符都应当是小写元音字母（'a', 'e', 'i', 'o', 'u'） 
// 每个元音 'a' 后面都只能跟着 'e' 
// 每个元音 'e' 后面只能跟着 'a' 或者是 'i' 
// 每个元音 'i' 后面 不能 再跟着另一个 'i' 
// 每个元音 'o' 后面只能跟着 'i' 或者是 'u' 
// 每个元音 'u' 后面只能跟着 'a' 
// 
//
// 由于答案可能会很大，所以请你返回 模 10^9 + 7 之后的结果。 
//
// 
//
// 示例 1： 
//
// 输入：n = 1
//输出：5
//解释：所有可能的字符串分别是："a", "e", "i" , "o" 和 "u"。
// 
//
// 示例 2： 
//
// 输入：n = 2
//输出：10
//解释：所有可能的字符串分别是："ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" 和 "ua"。
// 
//
// 示例 3： 
//
// 输入：n = 5
//输出：68 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 2 * 10^4 
// 
// Related Topics 动态规划 👍 48 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 统计元音字母序列的数目
 */
public class P1220_CountVowelsPermutation {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1220_CountVowelsPermutation().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countVowelPermutation(int n) {
            // 题目等价于
            // 元音字母 ‘a’ 前面只能跟着 ‘e’,‘i’,‘u’；
            //元音字母 ‘e’ 前面只能跟着 ‘a’,‘i’；
            //每个元音 ‘i’ 前面只能跟着 ‘e’,‘o’；
            //每个元音 ‘o’ 前面只能跟着 ‘i’；
            //每个元音 ‘u’ 前面只能跟着 ‘i’,'o'；
            // 设 dp[i][j] 代表当前长度为 i 且以字符 j 为结尾的字符串的数目
            // 其中 ，j=0,1,2,3,4分别表示以 a,e,i,o,u为结尾
            // dp[i][0] = dp[i-1][1] + dp[i-1][2]+dp[i-1][4]
            // dp[i][1] = dp[i-1][0] + dp[i-1][2]
            // dp[i][2] = dp[i-1][1] + dp[i-1][3]
            // dp[i][3] = dp[i-1][2]
            // dp[i][4] = dp[i-1][2] + dp[i-1][3]
            // 最终可以形成长度为 n 的字符串的数目为：
            // i=0∑4 => dp[n][i] = dp[n][0]+dp[n][1]+dp[n][2]+dp[n][3]+dp[n][4]

            long mod = 1000000007;
            // 表示 i-1 的 dp值 dp[i-1]
            long[] dp = new long[5];
            // 表示 i 的 dp 值 dp[i]
            long[] ndp = new long[5];
            for (int i = 0; i < 5; i++) {
                dp[i] = 1;
            }
            for (int i = 2; i <= n; i++) {
                ndp[0] = (dp[1] + dp[2] + dp[4]) % mod;
                ndp[1] = (dp[0] + dp[2]) % mod;
                ndp[2] = (dp[1] + dp[3]) % mod;
                ndp[3] = dp[2] % mod;
                ndp[4] = (dp[2] + dp[3]) % mod;
                // src:源数组
                // srcPos:源数组的起始位置
                // dest:目标数组
                // destPos:目标数组的起始位置
                // length:复制长度
                // 当前结果dp[i]作为下次循环dp[i-1]的值。
                System.arraycopy(ndp, 0, dp, 0, 5);
            }
            long ans = 0;
            for (int i = 0; i < 5; i++) {
                ans = (ans + dp[i]) % mod;
            }
            return (int) ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
