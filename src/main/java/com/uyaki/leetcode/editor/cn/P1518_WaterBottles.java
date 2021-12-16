//小区便利店正在促销，用 numExchange 个空酒瓶可以兑换一瓶新酒。你购入了 numBottles 瓶酒。 
//
// 如果喝掉了酒瓶中的酒，那么酒瓶就会变成空的。 
//
// 请你计算 最多 能喝到多少瓶酒。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：numBottles = 9, numExchange = 3
//输出：13
//解释：你可以用 3 个空酒瓶兑换 1 瓶酒。
//所以最多能喝到 9 + 3 + 1 = 13 瓶酒。
// 
//
// 示例 2： 
//
// 
//
// 输入：numBottles = 15, numExchange = 4
//输出：19
//解释：你可以用 4 个空酒瓶兑换 1 瓶酒。
//所以最多能喝到 15 + 3 + 1 = 19 瓶酒。
// 
//
// 示例 3： 
//
// 输入：numBottles = 5, numExchange = 5
//输出：6
// 
//
// 示例 4： 
//
// 输入：numBottles = 2, numExchange = 3
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 1 <= numBottles <= 100 
// 2 <= numExchange <= 100 
// 
// Related Topics 数学 模拟 👍 63 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 换酒问题
 */
public class P1518_WaterBottles {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1518_WaterBottles().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了 100.00% 的用户
     * 内存消耗：35.2 MB, 在所有 Java 提交中击败了 59.19% 的用户
     */
    class Solution {
        public int numWaterBottles(int numBottles, int numExchange) {
            int sum = numBottles;
            while (numBottles >= numExchange) {
                //能换的新的酒的数量,这another瓶酒又会产生another个空瓶子
                int another = numBottles / numExchange;
                //总数加上用空瓶子换过来的酒
                sum += another;
                //当前拥有的瓶子数量=换过来的酒喝完剩下的酒瓶子 + 之前换酒剩下的酒瓶子
                numBottles = another + numBottles % numExchange;
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
