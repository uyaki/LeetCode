//给你一个由 n 个节点（下标从 0 开始）组成的无向加权图，该图由一个描述边的列表组成，其中 edges[i] = [a, b] 表示连接节点 a 和 b 
//的一条无向边，且该边遍历成功的概率为 succProb[i] 。 
//
// 指定两个节点分别作为起点 start 和终点 end ，请你找出从起点到终点成功概率最大的路径，并返回其成功概率。 
//
// 如果不存在从 start 到 end 的路径，请 返回 0 。只要答案与标准答案的误差不超过 1e-5 ，就会被视作正确答案。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.2], start = 0, 
//end = 2
//输出：0.25000
//解释：从起点到终点有两条路径，其中一条的成功概率为 0.2 ，而另一条为 0.5 * 0.5 = 0.25
// 
//
// 示例 2： 
//
// 
//
// 输入：n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.3], start = 0, 
//end = 2
//输出：0.30000
// 
//
// 示例 3： 
//
// 
//
// 输入：n = 3, edges = [[0,1]], succProb = [0.5], start = 0, end = 2
//输出：0.00000
//解释：节点 0 和 节点 2 之间不存在路径
// 
//
// 
//
// 提示： 
//
// 
// 2 <= n <= 10^4 
// 0 <= start, end < n 
// start != end 
// 0 <= a, b < n 
// a != b 
// 0 <= succProb.length == edges.length <= 2*10^4 
// 0 <= succProb[i] <= 1 
// 每两个节点之间最多有一条边 
// 
// Related Topics 图 最短路 堆（优先队列） 👍 72 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 概率最大的路径
 */
public class P1514_PathWithMaximumProbability {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
            List<List<Pair>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            // 将点和边的关系存入graph
            for (int i = 0; i < edges.length; i++) {
                int[] e = edges[i];
                graph.get(e[0]).add(new Pair(succProb[i], e[1]));
                graph.get(e[1]).add(new Pair(succProb[i], e[0]));
            }

            PriorityQueue<Pair> que = new PriorityQueue<>();
            double[] prob = new double[n];
            //添加首节点
            que.offer(new Pair(1, start));
            // 边概率数组
            prob[start] = 1;
            while (!que.isEmpty()) {
                // 这是一个优先队列，优先队列有自动排序功能，所以从队头出队列的是概率最大的那一个
                Pair pair = que.poll();
                double pr = pair.probability;
                // 节点值
                int node = pair.node;
                // 可能同一个节点放进去多次了，可能出队的节点是当前队列中最小的，但是在当前的prob数组中其值可能已经被更新了，并不是最小的，所以要判断
                if (pr < prob[node]) {
                    continue;
                }
                for (Pair pairNext : graph.get(node)) {
                    double prNext = pairNext.probability;
                    int nodeNext = pairNext.node;
                    if (prob[nodeNext] < prob[node] * prNext) {
                        prob[nodeNext] = prob[node] * prNext;
                        que.offer(new Pair(prob[nodeNext], nodeNext));
                    }
                }
            }
            return prob[end];
        }

        class Pair implements Comparable<Pair> {
            double probability;
            int node;

            public Pair(double probability, int node) {
                this.probability = probability;
                this.node = node;
            }

            public int compareTo(Pair pair2) {
                if (this.probability == pair2.probability) {
                    return this.node - pair2.node;
                } else {
                    return this.probability - pair2.probability > 0 ? -1 : 1;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
