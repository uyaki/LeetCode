package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P104_MaximumDepthOfBinaryTreeTest {
    @Test
    public void maxDepth() {
        P104_MaximumDepthOfBinaryTree.Solution solution = new P104_MaximumDepthOfBinaryTree().new Solution();
        assertEquals(3, solution.maxDepth(TreeNode.create(new Integer[]{3, 9, 20, null, null, 15, 7})));
        assertEquals(3, solution.maxDepthBFS(TreeNode.create(new Integer[]{3, 9, 20, null, null, 15, 7})));
    }
}