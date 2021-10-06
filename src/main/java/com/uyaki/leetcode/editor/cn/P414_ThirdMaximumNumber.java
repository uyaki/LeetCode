//给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。 
//
// 
//
// 示例 1： 
//
// 
//输入：[3, 2, 1]
//输出：1
//解释：第三大的数是 1 。 
//
// 示例 2： 
//
// 
//输入：[1, 2]
//输出：2
//解释：第三大的数不存在, 所以返回最大的数 2 。
// 
//
// 示例 3： 
//
// 
//输入：[2, 2, 3, 1]
//输出：1
//解释：注意，要求返回第三大的数，是指在所有不同数字中排第三大的数。
//此例中存在两个值为 2 的数，它们都排第二。在所有不同数字中排第三大的数为 1 。 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能设计一个时间复杂度 O(n) 的解决方案吗？ 
// Related Topics 数组 排序 👍 280 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * 第三大的数
 */
public class P414_ThirdMaximumNumber {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P414_ThirdMaximumNumber().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 时间复杂度：O(n)，其中 n 是数组 nums 的长度。由于有序集合的大小至多为 33，插入和删除的时间复杂度可以视作是 O(1) 的，因此时间复杂度为 O(n)。
         * <p>
         * 空间复杂度：O(1)
         */
        public int thirdMax(int[] nums) {
            TreeSet<Integer> s = new TreeSet<Integer>();
            for (int num : nums) {
                s.add(num);
                if (s.size() > 3) {
                    s.remove(s.first());
                }
            }
            return s.size() == 3 ? s.first() : s.last();
        }

        /**
         * 时间复杂度：O(nlogn)，其中 n 是数组 nums 的长度。排序需要 O(nlogn) 的时间。
         * <p>
         * 空间复杂度：O(logn)。排序需要的栈空间为 O(logn)。
         */
        public int thirdMax2(int[] nums) {
            // 题目要求是O(n)，所有sort(复杂度O(nlgn))、优先队列(复杂度O(nlg3))的算法都是不正确的。
            int[] ans = Arrays.stream(nums).distinct().sorted().toArray();
            if (ans.length < 3) {
                return ans[Math.max(ans.length - 1, 0)];
            } else {
                return ans[ans.length - 3];
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
