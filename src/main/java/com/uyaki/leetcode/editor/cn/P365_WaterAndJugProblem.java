//有两个水壶，容量分别为 jug1Capacity 和 jug2Capacity 升。水的供应是无限的。确定是否有可能使用这两个壶准确得到 
//targetCapacity 升。 
//
// 如果可以得到 targetCapacity 升水，最后请用以上水壶中的一或两个来盛放取得的 targetCapacity 升水。 
//
// 你可以： 
//
// 
// 装满任意一个水壶 
// 清空任意一个水壶 
// 从一个水壶向另外一个水壶倒水，直到装满或者倒空 
// 
//
// 
//
// 示例 1: 
//
// 
//输入: jug1Capacity = 3, jug2Capacity = 5, targetCapacity = 4
//输出: true
//解释：来自著名的 "Die Hard" 
//
// 示例 2: 
//
// 
//输入: jug1Capacity = 2, jug2Capacity = 6, targetCapacity = 5
//输出: false
// 
//
// 示例 3: 
//
// 
//输入: jug1Capacity = 1, jug2Capacity = 2, targetCapacity = 3
//输出: true
// 
//
// 
//
// 提示: 
//
// 
// 1 <= jug1Capacity, jug2Capacity, targetCapacity <= 10⁶ 
// 
//
// Related Topics 深度优先搜索 广度优先搜索 数学 👍 491 👎 0


package com.uyaki.leetcode.editor.cn;

/**
* 水壶问题
  */
  public class P365_WaterAndJugProblem{
  public static void main(String[] args) {
  //测试代码
  Solution solution = new P365_WaterAndJugProblem().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
      public boolean canMeasureWater(int x, int y, int z) {
          if (x + y < z) {
              return false;
          }
          if (x == 0 || y == 0) {
              return z == 0 || x + y == z;
          }
          // 我们可以认为每次操作只会给水的总量带来x或者y的变化量。
          // 因此我们的目标可以改写成：找到一对整数α,b，使得  xa + by = z
          // 贝祖定理告诉我们，ax+by=z 有解当且仅当 z 是 x,y的最大公约数的倍数。
          // 因此我们只需要找到 x,y的最大公约数并判断 z 是否是它的倍数即可

          return z % gcd(x, y) == 0;
      }

      public int gcd(int x, int y) {
          int remainder = x % y;
          while (remainder != 0) {
              x = y;
              y = remainder;
              remainder = x % y;
          }
          return y;
      }
}
//leetcode submit region end(Prohibit modification and deletion)

  }