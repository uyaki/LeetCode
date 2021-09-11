package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class P2_AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
        P2_AddTwoNumbers.Solution solution = new P2_AddTwoNumbers().new Solution();
        Assert.assertEquals(ListNode.create(new int[]{7, 0, 8}), solution.addTwoNumbers(ListNode.create(new int[]{2, 4, 3}), ListNode.create(new int[]{5, 6, 4})));
        Assert.assertEquals(ListNode.create(new int[]{8, 9, 9, 9, 0, 0, 0, 1}), solution.addTwoNumbers(ListNode.create(new int[]{9, 9, 9, 9, 9, 9, 9}), ListNode.create(new int[]{9, 9, 9, 9})));
        Assert.assertEquals(ListNode.create(new int[]{0}), solution.addTwoNumbers(ListNode.create(new int[]{0}), ListNode.create(new int[]{0})));
    }
}