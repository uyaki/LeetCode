package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P98_ValidateBinarySearchTreeTest {
    @Test
    public void isValidBST() {
        P98_ValidateBinarySearchTree.Solution solution = new P98_ValidateBinarySearchTree().new Solution();
        Assert.assertTrue(solution.isValidBST(TreeNode.create(new Integer[]{2, 1, 3})));
        Assert.assertFalse(solution.isValidBST(TreeNode.create(new Integer[]{5, 1, 4, null, null, 3, 6})));
        Assert.assertFalse(solution.isValidBST(TreeNode.create(new Integer[]{5, 1, 6, null, null, 8, 1})));
    }

}