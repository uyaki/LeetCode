package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P121_BestTimeToBuyAndSellStockTest {
    @Test
    public void maxProfit() {
        P121_BestTimeToBuyAndSellStock.Solution solution = new P121_BestTimeToBuyAndSellStock().new Solution();
        Assert.assertEquals(5, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(0, solution.maxProfit(new int[]{7, 6, 5, 4, 3, 2, 1}));
    }
}