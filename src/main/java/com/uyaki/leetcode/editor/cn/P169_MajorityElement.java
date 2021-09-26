//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。 
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 
//
// 示例 1： 
//
// 
//输入：[3,2,3]
//输出：3 
//
// 示例 2： 
//
// 
//输入：[2,2,1,1,1,2,2]
//输出：2
// 
//
// 
//
// 进阶： 
//
// 
// 尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。 
// 
// Related Topics 数组 哈希表 分治 计数 排序 👍 1146 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 多数元素
 */
public class P169_MajorityElement {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 分治法
         * 如果数 a 是数组 nums 的众数，如果我们将 nums 分成两部分，那么 a 必定是至少一部分的众数
         * 反证法：切割后的数组长度为l1，l2。 如果a不是左右的众数，
         * 则 a出现的次数小于 l1 / 2 + l2 / 2 <= （ l1 + l2 ）/2 ，所以a不会是nums的众数
         * <p>
         * 分治：
         * 1. 将子问题切割到长度为 1的数组 ，这个唯一的数字就是众数
         * 2. 回溯后，如果数组长度 >1 ,将左右子区间合并，如果众数相同，那么众数不变，如果众数不同，比较出现次数
         */
        public int majorityElement(int[] nums) {
            return divideAndConquer(nums, 0, nums.length - 1);
        }

        /**
         * 分治子问题
         *
         * @param nums  数组
         * @param left  左区间边界
         * @param right 右区间边界
         * @return 结果
         */
        private int divideAndConquer(int[] nums, int left, int right) {
            if (left == right) {
                return nums[left];
            }
            int mid = (left + right) / 2;
            int leftMajority = divideAndConquer(nums, left, mid);
            int rightMajority = divideAndConquer(nums, mid + 1, right);
            // 众数相同直接返回
            if (leftMajority == rightMajority) {
                return leftMajority;
            }
            int leftCount = count(nums, leftMajority, left, right);
            int rightCount = count(nums, rightMajority, left, right);
            // 众数不同，比较出现次数
            return leftCount > rightCount ? leftMajority : rightMajority;
        }

        /**
         * 计算出现次数
         *
         * @param nums     数组
         * @param majority 被统计数字
         * @param left     左区间
         * @param right    有区间
         * @return 次数
         */
        private int count(int[] nums, int majority, int left, int right) {
            int count = 0;
            for (int i = left; i <= right; i++) {
                if (nums[i] == majority) {
                    count++;
                }
            }
            return count;
        }

        /**
         * 最简单的做法就是排序，中间的数字一定是众数
         */
        public int majorityElement1(int[] nums) {
            Arrays.sort(nums);
            // 无论数组的长度是奇数还是偶数都成立
            return nums[nums.length / 2];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
