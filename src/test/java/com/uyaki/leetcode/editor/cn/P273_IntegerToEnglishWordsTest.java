package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P273_IntegerToEnglishWordsTest {
    @Test
    public void numberToWords() {
        P273_IntegerToEnglishWords.Solution solution = new P273_IntegerToEnglishWords().new Solution();
        Assert.assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One",solution.numberToWords(1234567891));
        Assert.assertEquals("Zero",solution.numberToWords(0));
        Assert.assertEquals("One Hundred Twenty Three",solution.numberToWords(123));
        Assert.assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",solution.numberToWords(1234567));
        Assert.assertEquals("Twelve Thousand Three Hundred Forty Five",solution.numberToWords(12345));
        Assert.assertEquals("One Thousand",solution.numberToWords(1000));
        Assert.assertEquals("One Million",solution.numberToWords(1000000));
    }
}