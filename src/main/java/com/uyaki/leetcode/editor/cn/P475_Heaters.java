//冬季已经来临。 你的任务是设计一个有固定加热半径的供暖器向所有房屋供暖。 
//
// 在加热器的加热半径范围内的每个房屋都可以获得供暖。 
//
// 现在，给出位于一条水平线上的房屋 houses 和供暖器 heaters 的位置，请你找出并返回可以覆盖所有房屋的最小加热半径。 
//
// 说明：所有供暖器都遵循你的半径标准，加热的半径也一样。 
//
// 
//
// 示例 1: 
//
// 
//输入: houses = [1,2,3], heaters = [2]
//输出: 1
//解释: 仅在位置2上有一个供暖器。如果我们将加热半径设为1，那么所有房屋就都能得到供暖。
// 
//
// 示例 2: 
//
// 
//输入: houses = [1,2,3,4], heaters = [1,4]
//输出: 1
//解释: 在位置1, 4上有两个供暖器。我们需要将加热半径设为1，这样所有房屋就都能得到供暖。
// 
//
// 示例 3： 
//
// 
//输入：houses = [1,5], heaters = [2]
//输出：3
// 
//
// 
//
// 提示： 
//
// 
// 1 <= houses.length, heaters.length <= 3 * 10⁴ 
// 1 <= houses[i], heaters[i] <= 10⁹ 
// 
// Related Topics 数组 双指针 二分查找 排序 👍 239 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 供暖器
 */
public class P475_Heaters {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P475_Heaters().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 执行用时：19 ms, 在所有 Java 提交中击败了 27.35% 的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了 78.13% 的用户
     */
    class Solution {
        public int findRadius(int[] houses, int[] heaters) {
            // 选择离该房屋最近的供暖器覆盖该房屋，最近的供暖器和房屋的距离即为该房屋需要的供暖器的最小加热半径。
            // 所有房屋需要的供暖器的最小加热半径中的最大值即为可以覆盖所有房屋的最小加热半径。

            // 在得到下标 i 之后，令 j = i + 1 则 j 是满足 heaters[j]>house 的最小下标。
            // 特别地，当 heaters[n−1]≤house 时，j = n，其中 n 是数组 heaters 的长度
            int ans = 0;
            Arrays.sort(heaters);
            for (int house : houses) {
                int i = binarySearch(heaters, house);
                int j = i + 1;
                // i<0 下标越界
                int leftDistance = i < 0 ? Integer.MAX_VALUE : house - heaters[i];
                // j>=n 下标越界
                int rightDistance = j >= heaters.length ? Integer.MAX_VALUE : heaters[j] - house;
                int curDistance = Math.min(leftDistance, rightDistance);
                ans = Math.max(ans, curDistance);
            }
            return ans;
        }

        public int binarySearch(int[] nums, int target) {
            //对于每个房屋 house，需要在有序数组 heaters 中找到最大的下标 i，使得 heaters[i]≤house
            // 特别地，当 heaters[0] > house 时，i=−1
            int left = 0, right = nums.length - 1;
            if (nums[left] > target) {
                return -1;
            }
            while (left < right) {
                int mid = (right - left + 1) / 2 + left;
                if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid;
                }
            }
            return left;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
