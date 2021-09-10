package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Test;

public class P108_ConvertSortedArrayToBinarySearchTreeTest {
    @Test
    public void sortedArrayToBST() {
        P108_ConvertSortedArrayToBinarySearchTree.Solution solution = new P108_ConvertSortedArrayToBinarySearchTree().new Solution();
        TreeNode node = solution.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        TreeNode.levelOrder(node);
    }
}