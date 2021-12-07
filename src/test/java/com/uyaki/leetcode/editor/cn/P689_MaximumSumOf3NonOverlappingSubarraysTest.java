package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P689_MaximumSumOf3NonOverlappingSubarraysTest {
    @Test
    public void maxSumOfThreeSubarrays() {
        P689_MaximumSumOf3NonOverlappingSubarrays.Solution solution = new P689_MaximumSumOf3NonOverlappingSubarrays().new Solution();
        Assert.assertArrayEquals(new int[]{0, 3, 5}, solution.maxSumOfThreeSubarrays(new int[]{1, 2, 1, 2, 6, 7, 5, 1}, 2));
    }
}