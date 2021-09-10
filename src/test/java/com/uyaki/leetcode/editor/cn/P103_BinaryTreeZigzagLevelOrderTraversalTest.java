package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Test;

import java.util.List;

public class P103_BinaryTreeZigzagLevelOrderTraversalTest {
    @Test
    public void zigzagLevelOrder() {
        P103_BinaryTreeZigzagLevelOrderTraversal.Solution solution = new P103_BinaryTreeZigzagLevelOrderTraversal().new Solution();
        List<List<Integer>> list = solution.zigzagLevelOrder(TreeNode.create(new Integer[]{3, 9, 20, null, null, 15, 7}));
        List<List<Integer>> list2 = solution.zigzagLevelOrder(TreeNode.create(new Integer[]{1, 2, 3, 4, null, null, 5}));
        List<List<Integer>> list3 = solution.zigzagLevelOrder(TreeNode.create(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}));
        List<List<Integer>> list4 = solution.zigzagLevelOrder(null);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
    }
}