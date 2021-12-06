package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P463_IslandPerimeterTest {
    @Test
    public void perimeter() {
        P463_IslandPerimeter.Solution solution = new P463_IslandPerimeter().new Solution();
        Assert.assertEquals(16, solution.islandPerimeter(new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}}));
        Assert.assertEquals(4, solution.islandPerimeter(new int[][]{{1, 0}}));
        Assert.assertEquals(4, solution.islandPerimeter(new int[][]{{1}}));
    }
}