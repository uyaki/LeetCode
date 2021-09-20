package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class P21_MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        P21_MergeTwoSortedLists.Solution solution = new P21_MergeTwoSortedLists().new Solution();
        Assert.assertEquals(ListNode.create(new int[]{1, 1, 2, 3, 4, 4}), solution.mergeTwoLists(ListNode.create(new int[]{1, 2, 4}), ListNode.create(new int[]{1, 3, 4})));
        Assert.assertEquals(ListNode.create(new int[]{}), solution.mergeTwoLists(ListNode.create(new int[]{}), ListNode.create(new int[]{})));
        Assert.assertEquals(ListNode.create(new int[]{0}), solution.mergeTwoLists(ListNode.create(new int[]{}), ListNode.create(new int[]{0})));
    }
}