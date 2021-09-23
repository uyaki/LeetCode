package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P118_PascalsTriangleTest {
    @Test
    public void generate() {
        P118_PascalsTriangle.Solution solution = new P118_PascalsTriangle().new Solution();
        List<List<Integer>> ans = Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1), Arrays.asList(1, 3, 3, 1), Arrays.asList(1, 4, 6, 4, 1));
        Assert.assertEquals(ans, solution.generate(5));
    }

}