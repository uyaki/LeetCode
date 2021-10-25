package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P240_SearchA2dMatrixIiTest {
    @Test
    public void search() {
        P240_SearchA2dMatrixIi.Solution solution = new P240_SearchA2dMatrixIi().new Solution();
        Assert.assertTrue(solution.searchMatrix(new int[][]{new int[]{1, 4, 7, 11, 15}, new int[]{2, 5, 8, 12, 19}, new int[]{3, 6, 9, 16, 22}, new int[]{10, 13, 14, 17, 24}, new int[]{18, 21, 23, 26, 30}}, 5));
        Assert.assertFalse(solution.searchMatrix(new int[][]{new int[]{1, 4, 7, 11, 15}, new int[]{2, 5, 8, 12, 19}, new int[]{3, 6, 9, 16, 22}, new int[]{10, 13, 14, 17, 24}, new int[]{18, 21, 23, 26, 30}}, 0));
        Assert.assertFalse(solution.searchMatrix(new int[][]{new int[]{1, 4, 7, 11, 15}, new int[]{2, 5, 8, 12, 19}, new int[]{3, 6, 9, 16, 22}, new int[]{10, 13, 14, 17, 24}, new int[]{18, 21, 23, 26, 30}}, 31));
        Assert.assertFalse(solution.searchMatrix(new int[][]{new int[]{1, 4, 7, 11, 15}, new int[]{2, 5, 8, 12, 19}, new int[]{3, 6, 9, 16, 22}, new int[]{10, 13, 14, 17, 24}, new int[]{18, 21, 23, 26, 30}}, 28));
        Assert.assertFalse(solution.searchMatrix(new int[][]{new int[]{1}}, 28));
        Assert.assertTrue(solution.searchMatrix(new int[][]{new int[]{1}}, 1));
        Assert.assertTrue(solution.searchMatrix(new int[][]{new int[]{-1, 3}}, 4));
        Assert.assertTrue(solution.searchMatrix(new int[][]{new int[]{-1, 3}}, -1));
        Assert.assertTrue(solution.searchMatrix(new int[][]{new int[]{-1, 3, 5}}, 5));
        Assert.assertTrue(solution.searchMatrix(new int[][]{new int[]{-1}, new int[]{3}}, 3));
        Assert.assertTrue(solution.searchMatrix(new int[][]{new int[]{-1}, new int[]{3}}, -1));
        Assert.assertFalse(solution.searchMatrix(new int[][]{new int[]{-1, 3}}, 1));
    }

}