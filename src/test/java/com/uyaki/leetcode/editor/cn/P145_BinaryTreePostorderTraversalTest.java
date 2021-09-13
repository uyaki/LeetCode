package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P145_BinaryTreePostorderTraversalTest {
    @Test
    public void postorderTraversal() {
        P145_BinaryTreePostorderTraversal.Solution solution = new P145_BinaryTreePostorderTraversal().new Solution();
        Assert.assertEquals(Arrays.asList(3, 2, 1), solution.postorderTraversal(TreeNode.create(new Integer[]{1, null, 2, 3})));
    }
}