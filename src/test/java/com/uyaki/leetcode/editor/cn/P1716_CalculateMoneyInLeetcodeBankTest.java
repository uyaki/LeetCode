package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P1716_CalculateMoneyInLeetcodeBankTest {
    @Test
    public void test() {
        P1716_CalculateMoneyInLeetcodeBank.Solution solution = new P1716_CalculateMoneyInLeetcodeBank().new Solution();
        Assert.assertEquals(10,solution.totalMoney(4));
        Assert.assertEquals(37,solution.totalMoney(10));
        Assert.assertEquals(96,solution.totalMoney(20));
    }
}