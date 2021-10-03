package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;


public class P166_FractionToRecurringDecimalTest {
    @Test
    public void fractionToDecimal() {
        P166_FractionToRecurringDecimal.Solution solution = new P166_FractionToRecurringDecimal().new Solution();
        Assert.assertEquals("0.5", solution.fractionToDecimal(1, 2));
    }
}