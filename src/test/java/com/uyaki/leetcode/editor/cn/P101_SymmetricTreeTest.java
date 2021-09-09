package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class P101_SymmetricTreeTest {
    @Test
    public void isSymmetric() {
        P101_SymmetricTree.Solution solution = new P101_SymmetricTree().new Solution();
        assertTrue(solution.isSymmetric(TreeNode.create(new Integer[]{1, 2, 2, 3, 4, 4, 3})));
        assertFalse(solution.isSymmetric(TreeNode.create(new Integer[]{1, 2, 2, null, 3, null, 3})));
    }
}