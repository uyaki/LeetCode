package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class P95_UniqueBinarySearchTreesIiTest {

    @Test
    public void generateTrees() {
        P95_UniqueBinarySearchTreesIi.Solution solution = new P95_UniqueBinarySearchTreesIi().new Solution();
        TreeNode n1 = TreeNode.create(new Integer[]{1, null, 2, null, 3});
        TreeNode n2 = TreeNode.create(new Integer[]{1, null, 3, 2});
        TreeNode n3 = TreeNode.create(new Integer[]{2, 1, 3});
        TreeNode n4 = TreeNode.create(new Integer[]{3, 1, null, null, 2});
        TreeNode n5 = TreeNode.create(new Integer[]{3, 2, null, 1,});
        assertEquals(Arrays.asList(n1, n2, n3, n4, n5), solution.generateTrees(3));
    }
}