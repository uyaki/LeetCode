package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P686_RepeatedStringMatchTest {
    @Test
    public void test() {
        P686_RepeatedStringMatch.Solution solution = new P686_RepeatedStringMatch().new Solution();
        Assert.assertEquals(5, solution.repeatedStringMatch("abcd", "cdabcdabcdabcdab"));
    }
}