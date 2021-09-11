package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P5_LongestPalindromicSubstringTest {
    @Test
    public void longestPalindrome() {
        P5_LongestPalindromicSubstring.Solution solution = new P5_LongestPalindromicSubstring().new Solution();
        Assert.assertEquals("bab", solution.longestPalindrome("babad"));
    }
}