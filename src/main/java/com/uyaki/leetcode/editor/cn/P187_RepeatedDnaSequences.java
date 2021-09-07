//所有 DNA 都由一系列缩写为 'A'，'C'，'G' 和 'T' 的核苷酸组成，例如："ACGAATTCCG"。在研究 DNA 时，识别 DNA 中的重复
//序列有时会对研究非常有帮助。 
//
// 编写一个函数来找出所有目标子串，目标子串的长度为 10，且在 DNA 字符串 s 中出现次数超过一次。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
//输出：["AAAAACCCCC","CCCCCAAAAA"]
// 
//
// 示例 2： 
//
// 
//输入：s = "AAAAAAAAAAAAA"
//输出：["AAAAAAAAAA"]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 10⁵ 
// s[i] 为 'A'、'C'、'G' 或 'T' 
// 
// Related Topics 位运算 哈希表 字符串 滑动窗口 哈希函数 滚动哈希 👍 195 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.*;

/**
 * 重复的DNA序列
 */
public class P187_RepeatedDnaSequences {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> findRepeatedDnaSequences(String s) {
            if (s.length() <= 10) {
                return Collections.EMPTY_LIST;
            }
            List<String> ans = new ArrayList<>();
            HashMap<String, Integer> map = new HashMap<>();
            //substring 是 [i,j)区间，滑动窗口大小是10
            for (int i = 0, j = 10; j <= s.length(); i++, j++) {
                String temp = s.substring(i, j);
                //确保DNA序列出现大于1次且DNA序列不重复
                if (map.containsKey(temp) && map.get(temp) == 1) {
                    ans.add(s.substring(i, j));
                }
                // map存放<k,v> = <DNA序列,序列出现次数>
                map.put(temp, map.get(temp) == null ? 1 : map.get(temp) + 1);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
