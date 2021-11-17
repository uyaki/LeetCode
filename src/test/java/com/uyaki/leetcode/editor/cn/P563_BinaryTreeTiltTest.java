package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P563_BinaryTreeTiltTest {
    @Test
    public void findTilt() {
        P563_BinaryTreeTilt.Solution solution = new P563_BinaryTreeTilt().new Solution();
        Assert.assertEquals(15, solution.findTilt(TreeNode.create(new Integer[]{4, 2, 9, 3, 5, null, 7})));
        Assert.assertEquals(1, solution.findTilt(TreeNode.create(new Integer[]{1, 2, 3})));
        Assert.assertEquals(9, solution.findTilt(TreeNode.create(new Integer[]{21, 7, 14, 1, 1, 2, 2, 3, 3})));
    }
}