//列表 arr 由在范围 [1, n] 中的所有整数组成，并按严格递增排序。请你对 arr 应用下述算法： 
//
// 
// 
// 
// 从左到右，删除第一个数字，然后每隔一个数字删除一个，直到到达列表末尾。 
// 重复上面的步骤，但这次是从右到左。也就是，删除最右侧的数字，然后剩下的数字每隔一个删除一个。 
// 不断重复这两步，从左到右和从右到左交替进行，直到只剩下一个数字。 
// 
//
// 给你整数 n ，返回 arr 最后剩下的数字。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 9
//输出：6
//解释：
//arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
//arr = [2, 4, 6, 8]
//arr = [2, 6]
//arr = [6]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 10⁹ 
// 
// 
// 
// Related Topics 数学 👍 207 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 消除游戏
 */
public class P390_EliminationGame {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P390_EliminationGame().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // n = 1
        // arr = [1]
        // n = 2        n = 3          n = 4            n = 5
        // arr = [1,2]  arr = [1,2,3]  arr = [1,2,3,4]  arr = [1,2,3,4,5]
        // arr = [2]    arr = [2]      arr = [2,4]      arr = [2,4]
        //                             arr = [2]        arr = [2]
        // n = 6                n = 7
        // arr = [1,2,3,4,5,6]  arr = [1,2,3,4,5,6,7]
        // arr = [2,4,6]        arr = [2,4,6]
        // arr = [4]            arr = [4]
        //
        // n = 8                    n = 9
        // arr = [1,2,3,4,5,6,7,8]  arr = [1,2,3,4,5,6,7,8,9]
        // arr = [2,4,6,8]          arr = [2,4,6,8]
        // arr = [2,6]              arr = [2,6]
        // arr = [6]                arr = [6]
        //
        // n = 10                         n = 11
        // arr = [1,2,3,4,5,6,7,8,9,10]   arr = [1,2,3,4,5,6,7,8,9,10,11]
        // arr = [2,4,6,8,10]             arr = [2,4,6,8,10]
        // arr = [4,8]                    arr = [4,8]
        // arr = [8]                      arr = [8]
        //
        // n = 12
        // arr = [1,2,3,4,5,6,7,8,9,10,11,12]
        // arr = [2,4,6,8,10,12]
        // arr = [2,6,10]
        // arr = [6]
        // n = 14
        // arr = [1,2,3,4,5,6,7,8,9,10,11,12,13,14]
        // arr = [2,4,6,8,10,12,14]
        // arr = [4,8,12]
        // arr = [8]
        // n = 16
        // arr = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16] length = 16
        // arr = [2,4,6,8,10,12,14,16] length = 8
        // arr = [2,6,10,14] length = 4
        // arr = [6,14]  length = 2
        // arr = [6] length = 1
        // n = 18
        // arr = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18] length = 18
        // arr = [2,4,6,8,10,12,14,16,18] length = 9
        // arr = [4,8,12,16] length = 4
        // arr = [8,16] length = 2
        // arr = [8] length = 1
        // n = 20
        // arr = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20] length = 20
        // arr = [2,4,6,8,10,12,14,16,18,20] length = 10
        // arr = [2,6,10,14,18] length = 5
        // arr = [6,14] length = 2
        // arr = [6] length = 1
        // n = 30
        // arr = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30] length = 30
        // arr = [2,4,6,8,10,12,14,16,18,20,22,24,26,28,30] length = 15
        // arr = [4,8,12,16,20,24,28] length = 7
        // arr = [8,16,24] length = 3
        // arr = [16] length = 1
        public int lastRemaining(int n) {
            if (n == 1) {
                return 1;
            }
            // 何时消除队首元素:从左到右 或者 从右到左，数组为奇数个，才会消除第一个
            int first = 1;
            int step = 1;
            int length = n;
            boolean isLeft = true;
            while (length > 1) {
                if (isLeft || ((length & 1) == 1)) {
                    first += step;
                }
                isLeft = !isLeft;
                step <<= 1;
                length >>= 1;
            }
            return first;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
