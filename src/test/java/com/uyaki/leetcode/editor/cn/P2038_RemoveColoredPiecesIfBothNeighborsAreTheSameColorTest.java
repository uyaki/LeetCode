package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P2038_RemoveColoredPiecesIfBothNeighborsAreTheSameColorTest {
    @Test
    public void test() {
        P2038_RemoveColoredPiecesIfBothNeighborsAreTheSameColor.Solution solution = new P2038_RemoveColoredPiecesIfBothNeighborsAreTheSameColor().new Solution();

        Assert.assertTrue(solution.winnerOfGame("AAABABB"));
        Assert.assertFalse(solution.winnerOfGame("AA"));
        Assert.assertFalse(solution.winnerOfGame("ABBBBBBBAAA"));
    }
}