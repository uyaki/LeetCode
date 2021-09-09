package com.uyaki.leetcode.editor.cn;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class P1_TwoSumTest {

    @Test
    public void twoSum() {
        //测试代码
        P1_TwoSum.Solution solution = new P1_TwoSum().new Solution();
        assertArrayEquals(solution.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        assertArrayEquals(solution.twoSum(new int[]{3, 2, 4}, 6), new int[]{1, 2});
        assertArrayEquals(solution.twoSum(new int[]{3, 3}, 6), new int[]{0, 1});

    }
}