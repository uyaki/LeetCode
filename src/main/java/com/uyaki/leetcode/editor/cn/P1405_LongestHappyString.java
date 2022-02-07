//如果字符串中不含有任何 'aaa'，'bbb' 或 'ccc' 这样的字符串作为子串，那么该字符串就是一个「快乐字符串」。 
//
// 给你三个整数 a，b ，c，请你返回 任意一个 满足下列全部条件的字符串 s： 
//
// 
// s 是一个尽可能长的快乐字符串。 
// s 中 最多 有a 个字母 'a'、b 个字母 'b'、c 个字母 'c' 。 
// s 中只含有 'a'、'b' 、'c' 三种字母。 
// 
//
// 如果不存在这样的字符串 s ，请返回一个空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 输入：a = 1, b = 1, c = 7
//输出："ccaccbcc"
//解释："ccbccacc" 也是一种正确答案。
// 
//
// 示例 2： 
//
// 输入：a = 2, b = 2, c = 1
//输出："aabbc"
// 
//
// 示例 3： 
//
// 输入：a = 7, b = 1, c = 0
//输出："aabaa"
//解释：这是该测试用例的唯一正确答案。 
//
// 
//
// 提示： 
//
// 
// 0 <= a, b, c <= 100 
// a + b + c > 0 
// 
// Related Topics 贪心 字符串 堆（优先队列） 👍 160 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 最长快乐字符串
 */
public class P1405_LongestHappyString {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1405_LongestHappyString().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestDiverseString(int a, int b, int c) {
            StringBuilder ans = new StringBuilder();
            Pair[] arr = {new Pair(a, 'a'),
                    new Pair(b, 'b'),
                    new Pair(c, 'c')};

            while (true) {
                Arrays.sort(arr, (o1, o2) -> o2.freq - o1.freq);
                boolean hasNext = false;
                for (Pair pair : arr) {
                    if (pair.freq <= 0) {
                        break;
                    }
                    int m = ans.length();
                    if (m >= 2 && ans.charAt(m - 2) == pair.ch && ans.charAt(m - 1) == pair.ch) {
                        continue;
                    }
                    hasNext = true;
                    ans.append(pair.ch);
                    pair.freq--;
                    break;
                }
                if (!hasNext) {
                    break;
                }
            }

            return ans.toString();
        }

        class Pair {
            int freq;
            char ch;

            public Pair(int freq, char ch) {
                this.freq = freq;
                this.ch = ch;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
