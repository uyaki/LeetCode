package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class P234_PalindromeLinkedListTest {
    @Test
    public void isPalindrome() {
        P234_PalindromeLinkedList.Solution solution = new P234_PalindromeLinkedList().new Solution();
        Assert.assertTrue(solution.isPalindrome(ListNode.create(new int[]{1, 2, 2, 1})));
        Assert.assertTrue(solution.isPalindrome(ListNode.create(new int[]{1, 2, 3, 2, 1})));
        Assert.assertFalse(solution.isPalindrome(ListNode.create(new int[]{1, 2, 3, 4, 2, 1})));
    }
}