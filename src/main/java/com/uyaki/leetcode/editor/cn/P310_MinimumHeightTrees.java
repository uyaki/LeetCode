//树是一个无向图，其中任何两个顶点只通过一条路径连接。 换句话说，一个任何没有简单环路的连通图都是一棵树。 
//
// 给你一棵包含 n 个节点的树，标记为 0 到 n - 1 。给定数字 n 和一个有 n - 1 条无向边的 edges 列表（每一个边都是一对标签），其中
// edges[i] = [ai, bi] 表示树中节点 ai 和 bi 之间存在一条无向边。 
//
// 可选择树中任何一个节点作为根。当选择节点 x 作为根节点时，设结果树的高度为 h 。在所有可能的树中，具有最小高度的树（即，min(h)）被称为 最小高度
//树 。 
//
// 请你找到所有的 最小高度树 并按 任意顺序 返回它们的根节点标签列表。 
//树的 高度 是指根节点和叶子节点之间最长向下路径上边的数量。
//
// 
//
// 示例 1： 
//
// 
//输入：n = 4, edges = [[1,0],[1,2],[1,3]]
//输出：[1]
//解释：如图所示，当根是标签为 1 的节点时，树的高度是 1 ，这是唯一的最小高度树。 
//
// 示例 2： 
//
// 
//输入：n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]
//输出：[3,4]
// 
//
// 
//
// 
// 
//
// 提示： 
//
// 
// 1 <= n <= 2 * 10⁴ 
// edges.length == n - 1 
// 0 <= ai, bi < n 
// ai != bi 
// 所有 (ai, bi) 互不相同 
// 给定的输入 保证 是一棵树，并且 不会有重复的边 
// 
// Related Topics 深度优先搜索 广度优先搜索 图 拓扑排序 👍 472 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 最小高度树
 */
public class P310_MinimumHeightTrees {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P310_MinimumHeightTrees().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
		/**
		 * -----无向无环图A在删除度为1的结点后得到无向无环图B。
		 * 可以证明，图A所成最小高度树TreeA是由图B所成的最小高度树TreeB接上被删除结点后构成的。
		 * 反证法：图B所成的树TreeB如果不是最小高度树，
		 * 那么存在图B的最小高度树TreeB’，TreeB’的高度比TreeB更小。
		 * 那么TreeB’接上被删除结点后高度比TreeA更小，这与TreeA是最小高度树矛盾。
		 *
		 * -----既然图A的最小高度树是由图B的最小高度树接上被删除的结点所成。
		 * 那么图A的最小高度树的根结点与图B的最小高度树的根结点是相同的，
		 * 因为，接上被删除的结点不会成为根结点，否则相比不成为根结点的高度还要高1。
		 * 因此找图A的最小高度树的根结点演变为找图B的最小高度树的根结点。
		 */
        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            // 我们从边缘开始，先找到所有出度为1的节点，
            // 然后把所有出度为1的节点进队列，然后不断地bfs，
            // 最后找到的就是两边同时向中间靠近的节点，
            // 那么这个中间节点就相当于把整个距离二分了，
            // 那么它当然就是到两边距离最小的点啦，
            // 也就是到其他叶子节点最近的节点了。
			List<Integer> ans = new ArrayList<>();
			// 如果只有一个节点，它必然是根节点
			if(n == 1){
				ans.add(0);
				return ans;
			}
			// 建立节点的出度表 (即这个节点上有多少根线，出度为 1，说明他是叶子节点 )
			int[] degree = new int[n];
			// 建立图关系
			List<List<Integer>> graph = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				graph.add(new ArrayList<>());
			}
			for (int[] edge : edges) {
				// 连接别人或者被别人连接都算 1
				degree[edge[0]]++;
				degree[edge[1]]++;
				graph.get(edge[0]).add(edge[1]);
				graph.get(edge[1]).add(edge[0]);
			}
			// 建立队列
			Queue<Integer> queue = new LinkedList<>();
			// 把叶子节点加入队列
			for (int i = 0; i < n; i++) {
				if (degree[i] == 1) {
					queue.offer(i);
				}
			}

			while (!queue.isEmpty()) {
				// 每次循环都要保存一个新的结果集，这样最后的就是最小高度结果
				ans = new ArrayList<>();
				int size = queue.size();
				for (int i = 0; i < size; i++) {
					// 取出1个值
					int cur = queue.poll();
					// 每次循环都会新建一个 ans，所以最后保存的就是最后一个状态下的叶子节点
					// 想象一下图，每层遍历完，都会把该层（也就是叶子节点层）这一层从队列中移除掉
					// 图变成了一个剔除一圈叶子节点的缩小的图
					ans.add(cur);
					List<Integer> neighbors = graph.get(cur);
					// 这里就是经典的bfs了，把当前节点的相邻接点都拿出来
					// 把它们的出度都减1，因为当前节点已经不存在了
					// 它的相邻节点们就有可能变成叶子节点
					for (int neighbor : neighbors) {
						degree[neighbor]--;
						if(degree[neighbor]==1){
							//如果是叶子节点就入队
							queue.offer(neighbor);
						}
					}
				}
			}
			return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
