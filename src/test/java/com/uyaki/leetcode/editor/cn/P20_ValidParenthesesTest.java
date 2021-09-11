package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P20_ValidParenthesesTest {
    @Test
    public void isValid() {
        P20_ValidParentheses.Solution solution = new P20_ValidParentheses().new Solution();
        Assert.assertTrue(solution.isValid("()"));
        Assert.assertTrue(solution.isValid("()[]{}"));
        Assert.assertFalse(solution.isValid("(]"));
        Assert.assertFalse(solution.isValid("([)]"));
        Assert.assertFalse(solution.isValid("("));
        Assert.assertFalse(solution.isValid("(("));
        Assert.assertFalse(solution.isValid("}{"));
        Assert.assertTrue(solution.isValid("{[]}"));
    }
}