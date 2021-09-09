package com.uyaki.leetcode.editor.cn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P3_LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void lengthOfLongestSubstring() {
        P3_LongestSubstringWithoutRepeatingCharacters.Solution solution = new P3_LongestSubstringWithoutRepeatingCharacters().new Solution();
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }
}