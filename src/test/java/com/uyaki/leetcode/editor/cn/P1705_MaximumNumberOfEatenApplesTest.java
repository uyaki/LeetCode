package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P1705_MaximumNumberOfEatenApplesTest {
    @Test
    public void test() {
        P1705_MaximumNumberOfEatenApples.Solution solution = new P1705_MaximumNumberOfEatenApples().new Solution();
        Assert.assertEquals(5, solution.eatenApples(new int[]{3, 0, 0, 0, 0, 2}, new int[]{3, 0, 0, 0, 0, 2}));
        Assert.assertEquals(7, solution.eatenApples(new int[]{1, 2, 3, 5, 2}, new int[]{3, 2, 1, 4, 2}));
        Assert.assertEquals(8, solution.eatenApples(new int[]{1, 2, 1, 2, 2}, new int[]{3, 3, 1, 5, 2}));
        Assert.assertEquals(1, solution.eatenApples(new int[]{1}, new int[]{2}));
        Assert.assertEquals(8, solution.eatenApples(new int[]{2, 1, 1, 4, 5}, new int[]{10, 10, 6, 4, 2}));
    }
}