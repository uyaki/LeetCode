package com.uyaki.leetcode.editor.cn;

import org.junit.Test;

public class P1995_CountSpecialQuadrupletsTest {
    @Test
    public void test() {
        P1995_CountSpecialQuadruplets.Solution solution = new P1995_CountSpecialQuadruplets().new Solution();
        int ans = solution.countQuadruplets(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(ans);
    }
}