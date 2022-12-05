////你有一辆货运卡车，你需要用这一辆车把一些箱子从仓库运送到码头。这辆卡车每次运输有 箱子数目的限制 和 总重量的限制 。 
////
//// 给你一个箱子数组 boxes 和三个整数 portsCount, maxBoxes 和 maxWeight ，其中 boxes[i] = [
//portsi,
//// weighti] 。 
////
//// 
//// portsi 表示第 i 个箱子需要送达的码头， weightsi 是第 i 个箱子的重量。 
//// portsCount 是码头的数目。 
//// maxBoxes 和 maxWeight 分别是卡车每趟运输箱子数目和重量的限制。 
//// 
////
//// 箱子需要按照 数组顺序 运输，同时每次运输需要遵循以下步骤： 
////
//// 
//// 卡车从 boxes 队列中按顺序取出若干个箱子，但不能违反 maxBoxes 和 maxWeight 限制。 
//// 对于在卡车上的箱子，我们需要 按顺序 处理它们，卡车会通过 一趟行程 将最前面的箱子送到目的地码头并卸货。如果卡车已经在对应的码头，那么不需要 额外行
//程 
////，箱子也会立马被卸货。 
//// 卡车上所有箱子都被卸货后，卡车需要 一趟行程 回到仓库，从箱子队列里再取出一些箱子。 
//// 
////
//// 卡车在将所有箱子运输并卸货后，最后必须回到仓库。 
////
//// 请你返回将所有箱子送到相应码头的 最少行程 次数。 
////
//// 
////
//// 示例 1： 
////
//// 输入：boxes = [[1,1],[2,1],[1,1]], portsCount = 2, maxBoxes = 3, maxWeight = 3
//
////输出：4
////解释：最优策略如下：
////- 卡车将所有箱子装上车，到达码头 1 ，然后去码头 2 ，然后再回到码头 1 ，最后回到仓库，总共需要 4 趟行程。
////所以总行程数为 4 。
////注意到第一个和第三个箱子不能同时被卸货，因为箱子需要按顺序处理（也就是第二个箱子需要先被送到码头 2 ，然后才能处理第三个箱子）。
//// 
////
//// 示例 2： 
////
//// 输入：boxes = [[1,2],[3,3],[3,1],[3,1],[2,4]], portsCount = 3, maxBoxes = 3, 
////maxWeight = 6
////输出：6
////解释：最优策略如下：
////- 卡车首先运输第一个箱子，到达码头 1 ，然后回到仓库，总共 2 趟行程。
////- 卡车运输第二、第三、第四个箱子，到达码头 3 ，然后回到仓库，总共 2 趟行程。
////- 卡车运输第五个箱子，到达码头 3 ，回到仓库，总共 2 趟行程。
////总行程数为 2 + 2 + 2 = 6 。
//// 
////
//// 示例 3： 
////
//// 输入：boxes = [[1,4],[1,2],[2,1],[2,1],[3,2],[3,4]], portsCount = 3, maxBoxes 
//= 
////6, maxWeight = 7
////输出：6
////解释：最优策略如下：
////- 卡车运输第一和第二个箱子，到达码头 1 ，然后回到仓库，总共 2 趟行程。
////- 卡车运输第三和第四个箱子，到达码头 2 ，然后回到仓库，总共 2 趟行程。
////- 卡车运输第五和第六个箱子，到达码头 3 ，然后回到仓库，总共 2 趟行程。
////总行程数为 2 + 2 + 2 = 6 。
//// 
////
//// 示例 4： 
////
//// 输入：boxes = [[2,4],[2,5],[3,1],[3,2],[3,7],[3,1],[4,4],[1,3],[5,2]], 
////portsCount = 5, maxBoxes = 5, maxWeight = 7
////输出：14
////解释：最优策略如下：
////- 卡车运输第一个箱子，到达码头 2 ，然后回到仓库，总共 2 趟行程。
////- 卡车运输第二个箱子，到达码头 2 ，然后回到仓库，总共 2 趟行程。
////- 卡车运输第三和第四个箱子，到达码头 3 ，然后回到仓库，总共 2 趟行程。
////- 卡车运输第五个箱子，到达码头 3 ，然后回到仓库，总共 2 趟行程。
////- 卡车运输第六和第七个箱子，到达码头 3 ，然后去码头 4 ，然后回到仓库，总共 3 趟行程。
////- 卡车运输第八和第九个箱子，到达码头 1 ，然后去码头 5 ，然后回到仓库，总共 3 趟行程。
////总行程数为 2 + 2 + 2 + 2 + 3 + 3 = 14 。
//// 
////
//// 
////
//// 提示： 
////
//// 
//// 1 <= boxes.length <= 10⁵ 
//// 1 <= portsCount, maxBoxes, maxWeight <= 10⁵ 
//// 1 <= portsi <= portsCount 
//// 1 <= weightsi <= maxWeight 
//// 
//// Related Topics 线段树 队列 数组 动态规划 单调队列 堆（优先队列） 👍 98 👎 0
//


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
* 从仓库到码头运输箱子
  */
  public class P1687_DeliveringBoxesFromStorageToPorts{
  public static void main(String[] args) {
  //测试代码
  Solution solution = new P1687_DeliveringBoxesFromStorageToPorts().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int boxDelivering(int[][] boxes, int portsCount, int maxBoxes, int maxWeight) {
// dp[i]即运送前i个箱子需要的最小行程次数
        // 箱子需要按数组顺序运输，每一次运输，卡车会按顺序取出连续的几个箱子，
        // 然后依次送往对应的码头，全部送达之后，又回到了仓库
        // 上一次运输的最后一个箱子的编号 j
        // 那么 f[i] 就可以从 f[j]转移而来，转移的时候，我们需要考虑以下几个问题
        // - 从 f[j] 转移过来的时候，卡车上的箱子数量不能超过 maxBoxes
        // - 从 f[j] 转移过来的时候，卡车上的箱子总重量不能超过 maxWeight
        // f[i] = min {f[j] + neg(j+1,i) +2 }
        // 0<= j < i
        // i-j <= maxBoxes
        // Wi -Wj <= maxWeight
        // 这一次运送的箱子为 [j+1,i]。箱子的数量不超过 maxBoxes，重量之和不能超过 maxWeight。
        // 运送的行程次数即为 p(j+1),⋯,p(i)相邻两项不等的次数 neg(j+1,i)
        // 加上来回的 2 次
        // neg(j+1,i) 拆分成两个前缀和的差
        // neg(j+1,i)=neg(i) - neg(j+1)
        // 则 f[i] = min {f[j] + neg(j+1,i) +2 }
        //         = min {f[j] + neg(i) - neg(j+1) +2 }
        //         = min {f[j] - neg(j+1)} +neg(i)+2
        // 记 g[j] = f[j] - neg(j+1)
        // 则 f[i] = min{ g[j] } + neg(i) + 2
        // 其中 j>= i -maxBoxes , Wj >= Wi - maxWeight
        // 使用一个队列存储所有需要被保留的 g_j （存储下标 j 即可），
        // 从队首到队尾，j 的值单调递增，g_j的值也单调递增。
        // - 首先我们不断从队首弹出元素，直到队首的 j 是满足额外限制的；
        // - 使用队首的 j 进行转移，得到 f[i]
        // 计算出 g_i 并不断从队尾弹出元素，直到队列为空或者队尾元素对应的 g 值严格小与 g_i；
        // g_i 放入队列
        int n = boxes.length;
        int[] p = new int[n + 1];
        int[] w = new int[n + 1];
        int[] neg = new int[n + 1];
        long[] W = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            p[i] = boxes[i - 1][0];
            w[i] = boxes[i - 1][1];
            if (i > 1) {
                // 同个目的地行程数不变
                neg[i] = neg[i - 1] + (p[i - 1] != p[i] ? 1 : 0);
            }
            W[i] = W[i - 1] + w[i];
        }
        Deque<Integer> opt = new ArrayDeque<>();
        opt.offerLast(0);
        int[] f = new int[n + 1];
        int[] g = new int[n + 1];
        for (int i = 1; i <= n ; i++) {
            while (i-opt.peekFirst()>maxBoxes || W[i]-W[opt.peekFirst()]>maxWeight){
                opt.pollFirst();
            }
            f[i] = g[opt.peekFirst()] + neg[i] + 2;
            if (i != n) {
                g[i] = f[i] - neg[i + 1];
                while (!opt.isEmpty() && g[i] <= g[opt.peekLast()]) {
                    opt.pollLast();
                }
                opt.offerLast(i);
            }
        }
        return f[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }