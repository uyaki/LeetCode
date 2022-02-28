package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P1601_MaximumNumberOfAchievableTransferRequestsTest {

    @Test
    public void t() {
        P1601_MaximumNumberOfAchievableTransferRequests.Solution solution = new P1601_MaximumNumberOfAchievableTransferRequests().new Solution();
        Assert.assertEquals(3, solution.maximumRequests(3, new int[][]{{0, 0}, {1, 2}, {2, 1}}));
        Assert.assertEquals(5, solution.maximumRequests(3, new int[][]{{0, 0}, {1,1},{0,0},{2,0},{2,2},{1,1},{2,1},{0,1},{0,1}}));
        Assert.assertEquals(5, solution.maximumRequests(5, new int[][]{{0, 1}, {1, 0}, {0, 1}, {1, 2}, {2, 0}, {3, 4}}));
        Assert.assertEquals(4, solution.maximumRequests(4, new int[][]{{0, 3}, {3, 1}, {1, 2}, {2, 0}}));
    }
}