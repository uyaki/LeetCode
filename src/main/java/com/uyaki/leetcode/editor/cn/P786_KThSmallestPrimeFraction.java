//给你一个按递增顺序排序的数组 arr 和一个整数 k 。数组 arr 由 1 和若干 素数 组成，且其中所有整数互不相同。 
//
// 对于每对满足 0 < i < j < arr.length 的 i 和 j ，可以得到分数 arr[i] / arr[j] 。 
//
// 那么第 k 个最小的分数是多少呢? 以长度为 2 的整数数组返回你的答案, 这里 answer[0] == arr[i] 且 answer[1] == 
//arr[j] 。 
// 
//
// 示例 1： 
//
// 
//输入：arr = [1,2,3,5], k = 3
//输出：[2,5]
//解释：已构造好的分数,排序后如下所示: 
//1/5, 1/3, 2/5, 1/2, 3/5, 2/3
//很明显第三个最小的分数是 2/5
// 
//
// 示例 2： 
//
// 
//输入：arr = [1,7], k = 1
//输出：[1,7]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= arr.length <= 1000 
// 1 <= arr[i] <= 3 * 10⁴ 
// arr[0] == 1 
// arr[i] 是一个 素数 ，i > 0 
// arr 中的所有数字 互不相同 ，且按 严格递增 排序 
// 1 <= k <= arr.length * (arr.length - 1) / 2 
// 
// Related Topics 数组 二分查找 堆（优先队列） 👍 100 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 第 K 个最小的素数分数
 */
public class P786_KThSmallestPrimeFraction {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P786_KThSmallestPrimeFraction().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 优先队列
         *
         * @param arr
         * @param k
         * @return
         */
        public int[] kthSmallestPrimeFraction(int[] arr, int k) {
            PriorityQueue<int[]> queue = new PriorityQueue<>((x, y) -> arr[x[0]] * arr[y[1]] - arr[y[0]] * arr[x[1]]);
            //当分母为arr[j]时，分子在 arr[0]...arr[j-1]中选
            // 所以 arr[0]/arr[j]...arr[j-1]/arr[j]是严格递增的
            for (int j = 1; j < arr.length; j++) {
                //0/1 0/2 0/3
                queue.offer(new int[]{0, j});
            }
            for (int i = 1; i < k; i++) {
                int[] temp = queue.poll();
                int x = temp[0], y = temp[1];
                if (x + 1 < y) {
                    // 将合法最小值分子的索引+1放入堆中
                    queue.offer(new int[]{x + 1, y});
                }
            }
            return new int[]{arr[queue.peek()[0]], arr[queue.peek()[1]]};
        }

        /**
         * 自定义排序
         *
         * @param arr
         * @param k
         * @return
         */
        public int[] kthSmallestPrimeFraction2(int[] arr, int k) {
            //比较 a/b < c/d 可以用 a*d < b*c 代替
            int n = arr.length;
            List<int[]> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    list.add(new int[]{arr[i], arr[j]});
                }
            }
            list.sort((x, y) -> x[0] * y[1] - y[0] * x[1]);
            return list.get(k - 1);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
