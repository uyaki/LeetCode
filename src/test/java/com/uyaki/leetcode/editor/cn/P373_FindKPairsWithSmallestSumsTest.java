package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P373_FindKPairsWithSmallestSumsTest {
    @Test
    public void test() {
        P373_FindKPairsWithSmallestSums.Solution solution = new P373_FindKPairsWithSmallestSums().new Solution();
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.stream(new int[]{1, 1}).boxed().collect(Collectors.toList()));
        lists.add(Arrays.stream(new int[]{1, 1}).boxed().collect(Collectors.toList()));
        Assert.assertEquals(lists, solution.kSmallestPairs(new int[]{1, 1, 2}, new int[]{1, 2, 3}, 2));
    }
}