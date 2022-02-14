//给你一个仅由整数组成的有序数组，其中每个元素都会出现两次，唯有一个数只会出现一次。 
//
// 请你找出并返回只出现一次的那个数。 
//
// 你设计的解决方案必须满足 O(log n) 时间复杂度和 O(1) 空间复杂度。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,1,2,3,3,4,4,8,8]
//输出: 2
// 
//
// 示例 2: 
//
// 
//输入: nums =  [3,3,7,7,10,11,11]
//输出: 10
// 
//
// 
//
// 
//
// 提示: 
//
// 
// 1 <= nums.length <= 10⁵ 
// 0 <= nums[i] <= 10⁵ 
// 
// Related Topics 数组 二分查找 👍 414 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 有序数组中的单一元素
 */
public class P540_SingleElementInASortedArray {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P540_SingleElementInASortedArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            // 1、假设单一元素所在的下标为 x, 那x的左右两边都各有偶数个元素。
            // 2、对于 x 左边的下标 y 如果 nums[y] = nums[y+1] ,y 一定是偶数。 0、2、4
            // 3、对于 x 右边的下标 z 如果 nums[z] = nums[z+1], z 一定是奇数。 7、9、11
            // 反过来 ， 如果坐标 mid是偶数，如果 nums[mid] = nums[mid+1]，说明 x 在右边
            // 如果坐标 mid 是奇数 如果 nums[mid] = nums[mid - 1 ] ,说明 x 在右边。
            int left = 0, right = nums.length - 1;
            while (left < right) {
                int mid = (right - left) / 2 + left;
                // 当 mid是偶数 ， mid ^ 1 = mid + 1
                // 当 mid是奇数 ， mid ^ 1 = mid - 1
                if (nums[mid] == nums[mid ^ 1]) {
                    // 结果在右半部分
                    left = mid + 1;
                } else {
                    // 结果在左半部分
                    right = mid;
                }
            }
            return nums[left];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
