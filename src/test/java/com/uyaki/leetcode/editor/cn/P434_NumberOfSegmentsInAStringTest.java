package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P434_NumberOfSegmentsInAStringTest {
    @Test
    public void countSegments() {
        P434_NumberOfSegmentsInAString.Solution solution = new P434_NumberOfSegmentsInAString().new Solution();
        Assert.assertEquals(0,solution.countSegments(""));
        Assert.assertEquals(0,solution.countSegments("   "));
        Assert.assertEquals(6,solution.countSegments(", , , ,        a, eaefa"));
    }

}