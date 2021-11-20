package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P594_LongestHarmoniousSubsequenceTest {
    @Test
    public void findLHS() {
        P594_LongestHarmoniousSubsequence.Solution solution = new P594_LongestHarmoniousSubsequence().new Solution();
        Assert.assertEquals(5, solution.findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
        Assert.assertEquals(6, solution.findLHS(new int[]{1, 2, 2, 2, 2, 3, 3}));
        Assert.assertEquals(2, solution.findLHS(new int[]{1, 2, 3, 4}));
        Assert.assertEquals(0, solution.findLHS(new int[]{1}));
        Assert.assertEquals(0, solution.findLHS(new int[]{1, 1, 1, 1}));
    }
}