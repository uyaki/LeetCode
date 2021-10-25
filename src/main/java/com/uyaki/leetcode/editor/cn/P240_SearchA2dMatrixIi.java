//编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性： 
//
// 
// 每行的元素从左到右升序排列。 
// 每列的元素从上到下升序排列。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21
//,23,26,30]], target = 5
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21
//,23,26,30]], target = 20
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= n, m <= 300 
// -10⁹ <= matrix[i][j] <= 10⁹ 
// 每行的所有元素从左到右升序排列 
// 每列的所有元素从上到下升序排列 
// -10⁹ <= target <= 10⁹ 
// 
// Related Topics 数组 二分查找 分治 矩阵 👍 832 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 搜索二维矩阵 II
 */
public class P240_SearchA2dMatrixIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P240_SearchA2dMatrixIi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            // 1 2 3
            // 4 5 6
            // 7 8 9
            // 设 x 为左下角的值，
            //    则 x的上方 1,4 一定比x小，
            //    x的右方，8,9 一定比x大
            // 令 x = （i,j)
            //    if x = target，return true
            //    if x < target, 目标在右侧，则 j++
            //    if x > target ,则目标上方，则 i--
            // 如果最后没有找到，return false
            int m = matrix.length;
            int n = matrix[0].length;
            int i = m - 1;
            int j = 0;
            while (j < n && i >= 0) {
                if (matrix[i][j] == target) {
                    return true;
                } else if (matrix[i][j] < target) {
                    j++;
                } else {
                    i--;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
