package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.Node;
import org.junit.Assert;
import org.junit.Test;

public class P559_MaximumDepthOfNAryTreeTest {
    @Test
    public void maxDepth() {
        P559_MaximumDepthOfNAryTree.Solution solution = new P559_MaximumDepthOfNAryTree().new Solution();
        Node node = Node.create(new Integer[]{1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14});
        Assert.assertEquals(5, solution.maxDepth(node));
        Assert.assertEquals(0,solution.maxDepth(Node.create(new Integer[]{})));
    }
}