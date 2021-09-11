package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P106_ConstructBinaryTreeFromInorderAndPostorderTraversalTest {
    @Test
    public void buildTree() {
        P106_ConstructBinaryTreeFromInorderAndPostorderTraversal.Solution solution = new P106_ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
        TreeNode node = TreeNode.create(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15});
        TreeNode node1 = solution.buildTree(new int[]{8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15}, new int[]{8, 9, 4, 10, 11, 5, 2, 12, 13, 6, 14, 15, 7, 3, 1});
        Assert.assertEquals(node, node1);
    }
}