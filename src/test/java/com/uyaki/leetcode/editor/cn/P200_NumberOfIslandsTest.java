package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P200_NumberOfIslandsTest {
    @Test
    public void lands() {
        P200_NumberOfIslands.Solution solution = new P200_NumberOfIslands().new Solution();
        Assert.assertEquals(3, solution.numIslands(new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}}));
    }
}