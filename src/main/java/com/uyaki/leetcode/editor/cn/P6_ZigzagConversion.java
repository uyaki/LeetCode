//将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。 
//
// 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下： 
//
// 
//P   A   H   N
//A P L S I I G
//Y   I   R 
//
// 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。 
//
// 请你实现这个将字符串进行指定行数变换的函数： 
//
// 
//string convert(string s, int numRows); 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "PAYPALISHIRING", numRows = 3
//输出："PAHNAPLSIIGYIR"
// 
//示例 2：
//
// 
//输入：s = "PAYPALISHIRING", numRows = 4
//输出："PINALSIGYAHRPI"
//解释：
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
// 
//
// 示例 3： 
//
// 
//输入：s = "A", numRows = 1
//输出："A"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 由英文字母（小写和大写）、',' 和 '.' 组成 
// 1 <= numRows <= 1000 
// 
// Related Topics 字符串 👍 1501 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Z 字形变换
 */
public class P6_ZigzagConversion {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P6_ZigzagConversion().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convert(String s, int numRows) {
            if (numRows == 1) {
                return s;
            }
            int n = s.length();
            List<StringBuilder> rows = new ArrayList<>();
            for (int i = 0; i < Math.min(numRows, n); i++) {
                rows.add(new StringBuilder());
            }
            int currRow = 0;
            boolean isDown = false;
            for (char ch : s.toCharArray()) {
                rows.get(currRow).append(ch);
                // 第一行或者最后一行的时候，转换方向
                if (currRow == 0 || currRow == numRows - 1) {
                    isDown = !isDown;
                }
                currRow += isDown ? 1 : -1;
            }
            StringBuilder ans = new StringBuilder();
            for (StringBuilder row : rows) {
                ans.append(row);
            }
            return ans.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
