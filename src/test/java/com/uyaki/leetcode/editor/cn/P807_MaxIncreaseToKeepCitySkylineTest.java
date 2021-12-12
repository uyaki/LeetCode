package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P807_MaxIncreaseToKeepCitySkylineTest {
    @Test
    public void maxIncreaseKeepingSkyline() {
        P807_MaxIncreaseToKeepCitySkyline.Solution solution = new P807_MaxIncreaseToKeepCitySkyline().new Solution();
        Assert.assertEquals(35, solution.maxIncreaseKeepingSkyline(new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}}));
    }
}