package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P367_ValidPerfectSquareTest {
    @Test
    public void isPerfectSquare(){
        P367_ValidPerfectSquare.Solution solution = new P367_ValidPerfectSquare().new Solution();
        Assert.assertTrue(solution.isPerfectSquare(1));
        Assert.assertFalse(solution.isPerfectSquare(3));
        Assert.assertFalse(solution.isPerfectSquare(5));
        Assert.assertTrue(solution.isPerfectSquare(9));
        Assert.assertFalse(solution.isPerfectSquare(11));
        Assert.assertFalse(solution.isPerfectSquare(12));
        Assert.assertFalse(solution.isPerfectSquare(13));
        Assert.assertTrue(solution.isPerfectSquare(16));
        Assert.assertFalse(solution.isPerfectSquare(2147483647));
    }
}