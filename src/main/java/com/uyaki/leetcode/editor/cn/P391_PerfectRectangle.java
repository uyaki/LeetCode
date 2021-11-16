//给你一个数组 rectangles ，其中 rectangles[i] = [xi, yi, ai, bi] 表示一个坐标轴平行的矩形。这个矩形的左下顶点是
// (xi, yi) ，右上顶点是 (ai, bi) 。 
//
// 如果所有矩形一起精确覆盖了某个矩形区域，则返回 true ；否则，返回 false 。 
// 
//
// 示例 1： 
//
// 
//输入：rectangles = [[1,1,3,3],[3,1,4,2],[3,2,4,4],[1,3,2,4],[2,3,3,4]]
//输出：true
//解释：5 个矩形一起可以精确地覆盖一个矩形区域。 
// 
//
// 示例 2： 
//
// 
//输入：rectangles = [[1,1,2,3],[1,3,2,4],[3,1,4,2],[3,2,4,4]]
//输出：false
//解释：两个矩形之间有间隔，无法覆盖成一个矩形。 
//
// 示例 3： 
//
// 
//输入：rectangles = [[1,1,3,3],[3,1,4,2],[1,3,2,4],[3,2,4,4]]
//输出：false
//解释：图形顶端留有空缺，无法覆盖成一个矩形。 
//
// 示例 4： 
//
// 
//输入：rectangles = [[1,1,3,3],[3,1,4,2],[1,3,2,4],[2,2,4,4]]
//输出：false
//解释：因为中间有相交区域，虽然形成了矩形，但不是精确覆盖。 
//
// 
//
// 提示： 
//
// 
// 1 <= rectangles.length <= 2 * 10⁴ 
// rectangles[i].length == 4 
// -10⁵ <= xi, yi, ai, bi <= 10⁵ 
// 
// Related Topics 数组 扫描线 👍 180 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * 完美矩形
 */
public class P391_PerfectRectangle {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P391_PerfectRectangle().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isRectangleCover(int[][] rectangles) {
            // 1.矩形区域的面积等于所有矩形的面积之和
            // 2.矩形区域四角的顶点只能出现一次，且其余顶点的出现次数只能是两次或四次。
            int left = Integer.MAX_VALUE;
            int right = Integer.MIN_VALUE;
            int top = Integer.MIN_VALUE;
            int bottom = Integer.MAX_VALUE;
            Set<String> set = new HashSet<>();
            int sumArea = 0;
            for (int[] rectangle : rectangles) {
                //获取4个点的坐标
                left = Math.min(left, rectangle[0]);
                bottom = Math.min(bottom, rectangle[1]);
                right = Math.max(right, rectangle[2]);
                top = Math.max(top, rectangle[3]);
                sumArea += calculateArea(rectangle[0], rectangle[1], rectangle[2], rectangle[3]);
                //记录坐标
                String[] strings = new String[4];
                // 左下坐标
                strings[0] = rectangle[0] + " " + rectangle[1];
                // 左上
                strings[1] = rectangle[0] + " " + rectangle[3];
                // 右下
                strings[2] = rectangle[2] + " " + rectangle[1];
                // 右上
                strings[3] = rectangle[2] + " " + rectangle[3];
                // 出现偶数次抵消，奇数次保留
                for (int j = 0; j < 4; j++) {
                    if (set.contains(strings[j])) {
                        set.remove(strings[j]);
                    } else {
                        set.add(strings[j]);
                    }
                }
            }
            // 最后只剩4个大矩形坐标且面积相等即为完美矩形
            if (set.size() == 4 && set.contains(left + " " + top)
                    && set.contains(left + " " + bottom)
                    && set.contains(right + " " + top)
                    && set.contains(right + " " + bottom)) {
                return sumArea == calculateArea(left, bottom, right, top);
            }
            return false;
        }

        /**
         * 计算面积
         *
         * @param left   left
         * @param bottom bottom
         * @param right  right
         * @param top    top
         * @return 面积
         */
        private int calculateArea(int left, int bottom, int right, int top) {
            return (top - bottom) * (right - left);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
