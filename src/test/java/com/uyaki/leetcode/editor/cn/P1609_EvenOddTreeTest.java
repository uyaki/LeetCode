package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P1609_EvenOddTreeTest {
    @Test
    public void test() {
        P1609_EvenOddTree.Solution solution = new P1609_EvenOddTree().new Solution();
        Assert.assertFalse(solution.isEvenOddTree(TreeNode.create(new Integer[]{5, 4, 2, 3, 3, 7})));
    }
}