//给定一个偶数长度的数组，其中不同的数字代表着不同种类的糖果，每一个数字代表一个糖果。你需要把这些糖果平均分给一个弟弟和一个妹妹。返回妹妹可以获得的最大糖果的
//种类数。 
//
// 示例 1: 
//
// 
//输入: candies = [1,1,2,2,3,3]
//输出: 3
//解析: 一共有三种种类的糖果，每一种都有两个。
//     最优分配方案：妹妹获得[1,2,3],弟弟也获得[1,2,3]。这样使妹妹获得糖果的种类数最多。
// 
//
// 示例 2 : 
//
// 
//输入: candies = [1,1,2,3]
//输出: 2
//解析: 妹妹获得糖果[2,3],弟弟获得糖果[1,1]，妹妹有两种不同的糖果，弟弟只有一种。这样使得妹妹可以获得的糖果种类数最多。
// 
//
// 注意: 
//
// 
// 数组的长度为[2, 10,000]，并且确定为偶数。 
// 数组中数字的大小在范围[-100,000, 100,000]内。
// 
// 
// 
// 
// Related Topics 数组 哈希表 👍 169 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 分糖果
 */
public class P575_DistributeCandies {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P575_DistributeCandies().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 贪心思路
         * 姐弟获得的糖果数量为 n/2
         * 如果糖果种类为m，如果m>=n/2,则姐姐种类为 n/2
         * m < n/2,则种类为m
         *
         * @param candyType 糖果数组
         * @return 姐姐获得的种类数
         */
        public int distributeCandies(int[] candyType) {
            int m = (int) Arrays.stream(candyType).distinct().count();
            int n = candyType.length >> 2;
            return Math.min(m, n);
        }

        /**
         * 常规思路
         *
         * @param candyType 糖果数组
         * @return 姐姐获得的种类数
         */
        public int distributeCandies2(int[] candyType) {
            // 姐弟获得的糖果数量为
            int count = candyType.length / 2;
            Arrays.sort(candyType);
            Set<Integer> sister = new HashSet<>();
            int sisterCount = 0;
            int brotherCount = 0;
            for (int candy : candyType) {
                // 姐姐已经有这种糖果，且弟弟还没分到一半的糖果。或者姐姐已经分到一半的糖果
                if ((sister.contains(candy) && brotherCount <= count) || sisterCount == count) {
                    brotherCount++;
                } else {
                    //姐姐还没分到一半的糖果，则新品种的糖果给姐姐
                    sister.add(candy);
                    sisterCount++;
                }
            }
            return sister.size();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
