package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P704_BinarySearchTest {
    @Test
    public void search() {
        P704_BinarySearch.Solution solution = new P704_BinarySearch().new Solution();
        Assert.assertEquals(4, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        Assert.assertEquals(-1, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}