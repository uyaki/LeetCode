package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;


public class P4_MedianOfTwoSortedArraysTest {
    @Test
    public void findMedianSortedArrays() {
        P4_MedianOfTwoSortedArrays.Solution solution = new P4_MedianOfTwoSortedArrays().new Solution();
        Assert.assertEquals(2.00000, solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 5);
    }
}