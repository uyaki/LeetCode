package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class P94_BinaryTreeInorderTraversalTest {

    @Test
    public void inorderTraversal() {
        P94_BinaryTreeInorderTraversal.Solution solution = new P94_BinaryTreeInorderTraversal().new Solution();
        Integer[] l1 = new Integer[]{1, null, 2, 3};
        TreeNode node = TreeNode.create(l1);
        assertEquals(Arrays.asList(1, 3, 2), solution.inorderTraversal(node));
        assertEquals(Arrays.asList(), solution.inorderTraversal(null));
        assertEquals(Arrays.asList(1), solution.inorderTraversal(new TreeNode(1)));
    }
}