//给定你一个整数数组 nums 
//
// 我们要将 nums 数组中的每个元素移动到 A 数组 或者 B 数组中，使得 A 数组和 B 数组不为空，并且 average(A) == 
//average(B) 。 
//
// 如果可以完成则返回true ， 否则返回 false 。 
//
// 注意：对于数组 arr , average(arr) 是 arr 的所有元素的和除以 arr 长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,2,3,4,5,6,7,8]
//输出: true
//解释: 我们可以将数组分割为 [1,4,5,8] 和 [2,3,6,7], 他们的平均值都是4.5。
// 
//
// 示例 2: 
//
// 
//输入: nums = [3,1]
//输出: false
// 
//
// 
//
// 提示: 
//
// 
// 1 <= nums.length <= 30 
// 0 <= nums[i] <= 10⁴ 
// 
// Related Topics 位运算 数组 数学 动态规划 状态压缩 👍 193 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 数组的均值分割
 */
public class P805_SplitArrayWithSameAverage {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P805_SplitArrayWithSameAverage().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean splitArraySameAverage(int[] nums) {
            // 假设 nums的个数为 n , A 的 个数为 a , B 的个数位 n - a
            // 1. sum(nums) = s
            // 2. sum(A) = s1
            // => s1 / a  = (s - s1) / (n - a)
            // => s1(n-a) = (s - s1)a
            // => s1/a = s/n
            // 即，avg(A) = avg(nums) , 找到一个子数组A，它的平均值 = nums的平均值
            // 将 nums 的每个元素 减去 nums的平均值，问题就转为
            // 在nums中，找到一个子数组，使其和 = 0
            // 为了防止平均数不是整数带来的浮点精度问题，数组中，每个元素 *n
            // s1*n/a = s
            // 将 nums 的每个元素 减去 sum(nums) = s，问题就转为 在nums中，找到一个子数组，使其和 = 0
            // 又因为枚举时间复杂度 O(2^n) ，可以采用折半枚举O(2^(n/2))
            // 将nums分成左右两个部分，
            // 1. 子数组 A 完全在数组 nums 的左半部分
            // 2. 子数组 A 完全在数组 nums 的右半部分
            // 3. 子数组 A 在数组 nums 的左半部分和右半部分
            // 相对的，
            // 1. 求左半部分所有子数组的和 s ,如果存在一个子数组和为0，返回true，否则存入vis
            // 2. 求右半部分所有子数组的和 s ,如果存在一个子数组和为0，返回true
            // 3. 判断 2子数组的和，是否在vis中存在相反数，有，返回true
            //我们不能同时全选左半部分和右半部分，因为这样会导致子数组 B为空，这是不符合题意的。在实现上，我们只需要考虑数组的 n−1 个数。
            int n = nums.length;
            if (n == 1) {
                return false;
            }
            int s = Arrays.stream(nums).sum();
            for (int i = 0; i < n; i++) {
                nums[i] = nums[i] * n - s;
            }
            int m = n >> 1;
            Set<Integer> vis = new HashSet<>();
            for (int i = 1; i < 1 << m; i++) {
                int temp = 0;
                for (int j = 0; j < m; j++) {
                    if (((i >> j) & 1) == 1) {
                        temp += nums[j];
                    }
                }
                if (temp == 0) {
                    return true;
                }
                vis.add(temp);
            }
            for (int i = 1; i < 1 << (n - m); i++) {
                int temp = 0;
                for (int j = 0; j < (n - m); j++) {
                    if (((i >> j) & 1) == 1) {
                        temp += nums[m + j];
                    }
                }
                if (temp == 0 || (i != (1 << (n - m)) - 1) && vis.contains(-temp)) {
                    return true;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
