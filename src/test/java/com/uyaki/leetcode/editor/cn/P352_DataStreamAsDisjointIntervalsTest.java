package com.uyaki.leetcode.editor.cn;

import org.junit.Test;

import java.util.Arrays;

public class P352_DataStreamAsDisjointIntervalsTest {
    @Test
    public void summaryRanges() {
        P352_DataStreamAsDisjointIntervals.SummaryRanges summaryRanges = new P352_DataStreamAsDisjointIntervals().new SummaryRanges();
        int[][] intervals = summaryRanges.getIntervals();
        Arrays.stream(intervals).forEach(s -> Arrays.stream(s).forEach(System.out::println));
    }

}