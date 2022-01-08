package com.uyaki.leetcode.editor.cn;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P89_GrayCodeTest {
    @Test
    public void test() {
        P89_GrayCode.Solution solution = new P89_GrayCode().new Solution();
        int n = 3;
        List<Integer> ans = solution.grayCode(n);
        ans.forEach(it -> {
            System.out.println(it + "\t" + fill(Integer.toBinaryString(it), 2 << (n - 2)));
        });
    }

    private String fill(String s, int length) {
        StringBuilder sb = new StringBuilder();
        char[] chars = new char[length - s.length()];
        Arrays.fill(chars, '0');
        String s2 = new String(chars);
        sb.append(s2).append(s);
        return sb.toString();
    }
}