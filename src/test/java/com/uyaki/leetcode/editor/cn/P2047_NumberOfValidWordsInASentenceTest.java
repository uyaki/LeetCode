package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P2047_NumberOfValidWordsInASentenceTest {
    @Test
    public void test() {
        P2047_NumberOfValidWordsInASentence.Solution solution = new P2047_NumberOfValidWordsInASentence().new Solution();
        Assert.assertEquals(3, solution.countValidWords("cat and dog"));
        Assert.assertEquals(1, solution.countValidWords(" o6 t"));
        Assert.assertEquals(0, solution.countValidWords("!this 1-s b8d!"));
    }
}