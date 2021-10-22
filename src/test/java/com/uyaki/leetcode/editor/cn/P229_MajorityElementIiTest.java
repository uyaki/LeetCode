package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class P229_MajorityElementIiTest {
    @Test
    public void majorityElement() {
        P229_MajorityElementIi.Solution solution = new P229_MajorityElementIi().new Solution();
        Assert.assertEquals(Collections.singletonList(1), solution.majorityElement(new int[]{4, 2, 1, 1}));
    }
}