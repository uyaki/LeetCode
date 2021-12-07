//给你一个整数数组 nums 和一个整数 k ，找出三个长度为 k 、互不重叠、且 3 * k 项的和最大的子数组，并返回这三个子数组。 
//
// 以下标的数组形式返回结果，数组中的每一项分别指示每个子数组的起始位置（下标从 0 开始）。如果有多个结果，返回字典序最小的一个。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,1,2,6,7,5,1], k = 2
//输出：[0,3,5]
//解释：子数组 [1, 2], [2, 6], [7, 5] 对应的起始下标为 [0, 3, 5]。
//也可以取 [2, 1], 但是结果 [1, 3, 5] 在字典序上更大。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,1,2,1,2,1,2,1], k = 2
//输出：[0,2,4]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 2 * 10⁴ 
// 1 <= nums[i] < 2¹⁶ 
// 1 <= k <= floor(nums.length / 3) 
// 
// Related Topics 数组 动态规划 👍 155 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 三个无重叠子数组的最大和
 */
public class P689_MaximumSumOf3NonOverlappingSubarrays {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P689_MaximumSumOf3NonOverlappingSubarrays().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
            int n = nums.length;
            // 计算以下标i开始向右扩展k个长度的子数组的和
            // 本题以，nums = {1,2,1,2,6,7,5,1} k=2 举例
            // sums = {3,3,3,8,13,12,6}
            int m = n - k + 1;
            int[] sums = new int[m];
            for (int i = 0; i < m; i++) {
                int sum = 0;
                for (int j = 0; j < k; j++) {
                    sum += nums[i + j];
                }
                sums[i] = sum;
            }

            // left[i] 保存 从 0 到 i 范围内，sums[i]值最大的下标值
            // right[i] 保存 从 n - 1 到 i 范围内，sums[i]值最大的下标值
            // 此时 ， left = {0,0,0,3,4,4,4}
            // 此时 ， right = {4,4,4,4,4,5,6}
            int[] left = new int[m];
            left[0] = 0;
            int[] right = new int[m];
            right[m - 1] = m - 1;
            for (int i = 1; i < m; i++) {
                // 左侧在等于的时候优先保留靠左的，即之前遍历的，所以是大于
                left[i] = sums[i] > sums[left[i - 1]] ? i : left[i - 1];
                // 右侧在等于的时候优先保留靠左的，即后遍历的，所以是大于等于。
                right[m - i - 1] = sums[m - i - 1] >= sums[right[m - i]] ? m - i - 1 : right[m - i];
            }
            int[] ans = new int[0];
            // 枚举所有可能的中间下标，左子数组占 k 位，右子数组占 k位 自身占 k位
            int maxSum = 0;
            for (int i = k; i <= n - 2 * k; i++) {
                int curSum = sums[left[i - k]] + sums[i] + sums[right[i + k]];
                if (maxSum < curSum) {
                    maxSum = curSum;
                    ans = new int[]{left[i - k], i, right[i + k]};
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
