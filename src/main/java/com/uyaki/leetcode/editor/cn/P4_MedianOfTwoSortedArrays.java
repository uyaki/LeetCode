//给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 示例 3： 
//
// 
//输入：nums1 = [0,0], nums2 = [0,0]
//输出：0.00000
// 
//
// 示例 4： 
//
// 
//输入：nums1 = [], nums2 = [1]
//输出：1.00000
// 
//
// 示例 5： 
//
// 
//输入：nums1 = [2], nums2 = []
//输出：2.00000
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -10⁶ <= nums1[i], nums2[i] <= 10⁶ 
// 
//
// 
//
// 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？ 
// Related Topics 数组 二分查找 分治 👍 4510 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 寻找两个正序数组的中位数
 */
public class P4_MedianOfTwoSortedArrays {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length;
            int n = nums2.length;
            // m+n为奇数，中位数下标为（m+n）/2
            // m+n为偶数，中位数下标为（m+n）/2 、 (m+n)/2+1的平均值
            if (m > n) {
                // 保证nums1为短的数组
                return findMedianSortedArrays(nums2, nums1);
            }
            int left = 0, right = m;
            int leftMax = 0, rightMin = 0;
            while (left <= right) {
                //左边数组包含nums1[0 .. i-1] 和 nums2[0 .. j-1]
                //右边数组包含nums1[i .. m-1] 和 nums2[j .. n-1]
                int i = (left + right) / 2;
                // 两个数组长度之和为偶数时，当在长度之和上+1时，由于整除是向下取整，所以不会改变结果
                // 两个数组长度之和为奇数时，按照分割线的左边比右边多一个元素的要求，此时在长度之和上+1，就会被2整除，会在原来的数的基础上+1，于是多出来的那个1就是左边比右边多出来的一个元素
                int j = (m + n + 1) / 2 - i;
                // nums_im1, nums_i, nums_jm1, nums_j 分别表示 nums1[i-1], nums1[i], nums2[j-1], nums2[j]
                int nums_im1 = (i == 0 ? Integer.MIN_VALUE : nums1[i - 1]);
                int nums_i = (i == m ? Integer.MAX_VALUE : nums1[i]);
                int nums_jm1 = (j == 0 ? Integer.MIN_VALUE : nums2[j - 1]);
                int nums_j = (j == n ? Integer.MAX_VALUE : nums2[j]);
                if (nums_im1 <= nums_j) {
                    leftMax = Math.max(nums_im1, nums_jm1);
                    rightMin = Math.min(nums_i, nums_j);
                    left = i + 1;
                } else {
                    right = i - 1;
                }

            }
            return (m + n) % 2 == 0 ? (leftMax + rightMin) / 2.0 : leftMax;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
