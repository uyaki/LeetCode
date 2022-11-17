//给定字符串 s 和字符串数组 words, 返回 words[i] 中是s的子序列的单词个数 。 
//
// 字符串的 子序列 是从原始字符串中生成的新字符串，可以从中删去一些字符(可以是none)，而不改变其余字符的相对顺序。 
//
// 
// 例如， “ace” 是 “abcde” 的子序列。 
// 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcde", words = ["a","bb","acd","ace"]
//输出: 3
//解释: 有三个是 s 的子序列的单词: "a", "acd", "ace"。
// 
//
// Example 2: 
//
// 
//输入: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
//输出: 2
// 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length <= 5 * 10⁴ 
// 1 <= words.length <= 5000 
// 1 <= words[i].length <= 50 
// words[i]和 s 都只由小写字母组成。 
// 
// Related Topics 字典树 哈希表 字符串 排序 👍 287 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 匹配子序列的单词数
 */
public class P792_NumberOfMatchingSubsequences {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P792_NumberOfMatchingSubsequences().new Solution();
        System.out.println(solution.numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numMatchingSubseq(String s, String[] words) {
			Deque<String>[] deques = new Deque[26];
			for (int i = 0; i < 26; i++) {
				deques[i] = new ArrayDeque<>();
			}
			// 根据首字母进行分桶
			// 如 words = ["a", "bb", "acd", "ace"]
			// a: ["a", "acd", "ace"]
			// b: ["bb"]
			for (String word : words) {
				deques[word.charAt(0) - 'a'].add(word);
			}
			int ans = 0;
			for (char ch : s.toCharArray()) {
				Deque<String> que = deques[ch - 'a'];
				for (int i = que.size(); i >0 ; i--) {
					String temp = que.pollFirst();
					// 对于取出的每个单词，如果此时单词长度为 1，说明该单词已经匹配完毕，我们将答案加 1
					if (temp.length() == 1) {
						ans++;
					} else {
						// 将单词的首字母去掉，然后放入下一个字母开头的桶中
						// 比如对于单词 "acd"，去掉首字母 'a' 后，我们将其放入 'c' 开头的桶中。第二轮分桶结果如下
						// c: ["cd", "ce"]
						// b: ["bb"]
						deques[temp.charAt(1) - 'a'].offer(temp.substring(1));
					}
				}
			}
			return ans;
        }



    }
//leetcode submit region end(Prohibit modification and deletion)

}
