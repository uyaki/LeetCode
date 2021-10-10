package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P441_ArrangingCoinsTest {
    @Test
    public void arrangeCoins() {
        P441_ArrangingCoins.Solution solution = new P441_ArrangingCoins().new Solution();
        Assert.assertEquals(65535, solution.arrangeCoins(2147483647));
    }
}