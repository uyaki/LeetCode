package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P144_BinaryTreePreorderTraversalTest {
    @Test
    public void preorderTraversal() {
        P144_BinaryTreePreorderTraversal.Solution solution = new P144_BinaryTreePreorderTraversal().new Solution();
        Assert.assertEquals(Arrays.asList(1, 2, 3), solution.preorderTraversal(TreeNode.create(new Integer[]{1, null, 2, 3})));
    }
}