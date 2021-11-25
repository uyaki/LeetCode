# README

- [README](#readme)
  - [IDEA插件之LeetCode Editor配置](#idea插件之leetcode-editor配置)
  - [说明](#说明)
  - [总结](#总结)
  - [数学题](#数学题)
  - [字符串操作](#字符串操作)
  - [数组](#数组)
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
  - [分治法](#分治法)
  - [二分查找](#二分查找)
  - [贪心算法](#贪心算法)
  - [记忆化搜索](#记忆化搜索)
  - [动态规划](#动态规划)
  - [最短路径](#最短路径)
  - [回溯法](#回溯法)
  - [TODO](#todo)

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

- 解题技巧：[一些坑](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/Error.md)
- 位运算的解题总结：[Bit](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/Bit.md)
- 背包问题[Knapsack problem](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/KnapsackProblem.md)
- 最接近目标值的子序列合问题解法[Sum of target subsequences](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/SumOfTargetSubsequences.md)
- 摩尔投票法总结：[Boyer–Moore Majority Vote](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/Boyer–MooreMajorityVote.md)
- 二分图的最大匹配算法
    - 匈牙利算法：[HungarianAlgorithm](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/HungarianAlgorithm.md)
- 树的解题总结：[Tree](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/Tree.md)
- 分治法的解题总结：[Divide And Conquer](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/DivideAndConquer.md)
- 二分法的解题总结：[binary search](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/BinarySearch.md)
- 动态规划的解题总结：[Dynamic Programming](./src/main/java/com/uyaki/leetcode/editor/cn/doc/summarize/DynamicProgramming.md)

---

## 数学题

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💛 |[P29_两数相除](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P29_DivideTwoIntegers.md) | 👍 二分查找+快速乘 |[P29_DivideTwoIntegers.java](./src/main/java/com/uyaki/leetcode/editor/cn/P29_DivideTwoIntegers.java)|😄|
|💚 |[P66_加一](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P66_PlusOne.md) |  越界问题 |[P66_PlusOne.java](./src/main/java/com/uyaki/leetcode/editor/cn/P66_PlusOne.java)|😄|
|💛 |[P166_分数到小数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P166_FractionToRecurringDecimal.md) | 👍 长除法 |[P166_FractionToRecurringDecimal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P166_FractionToRecurringDecimal.java)|😄|
|💛 |[P223_矩形面积](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P223_RectangleArea.md) | 👍 投影法 |[P223_RectangleArea.java](./src/main/java/com/uyaki/leetcode/editor/cn/P223_RectangleArea.java)|😄|
|💛 |[P229_求众数 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P229_MajorityElementIi.md) | 👍👍 摩尔投票法 |[P229_MajorityElementIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P229_MajorityElementIi.java)|😄|
|💛 |[P319_灯泡开关](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P319_BulbSwitcher.md) | 👎 数学开根号 |[P319_BulbSwitcher.java](./src/main/java/com/uyaki/leetcode/editor/cn/P319_BulbSwitcher.java)|😄|
|❤️ |[P335_路径交叉](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P335_SelfCrossing.md) | 👎 数学归纳 |[P335_SelfCrossing.java](./src/main/java/com/uyaki/leetcode/editor/cn/P335_SelfCrossing.java)|🤯|
|❤️ |[P391_完美矩形](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P391_PerfectRectangle.md) | 👎 数学归纳 |[P391_PerfectRectangle.java](./src/main/java/com/uyaki/leetcode/editor/cn/P391_PerfectRectangle.java)|😄|
|💚 |[P405_数字转换为十六进制数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P405_ConvertANumberToHexadecimal.md) | 位运算 |[P405_ConvertANumberToHexadecimal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P405_ConvertANumberToHexadecimal.java)|😄|
|💚 |[P412_Fizz Buzz](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P412_FizzBuzz.md) | 🍼 入门 |[P412_FizzBuzz.java](./src/main/java/com/uyaki/leetcode/editor/cn/P412_FizzBuzz.java)|😄|
|💚 |[P414_第三大的数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P414_ThirdMaximumNumber.md) | 🍼 入门 |[P414_ThirdMaximumNumber.java](./src/main/java/com/uyaki/leetcode/editor/cn/P414_ThirdMaximumNumber.java)|😄|
|💛 |[P423_从英文中重建数字](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P423_ReconstructOriginalDigitsFromEnglish.md) | 👎 数学归纳 |[P423_ReconstructOriginalDigitsFromEnglish.java](./src/main/java/com/uyaki/leetcode/editor/cn/P423_ReconstructOriginalDigitsFromEnglish.java)|😄|
|💚 |[P453_最小操作次数使数组元素相等](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P453_MinimumMovesToEqualArrayElements.md) | 🧠 脑筋急转弯 |[P453_MinimumMovesToEqualArrayElements.java](./src/main/java/com/uyaki/leetcode/editor/cn/P453_MinimumMovesToEqualArrayElements.java)|😄|
|❤️ |[P458_可怜的小猪](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P458_PoorPigs.md) | 👍 信息量/动态规划 |[P458_PoorPigs.java](./src/main/java/com/uyaki/leetcode/editor/cn/P458_PoorPigs.java)|😄|
|💚 |[P492_构造矩形](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P492_ConstructTheRectangle.md) | 👎 数学 |[P492_ConstructTheRectangle.java](./src/main/java/com/uyaki/leetcode/editor/cn/P492_ConstructTheRectangle.java)|😄|
|💚 |[P495_提莫攻击](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P495_TeemoAttacking.md) | 🍼 入门  |[P495_TeemoAttacking.java](./src/main/java/com/uyaki/leetcode/editor/cn/P495_TeemoAttacking.java)|😄|
|💚 |[P598_范围求和 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P598_RangeAdditionIi.md) | 👎 数学 |[P598_RangeAdditionIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P598_RangeAdditionIi.java)|😄|


---

## 字符串操作

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💛 |[P5_最长回文子串](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P5_LongestPalindromicSubstring.md) | 👍 中心扩展算法 |[P5_LongestPalindromicSubstring.java](./src/main/java/com/uyaki/leetcode/editor/cn/P5_LongestPalindromicSubstring.java)|😄|
|💛 |[P38_外观数列](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P38_CountAndSay.md) | ❓ 出题意义不明 |[P38_CountAndSay.java](./src/main/java/com/uyaki/leetcode/editor/cn/P38_CountAndSay.java)|😄|
|❤️ |[P273_整数转换英文表示](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P273_IntegerToEnglishWords.md) | ❓ 出题意义不明 |[P273_IntegerToEnglishWords.java](./src/main/java/com/uyaki/leetcode/editor/cn/P273_IntegerToEnglishWords.java)|😄|
|💛 |[P299_猜数字游戏](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P299_BullsAndCows.md) | ❓ 出题意义不明 |[P299_BullsAndCows.java](./src/main/java/com/uyaki/leetcode/editor/cn/P299_BullsAndCows.java)|😄|
|💛 |[P318_最大单词长度乘积](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P318_MaximumProductOfWordLengths.md) | |[P318_MaximumProductOfWordLengths.java](./src/main/java/com/uyaki/leetcode/editor/cn/P318_MaximumProductOfWordLengths.java)|😄|
|💚 |[P434_字符串中的单词数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P434_NumberOfSegmentsInAString.md) | |[P434_NumberOfSegmentsInAString.java](./src/main/java/com/uyaki/leetcode/editor/cn/P434_NumberOfSegmentsInAString.java)|😄|
|💚 |[P482_密钥格式化](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P482_LicenseKeyFormatting.md) | |[P482_LicenseKeyFormatting.java](./src/main/java/com/uyaki/leetcode/editor/cn/P482_LicenseKeyFormatting.java)|😄|
|💚 |[P500_键盘行](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P500_KeyboardRow.md) | |[P500_KeyboardRow.java](./src/main/java/com/uyaki/leetcode/editor/cn/P500_KeyboardRow.java)|😄|
|💚 |[P520_检测大写字母](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P520_DetectCapital.md) | |[P520_DetectCapital.java](./src/main/java/com/uyaki/leetcode/editor/cn/P520_DetectCapital.java)|😄|
|💚 |[P859_亲密字符串](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P859_BuddyStrings.md) | |[P859_BuddyStrings.java](./src/main/java/com/uyaki/leetcode/editor/cn/P859_BuddyStrings.java)|😄|

---

## 数组

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|❤️ |[P4_寻找两个正序数组的中位数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P4_MedianOfTwoSortedArrays.md) | |[P4_MedianOfTwoSortedArrays.java](./src/main/java/com/uyaki/leetcode/editor/cn/P4_MedianOfTwoSortedArrays.java)|😄|
|💛 |[P260_只出现一次的数字 III](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P260_SingleNumberIii.md) | |[P260_SingleNumberIii.java](./src/main/java/com/uyaki/leetcode/editor/cn/P260_SingleNumberIii.java)|😄|
|💛 |[P284_顶端迭代器](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P284_PeekingIterator.md) | |[P284_PeekingIterator.java](./src/main/java/com/uyaki/leetcode/editor/cn/P284_PeekingIterator.java)|😄|
|💛 |[P384_打乱数组](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P384_ShuffleAnArray.md) | |[P384_ShuffleAnArray.java](./src/main/java/com/uyaki/leetcode/editor/cn/P384_ShuffleAnArray.java)|😄|
|💚 |[P594_最长和谐子序列](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P594_LongestHarmoniousSubsequence.md) | |[P594_LongestHarmoniousSubsequence.java](./src/main/java/com/uyaki/leetcode/editor/cn/P594_LongestHarmoniousSubsequence.java)|😄|

---

## 哈希

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💛 |[P677_键值映射](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P677_MapSumPairs.md) | |[P677_MapSumPairs.java](./src/main/java/com/uyaki/leetcode/editor/cn/P677_MapSumPairs.java)|😄|

---

## 递归

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💛 |[P2_两数相加](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P2_AddTwoNumbers.md) | |[P2_AddTwoNumbers.java](./src/main/java/com/uyaki/leetcode/editor/cn/P2_AddTwoNumbers.java)|😄|
|💚 |[P21_合并两个有序链表](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P21_MergeTwoSortedLists.md) | |[P21_MergeTwoSortedLists.java](./src/main/java/com/uyaki/leetcode/editor/cn/P21_MergeTwoSortedLists.java)|😄|

---

## 位运算

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💚 |[P190_颠倒二进制位](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P190_ReverseBits.md) | |[P190_ReverseBits.java](./src/main/java/com/uyaki/leetcode/editor/cn/P190_ReverseBits.java)|😄|
|💚 |[P231_2 的幂](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P231_PowerOfTwo.md) | 👍👍 位运算 |[P231_PowerOfTwo.java](./src/main/java/com/uyaki/leetcode/editor/cn/P231_PowerOfTwo.java)|😄|
|💚 |[P268_丢失的数字](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P268_MissingNumber.md) | 👍👍 异或`^`抵消 |[P268_MissingNumber.java](./src/main/java/com/uyaki/leetcode/editor/cn/P268_MissingNumber.java)|😄|
|💚 |[P476_数字的补数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P476_NumberComplement.md) | |[P476_NumberComplement.java](./src/main/java/com/uyaki/leetcode/editor/cn/P476_NumberComplement.java)|🤨|

---

## 堆

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|❤️ |[P407_接雨水 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P407_TrappingRainWaterIi.md) |[P407_TrappingRainWaterIi](./src/main/java/com/uyaki/leetcode/editor/cn/doc/answer/P407_TrappingRainWaterIi.md)|[P407_TrappingRainWaterIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P407_TrappingRainWaterIi.java)|🤨|

---

## 栈

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💚 |[P20_有效的括号](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P20_ValidParentheses.md) | |[P20_ValidParentheses.java](./src/main/java/com/uyaki/leetcode/editor/cn/P20_ValidParentheses.java)|😄|
|💛 |[P71_简化路径](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P71_SimplifyPath.md) | |[P71_SimplifyPath.java](./src/main/java/com/uyaki/leetcode/editor/cn/P71_SimplifyPath.java)|😄|
|💚 |[P155_最小栈](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P155_MinStack.md) | |[P155_MinStack.java](./src/main/java/com/uyaki/leetcode/editor/cn/P155_MinStack.java)|😄|
|💚 |[P225_用队列实现栈](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P225_ImplementStackUsingQueues.md) | |[P225_ImplementStackUsingQueues.java](./src/main/java/com/uyaki/leetcode/editor/cn/P225_ImplementStackUsingQueues.java)|😄|
|💚 |[P232_用栈实现队列](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P232_ImplementQueueUsingStacks.md) | |[P232_ImplementQueueUsingStacks.java](./src/main/java/com/uyaki/leetcode/editor/cn/P232_ImplementQueueUsingStacks.java)|😄|
|💚 |[P496_下一个更大元素 I](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P496_NextGreaterElementI.md) | |[P496_NextGreaterElementI.java](./src/main/java/com/uyaki/leetcode/editor/cn/P496_NextGreaterElementI.java)|😄|
|💚 |[P682_棒球比赛](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P682_BaseballGame.md) | |[P682_BaseballGame.java](./src/main/java/com/uyaki/leetcode/editor/cn/P682_BaseballGame.java)|😄|

---

## 链表

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💚 |[P234_回文链表](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P234_PalindromeLinkedList.md) | |[P234_PalindromeLinkedList.java](./src/main/java/com/uyaki/leetcode/editor/cn/P234_PalindromeLinkedList.java)|😄|
|💚 |[P237_删除链表中的节点](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P237_DeleteNodeInALinkedList.md) | |[P237_DeleteNodeInALinkedList.java](./src/main/java/com/uyaki/leetcode/editor/cn/P237_DeleteNodeInALinkedList.java)|😄|

---

## 滑动窗口

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💛 |[P3_无重复字符的最长子串](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P3_LongestSubstringWithoutRepeatingCharacters.md) | |[P3_LongestSubstringWithoutRepeatingCharacters.java](./src/main/java/com/uyaki/leetcode/editor/cn/P3_LongestSubstringWithoutRepeatingCharacters.java)|😄|
|💛 |[P15_三数之和](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P15_ThreeSum.md) | |[P15_ThreeSum.java](./src/main/java/com/uyaki/leetcode/editor/cn/P15_ThreeSum.java)|😄|
|💛 |[P187_重复的DNA序列](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P187_RepeatedDnaSequences.md) | |[P187_RepeatedDnaSequences.java](./src/main/java/com/uyaki/leetcode/editor/cn/P187_RepeatedDnaSequences.java)|😄|
|💛 |[P209_长度最小的子数组](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P209_MinimumSizeSubarraySum.md) | |[P209_MinimumSizeSubarraySum.java](./src/main/java/com/uyaki/leetcode/editor/cn/P209_MinimumSizeSubarraySum.java)|😄|

---

## 树

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💛 |[P95_不同的二叉搜索树 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P95_UniqueBinarySearchTreesIi.md) | |[P95_UniqueBinarySearchTreesIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P95_UniqueBinarySearchTreesIi.java)|😄|
|💛 |[P98_验证二叉搜索树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P98_ValidateBinarySearchTree.md) | |[P98_ValidateBinarySearchTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P98_ValidateBinarySearchTree.java)|😄|
|💛 |[P99_恢复二叉搜索树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P99_RecoverBinarySearchTree.md) | |[P99_RecoverBinarySearchTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P99_RecoverBinarySearchTree.java)|😄|
|💚 |[P100_相同的树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P100_SameTree.md) | |[P100_SameTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P100_SameTree.java)|😄|
|💚 |[P101_对称二叉树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P101_SymmetricTree.md) | |[P101_SymmetricTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P101_SymmetricTree.java)|😄|
|💚 |[P108_将有序数组转换为二叉搜索树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P108_ConvertSortedArrayToBinarySearchTree.md) |树+分治法 |[P108_ConvertSortedArrayToBinarySearchTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P108_ConvertSortedArrayToBinarySearchTree.java)|😄|
|💚 |[P563_二叉树的坡度](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P563_BinaryTreeTilt.md) | |[P563_BinaryTreeTilt.java](./src/main/java/com/uyaki/leetcode/editor/cn/P563_BinaryTreeTilt.java)|😄|
|+++|+++|+++|+++|+++|
|💚 |[P559_N 叉树的最大深度](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P559_MaximumDepthOfNAryTree.md) | |[P559_MaximumDepthOfNAryTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P559_MaximumDepthOfNAryTree.java)|😄|

### 树的遍历

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💚 |[P94_二叉树的中序遍历](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P94_BinaryTreeInorderTraversal.md) | |[P94_BinaryTreeInorderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P94_BinaryTreeInorderTraversal.java)|😄|
|💛 |[P102_二叉树的层序遍历](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P102_BinaryTreeLevelOrderTraversal.md) | |[P102_BinaryTreeLevelOrderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P102_BinaryTreeLevelOrderTraversal.java)|😄|
|💛 |[P103_二叉树的锯齿形层序遍历](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P103_BinaryTreeZigzagLevelOrderTraversal.md) | |[P103_BinaryTreeZigzagLevelOrderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P103_BinaryTreeZigzagLevelOrderTraversal.java)|😄|
|💛 |[P107_二叉树的层序遍历 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P107_BinaryTreeLevelOrderTraversalIi.md) | |[P107_BinaryTreeLevelOrderTraversalIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P107_BinaryTreeLevelOrderTraversalIi.java)|😄|
|💛 |[P105_从前序与中序遍历序列构造二叉树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P105_ConstructBinaryTreeFromPreorderAndInorderTraversal.md) |分治法 | [P105_ConstructBinaryTreeFromPreorderAndInorderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P105_ConstructBinaryTreeFromPreorderAndInorderTraversal.java)|😄|
|💛 |[P106_从中序与后序遍历序列构造二叉树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P106_ConstructBinaryTreeFromInorderAndPostorderTraversal.md) | 分治法| [P106_ConstructBinaryTreeFromInorderAndPostorderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P106_ConstructBinaryTreeFromInorderAndPostorderTraversal.java)|😄|
|💛 |[P114_二叉树展开为链表](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P114_FlattenBinaryTreeToLinkedList.md) | |[P114_FlattenBinaryTreeToLinkedList.java](./src/main/java/com/uyaki/leetcode/editor/cn/P114_FlattenBinaryTreeToLinkedList.java)|😄|
|💚 |[P144_二叉树的前序遍历](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P144_BinaryTreePreorderTraversal.md) | |[P144_BinaryTreePreorderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P144_BinaryTreePreorderTraversal.java)|😄|
|💚 |[P145_二叉树的后序遍历](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P145_BinaryTreePostorderTraversal.md) | |[P145_BinaryTreePostorderTraversal.java](./src/main/java/com/uyaki/leetcode/editor/cn/P145_BinaryTreePostorderTraversal.java)|😄|
|💛 |[P230_二叉搜索树中第K小的元素](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P230_KthSmallestElementInABst.md) | |[P230_KthSmallestElementInABst.java](./src/main/java/com/uyaki/leetcode/editor/cn/P230_KthSmallestElementInABst.java)|😄|

### 深度优先搜索

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💚 |[P104_二叉树的最大深度](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P104_MaximumDepthOfBinaryTree.md) | |[P104_MaximumDepthOfBinaryTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P104_MaximumDepthOfBinaryTree.java)|😄|
|💚 |[P110_平衡二叉树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P110_BalancedBinaryTree.md) | |[P110_BalancedBinaryTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P110_BalancedBinaryTree.java)|😄|
|💚 |[P111_二叉树的最小深度](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P111_MinimumDepthOfBinaryTree.md) | |[P111_MinimumDepthOfBinaryTree.java](./src/main/java/com/uyaki/leetcode/editor/cn/P111_MinimumDepthOfBinaryTree.java)|😄|
|💛 |[P211_添加与搜索单词 - 数据结构设计](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P211_DesignAddAndSearchWordsDataStructure.md) | |[P211_DesignAddAndSearchWordsDataStructure.java](./src/main/java/com/uyaki/leetcode/editor/cn/P211_DesignAddAndSearchWordsDataStructure.java)|😄|


---

## 分治法

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💚 |[P169_多数元素](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P169_MajorityElement.md) | |[P169_MajorityElement.java](./src/main/java/com/uyaki/leetcode/editor/cn/P169_MajorityElement.java)|😄|

---

## 二分查找

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💚 |[P35_搜索插入位置](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P35_SearchInsertPosition.md) | |[P35_SearchInsertPosition.java](./src/main/java/com/uyaki/leetcode/editor/cn/P35_SearchInsertPosition.java)|😄|
|💚 |[P69_x 的平方根](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P69_Sqrtx.md) | |[P69_Sqrtx.java](./src/main/java/com/uyaki/leetcode/editor/cn/P69_Sqrtx.java)|😄|
|💛 |[P240_搜索二维矩阵 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P240_SearchA2dMatrixIi.md) | |[P240_SearchA2dMatrixIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P240_SearchA2dMatrixIi.java)|😄|
|❤️ |[P352_将数据流变为多个不相交区间](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P352_DataStreamAsDisjointIntervals.md) | |[P352_DataStreamAsDisjointIntervals.java](./src/main/java/com/uyaki/leetcode/editor/cn/P352_DataStreamAsDisjointIntervals.java)|🤯|
|💚 |[P367_有效的完全平方数](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P367_ValidPerfectSquare.md) | |[P367_ValidPerfectSquare.java](./src/main/java/com/uyaki/leetcode/editor/cn/P367_ValidPerfectSquare.java)|😄|
|💚 |[P441_排列硬币](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P441_ArrangingCoins.md) | |[P441_ArrangingCoins.java](./src/main/java/com/uyaki/leetcode/editor/cn/P441_ArrangingCoins.java)|😄|
|💚 |[P704_二分查找](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P704_BinarySearch.md) | |[P704_BinarySearch.java](./src/main/java/com/uyaki/leetcode/editor/cn/P704_BinarySearch.java)|😄|
|💚 |[P剑指 Offer II 069_B1IidL](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P剑指%20Offer%20II%20069_B1IidL.md) | |[P剑指_Offer_II_069_B1IidL.java](./src/main/java/com/uyaki/leetcode/editor/cn/P剑指_Offer_II_069_B1IidL.java)|😄|

---

## 贪心算法

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💚 |[P575_分糖果](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P575_DistributeCandies.md) | |[P575_DistributeCandies.java](./src/main/java/com/uyaki/leetcode/editor/cn/P575_DistributeCandies.java)|😄|
|💛 |[P397_整数替换](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P397_IntegerReplacement.md) | |[P397_IntegerReplacement.java](./src/main/java/com/uyaki/leetcode/editor/cn/P397_IntegerReplacement.java)|😄|

---

## 记忆化搜索

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💛 |[P397_整数替换](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P397_IntegerReplacement.md) | |[P397_IntegerReplacement.java](./src/main/java/com/uyaki/leetcode/editor/cn/P397_IntegerReplacement.java)|😄|

---

## 动态规划

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|❤️ |[P10_正则表达式匹配](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P10_RegularExpressionMatching.md) | |[P10_RegularExpressionMatching.java](./src/main/java/com/uyaki/leetcode/editor/cn/P10_RegularExpressionMatching.java)|🤯|
|💚 |[P53_最大子序和](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P53_MaximumSubarray.md) | |[P53_MaximumSubarray.java](./src/main/java/com/uyaki/leetcode/editor/cn/P53_MaximumSubarray.java)|😄|
|💚 |[P70_爬楼梯](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P70_ClimbingStairs.md) | |[P70_ClimbingStairs.java](./src/main/java/com/uyaki/leetcode/editor/cn/P70_ClimbingStairs.java)|😄|
|💛 |[P96_不同的二叉搜索树](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P96_UniqueBinarySearchTrees.md) | |[P96_UniqueBinarySearchTrees.java](./src/main/java/com/uyaki/leetcode/editor/cn/P96_UniqueBinarySearchTrees.java)|😄|
|💚 |[P118_杨辉三角](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P118_PascalsTriangle.md) | |[P118_PascalsTriangle.java](./src/main/java/com/uyaki/leetcode/editor/cn/P118_PascalsTriangle.java)|😄|
|💚 |[P119_杨辉三角 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P119_PascalsTriangleIi.md) | |[P119_PascalsTriangleIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P119_PascalsTriangleIi.java)|😄|
|💚 |[P121_买卖股票的最佳时机](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P121_BestTimeToBuyAndSellStock.md) | |[P121_BestTimeToBuyAndSellStock.java](./src/main/java/com/uyaki/leetcode/editor/cn/P121_BestTimeToBuyAndSellStock.java)|😄|
|💛 |[P375_猜数字大小 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P375_GuessNumberHigherOrLowerIi.md) | |[P375_GuessNumberHigherOrLowerIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P375_GuessNumberHigherOrLowerIi.java)|😄|
|❤️ |[P629_K个逆序对数组](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P629_KInversePairsArray.md) | [P629_KInversePairsArray](./src/main/java/com/uyaki/leetcode/editor/cn/doc/answer/P629_KInversePairsArray.md) |[P629_KInversePairsArray.java](./src/main/java/com/uyaki/leetcode/editor/cn/P629_KInversePairsArray.java)|🤯|
|❤️ |[P1218_最长定差子序列](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1218_LongestArithmeticSubsequenceOfGivenDifference.md) | |[P1218_LongestArithmeticSubsequenceOfGivenDifference.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1218_LongestArithmeticSubsequenceOfGivenDifference.java)|😄|

---

## 最短路径

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💚 |[P1436_旅行终点站](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1436_DestinationCity.md) | |[P1436_DestinationCity.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1436_DestinationCity.java)|😄|
|💛 |[P1514_概率最大的路径](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P1514_PathWithMaximumProbability.md) | |[P1514_PathWithMaximumProbability.java](./src/main/java/com/uyaki/leetcode/editor/cn/P1514_PathWithMaximumProbability.java)|😄|

---

## 回溯法

|难度|题目|题解|代码|掌握度|
|:---:|:---|:---|:---:|:---|
|💛 |[P47_全排列 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P47_PermutationsIi.md) | |[P47_PermutationsIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P47_PermutationsIi.java)|😄|
|❤️ |[P282_给表达式添加运算符](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P282_ExpressionAddOperators.md) | |[P282_ExpressionAddOperators.java](./src/main/java/com/uyaki/leetcode/editor/cn/P282_ExpressionAddOperators.java)|🤯|
|❤️ |[P301_删除无效的括号](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P301_RemoveInvalidParentheses.md) | |[P301_RemoveInvalidParentheses.java](./src/main/java/com/uyaki/leetcode/editor/cn/P301_RemoveInvalidParentheses.java)|🤯|
|❤️ |[P488_祖玛游戏](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P488_ZumaGame.md) | |[P488_ZumaGame.java](./src/main/java/com/uyaki/leetcode/editor/cn/P488_ZumaGame.java)|🤯|
|❤️ |[P638_大礼包](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P638_ShoppingOffers.md) | |[P638_ShoppingOffers.java](./src/main/java/com/uyaki/leetcode/editor/cn/P638_ShoppingOffers.java)|🤯|
|+++|+++|+++|+++|+++|
|💛 |[P47_全排列 II](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P47_PermutationsIi.md) | |[P47_PermutationsIi.java](./src/main/java/com/uyaki/leetcode/editor/cn/P47_PermutationsIi.java)|😄|
|💛 |[P869_重新排序得到 2 的幂](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P869_ReorderedPowerOf2.md) | |[P869_ReorderedPowerOf2.java](./src/main/java/com/uyaki/leetcode/editor/cn/P869_ReorderedPowerOf2.java)|😄|
|+++|+++|+++|+++|+++|
## TODO

- [ ] Dijkstra 算法详解
- [ ] 回溯法总结
- [ ] PLCP_04_BrokenBoardDominoes