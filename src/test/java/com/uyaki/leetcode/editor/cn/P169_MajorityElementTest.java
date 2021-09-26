package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P169_MajorityElementTest {
    @Test
    public void majorityElement() {
        P169_MajorityElement.Solution solution = new P169_MajorityElement().new Solution();
        Assert.assertEquals(3, solution.majorityElement(new int[]{3, 2, 3}));
    }
}