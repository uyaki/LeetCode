package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P53_MaximumSubarrayTest {
    @Test
    public void maxSum() {
        P53_MaximumSubarray.Solution solution = new P53_MaximumSubarray().new Solution();
        Assert.assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}