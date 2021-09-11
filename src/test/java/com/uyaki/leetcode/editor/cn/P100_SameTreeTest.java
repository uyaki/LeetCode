package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P100_SameTreeTest {
    @Test
    public void isSameTree() {
        //测试代码
        P100_SameTree.Solution solution = new P100_SameTree().new Solution();
        Assert.assertTrue(solution.isSameTree(TreeNode.create(new Integer[]{1, 2, 3}), TreeNode.create(new Integer[]{1, 2, 3})));
        Assert.assertFalse(solution.isSameTree(TreeNode.create(new Integer[]{1, 2}), TreeNode.create(new Integer[]{1, null, 2})));
    }
}