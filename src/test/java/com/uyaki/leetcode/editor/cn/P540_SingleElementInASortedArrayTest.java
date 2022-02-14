package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P540_SingleElementInASortedArrayTest {
    @Test
    public void test() {
        P540_SingleElementInASortedArray.Solution solution = new P540_SingleElementInASortedArray().new Solution();
        Assert.assertEquals(2, solution.singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
        Assert.assertEquals(10, solution.singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
    }
}