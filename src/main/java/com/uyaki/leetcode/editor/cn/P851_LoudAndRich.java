//有一组 n 个人作为实验对象，从 0 到 n - 1 编号，其中每个人都有不同数目的钱，以及不同程度的安静值（quietness）。为了方便起见，我们将编号
//为 x 的人简称为 "person x "。 
//
// 给你一个数组 richer ，其中 richer[i] = [ai, bi] 表示 person ai 比 person bi 更有钱。另给你一个整数数组
// quiet ，其中 quiet[i] 是 person i 的安静值。richer 中所给出的数据 逻辑自恰（也就是说，在 person x 比 
//person y 更有钱的同时，不会出现 person y 比 person x 更有钱的情况 ）。 
//
// 现在，返回一个整数数组 answer 作为答案，其中 answer[x] = y 的前提是，在所有拥有的钱肯定不少于 person x 的人中，
//person y 是最安静的人（也就是安静值 quiet[y] 最小的人）。 
//
// 
//
// 示例 1： 
//
// 
//输入：richer = [[1,0],[2,1],[3,1],[3,7],[4,3],[5,3],[6,3]], quiet = [3,2,5,4,6,1,
//7,0]
//输出：[5,5,2,5,4,5,6,7]
//解释： 
//answer[0] = 5，
//person 5 比 person 3 有更多的钱，person 3 比 person 1 有更多的钱，person 1 比 person 0 有更多的钱。
//
//唯一较为安静（有较低的安静值 quiet[x]）的人是 person 7，
//但是目前还不清楚他是否比 person 0 更有钱。
//answer[7] = 7，
//在所有拥有的钱肯定不少于 person 7 的人中（这可能包括 person 3，4，5，6 以及 7），
//最安静（有较低安静值 quiet[x]）的人是 person 7。
//其他的答案也可以用类似的推理来解释。
// 
//
// 示例 2： 
//
// 
//输入：richer = [], quiet = [0]
//输出：[0]
// 
// 
//
// 提示： 
//
// 
// n == quiet.length 
// 1 <= n <= 500 
// 0 <= quiet[i] < n 
// quiet 的所有值 互不相同 
// 0 <= richer.length <= n * (n - 1) / 2 
// 0 <= ai, bi < n 
// ai != bi 
// richer 中的所有数对 互不相同 
// 对 richer 的观察在逻辑上是一致的 
// 
// Related Topics 深度优先搜索 图 拓扑排序 数组 👍 70 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 喧闹和富有
 */
public class P851_LoudAndRich {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P851_LoudAndRich().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了 89.30% 的用户
     * 内存消耗：46.4 MB, 在所有 Java 提交中击败了 79.54% 的用户
     */
    class Solution {
        public int[] loudAndRich(int[][] richer, int[] quiet) {
            int n = quiet.length;
            List<Integer>[] g = new List[n];
            for (int i = 0; i < n; ++i) {
                g[i] = new ArrayList<>();
            }
            for (int[] r : richer) {
                // 从 bi 到 ai连一条有向边 ，r[1] < r[0] 所以，任意 x 出发，g[x]的值都比 x 更有钱
                g[r[1]].add(r[0]);
            }

            int[] ans = new int[n];
            Arrays.fill(ans, -1);
            for (int i = 0; i < n; ++i) {
                dfs(i, quiet, g, ans);
            }
            return ans;
        }

        public void dfs(int x, int[] quiet, List<Integer>[] g, int[] ans) {
            if (ans[x] != -1) {
                return;
            }
            ans[x] = x;
            for (int y : g[x]) {
                dfs(y, quiet, g, ans);
                if (quiet[ans[y]] < quiet[ans[x]]) {
                    ans[x] = ans[y];
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
