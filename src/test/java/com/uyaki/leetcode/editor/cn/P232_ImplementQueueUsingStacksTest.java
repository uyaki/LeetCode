package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P232_ImplementQueueUsingStacksTest {

    @Test
    public void myQueue() {
        P232_ImplementQueueUsingStacks.MyQueue myQueue = new P232_ImplementQueueUsingStacks().new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        Assert.assertEquals(1, myQueue.peek());
        Assert.assertEquals(1, myQueue.pop());
    }
}