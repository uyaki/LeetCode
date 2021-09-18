package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P111_MinimumDepthOfBinaryTreeTest {
    @Test
    public void minDepth() {
        P111_MinimumDepthOfBinaryTree.Solution solution = new P111_MinimumDepthOfBinaryTree().new Solution();
        Assert.assertEquals(2, solution.minDepth(TreeNode.create(new Integer[]{3, 9, 20, null, null, 15, 7})));
        Assert.assertEquals(5, solution.minDepth(TreeNode.create(new Integer[]{2, null, 3, null, 4, null, 5, null, 6})));
    }

}