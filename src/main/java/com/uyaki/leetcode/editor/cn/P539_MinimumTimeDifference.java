//给定一个 24 小时制（小时:分钟 "HH:MM"）的时间列表，找出列表中任意两个时间的最小时间差并以分钟数表示。 
//
// 
//
// 示例 1： 
//
// 
//输入：timePoints = ["23:59","00:00"]
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：timePoints = ["00:00","23:59","00:00"]
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 2 <= timePoints <= 2 * 10⁴ 
// timePoints[i] 格式为 "HH:MM" 
// 
// Related Topics 数组 数学 字符串 排序 👍 131 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Comparator;
import java.util.List;

/**
 * 最小时间差
 */
public class P539_MinimumTimeDifference {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P539_MinimumTimeDifference().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMinDifference(List<String> timePoints) {
            // 鸽巢原理
            //一共有 24×60=1440 种不同的时间。
            // 由鸽巢原理可知，如果 timePoints 的长度超过 1440，那么必然会有两个相同的时间，此时可以直接返回 0。
            int n = timePoints.size();
            if (n > 1440) {
                return 0;
            }
            // 按分钟数排序
            timePoints.sort(Comparator.comparingInt(this::convertTime2Minutes));
            int min = Integer.MAX_VALUE;
            int first = convertTime2Minutes(timePoints.get(0));
            int pre = first;
            for (int i = 1; i < n; i++) {
                int cur = convertTime2Minutes(timePoints.get(i));
                min = Math.min(min, cur - pre);
                pre = cur;
            }
            // 最后可能出现 23:00  1:00这种情况
            int last = convertTime2Minutes(timePoints.get(n - 1));
            min = Math.min(min, first + 24 * 60 - last);
            return min;
        }

        /**
         * 时间转化为分钟数
         * @param time time
         * @return 分钟数
         */
        private int convertTime2Minutes(String time) {
            String[] str = time.split(":");
            return Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
