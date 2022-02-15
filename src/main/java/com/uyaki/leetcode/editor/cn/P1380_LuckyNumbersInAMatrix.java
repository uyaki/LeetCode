//给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。 
//
// 幸运数是指矩阵中满足同时下列两个条件的元素： 
//
// 
// 在同一行的所有元素中最小 
// 在同一列的所有元素中最大 
// 
//
// 
//
// 示例 1： 
//
// 输入：matrix = [[3,7,8],[9,11,13],[15,16,17]]
//输出：[15]
//解释：15 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
// 
//
// 示例 2： 
//
// 输入：matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
//输出：[12]
//解释：12 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
// 
//
// 示例 3： 
//
// 输入：matrix = [[7,8],[1,2]]
//输出：[7]
// 
//
// 
//
// 提示： 
//
// 
// m == mat.length 
// n == mat[i].length 
// 1 <= n, m <= 50 
// 1 <= matrix[i][j] <= 10^5 
// 矩阵中的所有元素都是不同的 
// 
// Related Topics 数组 矩阵 👍 98 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Collections;
import java.util.List;

/**
 * 矩阵中的幸运数
 */
public class P1380_LuckyNumbersInAMatrix {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1380_LuckyNumbersInAMatrix().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> luckyNumbers(int[][] matrix) {
            // 答案只可能有 1 个 或者 0个元素 ， 反证法如下
            // 假设有两个解，A[x1,y1] B[x2,y2] ,显然 x1!=x2 且 y1 != y2
            // 对于 A ， 同行最小值，所以 1、m[x1][y1] < m[x1][y2]
            //          同列最大值，所以 2、m[x1][y1] > m[x2][y1]
            // 对于 B ， 3、m[x2][y2] < m[x2][y1]
            //          4、m[x2][y2] > m[x1][y2]
            // 5、1 + 4 => m[x2][y2] > m[x1][y2] > m[x1][y1] =>  m[x2][y2] > m[x1][y1]
            // 6、2 + 3 => m[x1][y1] > m[x2][y1] > m[x2][y2] =>  m[x1][y1] > m[x2][y2]
            // 5 + 6 => 矛盾
            int m = matrix.length, n = matrix[0].length;
            int[] rowMinIndex = new int[m];
            for (int i = 0; i < m; i++) {
                int minIndex = 0;
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] < matrix[i][minIndex]) {
                        minIndex = j;
                    }
                }
                rowMinIndex[i] = minIndex;
            }
            for (int i = 0; i < m; i++) {
                int col = rowMinIndex[i];
                int maxIndex = 0;
                for (int j = 1; j < m; j++) {
                    if (matrix[j][col] > matrix[maxIndex][col]) {
                        maxIndex = j;
                    }
                }
                // maxIndex刚好在当前行，获得唯一解
                if (maxIndex == i) {
                    return Collections.singletonList(matrix[i][rowMinIndex[i]]);
                }
            }
            return Collections.emptyList();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
