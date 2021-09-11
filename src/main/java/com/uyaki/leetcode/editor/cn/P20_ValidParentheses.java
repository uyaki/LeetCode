//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics 栈 字符串 👍 2630 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Stack;

/**
 * 有效的括号
 */
public class P20_ValidParentheses {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            // 如果s不是偶数字符，直接返回false
            if (s.length() % 2 != 0) {
                return false;
            }
            Stack<Character> stack = new Stack<>();
            HashMap<Character, Character> map = new HashMap<>();
            map.put('{', '}');
            map.put('[', ']');
            map.put('(', ')');
            for (int i = 0; i < s.length(); i++) {
                Character character = s.charAt(i);
                if (map.containsKey(character)) {
                    stack.push(character);
                } else {
                    if (!stack.isEmpty()) {
                        Character last = stack.pop();
                        if (map.get(last) != character) {
                            return false;
                        }
                    } else {
                        // 堆内没有能与当前字符匹配的字符，直接返回false
                        return false;
                    }
                }
            }
            // 堆必须用完
            return stack.isEmpty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
