//有一棵特殊的苹果树，一连 n 天，每天都可以长出若干个苹果。在第 i 天，树上会长出 apples[i] 个苹果，这些苹果将会在 days[i] 天后（也就
//是说，第 i + days[i] 天时）腐烂，变得无法食用。也可能有那么几天，树上不会长出新的苹果，此时用 apples[i] == 0 且 days[i] =
//= 0 表示。 
//
// 你打算每天 最多 吃一个苹果来保证营养均衡。注意，你可以在这 n 天之后继续吃苹果。 
//
// 给你两个长度为 n 的整数数组 days 和 apples ，返回你可以吃掉的苹果的最大数目。 
//
// 
//
// 示例 1： 
//
// 输入：apples = [1,2,3,5,2], days = [3,2,1,4,2]
//输出：7
//解释：你可以吃掉 7 个苹果：
//- 第一天，你吃掉第一天长出来的苹果。
//- 第二天，你吃掉一个第二天长出来的苹果。
//- 第三天，你吃掉一个第二天长出来的苹果。过了这一天，第三天长出来的苹果就已经腐烂了。
//- 第四天到第七天，你吃的都是第四天长出来的苹果。
// 
//
// 示例 2： 
//
// 输入：apples = [3,0,0,0,0,2], days = [3,0,0,0,0,2]
//输出：5
//解释：你可以吃掉 5 个苹果：
//- 第一天到第三天，你吃的都是第一天长出来的苹果。
//- 第四天和第五天不吃苹果。
//- 第六天和第七天，你吃的都是第六天长出来的苹果。
// 
//
// 
//
// 提示： 
//
// 
// apples.length == n 
// days.length == n 
// 1 <= n <= 2 * 10⁴ 
// 0 <= apples[i], days[i] <= 2 * 10⁴ 
// 只有在 apples[i] = 0 时，days[i] = 0 才成立 
// 
// Related Topics 贪心 数组 堆（优先队列） 👍 54 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 吃苹果的最大数目
 */
public class P1705_MaximumNumberOfEatenApples {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1705_MaximumNumberOfEatenApples().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        /**
         * 优先队列
         * 执行用时：94 ms, 在所有 Java 提交中击败了 27.11% 的用户
         * 内存消耗：41.9 MB, 在所有 Java 提交中击败了 13.86% 的用户
         */
        public int eatenApples(int[] apples, int[] days) {
            //优先队列
            PriorityQueue<int[]> queue = new PriorityQueue<>(
                    Comparator.comparingInt(o -> o[1])
            );
            int max = 0;
            for (int i = 0; i < apples.length + 20000; i++) {
                // 放入当天的苹果
                if (i < apples.length && apples[i] > 0 && days[i] > 0) {
                    queue.add(new int[]{apples[i], i + days[i]});
                }
                if (!queue.isEmpty()) {
                    int[] cur = queue.poll();
                    // 吃最早过期苹果
                    if (cur[0] > 0 && i < cur[1]) {
                        max++;
                        cur[0]--;
                        // 吃完还剩苹果，放回去
                        if (cur[0] > 0) {
                            queue.offer(cur);
                        }
                    }
                }
                // 如果第二天苹果会腐烂，就移除掉
                while (!queue.isEmpty() && i + 1 == queue.peek()[1]) {
                    queue.poll();
                }
            }
            return max;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
