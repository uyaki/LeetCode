//给你一个整数数组 nums 。如果 nums 的一个子集中，所有元素的乘积可以表示为一个或多个 互不相同的质数 的乘积，那么我们称它为 好子集 。 
//
// 
// 比方说，如果 nums = [1, 2, 3, 4] ：
//
// 
// [2, 3] ，[1, 2, 3] 和 [1, 3] 是 好 子集，乘积分别为 6 = 2*3 ，6 = 2*3 和 3 = 3 。 
// [1, 4] 和 [4] 不是 好 子集，因为乘积分别为 4 = 2*2 和 4 = 2*2 。 
// 
// 
// 
//
// 请你返回 nums 中不同的 好 子集的数目对 10⁹ + 7 取余 的结果。 
//
// nums 中的 子集 是通过删除 nums 中一些（可能一个都不删除，也可能全部都删除）元素后剩余元素组成的数组。如果两个子集删除的下标不同，那么它们被视
//为不同的子集。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3,4]
//输出：6
//解释：好子集为：
//- [1,2]：乘积为 2 ，可以表示为质数 2 的乘积。
//- [1,2,3]：乘积为 6 ，可以表示为互不相同的质数 2 和 3 的乘积。
//- [1,3]：乘积为 3 ，可以表示为质数 3 的乘积。
//- [2]：乘积为 2 ，可以表示为质数 2 的乘积。
//- [2,3]：乘积为 6 ，可以表示为互不相同的质数 2 和 3 的乘积。
//- [3]：乘积为 3 ，可以表示为质数 3 的乘积。
// 
//
// 示例 2： 
//
// 
//输入：nums = [4,2,3,15]
//输出：5
//解释：好子集为：
//- [2]：乘积为 2 ，可以表示为质数 2 的乘积。
//- [2,3]：乘积为 6 ，可以表示为互不相同质数 2 和 3 的乘积。
//- [2,15]：乘积为 30 ，可以表示为互不相同质数 2，3 和 5 的乘积。
//- [3]：乘积为 3 ，可以表示为质数 3 的乘积。
//- [15]：乘积为 15 ，可以表示为互不相同质数 3 和 5 的乘积。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// 1 <= nums[i] <= 30 
// 
// Related Topics 位运算 数组 数学 动态规划 状态压缩 👍 96 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 好子集的数目
 */
public class P1994_TheNumberOfGoodSubsets {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1994_TheNumberOfGoodSubsets().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // 1
        // 2,3,5,6,7,10,11,13,14,15,17,19,21,22,23,26,29,30  这些数均不包含平方因子，因此每个数在好子集中至多出现一次；
        // 4,8,9,12,16,18,20,24,25,27,28 这些数包含平方因子，因此一定不能在好子集中出现
        // 质数
        final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        // 最大数
        final int NUM_MAX = 30;
        final int MOD = 1000000007;

        public int numberOfGoodSubsets(int[] nums) {

            int[] freq = new int[NUM_MAX + 1];
            for (int num : nums) {
				// 计数
                freq[num]++;
            }
			//
            int[] f = new int[1 << PRIMES.length];
            f[0] = 1;
            for (int i = 0; i < freq[1]; ++i) {
                f[0] = f[0] * 2 % MOD;
            }

            for (int i = 2; i <= NUM_MAX; ++i) {
                if (freq[i] == 0) {
                    continue;
                }

                // 检查 i 的每个质因数是否均不超过 1 个
                int subset = 0, x = i;
                boolean check = true;
                for (int j = 0; j < PRIMES.length; ++j) {
                    int prime = PRIMES[j];
                    if (x % (prime * prime) == 0) {
                        check = false;
                        break;
                    }
                    if (x % prime == 0) {
                        subset |= (1 << j);
                    }
                }
                if (!check) {
                    continue;
                }

                // 动态规划
                for (int mask = (1 << PRIMES.length) - 1; mask > 0; --mask) {
                    if ((mask & subset) == subset) {
                        f[mask] = (int) ((f[mask] + ((long) f[mask ^ subset]) * freq[i]) % MOD);
                    }
                }
            }

            int ans = 0;
            for (int mask = 1, maskMax = (1 << PRIMES.length); mask < maskMax; ++mask) {
                ans = (ans + f[mask]) % MOD;
            }

            return ans;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
