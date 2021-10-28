//给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,2]
//输出：
//[[1,1,2],
// [1,2,1],
// [2,1,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 8 
// -10 <= nums[i] <= 10 
// 
// Related Topics 数组 回溯 👍 850 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 全排列 II
 */
public class P47_PermutationsIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P47_PermutationsIi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //看作有 n 个排列成一行的空格，我们需要从左往右依次填入题目给定的 n 个数
        //定义一个标记数组vis来标记已经填过的数字。
        boolean[] vis;

        public List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> perm = new ArrayList<>();
            vis = new boolean[nums.length];
            Arrays.sort(nums);
            backtrack(nums, ans, 0, perm);
            return ans;

        }

        /**
         * 当前排列为 perm，下一个待填入的位置是第 idx 个位置（下标从 0 开始）
         * <p>
         * 如果idx == n，说明已经填完了n个位置，找到了一个可行的解，将perm放入答案数组中，递归结束
         * <p>
         * 如果idx<n，要考虑idx个位置填哪个数字。
         * <p>
         * 定义一个标记数组vis来标记已经填过的数字。
         * 那么在填第 idx 个数的时候我们遍历题目给定的 n 个数，
         * <p>
         * 如果这个数没有被标记过，我们就尝试填入，并将其标记，继续尝试填下一个位置，即调用函数 backtrack(idx + 1, perm)。
         * <p>
         * 搜索回溯的时候要撤销该个位置填的数以及标记，并继续尝试其他没被标记过的数
         */
        private void backtrack(int[] nums, List<List<Integer>> ans, int idx, List<Integer> perm) {
            if (idx == nums.length) {
                ans.add(new ArrayList<>(perm));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                // nums事先排序过，所以可以保证在填第 idx 个数的时候重复数字只会被填入一次
                //
                // 1. 剪枝条件：
                //
                // 2. i > 0 是为了保证 nums[i - 1] 有意义
                //
                // 3. 加上 !vis[i - 1]来去重主要是通过限制一下两个相邻的重复数字的访问顺序
                // (因为 nums[i - 1] 在深度优先遍历的过程中刚刚被撤销选择)
                //举个栗子，对于两个相同的数11，我们将其命名为1a1b, 1a表示第一个1，1b表示第二个1；
                // 那么，不做去重的话，会有两种重复排列 1a1b, 1b1a， 我们只需要取其中任意一种排列；
                // 为了达到这个目的，限制一下1a, 1b访问顺序即可。
                // 比如我们只取1a1b那个排列的话，只有当visit nums[i-1]之后我们才去visit nums[i]，
                // 也就是如果!visited[i-1]的话则continue
                if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])) {
                    continue;
                }
                perm.add(nums[i]);
                vis[i] = true;
                backtrack(nums, ans, idx + 1, perm);
                vis[i] = false;
                // 回复原来状态
                perm.remove(idx);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
