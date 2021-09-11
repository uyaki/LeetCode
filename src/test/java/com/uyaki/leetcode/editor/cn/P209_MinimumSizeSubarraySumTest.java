package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P209_MinimumSizeSubarraySumTest {

    @Test
    public void minSubArrayLen() {
        P209_MinimumSizeSubarraySum.Solution solution = new P209_MinimumSizeSubarraySum().new Solution();
        Assert.assertEquals(2, solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        Assert.assertEquals(3, solution.minSubArrayLen(7, new int[]{5, 3, 1, 2, 4, 4}));
        Assert.assertEquals(1, solution.minSubArrayLen(4, new int[]{1, 4, 4}));
        Assert.assertEquals(0, solution.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
        Assert.assertEquals(3, solution.minSubArrayLen(11, new int[]{1, 2, 3, 4, 5}));
    }
}