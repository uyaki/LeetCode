package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P35_SearchInsertPositionTest {
    @Test
    public void searchInsert(){
        P35_SearchInsertPosition.Solution solution = new P35_SearchInsertPosition().new Solution();
        Assert.assertEquals(2, solution.searchInsert(new int[]{1, 3, 5, 6}, 5));
        Assert.assertEquals(1, solution.searchInsert(new int[]{1, 3, 5, 6}, 2));
        Assert.assertEquals(4, solution.searchInsert(new int[]{1, 3, 5, 6}, 7));
        Assert.assertEquals(0, solution.searchInsert(new int[]{1, 3, 5, 6}, 0));
        Assert.assertEquals(0, solution.searchInsert(new int[]{1}, 0));
        Assert.assertEquals(0,solution.searchInsert(new int[]{1,3,5,6,7},0));
        Assert.assertEquals(2,solution.searchInsert(new int[]{1,3,5,6,7},4));
        Assert.assertEquals(2,solution.searchInsert(new int[]{1,3,5,6,7},5));
        Assert.assertEquals(5,solution.searchInsert(new int[]{1,3,5,6,7},8));
    }
}