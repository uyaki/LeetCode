# README

- [README](#readme)
    - [IDEA插件之LeetCode Editor配置](#idea插件之leetcode-editor配置)
    - [说明](#说明)
    - [总结](#总结)
    - [数学题](#数学题)
    - [模拟|设计](#模拟|设计)
    - [预处理](#预处理)
    - [字符串操作](#字符串操作)
    - [数组](#数组)
    - [优先队列](#优先队列)
    - [排序](#排序)
    - [哈希](#哈希)
    - [递归](#递归)
    - [位运算](#位运算)
    - [堆](#堆)
    - [栈](#栈)
    - [链表](#链表)
    - [滑动窗口](#滑动窗口)
    - [树](#树)
        - [树的遍历](#树的遍历)
        - [深度优先搜索](#深度优先搜索)
        - [广度优先搜索](#广度优先搜索)
        - [字典树（前缀树）](#字典树前缀树)
    - [图](#图)
    - [分治法](#分治法)
    - [二分查找](#二分查找)
    - [双指针](#双指针)
    - [贪心算法](#贪心算法)
    - [记忆化搜索](#记忆化搜索)
    - [动态规划](#动态规划)
    - [最短路径](#最短路径)
    - [回溯法](#回溯法)
    - [TODO](#todo)
    - [📝 License](#-license)

## IDEA插件之LeetCode Editor配置

[LeetCode_Editor配置](./src/main/java/com/uyaki/leetcode/editor/cn/doc/plugin/LeetCode_Editor.md)

## 说明

- 题目难度
    - 💚：简单
    - 💛：中等
    - ❤️：困难
- 掌握情况
    - 😄：EZ
    - 🤨：有一些疑惑
    - 🤯：WTF
- 题解
    - 🍼 入门
    - 👍 有意思
    - ❓ 出题意义不明
    - 🧠 脑筋急转弯

## 总结

- 解题技巧：[算法基础](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/Base.md)
- 字符串
    - KMP算法总结：[KMP](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/KMP.md)
- 数组
    - 数组子集：[Array Subsets](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/ArraySubsets.md)
    -
    排列组合：[Permutation and Combination](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/PermutationAndCombination.md)
    - 树状数组：[Binary Indexed Tree](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/BinaryIndexedTree.md)
- 位运算的解题总结：[Bit](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/Bit.md)
- 贪心算法总结：[Greedy Algorithm](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/GreedyAlgorithm.md)
- 背包问题[Knapsack problem](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/KnapsackProblem.md)
-

最接近目标值的子序列合问题解法[Sum of target subsequences](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/SumOfTargetSubsequences.md)
-
摩尔投票法总结：[Boyer–Moore Majority Vote](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/Boyer–MooreMajorityVote.md)

- 二分图的最大匹配算法
    - 匈牙利算法：[HungarianAlgorithm](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/HungarianAlgorithm.md)
- 树
    - 解题总结：[Tree](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/Tree.md)
    - 前缀树：[Trie](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/Trie.md)
- 分治法的解题总结：[Divide And Conquer](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/DivideAndConquer.md)
    - 快速幂(本质：分治)总结：[Fast Pow](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/FastPow.md)
- 二分法的解题总结：[binary search](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/BinarySearch.md)
- 动态规划的解题总结：[Dynamic Programming](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/DynamicProgramming.md)
    - 博弈问题总结：[Game Problem](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/GameProblem.md)
- 深度优先搜索DFS：
    - 岛屿问题总结：[Island Problem](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/IslandProblem.md)
- 图算法总结
    - [图论基础](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/Graph_Base.md)

---

## 数学题

|难度| 题目                                                                                                                                | 题解                                                                                                          |代码|掌握度|
|:---:|:----------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------------------|:---|:---:|
|💛 | [P29_两数相除](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P29_DivideTwoIntegers.md)                                     | 👍 二分查找+快速乘                                                                                                 |[P29_DivideTwoIntegers.java](./src/main/java/com/uyaki/leetcode/editor/cn/P29_DivideTwoIntegers.java)|😄|
|💚 | [P66_加一](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P66_PlusOne.md)                                                 | 越界问题                                                                                                        |[P66_PlusOne.java](./src/main/java/com/uyaki/leetcode/editor/cn/P66_PlusOne.java)|😄|
|💛 | [P166_分数到小数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P166_FractionToRecurringDecimal.md)                         | 👍 长除法                                                                                                      |[P166_FractionToRecurringDecimal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P166_FractionToRecurringDecimal.java)|😄|
|💛 | [P172_阶乘后的零](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P172_FactorialTrailingZeroes.md)                            |                                                                                                             |[P172_FactorialTrailingZeroes.java](./src/main/java/com/uyaki/leetcode/editor/cn/P172_FactorialTrailingZeroes.java)|😄|
|💛 | [P223_矩形面积](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P223_RectangleArea.md)                                       | 👍 投影法                                                                                                      |[P223_RectangleArea.java](./src/main/java/com/uyaki/leetcode/editor/cn/P223_RectangleArea.java)|😄|
|💛 | [P229_求众数 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P229_MajorityElementIi.md)                                 | 👍👍 摩尔投票法                                                                                                  |[P229_MajorityElementIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P229_MajorityElementIi.java)|😄|
|💚 | [P258_各位相加](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P258_AddDigits.md)                                           | 👍 [官方题解](https://leetcode-cn.com/problems/add-digits/solution/ge-wei-xiang-jia-by-leetcode-solution-u4kj/) |[P258_AddDigits.java](./src/main/java/com/uyaki/leetcode/editor/cn/P258_AddDigits.java)|😄|
|💛 | [P319_灯泡开关](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P319_BulbSwitcher.md)                                        | 👎 数学开根号                                                                                                    |[P319_BulbSwitcher.java](./src/main/java/com/uyaki/leetcode/editor/cn/P319_BulbSwitcher.java)|😄|
|❤️ | [P335_路径交叉](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P335_SelfCrossing.md)                                        | 👎 数学归纳                                                                                                     |[P335_SelfCrossing.java](./src/main/java/com/uyaki/leetcode/editor/cn/P335_SelfCrossing.java)|🤯|
|💛 | [P390_消除游戏](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P390_EliminationGame.md)                                     | 👍 位移                                                                                                       |[P390_EliminationGame.java](./src/main/java/com/uyaki/leetcode/editor/cn/P390_EliminationGame.java)|😄|
|❤️ | [P391_完美矩形](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P391_PerfectRectangle.md)                                    | 👎 数学归纳                                                                                                     |[P391_PerfectRectangle.java](./src/main/java/com/uyaki/leetcode/editor/cn/P391_PerfectRectangle.java)|😄|
|💛 | [P400_第 N 位数字](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P400_NthDigit.md)                                         | 👎 数学归纳                                                                                                     |[P400_NthDigit.java](./src/main/java/com/uyaki/leetcode/editor/cn/P400_NthDigit.java)|😄|
|💚 | [P405_数字转换为十六进制数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P405_ConvertANumberToHexadecimal.md)                   | 位运算                                                                                                         |[P405_ConvertANumberToHexadecimal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P405_ConvertANumberToHexadecimal.java)|😄|
|💚 | [P412_Fizz Buzz](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P412_FizzBuzz.md)                                       | 🍼 入门                                                                                                       |[P412_FizzBuzz.java](./src/main/java/com/uyaki/leetcode/editor/cn/P412_FizzBuzz.java)|😄|
|💚 | [P414_第三大的数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P414_ThirdMaximumNumber.md)                                 | 🍼 入门                                                                                                       |[P414_ThirdMaximumNumber.java](./src/main/java/com/uyaki/leetcode/editor/cn/P414_ThirdMaximumNumber.java)|😄|
|💛 | [P423_从英文中重建数字](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P423_ReconstructOriginalDigitsFromEnglish.md)            | 👎 数学归纳                                                                                                     |[P423_ReconstructOriginalDigitsFromEnglish.java](./src/main/java/com/uyaki/leetcode/editor/cn/P423_ReconstructOriginalDigitsFromEnglish.java)|😄|
|💚 | [P453_最小操作次数使数组元素相等](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P453_MinimumMovesToEqualArrayElements.md)           | 🧠 脑筋急转弯                                                                                                    |[P453_MinimumMovesToEqualArrayElements.java](./src/main/java/com/uyaki/leetcode/editor/cn/P453_MinimumMovesToEqualArrayElements.java)|😄|
|❤️ | [P458_可怜的小猪](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P458_PoorPigs.md)                                           | 👍 信息量/动态规划                                                                                                 |[P458_PoorPigs.java](./src/main/java/com/uyaki/leetcode/editor/cn/P458_PoorPigs.java)|😄|
|❤️ | [P479_最大回文数乘积](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P479_LargestPalindromeProduct.md)                         | 👍 出题意义不明                                                                                                   |[P479_LargestPalindromeProduct.java](./src/main/java/com/uyaki/leetcode/editor/cn/P479_LargestPalindromeProduct.java)|😄|
|💚 | [P492_构造矩形](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P492_ConstructTheRectangle.md)                               | 👎 数学                                                                                                       |[P492_ConstructTheRectangle.java](./src/main/java/com/uyaki/leetcode/editor/cn/P492_ConstructTheRectangle.java)|😄|
|💚 | [P495_提莫攻击](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P495_TeemoAttacking.md)                                      | 🍼 入门                                                                                                       |[P495_TeemoAttacking.java](./src/main/java/com/uyaki/leetcode/editor/cn/P495_TeemoAttacking.java)|😄|
|💚 | [P504_七进制数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P504_Base7.md)                                               | 记得考虑负数                                                                                                      |[P504_Base7.java](./src/main/java/com/uyaki/leetcode/editor/cn/P504_Base7.java)|😄|
|💚 | [P506_相对名次](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P506_RelativeRanks.md)                                       | 👍 二位数组记录原始下标                                                                                               |[P506_RelativeRanks.java](./src/main/java/com/uyaki/leetcode/editor/cn/P506_RelativeRanks.java)|😄|
|💚 | [P507_完美数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P507_PerfectNumber.md)                                        | 🍼 入门                                                                                                       |[P507_PerfectNumber.java](./src/main/java/com/uyaki/leetcode/editor/cn/P507_PerfectNumber.java)|😄|
|💛 | [P519_随机翻转矩阵](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P519_RandomFlipMatrix.md)                                  | 👍 数组映射                                                                                                     |[P519_RandomFlipMatrix.java](./src/main/java/com/uyaki/leetcode/editor/cn/P519_RandomFlipMatrix.java)|😄|
|💛 | [P553_最优除法](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P553_OptimalDivision.md)                                     | 🍼 入门                                                                                                       |[P553_OptimalDivision.java](./src/main/java/com/uyaki/leetcode/editor/cn/P553_OptimalDivision.java)|😄|
|❤️ | [P587_安装栅栏](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P587_ErectTheFence.md)                                       | 👍 可耻的cv，有空再看                                                                                               |[P587_ErectTheFence.java](./src/main/java/com/uyaki/leetcode/editor/cn/P587_ErectTheFence.java)|😄|
|💚 | [P598_范围求和 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P598_RangeAdditionIi.md)                                  | 👎 数学                                                                                                       |[P598_RangeAdditionIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P598_RangeAdditionIi.java)|😄|
|💚 | [P728_自除数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P728_SelfDividingNumbers.md)                                  | 🍼 入门                                                                                                       |[P728_SelfDividingNumbers.java](./src/main/java/com/uyaki/leetcode/editor/cn/P728_SelfDividingNumbers.java)|😄|
|💚 | [P762_二进制表示中质数个计算置位](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P762_PrimeNumberOfSetBitsInBinaryRepresentation.md) | 🍼 入门                                                                                                       |[P762_PrimeNumberOfSetBitsInBinaryRepresentation.java](./src/main/java/com/uyaki/leetcode/editor/cn/P762_PrimeNumberOfSetBitsInBinaryRepresentation.java)|😄|
|❤️ | [P780_到达终点](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P780_ReachingPoints.md)                                      | 👍逆向思维                                                                                                      |[P780_ReachingPoints.java](./src/main/java/com/uyaki/leetcode/editor/cn/P780_ReachingPoints.java)|🤯|
|❤️ | [P798_得分最高的最小轮调](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P798_SmallestRotationWithHighestScore.md)               | 👍差分数组                                                                                                      |[P798_SmallestRotationWithHighestScore.java](./src/main/java/com/uyaki/leetcode/editor/cn/P798_SmallestRotationWithHighestScore.java)|🤯|
|💚 | [P883_三维形体投影面积](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P883_ProjectionAreaOf3dShapes.md)                        | 🍼 入门                                                                                                       |[P883_ProjectionAreaOf3dShapes.java](./src/main/java/com/uyaki/leetcode/editor/cn/P883_ProjectionAreaOf3dShapes.java)|😄|
|💚 | [P908_最小差值 I](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P908_SmallestRangeI.md)                        | 🍼 入门                                                                                                       |[P908_SmallestRangeI.java](./src/main/java/com/uyaki/leetcode/editor/cn/P908_SmallestRangeI.java)|😄|
|💚 | [P1154_一年中的第几天](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1154_DayOfTheYear.md)                                   | 🍼 入门                                                                                                       |[P1154_DayOfTheYear.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1154_DayOfTheYear.java)|😄|
|💚 | [P1185_一周中的第几天](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1185_DayOfTheWeek.md)                                   | 🍼 入门                                                                                                       |[P1185_DayOfTheWeek.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1185_DayOfTheWeek.java)|😄|
|💛 | [P1447_最简分数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1447_SimplifiedFractions.md)                               | 👍 数论                                                                                                       |[P1447_SimplifiedFractions.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1447_SimplifiedFractions.java)|😄|
|💚 | [P1518_换酒问题](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1518_WaterBottles.md)                                      | 🍼 入门                                                                                                       |[P1518_WaterBottles.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1518_WaterBottles.java)|😄|
|💚 | [P1672_最富有客户的资产总量](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1672_RichestCustomerWealth.md)                       | 🍼 入门                                                                                                       |[P1672_RichestCustomerWealth.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1672_RichestCustomerWealth.java)|😄|
|💚 | [P1688_比赛中的配对次数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1688_CountOfMatchesInTournament.md)                    | 🍼 入门                                                                                                       |[P1688_CountOfMatchesInTournament.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1688_CountOfMatchesInTournament.java)|😄|
|💚 | [P1716_计算力扣银行的钱](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1716_CalculateMoneyInLeetcodeBank.md)                  | 🍼 入门                                                                                                       |[P1716_CalculateMoneyInLeetcodeBank.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1716_CalculateMoneyInLeetcodeBank.java)|😄|
|+++| 快速幂                                                                                                                               | +++                                                                                                         |快速幂|+++|
|💛 | [P50_Pow(x, n)](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P50_PowxN.md)                                            | 👍 [快速幂](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/FastPow.md)                             |[P50_PowxN.java](./src/main/java/com/uyaki/leetcode/editor/cn/P50_PowxN.java)|😄|
|💛 | [P372_超级次方](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P372_SuperPow.md)                                            | 👍 [快速幂](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/FastPow.md)                             |[P166_FractionToRecurringDecimal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P372_SuperPow.java)|😄|

---

## 模拟|设计

|难度| 题目                                                                                                                                | 题解      |代码|掌握度|
|:---:|:----------------------------------------------------------------------------------------------------------------------------------|:--------|:---|:---:|
|💛 | [P380_O(1) 时间插入、删除和获取随机元素](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P380_InsertDeleteGetrandomO1.md)              | 🍼 入门   |[P380_InsertDeleteGetrandomO1.java](./src/main/java/com/uyaki/leetcode/editor/cn/P380_InsertDeleteGetrandomO1.java)|😄|
|💛 | [P398_随机数索引](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P398_RandomPickIndex.md)               | 👍 水塘抽样 |[P398_RandomPickIndex.java](./src/main/java/com/uyaki/leetcode/editor/cn/P398_RandomPickIndex.java)|😄|
|💛 | [P537_复数乘法](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P537_ComplexNumberMultiplication.md)                         | 🍼 入门   |[P537_ComplexNumberMultiplication.java](./src/main/java/com/uyaki/leetcode/editor/cn/P537_ComplexNumberMultiplication.java)|😄|
|💚 | [P661_图片平滑器](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P661_ImageSmoother.md)                                      | 🍼 入门   |[P661_ImageSmoother.java](./src/main/java/com/uyaki/leetcode/editor/cn/P661_ImageSmoother.java)|😄|
|❤️ | [1606_找到处理最多请求的服务器](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1606_FindServersThatHandledMostNumberOfRequests.md) | 模拟+优先队列 |[P1606_FindServersThatHandledMostNumberOfRequests.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1606_FindServersThatHandledMostNumberOfRequests.java)|😄|
|💛 | [P1706_球会落何处](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1706_WhereWillTheBallFall.md)                             |         |[P1706_WhereWillTheBallFall.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1706_WhereWillTheBallFall.java)|😄|
|💛 | [P2028_找出缺失的观测数据](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2028_FindMissingObservations.md)                      | 🍼 入门   |[P2028_FindMissingObservations.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2028_FindMissingObservations.java)|😄|
|💛 | [P2043_简易银行系统](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2043_SimpleBankSystem.md)                                | 🍼 入门   |[P2043_SimpleBankSystem.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2043_SimpleBankSystem.java)|😄|

---

## 预处理

|难度| 题目                                                                                                   | 题解                        |代码|掌握度|
|:---:|:-----------------------------------------------------------------------------------------------------|:--------------------------|:---|:---:|
|💛 | [P2055_蜡烛之间的盘子](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2055_PlatesBetweenCandles.md) |    👍预处理 + 前缀和      |[P2055_PlatesBetweenCandles.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2055_PlatesBetweenCandles.java)|😄|

---

## 字符串操作

|难度| 题目                                                                                                                                  | 题解                        |代码|掌握度|
|:---:|:------------------------------------------------------------------------------------------------------------------------------------|:--------------------------|:---|:---:|
|💛 | [P5_最长回文子串](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P5_LongestPalindromicSubstring.md)                             | 👍 中心扩展算法                 |[P5_LongestPalindromicSubstring.java](./src/main/java/com/uyaki/leetcode/editor/cn/P5_LongestPalindromicSubstring.java)|😄|
|💛 | [P6_Z 字形变换](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P6_ZigzagConversion.md)                                        | 👍 根据变量判断方向               |[P6_ZigzagConversion.java](./src/main/java/com/uyaki/leetcode/editor/cn/P6_ZigzagConversion.java)|😄|
|💛 | [P38_外观数列](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P38_CountAndSay.md)                                             | ❓ 出题意义不明                  |[P38_CountAndSay.java](./src/main/java/com/uyaki/leetcode/editor/cn/P38_CountAndSay.java)|😄|
|❤️ | [P273_整数转换英文表示](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P273_IntegerToEnglishWords.md)                             | ❓ 出题意义不明                  |[P273_IntegerToEnglishWords.java](./src/main/java/com/uyaki/leetcode/editor/cn/P273_IntegerToEnglishWords.java)|😄|
|💛 | [P299_猜数字游戏](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P299_BullsAndCows.md)                                         | ❓ 出题意义不明                  |[P299_BullsAndCows.java](./src/main/java/com/uyaki/leetcode/editor/cn/P299_BullsAndCows.java)|😄|
|💛 | [P318_最大单词长度乘积](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P318_MaximumProductOfWordLengths.md)                       |                           |[P318_MaximumProductOfWordLengths.java](./src/main/java/com/uyaki/leetcode/editor/cn/P318_MaximumProductOfWordLengths.java)|😄|
|💚 | [P383_赎金信](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P383_RansomNote.md)                                             | 🍼 入门                     |[P383_RansomNote.java](./src/main/java/com/uyaki/leetcode/editor/cn/P383_RansomNote.java)|😄|
|💚 | [P434_字符串中的单词数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P434_NumberOfSegmentsInAString.md)                         |                           |[P434_NumberOfSegmentsInAString.java](./src/main/java/com/uyaki/leetcode/editor/cn/P434_NumberOfSegmentsInAString.java)|😄|
|💚 | [P482_密钥格式化](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P482_LicenseKeyFormatting.md)                                 |                           |[P482_LicenseKeyFormatting.java](./src/main/java/com/uyaki/leetcode/editor/cn/P482_LicenseKeyFormatting.java)|😄|
|💚 | [P500_键盘行](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P500_KeyboardRow.md)                                            |                           |[P500_KeyboardRow.java](./src/main/java/com/uyaki/leetcode/editor/cn/P500_KeyboardRow.java)|😄|
|💚 | [P520_检测大写字母](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P520_DetectCapital.md)                                       |                           |[P520_DetectCapital.java](./src/main/java/com/uyaki/leetcode/editor/cn/P520_DetectCapital.java)|😄|
|💚 | [P521_最长特殊序列 Ⅰ](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P521_LongestUncommonSubsequenceI.md)                       |                           |[P521_LongestUncommonSubsequenceI.java](./src/main/java/com/uyaki/leetcode/editor/cn/P521_LongestUncommonSubsequenceI.java)|😄|
|❤️ | [P564_寻找最近的回文数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P564_FindTheClosestPalindrome.md)                          | 👍回文                        |[P564_FindTheClosestPalindrome.java](./src/main/java/com/uyaki/leetcode/editor/cn/P564_FindTheClosestPalindrome.java)|😄|
|💚 | [P709_转换成小写字母](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P709_ToLowerCase.md)                                        | 🍼 入门                     |[P709_ToLowerCase.java](./src/main/java/com/uyaki/leetcode/editor/cn/P709_ToLowerCase.java)|😄|
|💚 | [P748_最短补全词](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P748_ShortestCompletingWord.md)                               | 🍼 入门                     |[P748_ShortestCompletingWord.java](./src/main/java/com/uyaki/leetcode/editor/cn/P748_ShortestCompletingWord.java)|😄|
|💛 | [P794_有效的井字游戏](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P794_ValidTicTacToeState.md)                                |                           |[P794_ValidTicTacToeState.java](./src/main/java/com/uyaki/leetcode/editor/cn/P794_ValidTicTacToeState.java)|😄|
|💚 | [P796_旋转字符串](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P796_RotateString.md)                                         | 🍼 入门                     |[P796_RotateString.java](./src/main/java/com/uyaki/leetcode/editor/cn/P796_RotateString.java)|😄|
|💚 | [P804_唯一摩尔斯密码词](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P804_UniqueMorseCodeWords.md)                              | 🍼 入门                     |[P804_UniqueMorseCodeWords.java](./src/main/java/com/uyaki/leetcode/editor/cn/P804_UniqueMorseCodeWords.java)|😄|
|💚 | [P806_写字符串需要的行数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P806_NumberOfLinesToWriteString.md)                       | 🍼 入门                     |[P806_NumberOfLinesToWriteString.java](./src/main/java/com/uyaki/leetcode/editor/cn/P806_NumberOfLinesToWriteString.java)|😄|
|💚 | [P819_最常见的单词](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P819_MostCommonWord.md)                                      | 🍼 入门                     |[P819_MostCommonWord.java](./src/main/java/com/uyaki/leetcode/editor/cn/P819_MostCommonWord.java)|😄|
|💚 | [P824_山羊拉丁文](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P824_GoatLatin.md)                                      | 🍼 入门                     |[P824_GoatLatin.java](./src/main/java/com/uyaki/leetcode/editor/cn/P824_GoatLatin.java)|😄|
|💛 | [P838_推多米诺](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P838_PushDominoes.md)                                          |                           |[P838_PushDominoes.java](./src/main/java/com/uyaki/leetcode/editor/cn/P838_PushDominoes.java)|😄|
|💚 | [P859_亲密字符串](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P859_BuddyStrings.md)                                         |                           |[P859_BuddyStrings.java](./src/main/java/com/uyaki/leetcode/editor/cn/P859_BuddyStrings.java)|😄|
|💚 | [P884_两句话中的不常见单词](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P884_UncommonWordsFromTwoSentences.md)                   | 🍼 入门                     |[P884_UncommonWordsFromTwoSentences.java](./src/main/java/com/uyaki/leetcode/editor/cn/P884_UncommonWordsFromTwoSentences.java)|😄|
|💚 | [P1078_Bigram 分词](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1078_OccurrencesAfterBigram.md)                         | 🍼 入门                     |[P1078_OccurrencesAfterBigram.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1078_OccurrencesAfterBigram.java)|😄|
|💚 | [P1189_“气球” 的最大数量](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1189_MaximumNumberOfBalloons.md)                       | 🍼 入门                     |[P1189_MaximumNumberOfBalloons.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1189_MaximumNumberOfBalloons.java)|😄|
|💚 | [P1332_删除回文子序列](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1332_RemovePalindromicSubsequences.md)                    | 🍼 入门，子序列不是子串             |[P1332_RemovePalindromicSubsequences.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1332_RemovePalindromicSubsequences.java)|😄|
|💚 | [P1446_连续字符](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1446_ConsecutiveCharacters.md)                               | 🍼 入门                     |[P1446_ConsecutiveCharacters.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1446_ConsecutiveCharacters.java)|😄|
|💚 | [P1576_替换所有的问号](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1576_ReplaceAllSToAvoidConsecutiveRepeatingCharacters.md) | 🍼 入门                     |[P1576_ReplaceAllSToAvoidConsecutiveRepeatingCharacters.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1576_ReplaceAllSToAvoidConsecutiveRepeatingCharacters.java)|😄|
|💚 | [P1614_括号的最大嵌套深度](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1614_MaximumNestingDepthOfTheParentheses.md)            | 🍼 入门                     |[P1614_MaximumNestingDepthOfTheParentheses.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1614_MaximumNestingDepthOfTheParentheses.java)|😄|
|💚 | [P1629_按键持续时间最长的键](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1629_SlowestKey.md)                                    | 🍼 入门                     |[P1629_SlowestKey.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1629_SlowestKey.java)|😄|
|💚 | [P1816_截断句子](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1816_TruncateSentence.md)                                    | 🍼 入门                     |[P1816_TruncateSentence.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1816_TruncateSentence.java)|😄|
|💚 | [P2000_反转单词前缀](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2000_ReversePrefixOfWord.md)                               | 🍼 入门                     |[P2000_ReversePrefixOfWord.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2000_ReversePrefixOfWord.java)|😄|
|💚 | [P2047_句子中的有效单词数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2047_NumberOfValidWordsInASentence.md)                  | 🍼 入门                     |[P2047_NumberOfValidWordsInASentence.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2047_NumberOfValidWordsInASentence.java)|😄|
|+++| Rabin-Karp 算法                                                                                                                       | +++                       | Rabin-Karp 算法 |+++|
|💛 | [P686_重复叠加字符串匹配](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P686_RepeatedStringMatch.md)                              | 👍 也可以用KMP算法              |[P686_RepeatedStringMatch.java](./src/main/java/com/uyaki/leetcode/editor/cn/P686_RepeatedStringMatch.java)|😄|
|❤️ | [P1044_最长重复子串](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1044_LongestDuplicateSubstring.md)                         | 👍二分查找 + Rabin-Karp 字符串编码 |[P1044_LongestDuplicateSubstring.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1044_LongestDuplicateSubstring.java)|😄|

---

## 数组

|难度| 题目                                                                                                                                      | 题解                                                                                                | 代码                                                                                                                                                                |掌握度|
|:---:|:----------------------------------------------------------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------|:---:|
|❤️ | [P4_寻找两个正序数组的中位数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P4_MedianOfTwoSortedArrays.md)                               |                                                                                                   | [P4_MedianOfTwoSortedArrays.java](./src/main/java/com/uyaki/leetcode/editor/cn/P4_MedianOfTwoSortedArrays.java)                                                   |😄|
|💛 | [P260_只出现一次的数字 III](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P260_SingleNumberIii.md)                                   |                                                                                                   | [P260_SingleNumberIii.java](./src/main/java/com/uyaki/leetcode/editor/cn/P260_SingleNumberIii.java)                                                               |😄|
|💛 | [P284_顶端迭代器](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P284_PeekingIterator.md)                                          |                                                                                                   | [P284_PeekingIterator.java](./src/main/java/com/uyaki/leetcode/editor/cn/P284_PeekingIterator.java)                                                               |😄|
|💛 | [P384_打乱数组](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P384_ShuffleAnArray.md)                                            |                                                                                                   | [P384_ShuffleAnArray.java](./src/main/java/com/uyaki/leetcode/editor/cn/P384_ShuffleAnArray.java)                                                                 |😄|
|💚 | [P594_最长和谐子序列](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P594_LongestHarmoniousSubsequence.md)                           |                                                                                                   | [P594_LongestHarmoniousSubsequence.java](./src/main/java/com/uyaki/leetcode/editor/cn/P594_LongestHarmoniousSubsequence.java)                                     |😄|
|💚 | [P717_1比特与2比特字符](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P717_OneBitAnd2BitCharacters.md)                              |                                                                                                   | [P717_OneBitAnd2BitCharacters.java](./src/main/java/com/uyaki/leetcode/editor/cn/P717_OneBitAnd2BitCharacters.java)                                               |😄|
|💚 | [P744_寻找比目标字母大的最小字母](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P744_FindSmallestLetterGreaterThanTarget.md)              |                                                                                                   | [P744_FindSmallestLetterGreaterThanTarget.java](./src/main/java/com/uyaki/leetcode/editor/cn/P744_FindSmallestLetterGreaterThanTarget.java)                       |😄|
|💚 | [P747_至少是其他数字两倍的最大数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P747_LargestNumberAtLeastTwiceOfOthers.md)                |                                                                                                   | [P747_LargestNumberAtLeastTwiceOfOthers.java](./src/main/java/com/uyaki/leetcode/editor/cn/P747_LargestNumberAtLeastTwiceOfOthers.java)                           |😄|
|💛 | [P807_保持城市天际线](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P807_MaxIncreaseToKeepCitySkyline.md)                           | 🍼 入门                                                                                             | [P807_MaxIncreaseToKeepCitySkyline.java](./src/main/java/com/uyaki/leetcode/editor/cn/P807_MaxIncreaseToKeepCitySkyline.java)                                     |😄|
|💛 | [P911_在线选举](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P911_OnlineElection.md)                                            | 二分法                                                                                               | [P911_OnlineElection.java](./src/main/java/com/uyaki/leetcode/editor/cn/P911_OnlineElection.java)                                                                 |😄|
|💚 | [P997_找到小镇的法官](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P997_FindTheTownJudge.md)                                       | 🍼 入门                                                                                             | [P997_FindTheTownJudge.java](./src/main/java/com/uyaki/leetcode/editor/cn/P997_FindTheTownJudge.java)                                                             |😄|
|💚 | [P1380_矩阵中的幸运数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1380_LuckyNumbersInAMatrix.md)                                | 🍼 入门                                                                                             | [P1380_LuckyNumbersInAMatrix.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1380_LuckyNumbersInAMatrix.java)                                                 |😄|
|💚 | [P1725_可以形成最大正方形的矩形数目](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1725_NumberOfRectanglesThatCanFormTheLargestSquare.md) | 🍼 入门                                                                                             | [P1725_NumberOfRectanglesThatCanFormTheLargestSquare.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1725_NumberOfRectanglesThatCanFormTheLargestSquare.java) |😄|
|💚 | [P1748_唯一元素的和](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1748_SumOfUniqueElements.md)                                   | 🍼🍼🍼 入门                                                                                         | [P1748_SumOfUniqueElements.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1748_SumOfUniqueElements.java)                                                     |😄|
|💚 | [P2006_差的绝对值为 K 的数对数目](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2006_CountNumberOfPairsWithAbsoluteDifferenceK.md)     | 🍼 入门                                                                                             | [P2006_CountNumberOfPairsWithAbsoluteDifferenceK.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2006_CountNumberOfPairsWithAbsoluteDifferenceK.java)         |😄|
|💚 | [P2016_增量元素之间的最大差值](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2016_MaximumDifferenceBetweenIncreasingElements.md)       | 👍前缀最小值                                                                                           | [P2016_MaximumDifferenceBetweenIncreasingElements.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2016_MaximumDifferenceBetweenIncreasingElements.java)       |😄|
|💚 | [P2022_将一维数组转变成二维数组](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2022_Convert1dArrayInto2dArray.md)                       | 🍼 入门                                                                                             | [P2022_Convert1dArrayInto2dArray.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2022_Convert1dArrayInto2dArray.java)                                         |😄|
|+++| 排列组合                                                                                                                                    | +++                                                                                               | 排列组合                                                                                                                                                              |+++|
|💛 | [P46_全排列](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P46_Permutations.md)                                                 | 👍[排列组合](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/PermutationAndCombination.md) | [P46_Permutations.java](./src/main/java/com/uyaki/leetcode/editor/cn/P46_Permutations.java)                                                                       |😄|
|💛 | [P47_全排列 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P47_PermutationsIi.md)                                            | 👍[排列组合](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/PermutationAndCombination.md) | [P47_PermutationsIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P47_PermutationsIi.java)                                                                   |😄|
|💚 | [P1995_统计特殊四元组](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1995_CountSpecialQuadruplets.md)                              | 👍[排列组合](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/PermutationAndCombination.md) | [P1995_CountSpecialQuadruplets.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1995_CountSpecialQuadruplets.java)                                             |😄|
|+++| 树状数组                                                                                                                                    | +++                                                                                               | 树状数组                                                                                                                                                              |+++|
|💛 | [P307_区域和检索 - 数组可修改](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P307_RangeSumQueryMutable.md)                                       | 👍[树状数组](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/BinaryIndexedTree.md)                 | [P307_RangeSumQueryMutable.java](./src/main/java/com/uyaki/leetcode/editor/cn/P307_RangeSumQueryMutable.java)                                                                       |😄|

---

## 优先队列

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---|:---:|
|❤️ |[P23_合并K个升序链表](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P23_MergeKSortedLists.md) | |[P23_MergeKSortedLists.java](./src/main/java/com/uyaki/leetcode/editor/cn/P23_MergeKSortedLists.java)|🤨|
|💛 |[P373_查找和最小的 K 对数字](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P373_FindKPairsWithSmallestSums.md)<br/><br/>[P剑指offerII_和最小的 k 个数对](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P剑指_Offer_II_061_Qn8gGX.md) | 👍 优先队列 |[P373_FindKPairsWithSmallestSums.java](./src/main/java/com/uyaki/leetcode/editor/cn/P373_FindKPairsWithSmallestSums.java)<br/><br/>[P剑指_Offer_II_061_Qn8gGX.java](./src/main/java/com/uyaki/leetcode/editor/cn/P剑指_Offer_II_061_Qn8gGX.java)|😄|
|❤️ |[P407_接雨水 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P407_TrappingRainWaterIi.md) |[P407_TrappingRainWaterIi](./src/main/java/com/uyaki/leetcode/editor/cn/doc/answer/P407_TrappingRainWaterIi.md)|[P407_TrappingRainWaterIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P407_TrappingRainWaterIi.java)|🤨|
|❤️ |[P786_第 K 个最小的素数分数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P786_KThSmallestPrimeFraction.md) | |[P786_KThSmallestPrimeFraction.java](./src/main/java/com/uyaki/leetcode/editor/cn/P786_KThSmallestPrimeFraction.java)|😄|
|💛 |[P1705_吃苹果的最大数目](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1705_MaximumNumberOfEatenApples.md) | 👍 优先队列、贪心 |[P1705_MaximumNumberOfEatenApples.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1705_MaximumNumberOfEatenApples.java)|😄|
|💛 |[P1514_概率最大的路径](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1514_PathWithMaximumProbability.md) | |[P1514_PathWithMaximumProbability.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1514_PathWithMaximumProbability.java)|😄|

---

## 排序

|难度| 题目                                                                                                                                     | 题解               |代码|掌握度|
|:---:|:---------------------------------------------------------------------------------------------------------------------------------------|:-----------------|:---|:---:|
|💛 | [P539_最小时间差](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P539_MinimumTimeDifference.md)                                   | 👍题目只能算ez，了解鸽巢原理 |[P539_MinimumTimeDifference.java](./src/main/java/com/uyaki/leetcode/editor/cn/P539_MinimumTimeDifference.java)|😄|
|💛 | [P969_煎饼排序](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P969_PancakeSorting.md)                                    | 👍题目只能算ez，了解鸽巢原理 |[P969_PancakeSorting.java](./src/main/java/com/uyaki/leetcode/editor/cn/P969_PancakeSorting.java)|😄|
|💚 | [P1984_学生分数的最小差值](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1984_MinimumDifferenceBetweenHighestAndLowestOfKScores.md) |                  |[P1984_MinimumDifferenceBetweenHighestAndLowestOfKScores.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1984_MinimumDifferenceBetweenHighestAndLowestOfKScores.java)|😄|
|💛 | [P1996_游戏中弱角色的数量](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1996_TheNumberOfWeakCharactersInTheGame.md)                | 👍题目只能算ez，入门     |[P1996_TheNumberOfWeakCharactersInTheGame.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1996_TheNumberOfWeakCharactersInTheGame.java)|😄|

---

## 哈希

|难度| 题目                                                                                                 |题解|代码|掌握度|
|:---:|:---------------------------------------------------------------------------------------------------|:---|:---|:---:|
|💚 | [P599_两个列表的最小索引总和](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P599_MinimumIndexSumOfTwoLists.md) | |[P599_MinimumIndexSumOfTwoLists.java](./src/main/java/com/uyaki/leetcode/editor/cn/P599_MinimumIndexSumOfTwoLists.java)|😄|
|💛 | [P677_键值映射](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P677_MapSumPairs.md)          | |[P677_MapSumPairs.java](./src/main/java/com/uyaki/leetcode/editor/cn/P677_MapSumPairs.java)|😄|
|❤️ | [P1001_网格照明](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1001_GridIllumination.md)   | |[P1001_GridIllumination.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1001_GridIllumination.java)|🤯|
|💛 | [P2013_检测正方形](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2013_DetectSquares.md)     | |[P2013_DetectSquares.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2013_DetectSquares.java)|😄|

---

## 递归

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---|:---:|
|💛 |[P2_两数相加](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2_AddTwoNumbers.md) | |[P2_AddTwoNumbers.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2_AddTwoNumbers.java)|😄|
|💚 |[P21_合并两个有序链表](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P21_MergeTwoSortedLists.md) | |[P21_MergeTwoSortedLists.java](./src/main/java/com/uyaki/leetcode/editor/cn/P21_MergeTwoSortedLists.java)|😄|

---

## 位运算

|难度| 题目                                                                                                                          | 题解           |代码|掌握度|
|:---:|:----------------------------------------------------------------------------------------------------------------------------|:-------------|:---|:---:|
|💛 | [P89_格雷编码](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P89_GrayCode.md)                                        |              |[P89_GrayCode.java](./src/main/java/com/uyaki/leetcode/editor/cn/P89_GrayCode.java)|🤯🤯|
|💚 | [P190_颠倒二进制位](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P190_ReverseBits.md)                                 |              |[P190_ReverseBits.java](./src/main/java/com/uyaki/leetcode/editor/cn/P190_ReverseBits.java)|😄|
|💚 | [P231_2 的幂](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P231_PowerOfTwo.md)                                    | 👍👍 位运算     |[P231_PowerOfTwo.java](./src/main/java/com/uyaki/leetcode/editor/cn/P231_PowerOfTwo.java)|😄|
|💚 | [P268_丢失的数字](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P268_MissingNumber.md)                                | 👍👍 异或`^`抵消 |[P268_MissingNumber.java](./src/main/java/com/uyaki/leetcode/editor/cn/P268_MissingNumber.java)|😄|
|💛 | [P393_UTF-8 编码验证](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P393_Utf8Validation.md)                          | 👍位移         |[P393_Utf8Validation.java](./src/main/java/com/uyaki/leetcode/editor/cn/P393_Utf8Validation.java)|😄|
|💚 | [P476_数字的补数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P476_NumberComplement.md)                             |              |[P476_NumberComplement.java](./src/main/java/com/uyaki/leetcode/editor/cn/P476_NumberComplement.java)|🤨|
|💚 | [P693_交替位二进制数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P693_BinaryNumberWithAlternatingBits.md)            | 👍位移+异或+与    |[P693_BinaryNumberWithAlternatingBits.java](./src/main/java/com/uyaki/leetcode/editor/cn/P693_BinaryNumberWithAlternatingBits.java)|😄|
|💚 | [P868_二进制间距](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P868_BinaryGap.md)            | 👍位移+异或+与    |[P868_BinaryGap.java](./src/main/java/com/uyaki/leetcode/editor/cn/P868_BinaryGap.java)|😄|
|💚 | [P1342_将数字变成 0 的操作次数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1342_NumberOfStepsToReduceANumberToZero.md) | 🍼 入门        |[P1342_NumberOfStepsToReduceANumberToZero.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1342_NumberOfStepsToReduceANumberToZero.java)|🤨|

---

## 堆

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---|:---:|
|❤️ |[P407_接雨水 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P407_TrappingRainWaterIi.md) |[P407_TrappingRainWaterIi](./src/main/java/com/uyaki/leetcode/editor/cn/doc/answer/P407_TrappingRainWaterIi.md)|[P407_TrappingRainWaterIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P407_TrappingRainWaterIi.java)|🤨|

---

## 栈

|难度| 题目                                                                                                        | 题解    |代码|掌握度|
|:---:|:----------------------------------------------------------------------------------------------------------|:------|:---|:---:|
|💚 | [P20_有效的括号](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P20_ValidParentheses.md)             |       |[P20_ValidParentheses.java](./src/main/java/com/uyaki/leetcode/editor/cn/P20_ValidParentheses.java)|😄|
|💛 | [P71_简化路径](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P71_SimplifyPath.md)                  |       |[P71_SimplifyPath.java](./src/main/java/com/uyaki/leetcode/editor/cn/P71_SimplifyPath.java)|😄|
|💚 | [P155_最小栈](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P155_MinStack.md)                     |       |[P155_MinStack.java](./src/main/java/com/uyaki/leetcode/editor/cn/P155_MinStack.java)|😄|
|💚 | [P225_用队列实现栈](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P225_ImplementStackUsingQueues.md) |       |[P225_ImplementStackUsingQueues.java](./src/main/java/com/uyaki/leetcode/editor/cn/P225_ImplementStackUsingQueues.java)|😄|
|💚 | [P232_用栈实现队列](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P232_ImplementQueueUsingStacks.md) |       |[P232_ImplementQueueUsingStacks.java](./src/main/java/com/uyaki/leetcode/editor/cn/P232_ImplementQueueUsingStacks.java)|😄|
|💚 | [P496_下一个更大元素 I](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P496_NextGreaterElementI.md)    |       |[P496_NextGreaterElementI.java](./src/main/java/com/uyaki/leetcode/editor/cn/P496_NextGreaterElementI.java)|😄|
|💚 | [P682_棒球比赛](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P682_BaseballGame.md)                |       |[P682_BaseballGame.java](./src/main/java/com/uyaki/leetcode/editor/cn/P682_BaseballGame.java)|😄|
|💛 | [P2104_子数组范围和](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2104_SumOfSubarrayRanges.md)                | 👍单调栈 |[P2104_SumOfSubarrayRanges.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2104_SumOfSubarrayRanges.java)|😄|

---

## 链表

|难度| 题目                                                                                                        | 题解       |代码|掌握度|
|:---:|:----------------------------------------------------------------------------------------------------------|:---------|:---|:---:|
|💚 | [P234_回文链表](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P234_PalindromeLinkedList.md)        |          |[P234_PalindromeLinkedList.java](./src/main/java/com/uyaki/leetcode/editor/cn/P234_PalindromeLinkedList.java)|😄|
|💚 | [P237_删除链表中的节点](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P237_DeleteNodeInALinkedList.md) |          |[P237_DeleteNodeInALinkedList.java](./src/main/java/com/uyaki/leetcode/editor/cn/P237_DeleteNodeInALinkedList.java)|😄|
|💛 | [P382_链表随机节点](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P382_LinkedListRandomNode.md)      | 👍水塘抽样   |[P382_LinkedListRandomNode.java](./src/main/java/com/uyaki/leetcode/editor/cn/P382_LinkedListRandomNode.java)|😄|
|❤️ | [P432_全 O(1) 的数据结构](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P432_AllOoneDataStructure.md)       | 👍手写双向链表 |[P432_AllOoneDataStructure.java](./src/main/java/com/uyaki/leetcode/editor/cn/P432_AllOoneDataStructure.java)|🤨|

---

## 滑动窗口

|难度| 题目                                                                                                                         |题解|代码|掌握度|
|:---:|:---------------------------------------------------------------------------------------------------------------------------|:---|:---|:---:|
|💛 | [P3_无重复字符的最长子串](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P3_LongestSubstringWithoutRepeatingCharacters.md) | |[P3_LongestSubstringWithoutRepeatingCharacters.java](./src/main/java/com/uyaki/leetcode/editor/cn/P3_LongestSubstringWithoutRepeatingCharacters.java)|😄|
|💛 | [P15_三数之和](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P15_ThreeSum.md)                                       | |[P15_ThreeSum.java](./src/main/java/com/uyaki/leetcode/editor/cn/P15_ThreeSum.java)|😄|
|💛 | [P187_重复的DNA序列](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P187_RepeatedDnaSequences.md)                     | |[P187_RepeatedDnaSequences.java](./src/main/java/com/uyaki/leetcode/editor/cn/P187_RepeatedDnaSequences.java)|😄|
|💛 | [P209_长度最小的子数组](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P209_MinimumSizeSubarraySum.md)                   | |[P209_MinimumSizeSubarraySum.java](./src/main/java/com/uyaki/leetcode/editor/cn/P209_MinimumSizeSubarraySum.java)|😄|
|💚 | [P219_存在重复元素 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P219_ContainsDuplicateIi.md)                     | |[P219_ContainsDuplicateIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P219_ContainsDuplicateIi.java)|😄|
|💛 | [P438_找到字符串中所有字母异位词](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P438_FindAllAnagramsInAString.md)            | |[P438_FindAllAnagramsInAString.java](./src/main/java/com/uyaki/leetcode/editor/cn/P438_FindAllAnagramsInAString.java)|😄|
|❤️ | [P689_三个无重叠子数组的最大和](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P689_MaximumSumOf3NonOverlappingSubarrays.md) | 👍  |[P689_MaximumSumOf3NonOverlappingSubarrays.java](./src/main/java/com/uyaki/leetcode/editor/cn/P689_MaximumSumOf3NonOverlappingSubarrays.java)|😄|
|💚 | [P1763_最长的美好子字符串](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1763_LongestNiceSubstring.md)                    | |[P1763_LongestNiceSubstring.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1763_LongestNiceSubstring.java)|😄|

---

## 树

|难度| 题目                                                                                                                          | 题解                                                                                                                                    |代码|掌握度|
|:---:|:----------------------------------------------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------------------------------------------|:---|:---:|
|💛 | [P95_不同的二叉搜索树 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P95_UniqueBinarySearchTreesIi.md)                |                                                                                                                                       |[P95_UniqueBinarySearchTreesIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P95_UniqueBinarySearchTreesIi.java)|😄|
|💛 | [P98_验证二叉搜索树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P98_ValidateBinarySearchTree.md)                     |                                                                                                                                       |[P98_ValidateBinarySearchTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P98_ValidateBinarySearchTree.java)|😄|
|💛 | [P99_恢复二叉搜索树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P99_RecoverBinarySearchTree.md)                      |                                                                                                                                       |[P99_RecoverBinarySearchTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P99_RecoverBinarySearchTree.java)|😄|
|💚 | [P100_相同的树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P100_SameTree.md)                                      |                                                                                                                                       |[P100_SameTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P100_SameTree.java)|😄|
|💚 | [P101_对称二叉树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P101_SymmetricTree.md)                                |                                                                                                                                       |[P101_SymmetricTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P101_SymmetricTree.java)|😄|
|💚 | [P108_将有序数组转换为二叉搜索树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P108_ConvertSortedArrayToBinarySearchTree.md) | 树+分治法                                                                                                                                 |[P108_ConvertSortedArrayToBinarySearchTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P108_ConvertSortedArrayToBinarySearchTree.java)|😄|
|💛 | [P427_建立四叉树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P427_ConstructQuadTree.md)                     | cv，有空再看                                                                                                                               |[P427_ConstructQuadTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P427_ConstructQuadTree.java)|😄|
|💚 | [P563_二叉树的坡度](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P563_BinaryTreeTilt.md)                              |                                                                                                                                       |[P563_BinaryTreeTilt.java](./src/main/java/com/uyaki/leetcode/editor/cn/P563_BinaryTreeTilt.java)|😄|
|💚 | [P700_二叉搜索树中的搜索](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P700_SearchInABinarySearchTree.md)                | 🍼 入门                                                                                                                                 |[P700_SearchInABinarySearchTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P700_SearchInABinarySearchTree.java)|😄|
|❤️❤️❤️ | [P1719_重构一棵树的方案数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1719_NumberOfWaysToReconstructATree.md)         | [官方题解](https://leetcode-cn.com/problems/number-of-ways-to-reconstruct-a-tree/solution/zhong-gou-yi-ke-shu-de-fang-an-shu-by-le-36e1/) |[P1719_NumberOfWaysToReconstructATree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1719_NumberOfWaysToReconstructATree.java)|🤯🤯🤯|
|+++| N叉树                                                                                                                         | +++                                                                                                                                   |N叉树|+++|
|💛 | [P429_N 叉树的层序遍历](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P429_NAryTreeLevelOrderTraversal.md)              | 🍼 入门                                                                                                                                 |[P429_NAryTreeLevelOrderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P429_NAryTreeLevelOrderTraversal.java)|😄|
|💚 | [P559_N 叉树的最大深度](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P559_MaximumDepthOfNAryTree.md)                   | 🍼 入门                                                                                                                                 |[P559_MaximumDepthOfNAryTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P559_MaximumDepthOfNAryTree.java)|😄|
|💚 | [P589_N 叉树的前序遍历](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P589_NAryTreePreorderTraversal.md)                | 🍼 入门                                                                                                                                 |[P589_NAryTreePreorderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P589_NAryTreePreorderTraversal.java)|😄|
|💚 | [P590_N 叉树的后序遍历](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P590_NAryTreePostorderTraversal.md)               | 🍼 入门                                                                                                                                 |[P590_NAryTreePostorderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P590_NAryTreePostorderTraversal.java)|😄|

### 树的遍历

|难度| 题目                                                                                                                                           | 题解          |代码|掌握度|
|:---:|:---------------------------------------------------------------------------------------------------------------------------------------------|:------------|:---|:---:|
|💚 | [P94_二叉树的中序遍历](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P94_BinaryTreeInorderTraversal.md)                                   |             |[P94_BinaryTreeInorderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P94_BinaryTreeInorderTraversal.java)|😄|
|💛 | [P103_二叉树的锯齿形层序遍历](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P103_BinaryTreeZigzagLevelOrderTraversal.md)                     |             |[P103_BinaryTreeZigzagLevelOrderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P103_BinaryTreeZigzagLevelOrderTraversal.java)|😄|
|💛 | [P105_从前序与中序遍历序列构造二叉树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P105_ConstructBinaryTreeFromPreorderAndInorderTraversal.md)  | 分治法         | [P105_ConstructBinaryTreeFromPreorderAndInorderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P105_ConstructBinaryTreeFromPreorderAndInorderTraversal.java)|😄|
|💛 | [P106_从中序与后序遍历序列构造二叉树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P106_ConstructBinaryTreeFromInorderAndPostorderTraversal.md) | 分治法         | [P106_ConstructBinaryTreeFromInorderAndPostorderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P106_ConstructBinaryTreeFromInorderAndPostorderTraversal.java)|😄|
|💛 | [P114_二叉树展开为链表](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P114_FlattenBinaryTreeToLinkedList.md)                              |             |[P114_FlattenBinaryTreeToLinkedList.java](./src/main/java/com/uyaki/leetcode/editor/cn/P114_FlattenBinaryTreeToLinkedList.java)|😄|
|💚 | [P144_二叉树的前序遍历](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P144_BinaryTreePreorderTraversal.md)                                |             |[P144_BinaryTreePreorderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P144_BinaryTreePreorderTraversal.java)|😄|
|💚 | [P145_二叉树的后序遍历](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P145_BinaryTreePostorderTraversal.md)                               |             |[P145_BinaryTreePostorderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P145_BinaryTreePostorderTraversal.java)|😄|
|💛 | [P230_二叉搜索树中第K小的元素](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P230_KthSmallestElementInABst.md)                               |             |[P230_KthSmallestElementInABst.java](./src/main/java/com/uyaki/leetcode/editor/cn/P230_KthSmallestElementInABst.java)|😄|
|💚 | [P606_根据二叉树创建字符串](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P606_ConstructStringFromBinaryTree.md)                            |             |[P606_ConstructStringFromBinaryTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P606_ConstructStringFromBinaryTree.java)|😄|
|💛 | [P1305_两棵二叉搜索树中的所有元素](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1305_AllElementsInTwoBinarySearchTrees.md)                              | 👍中序遍历+归并排序 |[P1305_AllElementsInTwoBinarySearchTrees.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1305_AllElementsInTwoBinarySearchTrees.java)|😄|
|+++| 层序遍历                                                                                                                                         | +++         |层序遍历|+++|
|💛 | [P102_二叉树的层序遍历](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P102_BinaryTreeLevelOrderTraversal.md)                              | 👍层序遍历      |[P102_BinaryTreeLevelOrderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P102_BinaryTreeLevelOrderTraversal.java)|😄|
|💛 | [P107_二叉树的层序遍历 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P107_BinaryTreeLevelOrderTraversalIi.md)                         | 👍层序遍历      |[P107_BinaryTreeLevelOrderTraversalIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P107_BinaryTreeLevelOrderTraversalIi.java)|😄|
|💛 | [P1609_奇偶树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1609_EvenOddTree.md)                                                   | 👍层序遍历      |[P1609_EvenOddTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1609_EvenOddTree.java)|😄|

### 深度优先搜索

|难度| 题目                                                                                                                             | 题解                                                                                                                     |代码|掌握度|
|:---:|:-------------------------------------------------------------------------------------------------------------------------------|:-----------------------------------------------------------------------------------------------------------------------|:---|:---:|
|💚 | [P104_二叉树的最大深度](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P104_MaximumDepthOfBinaryTree.md)                     |                                                                                                                        |[P104_MaximumDepthOfBinaryTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P104_MaximumDepthOfBinaryTree.java)|😄|
|💚 | [P110_平衡二叉树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P110_BalancedBinaryTree.md)                              |                                                                                                                        |[P110_BalancedBinaryTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P110_BalancedBinaryTree.java)|😄|
|💚 | [P111_二叉树的最小深度](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P111_MinimumDepthOfBinaryTree.md)                     |                                                                                                                        |[P111_MinimumDepthOfBinaryTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P111_MinimumDepthOfBinaryTree.java)|😄|
|💛 | [P211_添加与搜索单词 - 数据结构设计](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P211_DesignAddAndSearchWordsDataStructure.md) |                                                                                                                        |[P211_DesignAddAndSearchWordsDataStructure.java](./src/main/java/com/uyaki/leetcode/editor/cn/P211_DesignAddAndSearchWordsDataStructure.java)|😄|
|💛 | [P385_迷你语法分析器](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P385_MiniParser.md)                                    |                                                                                                                        |[P385_MiniParser.java](./src/main/java/com/uyaki/leetcode/editor/cn/P385_MiniParser.java)||
|💛 | [P386_字典序排数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P386_LexicographicalNumbers.md)                          |                                                                                                                        |[P386_LexicographicalNumbers.java](./src/main/java/com/uyaki/leetcode/editor/cn/P386_LexicographicalNumbers.java)||
|💛 | [P388_文件的最长绝对路径](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P388_LongestAbsoluteFilePath.md)                     |                                                                                                                        |[P388_LongestAbsoluteFilePath.java](./src/main/java/com/uyaki/leetcode/editor/cn/P388_LongestAbsoluteFilePath.java)||
|💛 | [P417_太平洋大西洋水流问题](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P417_PacificAtlanticWaterFlow.md)                     |                                                                                                                        |[P417_PacificAtlanticWaterFlow.java](./src/main/java/com/uyaki/leetcode/editor/cn/P417_PacificAtlanticWaterFlow.java)||
|💚 | [P653_两数之和 IV - 输入 BST](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P653_TwoSumIvInputIsABst.md)                  |         🍼 入门                                                                                                               |[P653_TwoSumIvInputIsABst.java](./src/main/java/com/uyaki/leetcode/editor/cn/P653_TwoSumIvInputIsABst.java)|😄|
|💛 | [P851_喧闹和富有](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P851_LoudAndRich.md)                                     | 👍深度优先或者图拓扑                                                                                                            |[P851_LoudAndRich.java](./src/main/java/com/uyaki/leetcode/editor/cn/P851_LoudAndRich.java)|😄|
|💛 | [P2049_统计最高分的节点数目](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2049_CountNodesWithTheHighestScore.md)            | 👍深度优先+预处理                                                                                                             |[P2049_CountNodesWithTheHighestScore.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2049_CountNodesWithTheHighestScore.java)|😄|
|+++| 岛屿问题                                                                                                                           | +++                                                                                                                    |岛屿问题|+++|
|💛 | [P200_岛屿数量](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P200_NumberOfIslands.md)                                  | 👍 [岛屿问题](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/IslandProblem.md)                                 |[P200_NumberOfIslands.java](./src/main/java/com/uyaki/leetcode/editor/cn/P200_NumberOfIslands.java)|😄|
|💛 | [P419_甲板上的战舰](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P419_BattleshipsInABoard.md)                            | 👍 [岛屿问题](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/IslandProblem.md) 的变种                             |[P419_BattleshipsInABoard.java](./src/main/java/com/uyaki/leetcode/editor/cn/P419_BattleshipsInABoard.java)|😄|
|💚 | [P463_岛屿的周长](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P463_IslandPerimeter.md)                                 | 👍 [岛屿问题](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/IslandProblem.md)                                 |[P463_IslandPerimeter.java](./src/main/java/com/uyaki/leetcode/editor/cn/P463_IslandPerimeter.java)|😄|
|💛 | [P695_岛屿的最大面积](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P695_MaxAreaOfIsland.md)                               | 👍 [岛屿问题](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/IslandProblem.md)                                 |[P695_MaxAreaOfIsland.java](./src/main/java/com/uyaki/leetcode/editor/cn/P695_MaxAreaOfIsland.java)|😄|
|❤️ | [P827_最大人工岛](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P827_MakingALargeIsland.md)                              | 👍 [岛屿问题](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/IslandProblem.md)                                 |[P827_MakingALargeIsland.java](./src/main/java/com/uyaki/leetcode/editor/cn/P827_MakingALargeIsland.java)|😄|
|💛 | [P1020_飞地的数量](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1020_NumberOfEnclaves.md)                              | 👍 [岛屿问题](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/P1020_NumberOfEnclaves.md)                        |[P1020_NumberOfEnclaves.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1020_NumberOfEnclaves.java)|😄|
|💛 | [P1034_边界着色](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1034_ColoringABorder.md)                                | ❓ 题目在说啥啊                                                                                                               |[P1034_ColoringABorder.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1034_ColoringABorder.java)|😄|
|❤️ | [P1036_逃离大迷宫](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1036_EscapeALargeMaze.md)                              | 👍 [官方题解](https://leetcode-cn.com/problems/escape-a-large-maze/solution/tao-chi-da-mi-gong-by-leetcode-solution-qxhz/) |[P1036_EscapeALargeMaze.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1036_EscapeALargeMaze.java)|😄|
|💛 | [P1219_黄金矿工](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1219_PathWithMaximumGold.md)                            | 👍👍👍 [岛屿问题](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/IslandProblem.md)+回溯                          |[P1219_PathWithMaximumGold.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1219_PathWithMaximumGold.java)|😄|

---

### 广度优先搜索

|难度| 题目                                                                                                                         | 题解                                                                                                                                           |代码|掌握度|
|:---:|:---------------------------------------------------------------------------------------------------------------------------|:---------------------------------------------------------------------------------------------------------------------------------------------|:---|:---:|
|💛 | [P310_最小高度树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P310_MinimumHeightTrees.md)                         | 👍👍👍缩圈                                                                                                                                         |[P310_MinimumHeightTrees.java](./src/main/java/com/uyaki/leetcode/editor/cn/P310_MinimumHeightTrees.java)|😄|
|❤️ | [P1345_跳跃游戏 IV](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1345_JumpGameIv.md)                              | 👍 [官方题解](https://leetcode-cn.com/problems/jump-game-iv/solution/tiao-yue-you-xi-iv-by-leetcode-solution-zsix/)                              |[P1345_JumpGameIv.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1345_JumpGameIv.java)|😄|
|💛 | [P1765_地图中的最高点](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1765_MapOfHighestPeak.md)                        | 👍 [岛屿问题](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/IslandProblem.md)                                                       |[P1765_MapOfHighestPeak.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1765_MapOfHighestPeak.java)|😄|
|💛 | [P2039_网络空闲的时刻](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2039_TheTimeWhenTheNetworkBecomesIdle.md)        | 👍 图                                                                                                                                         |[P2039_TheTimeWhenTheNetworkBecomesIdle.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2039_TheTimeWhenTheNetworkBecomesIdle.java)|😄|
|❤️ | [P2045_到达目的地的第二短时间](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2045_SecondMinimumTimeToReachDestination.md) | 👍 [官方题解](https://leetcode-cn.com/problems/second-minimum-time-to-reach-destination/solution/dao-da-mu-de-di-de-di-er-duan-shi-jian-b-05i0/) |[P2045_SecondMinimumTimeToReachDestination.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2045_SecondMinimumTimeToReachDestination.java)|😄|

---

### 字典树（前缀树）

|难度| 题目                                                                                                             | 题解                                                                                                                    |代码|掌握度|
|:---:|:---------------------------------------------------------------------------------------------------------------|:----------------------------------------------------------------------------------------------------------------------|:---|:---:|
|💛 | [P208_实现 Trie (前缀树)](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P208_ImplementTriePrefixTree.md) |                                                                                                                       |[P208_ImplementTriePrefixTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P208_ImplementTriePrefixTree.java)|😄|
|❤️ | [P440_字典序的第K小数字](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P440_KThSmallestInLexicographicalOrder.md)                 | 👍[P440_字典序的第K小数字](./src/main/java/com/uyaki/leetcode/editor/cn/doc/answer/P440_KThSmallestInLexicographicalOrder.md) |[P440_KThSmallestInLexicographicalOrder.java](./src/main/java/com/uyaki/leetcode/editor/cn/P440_KThSmallestInLexicographicalOrder.java)|😄|
|❤️ | [P472_连接词](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P472_ConcatenatedWords.md)                 | 👍字典树+DFS                                                                                                             |[P472_ConcatenatedWords.java](./src/main/java/com/uyaki/leetcode/editor/cn/P472_ConcatenatedWords.java)|😄|
|💚 | [P720_词典中最长的单词](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P720_LongestWordInDictionary.md)      | 👍字典树                                                                                                                 |[P720_LongestWordInDictionary.java](./src/main/java/com/uyaki/leetcode/editor/cn/P720_LongestWordInDictionary.java)|😄|

---

## 图

|难度| 题目                                                                                             | 题解   |代码|掌握度|
|:---:|:-----------------------------------------------------------------------------------------------|:-----|:---|:---:|
|💚 | [P1791_FindCenterOfStarGraph](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1791_FindCenterOfStarGraph.md) | 过于简单 |[P1791_FindCenterOfStarGraph.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1791_FindCenterOfStarGraph.java)|😄|

---

## 分治法

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---|:---:|
|💚 |[P169_多数元素](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P169_MajorityElement.md) | |[P169_MajorityElement.java](./src/main/java/com/uyaki/leetcode/editor/cn/P169_MajorityElement.java)|😄|

---

## 二分查找

|难度| 题目                                                                                                                   |题解|代码|掌握度|
|:---:|:---------------------------------------------------------------------------------------------------------------------|:---|:---|:---:|
|💚 | [P35_搜索插入位置](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P35_SearchInsertPosition.md)                   | |[P35_SearchInsertPosition.java](./src/main/java/com/uyaki/leetcode/editor/cn/P35_SearchInsertPosition.java)|😄|
|💚 | [P69_x 的平方根](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P69_Sqrtx.md)                                  | |[P69_Sqrtx.java](./src/main/java/com/uyaki/leetcode/editor/cn/P69_Sqrtx.java)|😄|
|💛 | [P240_搜索二维矩阵 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P240_SearchA2dMatrixIi.md)                 | |[P240_SearchA2dMatrixIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P240_SearchA2dMatrixIi.java)|😄|
|❤️ | [P352_将数据流变为多个不相交区间](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P352_DataStreamAsDisjointIntervals.md) | |[P352_DataStreamAsDisjointIntervals.java](./src/main/java/com/uyaki/leetcode/editor/cn/P352_DataStreamAsDisjointIntervals.java)|🤯|
|💚 | [P367_有效的完全平方数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P367_ValidPerfectSquare.md)                 | |[P367_ValidPerfectSquare.java](./src/main/java/com/uyaki/leetcode/editor/cn/P367_ValidPerfectSquare.java)|😄|
|💚 | [P441_排列硬币](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P441_ArrangingCoins.md)                         | |[P441_ArrangingCoins.java](./src/main/java/com/uyaki/leetcode/editor/cn/P441_ArrangingCoins.java)|😄|
|💛 | [P475_供暖器](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P475_Heaters.md)                                 | 排序+二分 |[P475_Heaters.java](./src/main/java/com/uyaki/leetcode/editor/cn/P475_Heaters.java)|😄|
|💛 | [P540_有序数组中的单一元素](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P540_SingleElementInASortedArray.md)                 | |[P540_SingleElementInASortedArray.java](./src/main/java/com/uyaki/leetcode/editor/cn/P540_SingleElementInASortedArray.java)|😄|
|💚 | [P704_二分查找](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P704_BinarySearch.md)                           | |[P704_BinarySearch.java](./src/main/java/com/uyaki/leetcode/editor/cn/P704_BinarySearch.java)|😄|
|❤️ | [P1610_可见点的最大数目](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1610_MaximumNumberOfVisiblePoints.md)     | 二分法或滑动窗口 |[P1610_MaximumNumberOfVisiblePoints.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1610_MaximumNumberOfVisiblePoints.java)|🤯🤯|
|💚 | [P剑指 Offer II 069_B1IidL](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P剑指%20Offer%20II%20069_B1IidL.md) | |[P剑指_Offer_II_069_B1IidL.java](./src/main/java/com/uyaki/leetcode/editor/cn/P剑指_Offer_II_069_B1IidL.java)|😄|

---

## 双指针

|难度| 题目                                                                                                               | 题解     |代码|掌握度|
|:---:|:-----------------------------------------------------------------------------------------------------------------|:-------|:---|:---:|
|💚 | [P821_字符的最短距离](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P821_ShortestDistanceToACharacter.md)    | 🍼 入门     |[P821_ShortestDistanceToACharacter.java](./src/main/java/com/uyaki/leetcode/editor/cn/P821_ShortestDistanceToACharacter.java)|😄|
|💛 | [P825_适龄的朋友](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P825_FriendsOfAppropriateAges.md)          | 排序+双指针 |[P825_FriendsOfAppropriateAges.java](./src/main/java/com/uyaki/leetcode/editor/cn/P825_FriendsOfAppropriateAges.java)|😄|
|💚 | [P905_按奇偶排序数组](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P905_SortArrayByParity.md)               |        |[P905_SortArrayByParity.java](./src/main/java/com/uyaki/leetcode/editor/cn/P905_SortArrayByParity.java)|😄|
|💚 | [P917_仅仅反转字母](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P917_ReverseOnlyLetters.md)               |        |[P917_ReverseOnlyLetters.java](./src/main/java/com/uyaki/leetcode/editor/cn/P917_ReverseOnlyLetters.java)|😄|
|💛 | [P2024_考试的最大困扰度](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2024_MaximizeTheConfusionOfAnExam.md) | 排序+双指针 |[P2024_MaximizeTheConfusionOfAnExam.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2024_MaximizeTheConfusionOfAnExam.java)|😄|

---

## 贪心算法

|难度| 题目                                                                                                                                              | 题解          |代码|掌握度|
|:---:|:------------------------------------------------------------------------------------------------------------------------------------------------|:------------|:---|:---:|
|💛 | [P334_递增的三元子序列](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P334_IncreasingTripletSubsequence.md)                                  |             |[P334_IncreasingTripletSubsequence.java](./src/main/java/com/uyaki/leetcode/editor/cn/P334_IncreasingTripletSubsequence.java)|😄|
|💛 | [P397_整数替换](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P397_IntegerReplacement.md)                                                |             |[P397_IntegerReplacement.java](./src/main/java/com/uyaki/leetcode/editor/cn/P397_IntegerReplacement.java)|😄|
|❤️ | [P420_强密码检验器](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P420_StrongPasswordChecker.md)                                                |             |[P420_StrongPasswordChecker.java](./src/main/java/com/uyaki/leetcode/editor/cn/P420_StrongPasswordChecker.java)|😄|
|💚 | [P575_分糖果](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P575_DistributeCandies.md)                                                  |             |[P575_DistributeCandies.java](./src/main/java/com/uyaki/leetcode/editor/cn/P575_DistributeCandies.java)|😄|
|💛 | [P846_一手顺子](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P846_HandOfStraights.md)                                                   | 👍贪心        |[P846_HandOfStraights.java](./src/main/java/com/uyaki/leetcode/editor/cn/P846_HandOfStraights.java)|😄|
|💛 | [P954_二倍数对数组](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P954_ArrayOfDoubledPairs.md)                                             | 👍贪心        |[P954_ArrayOfDoubledPairs.java](./src/main/java/com/uyaki/leetcode/editor/cn/P954_ArrayOfDoubledPairs.java)|😄|
|💚 | [P1005_K 次取反后最大化的数组和](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1005_MaximizeSumOfArrayAfterKNegations.md)                      |             |[P1005_MaximizeSumOfArrayAfterKNegations.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1005_MaximizeSumOfArrayAfterKNegations.java)|😄|
|💛 | [P1405_最长快乐字符串](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1405_LongestHappyString.md)                                           |              |[P1405_LongestHappyString.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1405_LongestHappyString.java)|🤯🤯|
|💛 | [P1414_和为 K 的最少斐波那契数字数目](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1414_FindTheMinimumNumberOfFibonacciNumbersWhoseSumIsK.md)   | 👍 [官方题解](https://leetcode-cn.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/solution/he-wei-k-de-zui-shao-fei-bo-na-qi-shu-zi-shu-mu-by/) |[P1414_FindTheMinimumNumberOfFibonacciNumbersWhoseSumIsK.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1414_FindTheMinimumNumberOfFibonacciNumbersWhoseSumIsK.java)|😄|
|💛 | [P2038_如果相邻两个颜色均相同则删除当前颜色](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2038_RemoveColoredPiecesIfBothNeighborsAreTheSameColor.md) |   🍼 入门          |[P2038_RemoveColoredPiecesIfBothNeighborsAreTheSameColor.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2038_RemoveColoredPiecesIfBothNeighborsAreTheSameColor.java)|😄|
|+++| 课程表                                                                                                                                             | +++         |课程表|+++|
|❤️ | [P630_课程表 III](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P630_CourseScheduleIii.md)                                              |             |[P630_CourseScheduleIii.java](./src/main/java/com/uyaki/leetcode/editor/cn/P630_CourseScheduleIii.java)|😄|

---

## 记忆化搜索

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---|:---:|
|💛 |[P397_整数替换](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P397_IntegerReplacement.md) | |[P397_IntegerReplacement.java](./src/main/java/com/uyaki/leetcode/editor/cn/P397_IntegerReplacement.java)|😄|

---

## 动态规划

|难度| 题目                                                                                                                               | 题解                                                                                                                         |代码|掌握度|
|:---:|:---------------------------------------------------------------------------------------------------------------------------------|:---------------------------------------------------------------------------------------------------------------------------|:---|:---:|
|❤️ | [P10_正则表达式匹配](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P10_RegularExpressionMatching.md)                         |                                                                                                                            |[P10_RegularExpressionMatching.java](./src/main/java/com/uyaki/leetcode/editor/cn/P10_RegularExpressionMatching.java)|🤯|
|💚 | [P53_最大子序和](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P53_MaximumSubarray.md)                                     |                                                                                                                            |[P53_MaximumSubarray.java](./src/main/java/com/uyaki/leetcode/editor/cn/P53_MaximumSubarray.java)|😄|
|💚 | [P70_爬楼梯](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P70_ClimbingStairs.md)                                        |                                                                                                                            |[P70_ClimbingStairs.java](./src/main/java/com/uyaki/leetcode/editor/cn/P70_ClimbingStairs.java)|😄|
|💛 | [P96_不同的二叉搜索树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P96_UniqueBinarySearchTrees.md)                          |                                                                                                                            |[P96_UniqueBinarySearchTrees.java](./src/main/java/com/uyaki/leetcode/editor/cn/P96_UniqueBinarySearchTrees.java)|😄|
|💚 | [P118_杨辉三角](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P118_PascalsTriangle.md)                                    |                                                                                                                            |[P118_PascalsTriangle.java](./src/main/java/com/uyaki/leetcode/editor/cn/P118_PascalsTriangle.java)|😄|
|💚 | [P119_杨辉三角 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P119_PascalsTriangleIi.md)                               |                                                                                                                            |[P119_PascalsTriangleIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P119_PascalsTriangleIi.java)|😄|
|💚 | [P121_买卖股票的最佳时机](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P121_BestTimeToBuyAndSellStock.md)                     |                                                                                                                            |[P121_BestTimeToBuyAndSellStock.java](./src/main/java/com/uyaki/leetcode/editor/cn/P121_BestTimeToBuyAndSellStock.java)|😄|
|💛 | [P357_统计各位数字都不同的数字个数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P357_CountNumbersWithUniqueDigits.md)             |                                                                                                                            |[P357_CountNumbersWithUniqueDigits.java](./src/main/java/com/uyaki/leetcode/editor/cn/P357_CountNumbersWithUniqueDigits.java)|😄|
|💛 | [P375_猜数字大小 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P375_GuessNumberHigherOrLowerIi.md)                     |                                                                                                                            |[P375_GuessNumberHigherOrLowerIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P375_GuessNumberHigherOrLowerIi.java)|😄|
|💛 | [P396_旋转函数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P396_RotateFunction.md)                     |                                                                                                                            |[P396_RotateFunction.java](./src/main/java/com/uyaki/leetcode/editor/cn/P396_RotateFunction.java)|😄|
|❤️ | [P629_K个逆序对数组](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P629_KInversePairsArray.md)                              | [P629_KInversePairsArray](./src/main/java/com/uyaki/leetcode/editor/cn/doc/answer/P629_KInversePairsArray.md)              |[P629_KInversePairsArray.java](./src/main/java/com/uyaki/leetcode/editor/cn/P629_KInversePairsArray.java)|🤯|
|💛 | [P688_骑士在棋盘上的概率](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P688_KnightProbabilityInChessboard.md)                 |                                                                                                                            |[P688_KnightProbabilityInChessboard.java](./src/main/java/com/uyaki/leetcode/editor/cn/P688_KnightProbabilityInChessboard.java)|😄|
|❤️ | [P1218_最长定差子序列](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1218_LongestArithmeticSubsequenceOfGivenDifference.md) |                                                                                                                            |[P1218_LongestArithmeticSubsequenceOfGivenDifference.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1218_LongestArithmeticSubsequenceOfGivenDifference.java)|😄|
|❤️ | [P1220_统计元音字母序列的数目](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1220_CountVowelsPermutation.md)                    | 👍逆向思维推导i-1                                                                                                                |[P1220_CountVowelsPermutation.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1220_CountVowelsPermutation.java)|😄|
|❤️ | [P1994_好子集的数目](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1994_TheNumberOfGoodSubsets.md)                         | [官方题解](https://leetcode-cn.com/problems/the-number-of-good-subsets/solution/hao-zi-ji-de-shu-mu-by-leetcode-solution-ky65/)                                                                                                                   |[P1994_TheNumberOfGoodSubsets.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1994_TheNumberOfGoodSubsets.java)|🤯|
|💛 | [P2100_适合打劫银行的日子](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2100_FindGoodDaysToRobTheBank.md)                    |                                                                                                                            |[P2100_FindGoodDaysToRobTheBank.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2100_FindGoodDaysToRobTheBank.java)|😄|
|+++| 博弈问题                                                                                                                             | +++                                                                                                                        |博弈问题|+++|
|💛 | [P486_预测赢家](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P486_PredictTheWinner.md)                                   | 👍[博弈问题](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/GameProblem.md)                                        |[P486_PredictTheWinner.java](./src/main/java/com/uyaki/leetcode/editor/cn/P486_PredictTheWinner.java)|😄|
|💛 | [P877_石子游戏](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P877_StoneGame.md)                                          | 👍[博弈问题](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/GameProblem.md)                                        |[P877_StoneGame.java](./src/main/java/com/uyaki/leetcode/editor/cn/P877_StoneGame.java)|😄|
|❤️ | [P913_猫和老鼠](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P913_CatAndMouse.md)                                        | 👍[P913_CatAndMouse](./src/main/java/com/uyaki/leetcode/editor/cn/doc/answer/P913_CatAndMouse.md)                          |[P913_CatAndMouse.java](./src/main/java/com/uyaki/leetcode/editor/cn/P913_CatAndMouse.java)|🤯🤯🤯|
|💛 | [P2029_石子游戏 IX](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2029_StoneGameIx.md)                                   | 👍[P2029_StoneGameIx](https://leetcode-cn.com/problems/stone-game-ix/solution/shi-zi-you-xi-ix-by-leetcode-solution-kk5f/) |[P2029_StoneGameIx.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2029_StoneGameIx.java)|🤯🤯🤯|

---

## 最短路径

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---|:---:|
|💚 |[P1436_旅行终点站](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1436_DestinationCity.md) | |[P1436_DestinationCity.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1436_DestinationCity.java)|😄|
|💛 |[P1514_概率最大的路径](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1514_PathWithMaximumProbability.md) | |[P1514_PathWithMaximumProbability.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1514_PathWithMaximumProbability.java)|😄|

---

## 回溯法

|难度| 题目                                                                                                                                |题解|代码|掌握度|
|:---:|:----------------------------------------------------------------------------------------------------------------------------------|:---|:---|:---:|
|❤️ | [P282_给表达式添加运算符](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P282_ExpressionAddOperators.md)                         | |[P282_ExpressionAddOperators.java](./src/main/java/com/uyaki/leetcode/editor/cn/P282_ExpressionAddOperators.java)|🤯|
|❤️ | [P301_删除无效的括号](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P301_RemoveInvalidParentheses.md)                         | |[P301_RemoveInvalidParentheses.java](./src/main/java/com/uyaki/leetcode/editor/cn/P301_RemoveInvalidParentheses.java)|🤯|
|💛 | [P306_累加数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P306_AdditiveNumber.md)                                       | 👍 |[P306_AdditiveNumber.java](./src/main/java/com/uyaki/leetcode/editor/cn/P306_AdditiveNumber.java)|😄|
|❤️ | [P488_祖玛游戏](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P488_ZumaGame.md)                                            | |[P488_ZumaGame.java](./src/main/java/com/uyaki/leetcode/editor/cn/P488_ZumaGame.java)|🤯|
|❤️ | [P638_大礼包](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P638_ShoppingOffers.md)                                       | |[P638_ShoppingOffers.java](./src/main/java/com/uyaki/leetcode/editor/cn/P638_ShoppingOffers.java)|🤯|
|❤️ | [P1601_最多可达成的换楼请求数目](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1601_MaximumNumberOfAchievableTransferRequests.md) | |[P1601_MaximumNumberOfAchievableTransferRequests.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1601_MaximumNumberOfAchievableTransferRequests.java)|🤯|
|💛 | [P2044_统计按位或能得到最大值的子集数目](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2044_CountNumberOfMaximumBitwiseOrSubsets.md)                                         | 👍 |[P2044_CountNumberOfMaximumBitwiseOrSubsets.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2044_CountNumberOfMaximumBitwiseOrSubsets.java)|😄|
|+++| 排列组合                                                                                                                              |+++|排列组合|+++|
|💛 | [P46_全排列](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P46_Permutations.md)                                           | 👍[排列组合](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/PermutationAndCombination.md) |[P46_Permutations.java](./src/main/java/com/uyaki/leetcode/editor/cn/P46_Permutations.java)|😄|
|💛 | [P47_全排列 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P47_PermutationsIi.md)                                      | 👍[排列组合](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/PermutationAndCombination.md) |[P47_PermutationsIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P47_PermutationsIi.java)|😄|
|💛 | [P869_重新排序得到 2 的幂](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P869_ReorderedPowerOf2.md)                            | |[P869_ReorderedPowerOf2.java](./src/main/java/com/uyaki/leetcode/editor/cn/P869_ReorderedPowerOf2.java)|😄|

## TODO

- [ ] Dijkstra 算法详解
- [ ] 回溯法总结
- [ ] PLCP_04_BrokenBoardDominoes
- [ ] P686 P1044 Rabin-Karp 算法 与 Knuth-Morris-Pratt 算法 实现

## 📝 License

Copyright © 2021 [uyaki](https://github.com/uyaki).

This project is [MIT License](https://github.com/uyaki/LeetCode/blob/main/LICENSE) licensed.
