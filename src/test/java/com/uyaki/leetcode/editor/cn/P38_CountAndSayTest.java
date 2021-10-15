package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P38_CountAndSayTest {
    @Test
    public void countAndSay() {
        P38_CountAndSay.Solution solution = new P38_CountAndSay().new Solution();
        Assert.assertEquals("1", solution.countAndSay(1));
        Assert.assertEquals("11", solution.countAndSay(2));
        Assert.assertEquals("21", solution.countAndSay(3));
        Assert.assertEquals("1211", solution.countAndSay(4));
        Assert.assertEquals("111221", solution.countAndSay(5));
        Assert.assertEquals("312211", solution.countAndSay(6));
        Assert.assertEquals("13112221", solution.countAndSay(7));
        Assert.assertEquals("1113213211", solution.countAndSay(8));
        Assert.assertEquals("31131211131221", solution.countAndSay(9));
        Assert.assertEquals("13211311123113112211", solution.countAndSay(10));
        Assert.assertEquals("11131221133112132113212221", solution.countAndSay(11));
        Assert.assertEquals("3113112221232112111312211312113211", solution.countAndSay(12));
    }
}