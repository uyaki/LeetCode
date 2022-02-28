package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P6_ZigzagConversionTest {
    @Test
    public void t() {
        P6_ZigzagConversion.Solution solution = new P6_ZigzagConversion().new Solution();
        Assert.assertEquals("17326824359140",solution.convert("12345678901234", 4));
    }
}