package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P423_ReconstructOriginalDigitsFromEnglishTest {
    @Test
    public void test() {
        P423_ReconstructOriginalDigitsFromEnglish.Solution solution = new P423_ReconstructOriginalDigitsFromEnglish().new Solution();
        Assert.assertEquals("9", solution.originalDigits("nnei"));
    }
}