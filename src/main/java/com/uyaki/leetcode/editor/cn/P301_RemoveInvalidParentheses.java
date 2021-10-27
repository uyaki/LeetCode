//给你一个由若干括号和字母组成的字符串 s ，删除最小数量的无效括号，使得输入的字符串有效。 
//
// 返回所有可能的结果。答案可以按 任意顺序 返回。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()())()"
//输出：["(())()","()()()"]
// 
//
// 示例 2： 
//
// 
//输入：s = "(a)())()"
//输出：["(a())()","(a)()()"]
// 
//
// 示例 3： 
//
// 
//输入：s = ")("
//输出：[""]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 25 
// s 由小写英文字母以及括号 '(' 和 ')' 组成 
// s 中至多含 20 个括号 
// 
// Related Topics 广度优先搜索 字符串 回溯 👍 590 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 删除无效的括号
 */
public class P301_RemoveInvalidParentheses {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P301_RemoveInvalidParentheses().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private List<String> ans = new ArrayList<>();

        public List<String> removeInvalidParentheses(String s) {
            int leftRemove = 0;
            int rightRemove = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    leftRemove++;
                } else if (s.charAt(i) == ')') {
                    if (leftRemove == 0) {
                        rightRemove++;
                    } else {
                        leftRemove--;
                    }
                }
            }
            helper(s, 0, 0, 0, leftRemove, rightRemove);

            return ans;
        }

        private void helper(String str, int start, int leftCount, int rightCount, int leftRemove, int rightRemove) {
            if (leftRemove == 0 && rightRemove == 0) {
                if (isValid(str)) {
                    ans.add(str);
                }
                return;
            }

            for (int i = start; i < str.length(); i++) {
                if (i != start && str.charAt(i) == str.charAt(i - 1)) {
                    continue;
                }
                // 如果剩余的字符无法满足去掉的数量要求，直接返回
                if (leftRemove + rightRemove > str.length() - i) {
                    return;
                }
                // 尝试去掉一个左括号
                if (leftRemove > 0 && str.charAt(i) == '(') {
                    helper(str.substring(0, i) + str.substring(i + 1), i, leftCount, rightCount, leftRemove - 1, rightRemove);
                }
                // 尝试去掉一个右括号
                if (rightRemove > 0 && str.charAt(i) == ')') {
                    helper(str.substring(0, i) + str.substring(i + 1), i, leftCount, rightCount, leftRemove, rightRemove - 1);
                }
                if (str.charAt(i) == ')') {
                    leftCount++;
                } else if (str.charAt(i) == ')') {
                    rightCount++;
                }
                // 当前右括号的数量大于左括号的数量则为非法,直接返回.
                if (rightCount > leftCount) {
                    break;
                }
            }
        }

        private boolean isValid(String str) {
            int cnt = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    cnt++;
                } else if (str.charAt(i) == ')') {
                    cnt--;
                    if (cnt < 0) {
                        return false;
                    }
                }
            }

            return cnt == 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
