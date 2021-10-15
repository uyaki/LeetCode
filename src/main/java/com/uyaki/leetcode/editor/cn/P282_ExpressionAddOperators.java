//给定一个仅包含数字 0-9 的字符串 num 和一个目标值整数 target ，在 num 的数字之间添加 二元 运算符（不是一元）+、- 或 * ，返回所
//有能够得到目标值的表达式。 
//
// 
//
// 示例 1: 
//
// 
//输入: num = "123", target = 6
//输出: ["1+2+3", "1*2*3"] 
// 
//
// 示例 2: 
//
// 
//输入: num = "232", target = 8
//输出: ["2*3+2", "2+3*2"] 
//
// 示例 3: 
//
// 
//输入: num = "105", target = 5
//输出: ["1*0+5","10-5"] 
//
// 示例 4: 
//
// 
//输入: num = "00", target = 0
//输出: ["0+0", "0-0", "0*0"]
// 
//
// 示例 5: 
//
// 
//输入: num = "3456237490", target = 9191
//输出: [] 
//
// 
//
// 提示： 
//
// 
// 1 <= num.length <= 10 
// num 仅含数字 
// -2³¹ <= target <= 2³¹ - 1 
// 
// Related Topics 数学 字符串 回溯 👍 260 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 给表达式添加运算符
 */
public class P282_ExpressionAddOperators {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P282_ExpressionAddOperators().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int n;
        String num;
        int target;
        List<String> ans;

        public List<String> addOperators(String num, int target) {
            //设字符串 num 的长度为 n，为构建表达式，我们可以往 num 中间的 n−1 个空隙添加+ 号、- 号或 * 号，或者不添加符号。
            //我们可以用「回溯法」来模拟这个过程。从左向右构建表达式，并实时计算表达式的结果。由于乘法运算优先级高于加法和减法运算，我们还需要保存最后一个连乘串（如 2*3*4）的运算结果
            //
            this.n = num.length();
            this.num = num;
            this.target = target;
            this.ans = new ArrayList<>();
            StringBuffer expr = new StringBuffer();
            backtrack(expr, 0, 0, 0);
            return ans;
        }

        /**
         * 回溯法递归函数
         *
         * @param expr 当前构建出的表达式
         * @param i    当前的枚举到了 num 的第 i 个数字
         * @param res  当前表达式的计算结果
         * @param mul  表达式最后一个连乘串的计算结果
         */
        public void backtrack(StringBuffer expr, int i, long res, long mul) {
            // 如果 i=n，说明表达式已经构造完成，若此时有 res=target，则找到了一个可行解，我们将 expr 放入答案数组中，递归结束；
            if (i == n) {
                if (res == target) {
                    ans.add(expr.toString());
                }
                return;
            }
            // 如果 i<n，需要枚举当前表达式末尾要添加的符号（+号、-号或*号），以及该符号之后需要截取多少位数字。
            int signIndex = expr.length();
            if (i > 0) {
                // 占位，下面填充符号
                expr.append(0);
            }
            // 设该符号之后的数字为 val，按符号分类讨论
            // 若添加 + 号，则 res 增加 val，且 val 单独组成表达式最后一个连乘串；
            // 若添加 - 号，则 res 减少 val，且 −val 单独组成表达式最后一个连乘串；
            // 若添加 * 号，由于乘法运算优先级高于加法和减法运算，我们需要对 res 撤销之前 mul 的计算结果，并添加新的连乘结果 mul∗val，也就是将 res 减少 mul 并增加 mul∗val。
            long val = 0;
            // 枚举截取的数字长度（取多少位），注意数字可以是单个 0 但不能有前导零
            for (int j = i; j < n && (j == i || num.charAt(i) != '0'); j++) {
                val = val * 10 + num.charAt(j) - '0';
                expr.append(num.charAt(j));
                if (i == 0) {
                    // 表达式开头不能添加符号
                    backtrack(expr, j + 1, val, val);
                } else {
                    expr.setCharAt(signIndex, '+');
                    backtrack(expr, j + 1, res + val, val);
                    expr.setCharAt(signIndex, '-');
                    backtrack(expr, j + 1, res - val, -val);
                    expr.setCharAt(signIndex, '*');
                    backtrack(expr, j + 1, res - mul + mul * val, mul * val);
                }
            }
            expr.setLength(signIndex);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
