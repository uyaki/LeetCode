//给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。 
//
// 
// '.' 匹配任意单个字符 
// '*' 匹配零个或多个前面的那一个元素 
// 
//
// 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。 
// 
//
// 示例 1： 
//
// 
//输入：s = "aa" p = "a"
//输出：false
//解释："a" 无法匹配 "aa" 整个字符串。
// 
//
// 示例 2: 
//
// 
//输入：s = "aa" p = "a*"
//输出：true
//解释：因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
// 
//
// 示例 3： 
//
// 
//输入：s = "ab" p = ".*"
//输出：true
//解释：".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
// 
//
// 示例 4： 
//
// 
//输入：s = "aab" p = "c*a*b"
//输出：true
//解释：因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
// 
//
// 示例 5： 
//
// 
//输入：s = "mississippi" p = "mis*is*p*."
//输出：false 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 20 
// 0 <= p.length <= 30 
// s 可能为空，且只包含从 a-z 的小写字母。 
// p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。 
// 保证每次出现字符 * 时，前面都匹配到有效的字符 
// 
// Related Topics 递归 字符串 动态规划 👍 2394 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 正则表达式匹配
 */
public class P10_RegularExpressionMatching {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isMatch(String s, String p) {
            //用f[i][j]表示，s的前i个字符与p的前j个字符是否匹配
            // 如果p的第j个字符是
            // 1. p[j] = 小写字母，则有
            // 1.1 f[i][j] = f[i-1]f[j-1] ,s[i] = p[j] (f[i][j]由前面的结果决定)
            // 1.2 f[i][j] = false ,s[i]≠p[j]
            // 2. p[j] = *，则有 p为字母+星号，本质有两种情况
            // 2.1 匹配s末尾的一个字符，将该字符扔掉，而该组合还可以继续匹配：
            // f[i][j] = f[i-1][j] or f[i][j-2], s[i] = p[j-1]
            // 2.2 不匹配字符，将该组合扔掉，不再进行匹配
            // f[i][j] = f[i][j-2], s[i] ≠ p[j-1]
            // 3.在任意情况下，只要 p[j] = . ,那么一定成功匹配s中任意一个小写字母
            // 最终状态转移方程为 :
            // f[i][j]
            // 		if(p[j]≠*)
            //			then
            //				if   matches(s[i],p[j])
            //				then f[i][j] =  f[i-1][j-1]
            //          	else
            //          		 f[i][j] = false
            //      else
            //      	if   matches(s[i],p[j-1])
            //			then f[i][j] = f[i-1][j] or f[i][j-2]
            //		    else
            //		         f[i][j] = f[i][j-2]
            // 其中，matches(x,y)是判断两个字符是否匹配的辅助函数，当y='.'或者x=y时为true
            // 两个空字符可以匹配，所以，边界条件为f[0][0] = true
            int sLength = s.length();
            int pLength = p.length();
            boolean[][] f = new boolean[sLength + 1][pLength + 1];
            f[0][0] = true;
            for (int i = 0; i <= s.length(); i++) {
                for (int j = 1; j <= p.length(); j++) {
                    if (p.charAt(j - 1) != '*') {
                        if (matches(s, p, i, j)) {
                            f[i][j] = f[i - 1][j - 1];
                        } else {
                            f[i][j] = false;
                        }
                    } else {
                        if (matches(s, p, i, j - 1)) {
                            f[i][j] = f[i - 1][j] || f[i][j - 2];
                        } else {
                            f[i][j] = f[i][j - 2];
                        }
                    }
                }
            }
            return f[sLength][pLength];
        }

        public boolean matches(String s, String p, int i, int j) {
            if (i == 0) {
                return false;
            }
            return p.charAt(j - 1) == '.' || s.charAt(i - 1) == p.charAt(j - 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
