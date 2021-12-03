//给你一个整数数组 nums 和一个整数 k ，按以下方法修改该数组： 
//
// 
// 选择某个下标 i 并将 nums[i] 替换为 -nums[i] 。 
// 
//
// 重复这个过程恰好 k 次。可以多次选择同一个下标 i 。 
//
// 以这种方式修改数组后，返回数组 可能的最大和 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [4,2,3], k = 1
//输出：5
//解释：选择下标 1 ，nums 变为 [4,-2,3] 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,-1,0,2], k = 3
//输出：6
//解释：选择下标 (1, 2, 2) ，nums 变为 [3,1,0,2] 。
// 
//
// 示例 3： 
//
// 
//输入：nums = [2,-3,-1,5,-4], k = 2
//输出：13
//解释：选择下标 (1, 4) ，nums 变为 [2,3,-1,5,4] 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁴ 
// -100 <= nums[i] <= 100 
// 1 <= k <= 10⁴ 
// 
// Related Topics 贪心 数组 排序 👍 180 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;

/**
 * K 次取反后最大化的数组和
 */
public class P1005_MaximizeSumOfArrayAfterKNegations {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1005_MaximizeSumOfArrayAfterKNegations().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int largestSumAfterKNegations(int[] nums, int k) {
            // 贪心思路：
            //   局部最优 -> 全局最优
            //   1. 数组存在负数：让绝对值大的负数变为正数，当前数值达到最大 -> 	整个数组和达到最大。
            //   2. 数组已经不存在负数：只找数值最小的正整数进行反转，当前数值可以达到最大 -> 整个数组和达到最大。
            // 实现：
            //	第一步：将数组按照绝对值大小从大到小排序，**注意要按照绝对值的大小**
            //	第二步：从前向后遍历，遇到负数将其变为正数，同时K--
            //	第三步：如果K还大于0，那么反复转变数值最小的元素，将K用完（如果k为偶数，不变，奇数变一次）
            //	第四步：求和
            nums = Arrays.stream(nums).boxed().sorted(((o1, o2) -> Math.abs(o2) - Math.abs(o1))).mapToInt(Integer::intValue).toArray();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0 & k > 0) {
                    nums[i] = -nums[i];
                    k--;
                }
            }
            // 如果还剩奇数次k，反转最小值
            if (k % 2 == 1) {
                nums[nums.length - 1] = -nums[nums.length - 1];
            }
            return Arrays.stream(nums).sum();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
