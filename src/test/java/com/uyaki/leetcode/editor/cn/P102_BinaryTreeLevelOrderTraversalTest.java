package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Test;

import java.util.List;

public class P102_BinaryTreeLevelOrderTraversalTest {

    @Test
    public void levelOrder() {
        //测试代码
        P102_BinaryTreeLevelOrderTraversal.Solution solution = new P102_BinaryTreeLevelOrderTraversal().new Solution();
        List<List<Integer>> list = solution.levelOrder(TreeNode.create(new Integer[]{3, 9, 20, null, null, 15, 7}));
        System.out.println(list);
        List<List<Integer>> list2 = solution.levelOrder(TreeNode.create(new Integer[]{3, 9, 20, null, null, 15, 7, 9, null, 2, 3}));
        System.out.println(list2);
    }
}