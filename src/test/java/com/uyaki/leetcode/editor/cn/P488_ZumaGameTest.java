package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P488_ZumaGameTest {
    @Test
    public void findMinStep() {
        P488_ZumaGame.Solution solution = new P488_ZumaGame().new Solution();
        Assert.assertEquals(2, solution.findMinStep("WWRRBBWW", "WRBRW"));
    }
}