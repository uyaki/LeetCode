package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P96_UniqueBinarySearchTreesTest {
    @Test
    public void numTrees() {
        P96_UniqueBinarySearchTrees.Solution solution = new P96_UniqueBinarySearchTrees().new Solution();
        Assert.assertEquals(5, solution.numTrees(3));
        Assert.assertEquals(1, solution.numTrees(1));
    }

}