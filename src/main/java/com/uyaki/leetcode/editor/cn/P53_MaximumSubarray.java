//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出：6
//解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：nums = [0]
//输出：0
// 
//
// 示例 4： 
//
// 
//输入：nums = [-1]
//输出：-1
// 
//
// 示例 5： 
//
// 
//输入：nums = [-100000]
//输出：-100000
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 3 * 10⁴ 
// -10⁵ <= nums[i] <= 10⁵ 
// 
//
// 
//
// 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。 
// Related Topics 数组 分治 动态规划 👍 3734 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 最大子序和
 */
public class P53_MaximumSubarray {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubArray(int[] nums) {
            //假设 nums 数组的长度是 n，下标从 0到 n-1。
            // f(i) 代表以第 i 个数结尾的「连续子数组的最大和」
            // pre = f(i)=max{ f(i−1)+nums[i] , nums[i] }
            // ans = max(0<=i<=n-1){f(i)}
            int pre = 0, ans = nums[0];
            for (int num : nums) {
                pre = Math.max(pre + num, num);
                ans = Math.max(ans, pre);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
