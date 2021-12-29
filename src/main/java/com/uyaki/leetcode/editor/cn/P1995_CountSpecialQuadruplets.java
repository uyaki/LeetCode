//给你一个 下标从 0 开始 的整数数组 nums ，返回满足下述条件的 不同 四元组 (a, b, c, d) 的 数目 ： 
//
// 
// nums[a] + nums[b] + nums[c] == nums[d] ，且 
// a < b < c < d 
// 
//
// 
//
// 示例 1： 
//
// 输入：nums = [1,2,3,6]
//输出：1
//解释：满足要求的唯一一个四元组是 (0, 1, 2, 3) 因为 1 + 2 + 3 == 6 。
// 
//
// 示例 2： 
//
// 输入：nums = [3,3,6,4,5]
//输出：0
//解释：[3,3,6,4,5] 中不存在满足要求的四元组。
// 
//
// 示例 3： 
//
// 输入：nums = [1,1,1,3,5]
//输出：4
//解释：满足要求的 4 个四元组如下：
//- (0, 1, 2, 3): 1 + 1 + 1 == 3
//- (0, 1, 3, 4): 1 + 1 + 3 == 5
//- (0, 2, 3, 4): 1 + 1 + 3 == 5
//- (1, 2, 3, 4): 1 + 1 + 3 == 5
// 
//
// 
//
// 提示： 
//
// 
// 4 <= nums.length <= 50 
// 1 <= nums[i] <= 100 
// 
// Related Topics 数组 枚举 👍 70 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 统计特殊四元组
 */
public class P1995_CountSpecialQuadruplets {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1995_CountSpecialQuadruplets().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        int ans = 0;

        public int countQuadruplets(int[] nums) {
            // 全排列的下标组合
            int[] indexes = new int[4];
            combine(nums, indexes, 0, 4);
            return ans;
        }

        /**
         * 组合方案
         *
         * @param start 开始坐标
         * @param count 数量
         */
        public void combine(int[] nums, int[] indexes, int start, int count) {
            for (int i = start; i < nums.length + 1 - count; i++) {
                indexes[count - 1] = i;
                if (count - 1 == 0) {
                    if (nums[indexes[3]] + nums[indexes[2]] + nums[indexes[1]] == nums[indexes[0]]) {
                        ans++;
                    }
                } else {
                    combine(nums, indexes, i + 1, count - 1);
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
