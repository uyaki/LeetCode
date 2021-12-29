# 排列组合

## 排列

从 n 个不同元素中，任取 `m(m≤n，m与n均为自然数，下同)` 个不同的元素 **按照一定的顺序** 排成一列，叫做从 n 个不同元素中取出 m 个元素的一个排列；

从 n 个不同元素中取出 `m(m≤n)` 个元素的所有排列的个数，叫做从 n 个不同元素中取出 m 个元素的排列数，用符号 <img src="https://latex.codecogs.com/svg.image?A(n,m)" />
或 <img src="https://latex.codecogs.com/svg.image?A_{m}^{n}" /> 表示

<img src="https://latex.codecogs.com/svg.image?A_{m}^{n}=\underbrace{n(n-1)(n-2)...(n-m&plus;1)}=\frac{n!}{(n-m)!},n\geqslant&space;m" />

> 注意, 12! = 479,001,600 ,13! = 6,227,020,800 超过 int 的最大值

### 例子

|难度|题目|代码|掌握度|
|:---:|:---|:---|:---:|
|💛 |[P46_全排列](./../content/P46_Permutations.md) |[P46_Permutations.java](./../../P46_Permutations.java)|😄|

给定一个不含重复数字的数组 nums ，返回其所有可能的全排列 。你可以 **按任意顺序** 返回答案。

示例 1：

```text
输入：nums = [1,2,3]

输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
```

### 回溯算法

定义递归函数 `backtrack(first, output)` 表示从左往右填到第 first 个位置，当前排列为 output。 那么整个递归函数分为两个情况：

- 如果 `first == n`，说明已经填完了 n 个位置（注意下标从 0 开始），找到了一个可行的解，将 output 放入答案数组中，递归结束。
- 如果 `first < n`，要考虑这第 first 个位置要填哪个数。
    - 根据题目要求肯定不能填已经填过的数，可以定义一个标记数组 vis[] 来标记已经填过的数
    - 那么在填第 first 个数的时候遍历给定的 n 个数，如果这个数没有被标记过，就尝试填入，并将其标记，继续尝试填下一个位置，即调用函数 `backtrack(first + 1, output)`。
    - 回溯的时候要撤销这一个位置填的数以及标记，并继续尝试其他没被标记过的数。

使用标记数组来处理填过的数是一个很直观的思路，但是可不可以去掉这个标记数组呢？毕竟标记数组也增加了算法的空间复杂度。

答案是可以的，将数组 nums 划分成左右两个部分，在回溯的时候只要动态维护这个数组即可：

- 左边的表示已经填过的数
- 右边表示待填的数

具体来说，假设已经填到第 first 个位置，那么nums 数组中

- `[0,first−1]` 是已填过的数的集合，
- `[first,n−1]` 是待填的数的集合。

尝试用 `[first,n−1]` 里的数去填第 first 个数，

假设待填的数的下标为 i ，那么填完以后我们将第 i 个数和第 first 个数交换，

即能使得在填第 first+1 个数的时候 nums 数组的 `[0,first]` 部分为已填过的数，`[first+1,n−1]` 为待填的数，回溯的时候交换回来即能完成撤销操作。

举个简单的例子，假设有 `[2, 5, 8, 9, 10]` 这 5 个数要填入，

已经填到第 3 个位置，已经填了 `[8,9]` 两个数，那么这个数组目前为 `[8, 9 | 2, 5, 10]` 这样的状态，分隔符区分了左右两个部分。

假设这个位置要填 10 这个数，为了维护数组，将 2 和 10 交换，即能使得数组继续保持分隔符左边的数已经填过，右边的待填 `[8, 9, 10 | 2, 5]` 。

当然这样生成的全排列并不是按字典序存储在答案数组中的，如果题目要求按字典序输出，那么请还是用标记数组或者其他方法。

```java
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }
        int n = nums.length;
        backtrack(n, output, ans, 0);
        return ans;
    }

    private void backtrack(int n, List<Integer> output, List<List<Integer>> ans, int first) {
        // 所有数都填完了
        if (first == n) {
            ans.add(new ArrayList<>(output));
        }
        for (int i = first; i < n; i++) {
            // 动态维护数组
            Collections.swap(output, first, i);
            // 继续递归填下一个数
            backtrack(n, output, ans, first + 1);
            // 撤销操作
            Collections.swap(output, first, i);
        }
    }
}
```

时间复杂度：O(n × n!)，其中 n 为序列的长度。

算法的复杂度首先受 `backtrack` 的调用次数制约，`backtrack` 的调用次数为 <img src="https://latex.codecogs.com/svg.image?\sum_{n}^{k=1}P(n,k)" /> 次，

其中

<img src="https://latex.codecogs.com/svg.image?P_{m}^{k}=\frac{n!}{(n-k)!}=n(n-1)...(n-k+1),n\geqslant&space;m" />


该式被称作 n 的 k 排列，或者部分排列。

而

<img src="https://latex.codecogs.com/svg.image?\sum_{n}^{k=1}P(n,k)=n!+\frac{n!}{1!}+\frac{n!}{2!}+...+\frac{n!}{(n-1)!}<2n!+\frac{n!}{2}+\frac{n!}{2^{2}}+...+\frac{n!}{2^{n-2}}<3n!" /> 

这说明 `backtrack` 的调用次数是 O(n!) 的。

