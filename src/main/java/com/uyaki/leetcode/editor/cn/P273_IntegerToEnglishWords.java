//将非负整数 num 转换为其对应的英文表示。 
//
// 
//
// 示例 1： 
//
// 
//输入：num = 123
//输出："One Hundred Twenty Three"
// 
//
// 示例 2： 
//
// 
//输入：num = 12345
//输出："Twelve Thousand Three Hundred Forty Five"
// 
//
// 示例 3： 
//
// 
//输入：num = 1234567
//输出："One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
// 
//
// 示例 4： 
//
// 
//输入：num = 1234567891
//输出："One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven 
//Thousand Eight Hundred Ninety One"
// 
//
// 
//
// 提示： 
//
// 
// 0 <= num <= 2³¹ - 1 
// 
// Related Topics 递归 数学 字符串 👍 212 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Stack;

/**
 * 整数转换英文表示
 */
public class P273_IntegerToEnglishWords {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P273_IntegerToEnglishWords().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String numberToWords(int num) {
            if (num == 0) {
                return "Zero";
            }
            String[] en = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                    "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
            String[] tenEn = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            Stack<String> stack = new Stack<>();
            int i = 0;
            while (num > 0) {
                int temp = num % 1000;
                if (temp > 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    // 个位十位
                    int t1 = temp % 100;
                    // 百位
                    int t2 = temp / 100;
                    if (t2 > 0) {
                        stringBuilder.append(en[t2]).append(" ").append("Hundred").append(" ");
                    }
                    // 个位和十位
                    if (t1 / 10 >= 2) {
                        stringBuilder.append(tenEn[t1 / 10]).append(" ");
                        if (t1 % 10 > 0) {
                            stringBuilder.append(en[t1 % 10]).append(" ");
                        }
                    } else {
                        if (t1 > 0) {
                            stringBuilder.append(en[t1]).append(" ");
                        }
                    }
                    switch (i) {
                        case 1:
                            stringBuilder.append("Thousand").append(" ");
                            break;
                        case 2:
                            stringBuilder.append("Million").append(" ");
                            break;
                        case 3:
                            stringBuilder.append("Billion").append(" ");
                            break;
                        default:
                            break;
                    }
                    stack.push(stringBuilder.toString());
                }
                i++;
                num /= 1000;
            }
            StringBuilder ans = new StringBuilder();
            while (!stack.isEmpty()) {
                ans.append(stack.pop());
            }
            return ans.toString().trim();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
