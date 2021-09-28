package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P1514_PathWithMaximumProbabilityTest {
    @Test
    public void maxProbability() {
        P1514_PathWithMaximumProbability.Solution solution = new P1514_PathWithMaximumProbability().new Solution();
        //输入：n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.2], start = 0, end = 2 输出：0.25000
        Assert.assertEquals(0.25000d, solution.maxProbability(3, new int[][]{{1, 2}, {1, 2}, {2, 0}}, new double[]{0.5, 0.5, 0.2}, 0, 2), 5);
    }
}