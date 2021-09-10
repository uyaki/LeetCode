package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Test;

import java.util.List;

public class P107_BinaryTreeLevelOrderTraversalIiTest {
    @Test
    public void levelOrderBottom() {
        P107_BinaryTreeLevelOrderTraversalIi.Solution solution = new P107_BinaryTreeLevelOrderTraversalIi().new Solution();
        List<List<Integer>> ans = solution.levelOrderBottom(TreeNode.create(new Integer[]{3, 9, 20, null, null, 15, 7}));
        System.out.println(ans);
    }
}