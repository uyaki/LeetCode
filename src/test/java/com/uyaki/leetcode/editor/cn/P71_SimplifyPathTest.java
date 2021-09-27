package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P71_SimplifyPathTest {
    @Test
    public void simplifyPath() {
        P71_SimplifyPath.Solution solution = new P71_SimplifyPath().new Solution();
        Assert.assertEquals("/c", solution.simplifyPath("/a/./b/../../c/"));
        Assert.assertEquals("/home", solution.simplifyPath("/home/"));
        Assert.assertEquals("/home/foo", solution.simplifyPath("/home//foo/"));
        Assert.assertEquals("/c", solution.simplifyPath("/a/./b/../../c/"));
    }
}