package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P10_RegularExpressionMatchingTest {
    @Test
    public void isMatch() {
        P10_RegularExpressionMatching.Solution solution = new P10_RegularExpressionMatching().new Solution();
        Assert.assertTrue(solution.isMatch("aaa", "ab*ac*a"));
        Assert.assertTrue(solution.isMatch("aa", "a*"));
        Assert.assertTrue(solution.isMatch("ab", ".*"));
        Assert.assertTrue(solution.isMatch("aab", "c*a*b"));
        Assert.assertFalse(solution.isMatch("mississippi", "mis*is*p*."));
    }
}