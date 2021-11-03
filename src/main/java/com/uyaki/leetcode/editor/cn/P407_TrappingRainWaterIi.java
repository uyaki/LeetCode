//给你一个 m x n 的矩阵，其中的值均为非负整数，代表二维高度图每个单元的高度，请计算图中形状最多能接多少体积的雨水。 
//
// 
//
// 示例 1: 
//
// 
//
// 
//输入: heightMap = [[1,4,3,1,3,2],[3,2,1,3,2,4],[2,3,3,2,3,1]]
//输出: 4
//解释: 下雨后，雨水将会被上图蓝色的方块中。总的接雨水量为1+2+1=4。
// 
//
// 示例 2: 
//
// 
//
// 
//输入: heightMap = [[3,3,3,3,3],[3,2,2,2,3],[3,2,1,2,3],[3,2,2,2,3],[3,3,3,3,3]]
//输出: 10
// 
//
// 
//
// 提示: 
//
// 
// m == heightMap.length 
// n == heightMap[i].length 
// 1 <= m, n <= 200 
// 0 <= heightMap[i][j] <= 2 * 10⁴ 
// 
//
// 
// Related Topics 广度优先搜索 数组 矩阵 堆（优先队列） 👍 484 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 接雨水 II
 */
public class P407_TrappingRainWaterIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P407_TrappingRainWaterIi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int trapRainWater(int[][] heightMap) {
            int m = heightMap.length;
            int n = heightMap[0].length;
            if (m < 3 || n < 3) {
                return 0;
            }
            // 从小到大输出
            PriorityQueue<int[]> queue = new PriorityQueue<>((Comparator.comparingInt(o -> o[2])));
            boolean[][] visited = new boolean[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    //将最外圈的元素放入优先队列，同时标记已经访问
                    if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                        queue.offer(new int[]{i, j, heightMap[i][j]});
                        visited[i][j] = true;
                    }
                }
            }
            int ans = 0;
            // x+dir[i] y+dir[i+1]
            //  i = 0, x-1,y+0 左
            //  i = 1, x,y+1 右
            // i = 2, x+1 ,y+0 下
            // i = 3, x, y-1 上
            int[] dir = {-1, 0, 1, 0, -1};
            //循环从pq取出元素，遍历其左上右下结点，如果找到比他小的内部节点，就灌水到等高
            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                for (int k = 0; k < 4; k++) {
                    int nx = cur[0] + dir[k];
                    int ny = cur[1] + dir[k + 1];
                    if (nx >= 0 && nx < m && ny > 0 && ny < n && !visited[nx][ny]) {
                        int temp = cur[2] - heightMap[nx][ny];
                        if (temp > 0) {
                            ans += temp;
                        }
                        queue.offer(new int[]{nx, ny, Math.max(heightMap[nx][ny], cur[2])});
                        visited[nx][ny] = true;
                    }
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
