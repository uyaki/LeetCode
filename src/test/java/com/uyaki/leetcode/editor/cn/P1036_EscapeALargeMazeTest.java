package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P1036_EscapeALargeMazeTest {
    @Test
    public void test() {
        P1036_EscapeALargeMaze.Solution solution = new P1036_EscapeALargeMaze().new Solution();
        Assert.assertFalse(solution.isEscapePossible(new int[][]{{0, 1}, {1, 0}}, new int[]{0, 0}, new int[]{0, 2}));
    }
}