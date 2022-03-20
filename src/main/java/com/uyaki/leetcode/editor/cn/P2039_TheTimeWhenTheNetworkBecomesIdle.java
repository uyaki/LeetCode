//给你一个有 n 个服务器的计算机网络，服务器编号为 0 到 n - 1 。同时给你一个二维整数数组 edges ，其中 edges[i] = [ui, 
//vi] 表示服务器 ui 和 vi 之间有一条信息线路，在 一秒 内它们之间可以传输 任意 数目的信息。再给你一个长度为 n 且下标从 0 开始的整数数组 
//patience 。 
//
// 题目保证所有服务器都是 相通 的，也就是说一个信息从任意服务器出发，都可以通过这些信息线路直接或间接地到达任何其他服务器。 
//
// 编号为 0 的服务器是 主 服务器，其他服务器为 数据 服务器。每个数据服务器都要向主服务器发送信息，并等待回复。信息在服务器之间按 最优 线路传输，也就
//是说每个信息都会以 最少时间 到达主服务器。主服务器会处理 所有 新到达的信息并 立即 按照每条信息来时的路线 反方向 发送回复信息。 
//
// 在 0 秒的开始，所有数据服务器都会发送各自需要处理的信息。从第 1 秒开始，每 一秒最 开始 时，每个数据服务器都会检查它是否收到了主服务器的回复信息（
//包括新发出信息的回复信息）： 
//
// 
// 如果还没收到任何回复信息，那么该服务器会周期性 重发 信息。数据服务器 i 每 patience[i] 秒都会重发一条信息，也就是说，数据服务器 i 在上
//一次发送信息给主服务器后的 patience[i] 秒 后 会重发一条信息给主服务器。 
// 否则，该数据服务器 不会重发 信息。 
// 
//
// 当没有任何信息在线路上传输或者到达某服务器时，该计算机网络变为 空闲 状态。 
//
// 请返回计算机网络变为 空闲 状态的 最早秒数 。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：edges = [[0,1],[1,2]], patience = [0,2,1]
//输出：8
//解释：
//0 秒最开始时，
//- 数据服务器 1 给主服务器发出信息（用 1A 表示）。
//- 数据服务器 2 给主服务器发出信息（用 2A 表示）。
//
//1 秒时，
//- 信息 1A 到达主服务器，主服务器立刻处理信息 1A 并发出 1A 的回复信息。
//- 数据服务器 1 还没收到任何回复。距离上次发出信息过去了 1 秒（1 < patience[1] = 2），所以不会重发信息。
//- 数据服务器 2 还没收到任何回复。距离上次发出信息过去了 1 秒（1 == patience[2] = 1），所以它重发一条信息（用 2B 表示）。
//
//2 秒时，
//- 回复信息 1A 到达服务器 1 ，服务器 1 不会再重发信息。
//- 信息 2A 到达主服务器，主服务器立刻处理信息 2A 并发出 2A 的回复信息。
//- 服务器 2 重发一条信息（用 2C 表示）。
//...
//4 秒时，
//- 回复信息 2A 到达服务器 2 ，服务器 2 不会再重发信息。
//...
//7 秒时，回复信息 2D 到达服务器 2 。
//
//从第 8 秒开始，不再有任何信息在服务器之间传输，也不再有信息到达服务器。
//所以第 8 秒是网络变空闲的最早时刻。
// 
//
// 示例 2： 
//
// 
//
// 输入：edges = [[0,1],[0,2],[1,2]], patience = [0,10,10]
//输出：3
//解释：数据服务器 1 和 2 第 2 秒初收到回复信息。
//从第 3 秒开始，网络变空闲。
// 
//
// 
//
// 提示： 
//
// 
// n == patience.length 
// 2 <= n <= 10⁵ 
// patience[0] == 0 
// 对于 1 <= i < n ，满足 1 <= patience[i] <= 10⁵ 
// 1 <= edges.length <= min(10⁵, n * (n - 1) / 2) 
// edges[i].length == 2 
// 0 <= ui, vi < n 
// ui != vi 
// 不会有重边。 
// 每个服务器都直接或间接与别的服务器相连。 
// 
// Related Topics 广度优先搜索 图 数组 👍 77 👎 0


package com.uyaki.leetcode.editor.cn;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 网络空闲的时刻
 */
public class P2039_TheTimeWhenTheNetworkBecomesIdle {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P2039_TheTimeWhenTheNetworkBecomesIdle().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int networkBecomesIdle(int[][] edges, int[] patience) {
            // 本题的实质是求解图的最短路径
            // 节点 v 每发送一次消息后，经过 2×dist 秒才能收到回复。
            // 由于节点 v 在未收到节点 0 的回复时，会周期性每 patience[v] 秒发送一次消息，
            // 一旦收到来自节点 0 的回复后就停止发送消息，需要分以下两种情况进行讨论
            // 1. 2*dist <= patience[v] , v 还未开始发送第二次消息就已收到回复，
            //  - 因此节点 v 只会发送一次消息，则此时节点 v 变为空闲的时间为 2×dist+1。
            // 2. 2*dist > patience[v]
            // - 在 [1,2*dist)时间内，最多再次发送 ⌊(2*dist-1)/ patience[v]⌋ 次消息
            // - 最后一次发消息的时间为 patience[v] * ⌊(2*dist-1)/ patience[v]⌋
            // - 最后一次收到回复的时间为 patience[v] * ⌊(2*dist-1)/ patience[v]⌋ + 2*dist
            // - 变为空闲的时间为 patience[v] * ⌊(2*dist-1)/ patience[v]⌋ + 2*dist + 1
            // 当 2*dist <= patience[v] 时，⌊(2*dist-1)/ patience[v]⌋  = 0 ，所以1、2实际上可以合并

            // n为服务器数量
            int n = patience.length;
            List<Integer>[] connect = new List[n];
            for (int i = 0; i < n; i++) {
                connect[i] = new ArrayList<>();
            }
            boolean[] visit = new boolean[n];
            // 构建互通数据
            for (int[] edge : edges) {
                connect[edge[0]].add(edge[1]);
                connect[edge[1]].add(edge[0]);
            }
            Queue<Integer> queue = new ArrayDeque<>();
            queue.offer(0);
            visit[0] = true;
            int dist = 1;
            int ans = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int curr = queue.poll();
                    for (int node : connect[curr]) {
                        if (visit[node]) {
                            continue;
                        }
                        queue.offer(node);
                        int time = patience[node] * ((2 * dist - 1) / patience[node]) + 2 * dist + 1;
                        ans = Math.max(ans, time);
                        visit[node] = true;
                    }
                }
                dist++;
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
