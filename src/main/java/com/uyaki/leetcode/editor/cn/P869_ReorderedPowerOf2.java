//给定正整数 N ，我们按任何顺序（包括原始顺序）将数字重新排序，注意其前导数字不能为零。 
//
// 如果我们可以通过上述方式得到 2 的幂，返回 true；否则，返回 false。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入：1
//输出：true
// 
//
// 示例 2： 
//
// 输入：10
//输出：false
// 
//
// 示例 3： 
//
// 输入：16
//输出：true
// 
//
// 示例 4： 
//
// 输入：24
//输出：false
// 
//
// 示例 5： 
//
// 输入：46
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= N <= 10^9 
// 
// Related Topics 数学 计数 枚举 排序 👍 120 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 重新排序得到 2 的幂
 */
public class P869_ReorderedPowerOf2 {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P869_ReorderedPowerOf2().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        boolean[] vis;

        public boolean reorderedPowerOf2(int n) {
            char[] nums = Integer.toString(n).toCharArray();
            Arrays.sort(nums);
            vis = new boolean[nums.length];
            return backtrack(nums, 0, 0);
        }

        public boolean backtrack(char[] nums, int idx, int num) {
            if (idx == nums.length) {
                // P231 2的幂次方
                return (num & (num - 1)) == 0;
            }
            // P47. 全排列 II
            for (int i = 0; i < nums.length; ++i) {
                // 不能有前导零
                if ((num == 0 && nums[i] == '0') || vis[i] || (i > 0 && !vis[i - 1] && nums[i] == nums[i - 1])) {
                    continue;
                }
                vis[i] = true;
                if (backtrack(nums, idx + 1, num * 10 + nums[i] - '0')) {
                    return true;
                }
                vis[i] = false;
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
