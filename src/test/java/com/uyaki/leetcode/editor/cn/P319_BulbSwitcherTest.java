package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P319_BulbSwitcherTest {
    @Test
    public void bulbSwitch() {
        P319_BulbSwitcher.Solution solution = new P319_BulbSwitcher().new Solution();
        Assert.assertEquals(1, solution.bulbSwitch(1));
        Assert.assertEquals(1, solution.bulbSwitch(2));
        Assert.assertEquals(1, solution.bulbSwitch(3));
        Assert.assertEquals(2, solution.bulbSwitch(4));
        Assert.assertEquals(2, solution.bulbSwitch(5));
        Assert.assertEquals(2, solution.bulbSwitch(6));
        Assert.assertEquals(2, solution.bulbSwitch(7));
        Assert.assertEquals(2, solution.bulbSwitch(8));
        Assert.assertEquals(3, solution.bulbSwitch(9));
        Assert.assertEquals(3, solution.bulbSwitch(10));
//        Assert.assertEquals(3, solution.bulbSwitch(1000000000));
        System.out.println(Double.valueOf(Math.floor(Math.sqrt(0))).intValue());
        System.out.println(Math.floor(Math.sqrt(2)));
        System.out.println(Math.floor(Math.sqrt(3)));
        System.out.println(Math.floor(Math.sqrt(4)));
        System.out.println(Math.floor(Math.sqrt(10)));
    }
}