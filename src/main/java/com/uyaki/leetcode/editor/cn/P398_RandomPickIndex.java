//给你一个可能含有 重复元素 的整数数组 nums ，请你随机输出给定的目标数字 target 的索引。你可以假设给定的数字一定存在于数组中。 
//
// 实现 Solution 类： 
//
// 
// Solution(int[] nums) 用数组 nums 初始化对象。 
// int pick(int target) 从 nums 中选出一个满足 nums[i] == target 的随机索引 i 。如果存在多个有效的索引，则每
//个索引的返回概率应当相等。 
// 
//
// 
//
// 示例： 
//
// 
//输入
//["Solution", "pick", "pick", "pick"]
//[[[1, 2, 3, 3, 3]], [3], [1], [3]]
//输出
//[null, 4, 0, 2]
//
//解释
//Solution solution = new Solution([1, 2, 3, 3, 3]);
//solution.pick(3); // 随机返回索引 2, 3 或者 4 之一。每个索引的返回概率应该相等。
//solution.pick(1); // 返回 0 。因为只有 nums[0] 等于 1 。
//solution.pick(3); // 随机返回索引 2, 3 或者 4 之一。每个索引的返回概率应该相等。
// 
//
// 
//
// 
// 
// 
// 提示： 
//
// 
// 1 <= nums.length <= 2 * 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// target 是 nums 中的一个整数 
// 最多调用 pick 函数 10⁴ 次 
// 
// 
// 
// 
//
// 
// Related Topics 水塘抽样 哈希表 数学 随机化 👍 217 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Random;

/**
 * 随机数索引
 */
public class P398_RandomPickIndex {
    public static void main(String[] args) {
        //测试代码
//        Solution solution = new P398_RandomPickIndex().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int[] nums;
        Random random;

        public Solution(int[] nums) {
            this.nums = nums;
            random = new Random();
        }

        public int pick(int target) {
            int ans = 0;
            // P(第 i 次遇到值为 target 的元素的下标成为最终返回值)
            // =P(第 i 次随机选择的值 = 0)×P(第 i+1 次随机选择的值 ≠ 0) x ... x ( 第 k 次随机选择的值 ≠ 0)
            // = 1/i x ( 1- 1/i+1) x .... x (1-1/k)
            // = 1/i x i/i+1 x ... x k-1/k
            // = 1/k
            for (int i = 0, cnt = 0; i < nums.length; ++i) {
                if (nums[i] == target) {
                    ++cnt; // 第 cnt 次遇到 target
                    // 遍历 nums，当我们第 i 次遇到值为 target 的元素时，
                    // 随机选择区间 [0,i)内的一个整数，
                    // 如果其等于 0，则将返回值置为该元素的下标，否则返回值不变。
                    if (random.nextInt(cnt) == 0) {
                        ans = i;
                    }
                }
            }
            return ans;
        }
    }

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
