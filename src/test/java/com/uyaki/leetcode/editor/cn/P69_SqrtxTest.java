package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P69_SqrtxTest {
    @Test
    public void mySqrt() {
        P69_Sqrtx.Solution solution = new P69_Sqrtx().new Solution();
        Assert.assertEquals(2, solution.mySqrt(8));
        Assert.assertEquals(2, solution.mySqrt(4));
        Assert.assertEquals(3, solution.mySqrt(15));
        Assert.assertEquals(4, solution.mySqrt(17));
        Assert.assertEquals(0, solution.mySqrt(0));
        Assert.assertEquals(1, solution.mySqrt(1));
        Assert.assertEquals(46339, solution.mySqrt(2147395599));
    }
}