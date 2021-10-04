//有一个密钥字符串 S ，只包含字母，数字以及 '-'（破折号）。其中， N 个 '-' 将字符串分成了 N+1 组。 
//
// 给你一个数字 K，请你重新格式化字符串，使每个分组恰好包含 K 个字符。特别地，第一个分组包含的字符个数必须小于等于 K，但至少要包含 1 个字符。两个分
//组之间需要用 '-'（破折号）隔开，并且将所有的小写字母转换为大写字母。 
//
// 给定非空字符串 S 和数字 K，按照上面描述的规则进行格式化。 
//
// 
//
// 示例 1： 
//
// 输入：S = "5F3Z-2e-9-w", K = 4
//输出："5F3Z-2E9W"
//解释：字符串 S 被分成了两个部分，每部分 4 个字符；
//     注意，两个额外的破折号需要删掉。
// 
//
// 示例 2： 
//
// 输入：S = "2-5g-3-J", K = 2
//输出："2-5G-3J"
//解释：字符串 S 被分成了 3 个部分，按照前面的规则描述，第一部分的字符可以少于给定的数量，其余部分皆为 2 个字符。
// 
//
// 
//
// 提示: 
//
// 
// S 的长度可能很长，请按需分配大小。K 为正整数。 
// S 只包含字母数字（a-z，A-Z，0-9）以及破折号'-' 
// S 非空 
// 
//
// 
// Related Topics 字符串 👍 109 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 密钥格式化
 */
public class P482_LicenseKeyFormatting {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P482_LicenseKeyFormatting().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String licenseKeyFormatting(String s, int k) {
            s = s.replace("-", "");
            if (s.length() == 0) {
                return "";
            }
            s = s.toUpperCase();
            int first = s.length() % k;
            StringBuilder stringBuilder = new StringBuilder();
            if (first != 0) {
                stringBuilder.append(s, 0, first).append("-");
            }
            for (int i = first; i < s.length(); i = i + k) {
                stringBuilder.append(s, i, i + k).append("-");
            }
            return stringBuilder.substring(0, stringBuilder.length() - 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
