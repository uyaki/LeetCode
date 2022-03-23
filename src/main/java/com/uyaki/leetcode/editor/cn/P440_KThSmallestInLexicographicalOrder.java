//给定整数 n 和 k，返回 [1, n] 中字典序第 k 小的数字。 
//
// 
//
// 示例 1: 
//
// 
//输入: n = 13, k = 2
//输出: 10
//解释: 字典序的排列是 [1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9]，所以第二小的数字是 10。
// 
//
// 示例 2: 
//
// 
//输入: n = 1, k = 1
//输出: 1
// 
//
// 
//
// 提示: 
//
// 
// 1 <= k <= n <= 10⁹ 
// 
// Related Topics 字典树 👍 378 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 字典序的第K小数字
 */
public class P440_KThSmallestInLexicographicalOrder {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P440_KThSmallestInLexicographicalOrder().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findKthNumber(int n, int k) {
            // 第一个字典序
            int cur = 1;
            // 前缀从1开始
            int prefix = 1;
            while (cur < k) {
                // 当前prefix字典序的子节点数
                int count = count(n, prefix);
                if (cur + count > k) {
                    // 找到了，prefix往下一层遍历
                    prefix *= 10;
                    //一直遍历到第 k个
                    cur++;
                } else if (cur + count <= k) {
                    // 不在当前子树
                    // 去下一个prefix遍历
                    prefix++;
                    // 跨过了一整个prefix子树
                    cur += count;
                }
            }
            // cur == k 刚好退出循环，找到了结果
            return prefix;
        }

        /**
         * 以这个前缀为根节点的所有子节点数总和
         *
         * @param n      上界n
         * @param prefix 前缀
         * @return 当前前缀下的所有子节点数总和
         */
        private int count(int n, int prefix) {
            //不断向下层遍历可能一个乘10就溢出了, 所以用long
            long cur = prefix;
            //下一个前缀
            long next = cur + 1;
            int count = 0;
            while (cur <= n) {
                //下一峰头减去此峰头
                // 当 next 的值大于上界 n的时候，那以这个前缀为根节点的十叉树就不是满十叉树
                // 所以不能直接用 count += next - cur
                // 加入 n = 12,算出以1位前缀的子节点数，
                //   1
                // / |  \
                //10 11 12
                // 一共4个节点 。
                // n = 12 ， 如果 count += Math.min(n, next) - cur;
                // 第一次计算 cur=1 ，next=2  count = 1 ,这里是根节点本身
                // cur = 10 next= 20 > n
                // Math.min(n,next)-cur =  12 - 10 =  2 + 根节点 = 3 少了一个。
                // 所以 count += Math.min(n, next) - cur;
                count += Math.min(n + 1, next) - cur;
                // 如果说刚刚prefix是1，next是2，那么现在分别变成10和20
                // 1为前缀的子节点增加10个，十叉树增加一层, 变成了两层

                // 如果说现在prefix是10，next是20，那么现在分别变成100和200，
                // 1为前缀的子节点增加100个，十叉树又增加了一层，变成了三层
                cur *= 10;
                next *= 10; //往下层走
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
