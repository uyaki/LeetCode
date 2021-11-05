//给你一个整数数组 arr 和一个整数 difference，请你找出并返回 arr 中最长等差子序列的长度，该子序列中相邻元素之间的差等于 
//difference 。 
//
// 子序列 是指在不改变其余元素顺序的情况下，通过删除一些元素或不删除任何元素而从 arr 派生出来的序列。 
//
// 
//
// 示例 1： 
//
// 
//输入：arr = [1,2,3,4], difference = 1
//输出：4
//解释：最长的等差子序列是 [1,2,3,4]。 
//
// 示例 2： 
//
// 
//输入：arr = [1,3,5,7], difference = 1
//输出：1
//解释：最长的等差子序列是任意单个元素。
// 
//
// 示例 3： 
//
// 
//输入：arr = [1,5,7,8,5,3,4,2,1], difference = -2
//输出：4
//解释：最长的等差子序列是 [7,5,3,1]。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10⁵ 
// -10⁴ <= arr[i], difference <= 10⁴ 
// 
// Related Topics 数组 哈希表 动态规划 👍 95 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 最长定差子序列
 */
public class P1218_LongestArithmeticSubsequenceOfGivenDifference {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1218_LongestArithmeticSubsequenceOfGivenDifference().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 动态规划
         *
         * @param arr
         * @param difference
         * @return
         */
        public int longestSubsequence(int[] arr, int difference) {
            HashMap<Integer, Integer> dp = new HashMap<>();
            int ans = 0;
            // 令 dp[i] 表示以 arr[i] 为结尾的最长的等差子序列的长度
            // 可以在 arr[i] 左侧找到满足 arr[j]=arr[i]−d 的元素 (j<i)
            // 则 dp[i] = dp[j]+1
            // dp[num]=dp[num−difference]+1
            for (int num : arr) {
                dp.put(num, dp.getOrDefault(num - difference, 0) + 1);
                ans = Math.max(ans, dp.get(num));
            }
            return ans;
        }

        /**
         * 暴力剪枝也会超时
         *
         * @param arr
         * @param difference
         * @return
         */
        public int longestSubsequence2(int[] arr, int difference) {
            List<Integer> indexs = new ArrayList<>();
            // dp[i] = dp[i-1] + n
            int ans = 1;
            for (int i = 0; i < arr.length; i++) {
                if (!indexs.contains(i)) {
                    int length = 1;
                    int curr = arr[i];
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] == curr + difference) {
                            length++;
                            curr = arr[j];
                            indexs.add(j);
                        }
                    }
                    ans = Math.max(ans, length);
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
