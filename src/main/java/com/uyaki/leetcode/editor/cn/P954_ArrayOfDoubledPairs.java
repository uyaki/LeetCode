//给定一个长度为偶数的整数数组 arr，只有对 arr 进行重组后可以满足 “对于每个 0 <= i < len(arr) / 2，都有 arr[2 * i 
//+ 1] = 2 * arr[2 * i]” 时，返回 true；否则，返回 false。 
//
// 
//
// 示例 1： 
//
// 
//输入：arr = [3,1,3,6]
//输出：false
// 
//
// 示例 2： 
//
// 
//输入：arr = [2,1,2,6]
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：arr = [4,-2,2,-4]
//输出：true
//解释：可以用 [-2,-4] 和 [2,4] 这两组组成 [-2,-4,2,4] 或是 [2,4,-2,-4]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= arr.length <= 3 * 10⁴ 
// arr.length 是偶数 
// -10⁵ <= arr[i] <= 10⁵ 
// 
// Related Topics 贪心 数组 哈希表 排序 👍 145 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.*;

/**
 * 二倍数对数组
 */
public class P954_ArrayOfDoubledPairs {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P954_ArrayOfDoubledPairs().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canReorderDoubled(int[] arr) {
            //   2*i+1 2*i
            // 0 1     0
            // 1 3     2
            // 2 5     4
            // 3 7     6
            // 所以只要有成对的数出现就行
            Map<Integer, Integer> map = new HashMap<>();
            // 统计数字出现次数
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            // 只要出现奇数个0 肯定不对
            if (map.getOrDefault(0, 0) % 2 != 0) {
                return false;
            }
            // 提取key
            List<Integer> list = new ArrayList<>(map.keySet());
            // 根据绝对值排序，最小值的num
            // 如果 map[num*2] < map[num] , 那么就会有部分的num没有找到另一半
            // 反之，抵消等量数据，比较下一个最小值，直到所有的num被抵消
            list.sort(Comparator.comparing(Math::abs));
            for (int num : list) {
                if (map.getOrDefault(2 * num, 0) < map.get(num)) {
                    return false;
                }
                map.put(2 * num, map.getOrDefault(2 * num, 0) - map.get(num));
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}