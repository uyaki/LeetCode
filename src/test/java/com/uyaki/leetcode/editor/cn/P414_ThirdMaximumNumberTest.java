package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P414_ThirdMaximumNumberTest {
    @Test
    public void thirdMax() {
        P414_ThirdMaximumNumber.Solution solution = new P414_ThirdMaximumNumber().new Solution();
        Assert.assertEquals(1, solution.thirdMax(new int[]{3, 2, 1}));
        Assert.assertEquals(2, solution.thirdMax(new int[]{1, 2}));
        Assert.assertEquals(2, solution.thirdMax(new int[]{1, 2, 2}));
        Assert.assertEquals(1, solution.thirdMax(new int[]{1, 2, 2, 3}));
        Assert.assertEquals(2, solution.thirdMax(new int[]{1, 2, 2, 5, 3, 5}));
    }
}