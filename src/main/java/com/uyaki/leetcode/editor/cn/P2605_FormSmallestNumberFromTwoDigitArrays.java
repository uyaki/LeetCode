//给你两个只包含 1 到 9 之间数字的数组 nums1 和 nums2 ，每个数组中的元素 互不相同 ，请你返回 最小 的数字，两个数组都 至少 包含这个数
//字的某个数位。
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [4,1,3], nums2 = [5,7]
//输出：15
//解释：数字 15 的数位 1 在 nums1 中出现，数位 5 在 nums2 中出现。15 是我们能得到的最小数字。
// 
//
// 示例 2： 
//
// 输入：nums1 = [3,5,2,6], nums2 = [3,1,7]
//输出：3
//解释：数字 3 的数位 3 在两个数组中都出现了。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums1.length, nums2.length <= 9 
// 1 <= nums1[i], nums2[i] <= 9 
// 每个数组中，元素 互不相同 。 
// 
//
// Related Topics 数组 哈希表 枚举 👍 64 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
* 从两个数字数组里生成最小数字
  */
  public class P2605_FormSmallestNumberFromTwoDigitArrays{
  public static void main(String[] args) {
  //测试代码
  Solution solution = new P2605_FormSmallestNumberFromTwoDigitArrays().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int same = getSame(nums1, nums2);
        if (same > 0) {
            return same;
        }
        int x = Arrays.stream(nums1).min().getAsInt();
        int y = Arrays.stream(nums2).min().getAsInt();
        return Math.min(x * 10 + y, y * 10 + x);
    }

      private int getSame(int[] nums1, int[] nums2) {
        int same = 10;
          Set<Integer> set = new HashSet<>();
          for (int x : nums1) {
              set.add(x);
          }
          for (int x : nums2) {
              if (set.contains(x)) {
                  same = Math.min(same, x);
              }
          }
          return same == 10 ? -1 : same;
      }
  }
//leetcode submit region end(Prohibit modification and deletion)

  }