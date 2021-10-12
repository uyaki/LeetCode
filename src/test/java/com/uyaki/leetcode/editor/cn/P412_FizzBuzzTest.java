package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P412_FizzBuzzTest {
    @Test
    public void fizzBuzz() {
        P412_FizzBuzz.Solution solution = new P412_FizzBuzz().new Solution();
        Assert.assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"), solution.fizzBuzz(15));
    }

}