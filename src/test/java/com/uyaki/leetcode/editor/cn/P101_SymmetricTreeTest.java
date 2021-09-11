package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P101_SymmetricTreeTest {
    @Test
    public void isSymmetric() {
        P101_SymmetricTree.Solution solution = new P101_SymmetricTree().new Solution();
        Assert.assertTrue(solution.isSymmetric(TreeNode.create(new Integer[]{1, 2, 2, 3, 4, 4, 3})));
        Assert.assertFalse(solution.isSymmetric(TreeNode.create(new Integer[]{1, 2, 2, null, 3, null, 3})));
    }
}