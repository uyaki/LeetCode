package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Test;

public class P99_RecoverBinarySearchTreeTest {
    @Test
    public void recoverTree() {
        P99_RecoverBinarySearchTree.Solution solution = new P99_RecoverBinarySearchTree().new Solution();
        solution.recoverTree(TreeNode.create(new Integer[]{1, 3, null, null, 2}));
        solution.recoverTree(TreeNode.create(new Integer[]{3, 1, 4, null, null, 2}));
    }
}