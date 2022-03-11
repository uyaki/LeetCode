//给你一棵根节点为 0 的 二叉树 ，它总共有 n 个节点，节点编号为 0 到 n - 1 。同时给你一个下标从 0 开始的整数数组 parents 表示这棵
//树，其中 parents[i] 是节点 i 的父节点。由于节点 0 是根，所以 parents[0] == -1 。 
//
// 一个子树的 大小 为这个子树内节点的数目。每个节点都有一个与之关联的 分数 。求出某个节点分数的方法是，将这个节点和与它相连的边全部 删除 ，剩余部分是若
//干个 非空 子树，这个节点的 分数 为所有这些子树 大小的乘积 。 
//
// 请你返回有 最高得分 节点的 数目 。 
//
// 
//
// 示例 1: 
//
// 
//
// 输入：parents = [-1,2,0,2,0]
//输出：3
//解释：
//- 节点 0 的分数为：3 * 1 = 3
//- 节点 1 的分数为：4 = 4
//- 节点 2 的分数为：1 * 1 * 2 = 2
//- 节点 3 的分数为：4 = 4
//- 节点 4 的分数为：4 = 4
//最高得分为 4 ，有三个节点得分为 4 （分别是节点 1，3 和 4 ）。
// 
//
// 示例 2： 
//
// 
//
// 输入：parents = [-1,2,0]
//输出：2
//解释：
//- 节点 0 的分数为：2 = 2
//- 节点 1 的分数为：2 = 2
//- 节点 2 的分数为：1 * 1 = 1
//最高分数为 2 ，有两个节点分数为 2 （分别为节点 0 和 1 ）。
// 
//
// 
//
// 提示： 
//
// 
// n == parents.length 
// 2 <= n <= 10⁵ 
// parents[0] == -1 
// 对于 i != 0 ，有 0 <= parents[i] <= n - 1 
// parents 表示一棵二叉树。 
// 
// Related Topics 树 深度优先搜索 数组 二叉树 👍 90 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 统计最高分的节点数目
 */
public class P2049_CountNodesWithTheHighestScore {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P2049_CountNodesWithTheHighestScore().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // 节点的直接子节点
        List<Integer>[] childs;
        int n;
        long maxScore = 0;
        int count = 0;

        public int countHighestScoreNodes(int[] parents) {
            n = parents.length;
            childs = new List[n];
            for (int i = 0; i < n; i++) {
                childs[i] = new ArrayList<>();
            }
            for (int i = 0; i < n; i++) {
                if (parents[i] != -1) {
                    childs[parents[i]].add(i);
                }
            }
            dfs(0);
            return count;
        }

        private int dfs(int index) {
            long score = 1;
            // 节点本身算 1
            int sum = 1;
            // 有3钟情况
            // 1. 左子树
            // 2. 右子树
            // 3. 整棵树 - （自己本身+所有子树）
            // 注意：根节点不存在情况3
            for (int num : childs[index]) {
                int temp = dfs(num);
                score *= temp;
                //累加这个节点的子节点的大小
                sum += temp;
            }
            //根节点没有这种子树（把以这个节点为根结点的子树移除所形成的子树）
            if (index != 0) {
                //n-sum为把以这个节点为根结点的子树移除所形成的子树的大小
                score *= n - sum;
            }
            if (maxScore == score) {
                count++;
            } else if (maxScore < score) {
                maxScore = score;
                count = 1;
            }
            //dfs返回值是以这个节点为根结点的子树的大小
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
