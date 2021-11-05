package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P1218_LongestArithmeticSubsequenceOfGivenDifferenceTest {
    @Test
    public void longestSubsequence() {
        P1218_LongestArithmeticSubsequenceOfGivenDifference.Solution solution = new P1218_LongestArithmeticSubsequenceOfGivenDifference().new Solution();
        Assert.assertEquals(4, solution.longestSubsequence(new int[]{1, 5, 7, 8, 5, 3, 4, 2, 1}, -2));
        Assert.assertEquals(1, solution.longestSubsequence(new int[]{1, 3, 5, 7}, 1));
        Assert.assertEquals(4, solution.longestSubsequence(new int[]{1, 2, 3, 4}, 1));
    }
}