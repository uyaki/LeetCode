package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PLCP_04_BrokenBoardDominoesTest {
    @Test
    public void broken() {
        PLCP_04_BrokenBoardDominoes.Solution solution = new PLCP_04_BrokenBoardDominoes().new Solution();
        Assert.assertEquals(3,solution.domino(3,3, new int[][]{{1,1},{1,2},{1,3},{2,1},{2,3},{3,1}}));
        Assert.assertEquals(4,solution.domino(4,4, new int[][]{{1,1},{1,3},{2,1},{3,1},{3,2},{4,3},{4,4}}));
        Assert.assertEquals(5,solution.domino(6,5, new int[][]{{1,1},{1,3},{2,1},{2,5},{3,1},{3,2},{4,2},{4,4},{4,5},{5,2},{5,3},{5,4},{5,5},{6,1},{6,4}}));
    }

}