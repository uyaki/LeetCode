package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P318_MaximumProductOfWordLengthsTest {
    @Test
    public void maxProduct() {
        P318_MaximumProductOfWordLengths.Solution solution = new P318_MaximumProductOfWordLengths().new Solution();
        Assert.assertEquals(16, solution.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
        Assert.assertEquals(4, solution.maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"}));
        Assert.assertEquals(0, solution.maxProduct(new String[]{"a", "aa", "aaa", "aaaa"}));
    }
}