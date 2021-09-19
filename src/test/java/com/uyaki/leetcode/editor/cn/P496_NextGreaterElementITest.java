package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P496_NextGreaterElementITest {
    @Test
    public void nextGreaterElement() {
        P496_NextGreaterElementI.Solution solution = new P496_NextGreaterElementI().new Solution();
        Assert.assertArrayEquals(new int[]{-1, 3, -1}, solution.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
        Assert.assertArrayEquals(new int[]{3, -1}, solution.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4}));
    }
}