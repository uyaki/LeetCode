package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P575_DistributeCandiesTest {
    @Test
    public void candy() {

        P575_DistributeCandies.Solution solution = new P575_DistributeCandies().new Solution();
        Assert.assertEquals(2, solution.distributeCandies(new int[]{1, 1, 2, 3}));
        Assert.assertEquals(0, solution.distributeCandies(new int[]{}));

    }
}