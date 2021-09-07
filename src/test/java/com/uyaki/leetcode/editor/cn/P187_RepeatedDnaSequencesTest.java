package com.uyaki.leetcode.editor.cn;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class P187_RepeatedDnaSequencesTest {

    @Test
    public void findRepeatedDnaSequences(){
        P187_RepeatedDnaSequences.Solution solution = new P187_RepeatedDnaSequences().new Solution();
        String[] s1 = {"AAAAACCCCC", "CCCCCAAAAA"};
        List<String> l1 = Arrays.asList(s1);
        assertEquals(l1,solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        String[] s2 = {"AAAAAAAAAA"};
        List<String> l2 = Arrays.asList(s2);
        assertEquals(l2,solution.findRepeatedDnaSequences("AAAAAAAAAAAAA"));
        String[] s3 = {"AAAAAAAAAA"};
        List<String> l3 = Arrays.asList(s3);
        assertEquals(l3,solution.findRepeatedDnaSequences("CCAAAAAAAAAAA"));
    }
}