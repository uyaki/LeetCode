package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P110_BalancedBinaryTreeTest {
    @Test
    public void isBalanced(){
        P110_BalancedBinaryTree.Solution solution = new P110_BalancedBinaryTree().new Solution();
        Assert.assertTrue(solution.isBalanced(TreeNode.create(new Integer[]{3, 9, 20, null, null, 15, 7})));
        Assert.assertFalse(solution.isBalanced(TreeNode.create(new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4})));
        Assert.assertTrue(solution.isBalanced(TreeNode.create(new Integer[]{})));
        Assert.assertTrue(solution.isBalanced(TreeNode.create(new Integer[]{1,2,3,4,5,6,null,8})));
    }

}