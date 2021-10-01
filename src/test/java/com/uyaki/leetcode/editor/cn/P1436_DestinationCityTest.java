package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P1436_DestinationCityTest {
    @Test
    public void destCity() {
        P1436_DestinationCity.Solution solution = new P1436_DestinationCity().new Solution();
        Assert.assertEquals("A", solution.destCity(Arrays.asList(Arrays.asList("B", "C"), Arrays.asList("D", "B"), Arrays.asList("C", "A"))));
    }

}