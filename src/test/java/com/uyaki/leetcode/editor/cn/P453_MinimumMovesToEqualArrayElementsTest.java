package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P453_MinimumMovesToEqualArrayElementsTest {
    @Test
    public void minMoves() {
        P453_MinimumMovesToEqualArrayElements.Solution solution = new P453_MinimumMovesToEqualArrayElements().new Solution();
        Assert.assertEquals(3, solution.minMoves(new int[]{1, 2, 3}));
    }
}