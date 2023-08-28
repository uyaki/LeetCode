//给出一个含有不重复整数元素的数组 arr ，每个整数 arr[i] 均大于 1。 
//
// 用这些整数来构建二叉树，每个整数可以使用任意次数。其中：每个非叶结点的值应等于它的两个子结点的值的乘积。 
//
// 满足条件的二叉树一共有多少个？答案可能很大，返回 对 10⁹ + 7 取余 的结果。 
//
// 
//
// 示例 1: 
//
// 
//输入: arr = [2, 4]
//输出: 3
//解释: 可以得到这些二叉树: [2], [4], [4, 2, 2] 
//
// 示例 2: 
//
// 
//输入: arr = [2, 4, 5, 10]
//输出: 7
//解释: 可以得到这些二叉树: [2], [4], [5], [10], [4, 2, 2], [10, 2, 5], [10, 5, 2]. 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 1000 
// 2 <= arr[i] <= 10⁹ 
// arr 中的所有值 互不相同 
// 
//
// Related Topics 数组 哈希表 动态规划 排序 👍 109 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 带因子的二叉树
 */
public class P823_BinaryTreesWithFactors {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P823_BinaryTreesWithFactors().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numFactoredBinaryTrees(int[] arr) {
            // 使用 dp[i] 保存以 arr[i]arr[i] 为根结点的带因子的二叉树数目。
            // 假设 存在 0≤left≤right<i，使 arr[left]×arr[right]=arr[i]成立
            // 那么 arr[left] 和 arr[right]为根结点的带因子二叉树数目分别为 dp[left] 和 dp[right]
            // 不难推导出arr[left] 和 arr[right]作为 arr[i] 的两个子结点时，带因子二叉树数目 s 为
            // left=right 时，s=dp[left]×dp[right]
            // left≠right 时，两个节点可以交换，s=dp[left]×dp[right]*2
            // 当arr[i]没有子节点时，对应1个带因子二叉树
            // dp[i]=1+∑[(left,right)∈U] dp[left]×dp[right]×(1+f(left,right))
            // f(left,right) 的取值为当 left=right时，值为 0，否则值为 1
            Arrays.sort(arr);
            int n = arr.length;
            long[] dp = new long[n];
            long ans = 0, mod = 1000000007;
            for (int i = 0; i < n; i++) {
                dp[i] = 1;
                for (int left = 0, right = i - 1; left <= right; left++) {
                    while (right >= left && (long) arr[left] * arr[right] > arr[i]) {
                        right--;
                    }
                    if (right >= left && (long) arr[left] * arr[right] == arr[i]) {
                        dp[i] = (dp[i] + dp[left]*dp[right] * (left == right ? 1 : 2)) % mod;
                    }
                }
                ans = (ans + dp[i]) % mod;
            }
            return (int) ans;
        }

    }

//leetcode submit region end(Prohibit modification and deletion)
}