# 树状数组

## 预置函数

定义一个lowBit函数，返回 **参数转为二进制后，最后一个1的位置所代表的数值** 

```java
int lowBit(int x) {
    return x & -x;
}
```
## 元素修改

```java
void add(int index, int val) {
    while (index < tree.length) {
        tree[index] += val;
        index += lowBit(index);
    }
}
```
## 前缀和函数

定义一个数组 tree，用以维护前index个数的前缀和

```java
int prefixSum(int index) {
    int sum = 0;
    while (index > 0) {
        sum += tree[index];
        index -= lowBit(index);
    }
    return sum;
}
```

## 树状数组

```java
class BinaryIndexedTree{
    private int[] tree;
    private int[] nums;

    public NumArray(int[] nums) {
        this.tree = new int[nums.length + 1];
        this.nums = nums;
        for (int i = 0; i < nums.length; i++) {
            add(i + 1, nums[i]);
        }
    }

    public void update(int index, int val) {
        add(index + 1, val - nums[index]);
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        return prefixSum(right + 1) - prefixSum(left);
    }

    /**
     * 返回参数转为二进制后,最后一个1的位置所代表的数值
     * @param x
     * @return
     */
    private int lowBit(int x) {
        return x & -x;
    }

    /**
     * 单点修改 add(index,val)：把序列第 index 个数增加 val
     * @param index
     * @param val
     */
    private void add(int index, int val) {
        while (index < tree.length) {
            tree[index] += val;
            index += lowBit(index);
        }
    }

    /**
     * 区间查询 prefixSum(index)：查询前 index 个元素的前缀和
     * @param index
     * @return
     */
    private int prefixSum(int index) {
        int sum = 0;
        while (index > 0) {
            sum += tree[index];
            index -= lowBit(index);
        }
        return sum;
    }
}
```

## 例题

|难度| 题目                                                              | 题解                                                                                                | 代码                                                                       |掌握度|
|:---:|:----------------------------------------------------------------|:--------------------------------------------------------------------------------------------------|:-------------------------------------------------------------------------|:---:|
|💛 | [P307_区域和检索 - 数组可修改](./../content/P307_RangeSumQueryMutable.md) |             | [P307_RangeSumQueryMutable.java](./../../P307_RangeSumQueryMutable.java) |😄|




