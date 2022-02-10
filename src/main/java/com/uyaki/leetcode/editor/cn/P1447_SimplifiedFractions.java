//给你一个整数 n ，请你返回所有 0 到 1 之间（不包括 0 和 1）满足分母小于等于 n 的 最简 分数 。分数可以以 任意 顺序返回。 
//
// 
//
// 示例 1： 
//
// 输入：n = 2
//输出：["1/2"]
//解释："1/2" 是唯一一个分母小于等于 2 的最简分数。 
//
// 示例 2： 
//
// 输入：n = 3
//输出：["1/2","1/3","2/3"]
// 
//
// 示例 3： 
//
// 输入：n = 4
//输出：["1/2","1/3","1/4","2/3","3/4"]
//解释："2/4" 不是最简分数，因为它可以化简为 "1/2" 。 
//
// 示例 4： 
//
// 输入：n = 1
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 100 
// 
// Related Topics 数学 字符串 数论 👍 78 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 最简分数
 */
public class P1447_SimplifiedFractions {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1447_SimplifiedFractions().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> simplifiedFractions(int n) {
            List<String> ans = new ArrayList<>();
            for (int denominator = 2; denominator <= n; ++denominator) {
                for (int numerator = 1; numerator < denominator; ++numerator) {
                    if (gcd(numerator, denominator) == 1) {
                        ans.add(numerator + "/" + denominator);
                    }
                }
            }
            return ans;
        }

        public int gcd(int a, int b) {
            return b != 0 ? gcd(b, a % b) : a;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
