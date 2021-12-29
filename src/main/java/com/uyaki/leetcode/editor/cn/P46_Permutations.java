//给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1]
//输出：[[0,1],[1,0]]
// 
//
// 示例 3： 
//
// 
//输入：nums = [1]
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 6 
// -10 <= nums[i] <= 10 
// nums 中的所有整数 互不相同 
// 
// Related Topics 数组 回溯 👍 1706 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 全排列
 */
public class P46_Permutations {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P46_Permutations().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> output = new ArrayList<>();
            for (int num : nums) {
                output.add(num);
            }
            int n = nums.length;
            backtrack(n, output, ans, 0);
            return ans;
        }

        private void backtrack(int n, List<Integer> output, List<List<Integer>> ans, int first) {
            // 所有数都填完了
            if (first == n) {
                ans.add(new ArrayList<>(output));
            }
            for (int i = first; i < n; i++) {
                // 动态维护数组
                Collections.swap(output, first, i);
                // 继续递归填下一个数
                backtrack(n, output, ans, first + 1);
                // 撤销操作
                Collections.swap(output, first, i);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
