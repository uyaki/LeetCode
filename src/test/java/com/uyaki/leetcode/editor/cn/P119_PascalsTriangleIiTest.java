package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P119_PascalsTriangleIiTest {
    @Test
    public void getRow() {
        P119_PascalsTriangleIi.Solution solution = new P119_PascalsTriangleIi().new Solution();
        Assert.assertEquals(Arrays.asList(1, 3, 3, 1), solution.getRow(3));
    }
}