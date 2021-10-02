package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P405_ConvertANumberToHexadecimalTest {
    @Test
    public void toHex() {
        P405_ConvertANumberToHexadecimal.Solution solution = new P405_ConvertANumberToHexadecimal().new Solution();
        Assert.assertEquals("1a", solution.toHex(26));
    }
}