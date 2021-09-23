package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P70_ClimbingStairsTest {
    @Test
    public void climbStairs() {
        P70_ClimbingStairs.Solution solution = new P70_ClimbingStairs().new Solution();
        Assert.assertEquals(1, solution.climbStairs(1));
        Assert.assertEquals(2, solution.climbStairs(2));
        Assert.assertEquals(3, solution.climbStairs(3));
        Assert.assertEquals(5, solution.climbStairs(4));
        Assert.assertEquals(8, solution.climbStairs(5));
        Assert.assertEquals(13, solution.climbStairs(6));
        Assert.assertEquals(21, solution.climbStairs(7));
        Assert.assertEquals(34, solution.climbStairs(8));
        Assert.assertEquals(55, solution.climbStairs(9));
        Assert.assertEquals(89, solution.climbStairs(10));
        Assert.assertEquals(144, solution.climbStairs(11));
        Assert.assertEquals(1836311903, solution.climbStairs(45));
    }
}