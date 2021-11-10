package com.uyaki.leetcode.editor.cn;

import org.junit.Test;

public class P629_KInversePairsArrayTest {
    @Test
    public void kInversePairs() {

        System.out.println("n\t&\ti%2\t^" );
        for (int i = 0; i < 12; i++) {
            System.out.println( i +"\t"+ (i&1)+"\t"+(i%2)+"\t"+(i^1));
        }
    }
}