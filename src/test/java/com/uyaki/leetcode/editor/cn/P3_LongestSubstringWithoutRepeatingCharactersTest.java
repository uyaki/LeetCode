package com.uyaki.leetcode.editor.cn;

import org.junit.Test;

import static org.junit.Assert.*;

public class P3_LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void main() {
        P3_LongestSubstringWithoutRepeatingCharacters.Solution solution = new P3_LongestSubstringWithoutRepeatingCharacters().new Solution();
        assertEquals(solution.lengthOfLongestSubstring("abcabcbb"),3);
        assertEquals(solution.lengthOfLongestSubstring("bbbbb"),1);
        assertEquals(solution.lengthOfLongestSubstring("pwwkew"),3);
        assertEquals(solution.lengthOfLongestSubstring(""),0);
    }
}