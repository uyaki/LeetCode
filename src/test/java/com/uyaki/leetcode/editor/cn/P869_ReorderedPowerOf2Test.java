package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P869_ReorderedPowerOf2Test {
    @Test
    public void reorderedPowerOf2(){
        P869_ReorderedPowerOf2.Solution solution = new P869_ReorderedPowerOf2().new Solution();
        Assert.assertFalse(solution.reorderedPowerOf2(160));
        Assert.assertTrue(solution.reorderedPowerOf2(1));
        Assert.assertTrue(solution.reorderedPowerOf2(182));
        Assert.assertTrue(solution.reorderedPowerOf2(16));
        Assert.assertFalse(solution.reorderedPowerOf2(20));
        Assert.assertTrue(solution.reorderedPowerOf2(1240));
    }
}