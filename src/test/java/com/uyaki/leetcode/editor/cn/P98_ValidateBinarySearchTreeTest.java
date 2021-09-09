package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class P98_ValidateBinarySearchTreeTest {
    @Test
    public void isValidBST() {
        P98_ValidateBinarySearchTree.Solution solution = new P98_ValidateBinarySearchTree().new Solution();
        assertTrue(solution.isValidBST(TreeNode.create(new Integer[]{2, 1, 3})));
        assertFalse(solution.isValidBST(TreeNode.create(new Integer[]{5, 1, 4, null, null, 3, 6})));
        assertFalse(solution.isValidBST(TreeNode.create(new Integer[]{5, 1, 6, null, null, 8, 1})));
    }

}