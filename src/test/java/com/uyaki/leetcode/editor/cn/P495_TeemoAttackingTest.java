package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P495_TeemoAttackingTest {
    @Test
    public void findPoisonedDuration() {
        P495_TeemoAttacking.Solution solution = new P495_TeemoAttacking().new Solution();
        Assert.assertEquals(4, solution.findPoisonedDuration(new int[]{1, 4}, 2));
        Assert.assertEquals(10, solution.findPoisonedDuration(new int[]{1, 3, 5, 7, 9}, 2));
        Assert.assertEquals(9, solution.findPoisonedDuration(new int[]{1, 3, 5, 6, 10}, 2));
    }
}