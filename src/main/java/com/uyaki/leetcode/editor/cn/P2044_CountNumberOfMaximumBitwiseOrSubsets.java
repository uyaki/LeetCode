//给你一个整数数组 nums ，请你找出 nums 子集 按位或 可能得到的 最大值 ，并返回按位或能得到最大值的 不同非空子集的数目 。 
//
// 如果数组 a 可以由数组 b 删除一些元素（或不删除）得到，则认为数组 a 是数组 b 的一个 子集 。如果选中的元素下标位置不一样，则认为两个子集 不同
// 。 
//
// 对数组 a 执行 按位或 ，结果等于 a[0] OR a[1] OR ... OR a[a.length - 1]（下标从 0 开始）。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [3,1]
//输出：2
//解释：子集按位或能得到的最大值是 3 。有 2 个子集按位或可以得到 3 ：
//- [3]
//- [3,1]
// 
//
// 示例 2： 
//
// 
//输入：nums = [2,2,2]
//输出：7
//解释：[2,2,2] 的所有非空子集的按位或都可以得到 2 。总共有 2³ - 1 = 7 个子集。
// 
//
// 示例 3： 
//
// 
//输入：nums = [3,2,1,5]
//输出：6
//解释：子集按位或可能的最大值是 7 。有 6 个子集按位或可以得到 7 ：
//- [3,5]
//- [3,1,5]
//- [3,2,5]
//- [3,2,1,5]
//- [2,5]
//- [2,1,5] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 16 
// 1 <= nums[i] <= 10⁵ 
// 
// Related Topics 位运算 数组 回溯 👍 96 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 统计按位或能得到最大值的子集数目
 */
public class P2044_CountNumberOfMaximumBitwiseOrSubsets {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P2044_CountNumberOfMaximumBitwiseOrSubsets().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        int[] nums;
        int max, count;

        public int countMaxOrSubsets(int[] nums) {
            this.nums = nums;
            this.max = 0;
            this.count = 0;
            dfs(0, 0);
            return count;
        }

        /**
         * @param currIndex     下标
         * @param preSetOrValue 当前下标之前的某个子集的按位或值
         */
        private void dfs(int currIndex, int preSetOrValue) {
            // 所有元素选取完
            if (currIndex == nums.length) {
                if (preSetOrValue > max) {
                    max = preSetOrValue;
                    count = 1;
                } else if (preSetOrValue == max) {
                    count++;
                }
                return;
            }
            //数组中的每个元素都可以选取或者不选取
            // 选取
            dfs(currIndex + 1, preSetOrValue | nums[currIndex]);
            // 不选取
            dfs(currIndex + 1, preSetOrValue);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
