package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P682_BaseballGameTest {
    @Test
    public void calPoints() {
        P682_BaseballGame.Solution solution = new P682_BaseballGame().new Solution();
        Assert.assertEquals(30, solution.calPoints(new String[]{"5", "2", "C", "D", "+"}));
        Assert.assertEquals(27, solution.calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
        Assert.assertEquals(1, solution.calPoints(new String[]{"1"}));
    }
}