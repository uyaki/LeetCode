package com.uyaki.leetcode.editor.cn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P5_LongestPalindromicSubstringTest {
    @Test
    public void longestPalindrome() {
        P5_LongestPalindromicSubstring.Solution solution = new P5_LongestPalindromicSubstring().new Solution();
        assertEquals("bab", solution.longestPalindrome("babad"));
    }
}