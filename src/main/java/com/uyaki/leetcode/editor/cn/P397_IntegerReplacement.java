//给定一个正整数 n ，你可以做如下操作： 
//
// 
// 如果 n 是偶数，则用 n / 2替换 n 。 
// 如果 n 是奇数，则可以用 n + 1或n - 1替换 n 。 
// 
//
// n 变为 1 所需的最小替换次数是多少？ 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 8
//输出：3
//解释：8 -> 4 -> 2 -> 1
// 
//
// 示例 2： 
//
// 
//输入：n = 7
//输出：4
//解释：7 -> 8 -> 4 -> 2 -> 1
//或 7 -> 6 -> 3 -> 2 -> 1
// 
//
// 示例 3： 
//
// 
//输入：n = 4
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 2³¹ - 1 
// 
// Related Topics 贪心 位运算 记忆化搜索 动态规划 👍 113 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 整数替换
 */
public class P397_IntegerReplacement {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P397_IntegerReplacement().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 贪心
         */
        public int integerReplacement(int n) {
            //防止数据溢出
            long num = n;
            int time = 0;
            while (num != 1) {
                if (num % 2 == 1) {
                    // 默认取 n-1
                    long temp = num - 1;
                    // 且temp为奇数 且 temp!=3 ，选n+1
                    if (temp / 2 % 2 == 1 && temp / 2 != 1) {
                        num++;
                    } else {
                        num = temp;
                    }
                } else {
                    num /= 2;
                }
                time++;
            }
            return time;
        }

        Map<Integer, Integer> map = new HashMap<>();

        /**
         * 记忆化搜索
         */
        public int integerReplacement2(int n) {
            if (n == 1) {
                return 0;
            }
            // 当n为偶数，n = n/2
            if (!map.containsKey(n)) {
                if (n % 2 == 0) {
                    map.put(n, 1 + integerReplacement(n / 2));
                } else {
                    // 当n为奇数 ,n+1或者n-1
                    // 又因为这个n会变成偶数，那么下一次一定会除以2，
                    // 操作次数为 1 + (n+1)/2或者 1+ (n-1)/2
                    // 又因为n=2^31-1时，计算n+1会导致溢出，所以，可以用
                    // ⌊n/2⌋ + 1 和 ⌊n/2⌋ 分别表示 (n+1)/2 和 (n−1)/2，其中 ⌊⋅⌋ 表示向下取整
                    map.put(n, 2 + Math.min(integerReplacement(n / 2), integerReplacement(n / 2 + 1)));
                }
            }
            return map.get(n);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
