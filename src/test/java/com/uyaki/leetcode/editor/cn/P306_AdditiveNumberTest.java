package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;


public class P306_AdditiveNumberTest {
    @Test
    public void test() {
        P306_AdditiveNumber.Solution solution = new P306_AdditiveNumber().new Solution();
        Assert.assertTrue(solution.isAdditiveNumber("123"));
        Assert.assertTrue(solution.isAdditiveNumber("112358"));
        Assert.assertTrue(solution.isAdditiveNumber("199100199"));
        Assert.assertTrue(solution.isAdditiveNumber("19999999999991000000000000"));
    }
}