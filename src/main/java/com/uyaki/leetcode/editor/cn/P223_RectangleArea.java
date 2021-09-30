//给你 二维 平面上两个 由直线构成的 矩形，请你计算并返回两个矩形覆盖的总面积。 
//
// 每个矩形由其 左下 顶点和 右上 顶点坐标表示： 
//
// 
// 
// 第一个矩形由其左下顶点 (ax1, ay1) 和右上顶点 (ax2, ay2) 定义。 
// 第二个矩形由其左下顶点 (bx1, by1) 和右上顶点 (bx2, by2) 定义。 
// 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2
//输出：45
// 
//
// 示例 2： 
//
// 
//输入：ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2
//输出：16
// 
//
// 
//
// 提示： 
//
// 
// -10⁴ <= ax1, ay1, ax2, ay2, bx1, by1, bx2, by2 <= 10⁴ 
// 
// Related Topics 几何 数学 👍 153 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 矩形面积
 */
public class P223_RectangleArea {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 方法一：投影法
         */
        public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
            //方法一：计算重叠面积
            // 两个矩形覆盖的总面积等于两个矩形的面积之和减去两个矩形的重叠部分的面积。
            // 由于两个矩形的左下顶点和右上顶点己知，因此两个矩形的面积可以直接计算。
            // 如果两个矩形重叠，则两个矩形的重叠部分也是矩形，重叠部分的面积可以根据重叠部分的边界计算。
            //  两个矩形的水平边投影到x轴上的线段分别为 [ax1，ax2] 和 [bx1,bx2]，
            //  竖直边投影到y轴上的线段分别为 [ay1,ay2]和[by1,by2]。
            // 如果两个矩形重叠，则重叠部分的水平边投影到 x轴上的线段为max(ax1, bx1),min ( ax2, bx2)]
            // 竖直边投影到了y轴上的线段为max(ay1，by1),min(ax2,by2)]，
            // 根据重叠部分的水平边投影到x轴上的线段长度和竖直边投影到y轴上的线段长度即可计算重叠部分的面积。
            // 只有当两条线段的长度都大于 0时，重叠部分的面积才大于 0，否则重叠部分的面积为 0。
            int area1 = (ax2 - ax1) * (ay2 - ay1), area2 = (bx2 - bx1) * (by2 - by1);
            int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1), overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
            int overlapArea = Math.max(overlapWidth, 0) * Math.max(overlapHeight, 0);
            return area1 + area2 - overlapArea;
        }

        /**
         * 方法二：数学方法计算
         */
        public int computeArea2(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
            // a的面积
            int aArea = (ax2 - ax1) * (ay2 - ay1);
            // b的面积
            int bArea = (bx2 - bx1) * (by2 - by1);
            int ans = 0;
            if (ay2 <= by1 || ay1 >= by2 || ax1 >= bx2 || ax2 <= bx1) {
                // 没有交集
                ans = aArea + bArea;
            } else if (isBInA(ax1, ax2, bx1, bx2) && isBInA(ay1, ay2, by1, by2)) {
                // A全覆盖B
                ans = aArea;
            } else if (isAInB(ax1, ax2, bx1, bx2) && isAInB(ay1, ay2, by1, by2)) {
                // B全覆盖A
                ans = bArea;
            } else {
                int length = getLength(ax1, ax2, bx1, bx2);
                int width = getLength(ay1, ay2, by1, by2);
                ans = aArea + bArea - length * width;
            }
            return ans;
        }

        /**
         * A边是否被B覆盖
         *
         * @param a1 a左坐标
         * @param a2 a右坐标
         * @param b1 b左坐标
         * @param b2 b右坐标
         * @return ture or false
         */
        public boolean isAInB(int a1, int a2, int b1, int b2) {
            return b1 <= a1 && a2 <= b2;
        }

        /**
         * B边是否被A覆盖
         *
         * @param a1 a左坐标
         * @param a2 a右坐标
         * @param b1 b左坐标
         * @param b2 b右坐标
         * @return ture or false
         */
        public boolean isBInA(int a1, int a2, int b1, int b2) {
            return a1 <= b1 && b2 <= a2;
        }

        /**
         * 覆盖区域的长度
         *
         * @param a1 a左坐标
         * @param a2 a右坐标
         * @param b1 b左坐标
         * @param b2 b右坐标
         * @return ture or false
         */
        public int getLength(int a1, int a2, int b1, int b2) {
            if (isAInB(a1, a2, b1, b2)) {
                // a边被b边覆盖
                return a2 - a1;
            } else if (isBInA(a1, a2, b1, b2)) {
                // b边被a边覆盖
                return b2 - b1;
            } else if (a2 < b2) {
                return a2 - b1;
            } else {
                return b2 - a1;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
