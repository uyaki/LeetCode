//有 buckets 桶液体，其中 正好 有一桶含有毒药，其余装的都是水。它们从外观看起来都一样。为了弄清楚哪只水桶含有毒药，你可以喂一些猪喝，通过观察猪是否
//会死进行判断。不幸的是，你只有 minutesToTest 分钟时间来确定哪桶液体是有毒的。 
//
// 喂猪的规则如下： 
//
// 
// 选择若干活猪进行喂养 
// 可以允许小猪同时饮用任意数量的桶中的水，并且该过程不需要时间。 
// 小猪喝完水后，必须有 minutesToDie 分钟的冷却时间。在这段时间里，你只能观察，而不允许继续喂猪。 
// 过了 minutesToDie 分钟后，所有喝到毒药的猪都会死去，其他所有猪都会活下来。 
// 重复这一过程，直到时间用完。 
// 
//
// 给你桶的数目 buckets ，minutesToDie 和 minutesToTest ，返回在规定时间内判断哪个桶有毒所需的 最小 猪数。 
//
// 
//
// 示例 1： 
//
// 
//输入：buckets = 1000, minutesToDie = 15, minutesToTest = 60
//输出：5
// 
//
// 示例 2： 
//
// 
//输入：buckets = 4, minutesToDie = 15, minutesToTest = 15
//输出：2
// 
//
// 示例 3： 
//
// 
//输入：buckets = 4, minutesToDie = 15, minutesToTest = 30
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 1 <= buckets <= 1000 
// 1 <= minutesToDie <= minutesToTest <= 100 
// 
// Related Topics 数学 动态规划 组合数学 👍 298 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 可怜的小猪
 */
public class P458_PoorPigs {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P458_PoorPigs().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 数学
         *
         * @param buckets
         * @param minutesToDie
         * @param minutesToTest
         * @return
         */
        public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
            // 当有1只小猪，最多可以和times次水
            // 能够携带 base = times + 1的信息量。如有5桶水
            // 1. 喝0号死，0有毒
            // 2. 喝1号死，1有毒
            // 3. 喝2号死，2有毒
            // 4. 喝3号死，3有毒
            // 5. 喝完没死，4有毒
            // 2只小猪时，信息量 pow(base,2) = 5^2 = 25
            // 所以有 pow(base,ans) ≥ buckets时，能够吃出毒
            // 取对数 ans≥ log(buckets)/log(base)
            // ans为整数，ans=ceil( log(buckets)/log(base) )
            int times = minutesToTest / minutesToDie;
            int base = times + 1;
            double temp = Math.log(buckets) / Math.log(base);
            return (int) Math.ceil(temp);
        }

        /**
         * 动态规划
         *
         * @param buckets
         * @param minutesToDie
         * @param minutesToTest
         * @return
         */
        public int poorPigs2(int buckets, int minutesToDie, int minutesToTest) {
            if (buckets == 1) {
                return 0;
            }
            // 测试轮数
            int times = minutesToTest / minutesToDie;
            // 1. f(i,j)表示第i只小猪在j轮，最多可以在多少桶液体中确定毒液
            //    则 f(i,time) ≥ buckets
            //    当i=0或者j=0 最多只能在 1 桶液体中确定有毒的是这唯一的一桶
            //    所以 f(i,0) = f(0,j) = 1
            // 2. 当剩下 i 只小猪和 j 轮测试时，如果在一轮测试之后有 k 只小猪存活，
            //    则剩下 k 只小猪和 j - 1 轮测试。
            //    由于 k 只小猪和 j - 1 轮测试可以判断的最大桶数是 f(k,j−1)
            //    i 只小猪中有 k 只小猪存活的组合数是 C(i, k)
            //    因此剩下 k 只小猪和 j - 1 轮测试时，可以判断的最大桶数是 f(k,j−1)×C(i,k)
            //    =>  f(i,j) = (i ∑ k=0) f(k,j-1) * C(i,k)
            //      其中C(i,k)表示从i的不同元素中取出k个元素的组合，0 ≤ k ≤ i, C(0,0)=1
            //          当 i≥1时，C(i,0) = C(i,i) = 1
            //          当 0<j<i时，C(i,j) =C(i-1,j-1)+C(i-1,j)
            // 3. 最多需要的小猪数量为 0≤i<buckets
            // 4. 0≤j≤iterations
            int[][] c = new int[buckets + 1][buckets + 1];
            c[0][0] = 1;
            int[][] f = new int[buckets][buckets + 1];
            for (int i = 0; i < buckets; i++) {
                f[i][0] = 1;
            }
            for (int j = 0; j <= times; j++) {
                f[0][j] = 1;
            }
            for (int i = 0; i < buckets; i++) {
                c[i][0] = 1;
                c[i][i] = 1;
                for (int j = 0; j < i; j++) {
                    c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
                }
                for (int j = 1; j <= times; j++) {
                    for (int k = 0; k <= i; k++) {
                        f[i][j] += f[k][j - 1] * c[i][k];
                    }
                }
                if (f[i][times] >= buckets) {
                    return i;
                }
            }
            return 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}