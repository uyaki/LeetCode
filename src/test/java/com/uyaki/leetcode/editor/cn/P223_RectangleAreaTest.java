package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P223_RectangleAreaTest {
    @Test
    public void computeArea() {
        P223_RectangleArea.Solution solution = new P223_RectangleArea().new Solution();
        Assert.assertEquals(58, solution.computeArea(-5,-5,0,3,-3,-3,3,3));
        Assert.assertEquals(24, solution.computeArea(-3 ,1 ,3 ,3 ,-2 ,-2 ,2 ,2));
        Assert.assertEquals(24, solution.computeArea(-2, -2, 2, 2, -3, -3, 3, -1));
        Assert.assertEquals(45, solution.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
        Assert.assertEquals(16, solution.computeArea(-2, -2, 2, 2, -2, -2, 2, 2));
        Assert.assertEquals(4, solution.computeArea(0, 0, 0, 0, -1, -1, 1, 1));
    }
}