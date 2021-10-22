//给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：[3,2,3]
//输出：[3] 
//
// 示例 2： 
//
// 
//输入：nums = [1]
//输出：[1]
// 
//
// 示例 3： 
//
// 
//输入：[1,1,1,3,3,2,2,2]
//输出：[1,2] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 5 * 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// 
//
// 
//
// 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1)的算法解决此问题。 
// Related Topics 数组 哈希表 计数 排序 👍 501 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 求众数 II
 */
public class P229_MajorityElementIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P229_MajorityElementIi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 摩尔投票法
         *
         * @param nums nums
         * @return ans
         */
        public List<Integer> majorityElement(int[] nums) {
            // 投票阶段
            int num1 = 0, num2 = 0, count1 = 0, count2 = 0;
            for (int num : nums) {
                if (count1 > 0 && num == num1) {
                    count1++;
                } else if (count2 > 0 && num == num2) {
                    count2++;
                } else if (count1 == 0) {
                    // 选择第一个数
                    num1 = num;
                    count1++;
                } else if (count2 == 0) {
                    // 选择第二个数
                    num2 = num;
                    count2++;
                } else {
                    count1--;
                    count2--;
                }
            }
            // 计数阶段
            int count3 = 0, count4 = 0;
            for (int num : nums) {
                if (count1 > 0 && num == num1) {
                    count3++;
                }
                if (count2 > 0 && num == num2) {
                    count4++;
                }
            }
            // 结果封装
            List<Integer> ans = new ArrayList<>();
            if (count1 > 0 && count3 > nums.length / 3) {
                ans.add(num1);
            }
            if (count2 > 0 && count4 > nums.length / 3) {
                ans.add(num2);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
