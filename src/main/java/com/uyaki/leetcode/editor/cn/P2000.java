package com.uyaki.leetcode.editor.cn;

import java.util.Arrays;

public class P2000 {
    public static void main(String[] args) {
        Solution solution = new P2000().new Solution();
        int[][] ans = solution.combineArray(new int[]{1, 2, 3, 4, 5}, 3);
        Arrays.stream(ans).forEach(it-> {
            Arrays.stream(it).forEach(item->{
                System.out.print(item+"\t");
            });
            System.out.println();
        });
    }
    class Solution {
        int k = 0;
        public int[][] combineArray(int[] nums, int n) {
            int[] indexes = new int[n];
            // 如果结果数大于int的上限，抛出异常
            int numberOfCombinations = Math.toIntExact(numberOfCombinations( nums.length,n));
            int[][] ans = new int[numberOfCombinations][n];
            combine(ans,  nums, indexes, 0, n, n);
            return ans;
        }

        /**
         * 组合的可能数
         * @param ans 答案
         * @param nums nums
         * @param indexes 组合在原始数组中的下标数
         * @param start 开始值
         * @param count 当前indexes下标剩余可填空位
         * @param NUM 元素个数
         */
        public void combine(int[][] ans, int[] nums, int[] indexes, int start, int count, int NUM) {
            for (int i = start; i < nums.length + 1 - count; i++) {
                indexes[count - 1] = i;
                if (count - 1 == 0) {
                    int[] temp = new int[NUM];
                    for (int j = NUM - 1; j >= 0; j--) {
                        temp[NUM - j - 1] = nums[indexes[j]];
                    }
                    ans[k++] = temp;
                } else
                    combine(ans,  nums, indexes, i + 1, count - 1, NUM);
            }
        }

        /**
         * 从n个球中取出一个球，如果它属于 m，还需要从 n-1中取出 m-1个球；如果它不属于 m，则需要从 n-1中取出 m 个球
         */
        private long numberOfCombinations(int n, int m) {
            if (m == 0) {
                return 1;
            }
            if (1 == m) {
                return n;
            }
            if (m > n / 2) {
                return numberOfCombinations(n, n - m);
            }
            if (m > 1) {
                return numberOfCombinations(n - 1, m - 1) + numberOfCombinations(n - 1, m);
            }
            return -1;
        }
    }
}
