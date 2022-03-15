# 数组子集
## 数字子集个数

集合A中有n个元素

- 子集的个数 2<sup>n</sup>
- 真子集个数 2<sup>n</sup> - 1 （减去集合A本身），计算子集个数 `(1<<n)-1`
- 非空子集个数 2<sup>n</sup> - 2 （减去集合A本身和空集），计算子集个数 `(1<<n)-2`

## 全排列

> 回溯法解决问题

|难度| 题目                                                                                   | 题解                                                    | 代码                                                                                                         |掌握度|
|:---:|:-------------------------------------------------------------------------------------|:------------------------------------------------------|:-----------------------------------------------------------------------------------------------------------|:---:|
|💛 | [P2044_统计按位或能得到最大值的子集数目](./../content/P2044_CountNumberOfMaximumBitwiseOrSubsets.md) | 👍                                                    | [P2044_CountNumberOfMaximumBitwiseOrSubsets.java](./../../P2044_CountNumberOfMaximumBitwiseOrSubsets.java) |😄|
|+++| 排列组合                                                                                 | +++                                                   | 排列组合                                                                                                       |+++|
|💛 | [P46_全排列](./../content/P46_Permutations.md)                                          | 👍[排列组合](./../summarize/PermutationAndCombination.md) | [P46_Permutations.java](./../../P46_Permutations.java)                                                     |😄|
|💛 | [P47_全排列 II](./../content/P47_PermutationsIi.md)                                     | 👍[排列组合](./../PermutationAndCombination.md)           | [P47_PermutationsIi.java](./../../P47_PermutationsIi.java)                                                 |😄|
|💛 | [P869_重新排序得到 2 的幂](./../content/P869_ReorderedPowerOf2.md)                           |                                                       | [P869_ReorderedPowerOf2.java](./../../P869_ReorderedPowerOf2.java)    |😄|
