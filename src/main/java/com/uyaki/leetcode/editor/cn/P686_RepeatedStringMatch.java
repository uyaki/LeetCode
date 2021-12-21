//给定两个字符串 a 和 b，寻找重复叠加字符串 a 的最小次数，使得字符串 b 成为叠加后的字符串 a 的子串，如果不存在则返回 -1。 
//
// 注意：字符串 "abc" 重复叠加 0 次是 ""，重复叠加 1 次是 "abc"，重复叠加 2 次是 "abcabc"。 
//
// 
//
// 示例 1： 
//
// 输入：a = "abcd", b = "cdabcdab"
//输出：3
//解释：a 重复叠加三遍后为 "abcdabcdabcd", 此时 b 是其子串。
// 
//
// 示例 2： 
//
// 输入：a = "a", b = "aa"
//输出：2
// 
//
// 示例 3： 
//
// 输入：a = "a", b = "a"
//输出：1
// 
//
// 示例 4： 
//
// 输入：a = "abc", b = "wxyz"
//输出：-1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= a.length <= 10⁴ 
// 1 <= b.length <= 10⁴ 
// a 和 b 由小写英文字母组成 
// 
// Related Topics 字符串 字符串匹配 👍 165 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 重复叠加字符串匹配
 */
public class P686_RepeatedStringMatch {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P686_RepeatedStringMatch().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了 96.14% 的用户
     * 内存消耗：37.2 MB, 在所有 Java 提交中击败了 75.90% 的用户
     */
    class Solution {
        public int repeatedStringMatch(String a, String b) {
            int[] aCount = new int[26];
            for (char ch : a.toCharArray()) {
                aCount[ch - 'a']++;
            }
            // 如果 a 不包含 b 中有的字符，则直接返回 -1
            for (char ch : b.toCharArray()) {
                if (aCount[ch - 'a'] < 1) {
                    return -1;
                }
            }
            if (a.length() >= b.length()) {
                // 此时，必须 a本身包含b 或者 a重叠之后包含b
                // 特殊的，当 a.length = b.length时，
                //  1. a本身包含b : a.equal(b)
                //  2. a重叠之后包含b: 可能存在 ab ba 或 aabb bbaa 这样的反序字符串，下式也成立
                return a.contains(b) ? 1 : ((a + a).contains(b) ? 2 : -1);
            } else {
                // 此时，a必须重叠，用 builder 存储每次重叠后的结果
                StringBuilder builder = new StringBuilder(a);
                // 重叠次数
                int times = 1;
                // 字符串 b 实际是，字符串 a重叠多次之后，去头去尾得到的，
                // 所以重叠之后的最大长度不能超过 b.length + 2 * a.length
                while (builder.length() < b.length() + 2 * a.length()) {
                    builder.append(a);
                    times++;
                    // 如果找到子串
                    if (builder.indexOf(b) != -1) {
                        return times;
                    }
                }
                return -1;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
