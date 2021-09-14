package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P225_ImplementStackUsingQueuesTest {
    @Test
    public void myStack() {
        P225_ImplementStackUsingQueues.MyStack stack = new P225_ImplementStackUsingQueues().new MyStack();
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(2, stack.top());
        Assert.assertEquals(2, stack.pop());
        Assert.assertFalse(stack.empty());
    }
}