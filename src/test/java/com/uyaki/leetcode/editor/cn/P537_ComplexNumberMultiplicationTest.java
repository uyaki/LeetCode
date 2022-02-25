package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P537_ComplexNumberMultiplicationTest {
    @Test
    public void t() {
        P537_ComplexNumberMultiplication.Solution solution = new P537_ComplexNumberMultiplication().new Solution();
        Assert.assertEquals("0+2i", solution.complexNumberMultiply("1+1i", "1+1i"));
        Assert.assertEquals("0+-2i", solution.complexNumberMultiply("1+-1i", "1+-1i"));
    }
}