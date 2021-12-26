package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P1078_OccurrencesAfterBigramTest {
    @Test
    public void test() {
        P1078_OccurrencesAfterBigram.Solution solution = new P1078_OccurrencesAfterBigram().new Solution();
        Assert.assertArrayEquals(new String[]{"girl", "student"}, solution.findOcurrences("alice is a good girl she is a good student", "a", "good"));
    }
}