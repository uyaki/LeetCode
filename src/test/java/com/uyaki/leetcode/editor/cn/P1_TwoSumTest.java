package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P1_TwoSumTest {

    @Test
    public void twoSum() {
        //测试代码
        P1_TwoSum.Solution solution = new P1_TwoSum().new Solution();
        Assert.assertArrayEquals(solution.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        Assert.assertArrayEquals(solution.twoSum(new int[]{3, 2, 4}, 6), new int[]{1, 2});
        Assert.assertArrayEquals(solution.twoSum(new int[]{3, 3}, 6), new int[]{0, 1});

    }

    public static ThreadLocal<String> tl = new ThreadLocal<>();

    public static void main(String[] args) {
        tl.set("hello");
        Thread subThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("子线程tl：" + tl.get());
            }
        });
        subThread.start();
        System.out.println("main中的tl：" + tl.get());
    }
}