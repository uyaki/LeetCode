package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P105_ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    @Test
    public void buildTree() {
        P105_ConstructBinaryTreeFromPreorderAndInorderTraversal.Solution solution = new P105_ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
        TreeNode node = TreeNode.create(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15});
        TreeNode node1 = solution.buildTree(new int[]{1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15}, new int[]{8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15});
        assertEquals(node, node1);
    }
}