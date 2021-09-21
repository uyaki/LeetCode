//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//
// 请必须使用时间复杂度为 O(log n) 的算法。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,3,5,6], target = 5
//输出: 2
// 
//
// 示例 2: 
//
// 
//输入: nums = [1,3,5,6], target = 2
//输出: 1
// 
//
// 示例 3: 
//
// 
//输入: nums = [1,3,5,6], target = 7
//输出: 4
// 
//
// 示例 4: 
//
// 
//输入: nums = [1,3,5,6], target = 0
//输出: 0
// 
//
// 示例 5: 
//
// 
//输入: nums = [1], target = 0
//输出: 0
// 
//
// 
//
// 提示: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums 为无重复元素的升序排列数组 
// -10⁴ <= target <= 10⁴ 
// 
// Related Topics 数组 二分查找 👍 1079 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 搜索插入位置
 */
public class P35_SearchInsertPosition {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int searchInsert(int[] nums, int target) {
            return searchInsert(nums, 0, nums.length - 1, target);
        }

        private int searchInsert(int[] nums, int start, int end, int target) {
            if (start > end) {
                return start;
            }
            int mid = (start + end) / 2;
            if (target > nums[mid]) {
                // 比中位数大，在右边查找
                return searchInsert(nums, mid + 1, end, target);
            } else if (target < nums[mid]) {
                // 比中位数小，在左边查找
                return searchInsert(nums, start, mid - 1, target);
            } else {
                // 等于直接返回
                return mid;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
