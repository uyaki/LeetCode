package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P438_FindAllAnagramsInAStringTest {
    @Test
    public void test() {
        P438_FindAllAnagramsInAString.Solution solution = new P438_FindAllAnagramsInAString().new Solution();
        Assert.assertEquals(Arrays.asList(0, 6), solution.findAnagrams("cbaebabacd", "abc"));
    }
}