而对于 `backtrack` 调用的每个叶结点（共 n! 个），我们需要将当前答案使用 O(n) 的时间复制到答案数组中，相乘得时间复杂度为 O(n×n!)。

空间复杂度：O(n)，其中 n 为序列的长度。

除答案数组以外，递归函数在递归过程中需要为每一层递归函数分配栈空间，所以这里需要额外的空间且该空间取决于递归的深度，这里可知递归调用深度为 O(n)。

---

## 组合

从 n 个不同元素中，任取 `m(m≤n)` 个元素并成一组，叫做从 n 个不同元素中取出 m 个元素的一个组合；

从 n 个不同元素中取出 `m(m≤n)` 个元素的所有组合的个数，叫做从 n 个不同元素中取出 m 个元素的组合数。用符号 <img src="https://latex.codecogs.com/svg.image?C(n,m)" /> 或 <img src="https://latex.codecogs.com/svg.image?C_{m}^{n}" /> 表示。

<img src="https://latex.codecogs.com/svg.image?C_{m}^{n}=\frac{A_{m}^{n}}{m!}=\frac{n!}{m!(n-m)!};C(n,m)=C(n,n-m),n\geqslant&space;m"/>

### 求组合数的方法

> 注意, 12! = 479,001,600 ,13! = 6,227,020,800 超过 int 的最大值

如果直接计算阶乘，很容易造成数据溢出。

实际上，可以模拟组合的实际操作，从 n 个球中取出 m 个球，每次取一个球，对于这个球，有两种可能：
- 如果它属于 m，还需要从 n-1 中取出 m-1 个球；
- 如果它不属于 m，则需要从 n-1 中取出 m 个球；

```java
class Solution {
    public int combineArray(int[] nums, int n) {
        return Math.toIntExact(numberOfCombinations(nums.length, n));
    }

    /**
     * 从n个球中取出一个球。
     * 如果它属于 m，还需要从 n-1中取出 m-1个球；
     * 如果它不属于 m，则需要从 n-1中取出 m 个球；
     * 当数字较大时，递归深度过深，会相对耗时，甚至堆栈溢出。如果对性能有要求，可以建立键-值对，存储计算结果，防止，反复计算。
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

    /**
     * 当数字较大时，递归深度过深，会相对耗时，甚至堆栈溢出。如果对性能有要求，可以建立键-值对，存储计算结果，防止，反复计算。
     */
    Map<String, Long> map = new HashMap<String, Long>();

    private long numberOfCombinations2(int n, int m) {
        String key = m + "," + n;
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
            if (!map.containsKey(key))
                map.put(key, numberOfCombinations(n - 1, m - 1) + numberOfCombinations(n - 1, m));
            return map.get(key);
        }
        return -1;
    }
}
```

### 例子

|难度|题目|代码|掌握度|
|:---:|:---|:---|:---:|
|💚 |[P1995_统计特殊四元组](./../content/P1995_CountSpecialQuadruplets.md) |[P1995_CountSpecialQuadruplets.java](./../../P1995_CountSpecialQuadruplets.java)|😄|

当然，P1995 的例子 n 为固定值，更加普遍适用的例子如下：

给定数组 <img src="https://latex.codecogs.com/svg.image?nums=[1,2,3,4,...,n]" title="nums=[1,2,3,4,...,n]" />

从中取出m个数字：<img src="https://latex.codecogs.com/svg.image?nums[a]" />
，<img src="https://latex.codecogs.com/svg.image?nums[b]" />
... <img src="https://latex.codecogs.com/svg.image?nums[m]" />

其中，<img src="https://latex.codecogs.com/svg.image?a<b<...<m" />

求所有可能的结果组合。

如，nums = [1,2,3,4,5]，n = 3 ，

3 <= nums.length <= 50

1 <= nums[i] <= 100

则可能的排列如下所示

```text
1,2,3
1,2,4
1,2,5
1,3,4
1,3,5
1,4,5
2,3,4
2,3,5
2,4,5
3,4,5
```

### 暴力法

> 如果返回值为 `List<List<Integer>>` 类型，则无需预先计算组合的结果数。示例只是为了更全面一点故意使用 `int[][]` 类型返回

```java
class Solution {
    // 组合下标 index
    int index = 0;

    public int[][] combineArray(int[] nums, int m) {
        // 存储组合结果对应原始 nums 中的下标
        int[] indexes = new int[m];
        // 如果组合数大于 int 的上限，抛出异常
        int numberOfCombinations = Math.toIntExact(numberOfCombinations(nums.length, m));
        int[][] ans = new int[numberOfCombinations][m];
        combine(ans, nums, indexes, 0, m, m);
        return ans;
    }

    /**
     * 组合结果枚举
     * @param ans 答案
     * @param nums nums 原始数组
     * @param indexes 组合在原始数组中的下标数
     * @param start 开始值
     * @param count 当前indexes下标剩余可填空位
     * @param m 组合元素个数
     */
    private void combine(int[][] ans, int[] nums, int[] indexes, int start, int count, int m) {
        for (int i = start; i < nums.length + 1 - count; i++) {
            indexes[count - 1] = i;
            if (count - 1 == 0) {
                int[] temp = new int[m];
                for (int j = m - 1; j >= 0; j--) {
                    temp[m - 1 - j] = nums[indexes[j]];
                }
                ans[index++] = temp;
            } else {
                combine(ans, nums, indexes, i + 1, count - 1, m);
            }
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
```
