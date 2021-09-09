package com.uyaki.leetcode.editor.cn;

import org.junit.Test;

import static org.junit.Assert.*;

public class P96_UniqueBinarySearchTreesTest {
    @Test
    public void numTrees(){
        P96_UniqueBinarySearchTrees.Solution solution = new P96_UniqueBinarySearchTrees().new Solution();
        assertEquals(5,solution.numTrees(3));
        assertEquals(1,solution.numTrees(1));
    }

}