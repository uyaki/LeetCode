package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P299_BullsAndCowsTest {
    @Test
    public void getHint() {
        P299_BullsAndCows.Solution solution = new P299_BullsAndCows().new Solution();
        Assert.assertEquals("1A1B", solution.getHint("1123", "0111"));
    }
}