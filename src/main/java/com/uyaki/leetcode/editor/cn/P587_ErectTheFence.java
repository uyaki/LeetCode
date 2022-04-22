//在一个二维的花园中，有一些用 (x, y) 坐标表示的树。由于安装费用十分昂贵，你的任务是先用最短的绳子围起所有的树。只有当所有的树都被绳子包围时，花园才能
//围好栅栏。你需要找到正好位于栅栏边界上的树的坐标。 
//
// 
//
// 示例 1: 
//
// 输入: [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
//输出: [[1,1],[2,0],[4,2],[3,3],[2,4]]
//解释:
//
// 
//
// 示例 2: 
//
// 输入: [[1,2],[2,2],[4,2]]
//输出: [[1,2],[2,2],[4,2]]
//解释:
//
//即使树都在一条直线上，你也需要先用绳子包围它们。
// 
//
// 
//
// 注意: 
//
// 
// 所有的树应当被围在一起。你不能剪断绳子来包围树或者把树分成一组以上。 
// 输入的整数在 0 到 100 之间。 
// 花园至少有一棵树。 
// 所有树的坐标都是不同的。 
// 输入的点没有顺序。输出顺序也没有要求。 
// Related Topics 几何 数组 数学 👍 99 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 安装栅栏
 */
public class P587_ErectTheFence {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P587_ErectTheFence().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] outerTrees(int[][] trees) {
            int tsize = trees.length;
            if (tsize <= 3) {
                return trees;
            }
            Arrays.sort(trees, (u, v) -> u[0] == v[0] ? u[1] - v[1] : u[0] - v[0]);
            boolean[] visited = new boolean[tsize];
            int[] stack = new int[tsize + 1];
            int size = 0;
            for (int i = 0; i < tsize; i++) {
                while (size > 1 && f(trees[stack[size - 2]], trees[stack[size - 1]], trees[i]) < 0) {
                    visited[stack[--size]] = false;
                }
                stack[size++] = i;
                visited[i] = true;
            }
            int t = size;
            for (int i = tsize - 2; i >= 0; i--) {
                if (i != 0 && visited[i]) {
                    continue;
                }
                while (size > t && f(trees[stack[size - 2]], trees[stack[size - 1]], trees[i]) < 0) {
                    visited[stack[--size]] = false;
                }
                stack[size++] = i;
                visited[i] = true;
            }
            int[][] ans = new int[size - 1][];
            for (int i = 0; i < size - 1; i++) {
                ans[i] = trees[stack[i]];
            }
            return ans;
        }

        public int f(int[] a, int[] b, int[] c) {
            return (b[0] - a[0]) * (c[1] - b[1]) - (b[1] - a[1]) * (c[0] - b[0]);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
