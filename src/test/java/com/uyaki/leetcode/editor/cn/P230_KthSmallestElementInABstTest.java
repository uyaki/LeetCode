package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P230_KthSmallestElementInABstTest {
    @Test
    public void kthSmallest() {
        P230_KthSmallestElementInABst.Solution solution = new P230_KthSmallestElementInABst().new Solution();
        Assert.assertEquals(3, solution.kthSmallest(TreeNode.create(new Integer[]{5, 3, 6, 2, 4, null, null, 1}), 3));
        Assert.assertEquals(2, solution.kthSmallest(TreeNode.create(new Integer[]{1, null, 2}), 2));
    }
}