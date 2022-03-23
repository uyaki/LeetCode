# 字典序第K小的数字

字节常见10大hard题之一

## 什么是字典序

简而言之，就是根据数字的前缀进行排序，

比如 10 < 9，因为 10 的前缀是 1，比 9 小。

再比如 112 < 12，因为 112 的前缀 11 小于 12。

## 问题建模

本体的本质是一个10叉树的前序遍历。

![](./png/440_1.png)

实际不需要构造字典树，已知节点 i 的子节点为 (10×i,10×i+1,⋯,10×i+9)，可以通过计算找到前序遍历第 k 个节点即可。

我们需要找到排在第k位的数。找到他的排位，需要搞清楚三件事情:

1. 怎么确定一个前缀下所有子节点的个数？
2. 如果第 k 个数在当前的前缀下，怎么继续往下面的子节点找？
3. 如果第 k 个数不在当前的前缀，即当前的前缀比较小，如何扩大前缀，增大寻找的范围？

## 问题拆解

### 1. 怎么确定一个前缀下所有子节点的个数？

思路： 当前前缀下的所有子节点数总和 = 下一个前缀的起点减去当前前缀的起点

```java
class Solution {
    /**
     * 以这个前缀为根节点的所有子节点数总和
     * @param n 上界n
     * @param prefix 前缀
     * @return 当前前缀下的所有子节点数总和
     */
    private int count(int n, int prefix) {
        //不断向下层遍历可能一个乘10就溢出了, 所以用long
        long cur = prefix;
        //下一个前缀
        long next = cur + 1;
        int count = 0;
        while (cur <= n) {
            //下一峰头减去此峰头
            // 当 next 的值大于上界 n的时候，那以这个前缀为根节点的十叉树就不是满十叉树
            // 所以不能直接用 count += next - cur
            // 加入 n = 12,算出以1位前缀的子节点数，
            //   1
            // / |  \
            //10 11 12
            // 一共4个节点 。 
            // n = 12 ， 如果 count += Math.min(n, next) - cur;
            // 第一次计算 cur=1 ，next=2  count = 1 ,这里是根节点本身
            // cur = 10 next= 20 > n 
            // Math.min(n,next)-cur =  12 - 10 =  2 + 根节点 = 3 少了一个。
            // 所以 count += Math.min(n, next) - cur;
            count += Math.min(n + 1, next) - cur;
            // 如果说刚刚prefix是1，next是2，那么现在分别变成10和20
            // 1为前缀的子节点增加10个，十叉树增加一层, 变成了两层

            // 如果说现在prefix是10，next是20，那么现在分别变成100和200，
            // 1为前缀的子节点增加100个，十叉树又增加了一层，变成了三层
            cur *= 10;
            next *= 10; //往下层走
        }
        return count;
    }
}
```

### 2. 如果第 k 个数在当前的前缀下，怎么继续往下面的子节点找？

此时，k处于该前缀的子树

```java
prefix *= 10;
```

### 3. 如果第 k 个数不在当前的前缀，即当前的前缀比较小，如何扩大前缀，增大寻找的范围？

前缀小了，扩大前缀
```java
prefix++;
```

## 思路整合

```java
class Solution {
    public int findKthNumber(int n, int k) {
        // 第一个字典序
        int cur = 1;
        // 前缀从1开始
        int prefix = 1;
        while (cur < k) {
            // 当前prefix字典序的子节点数
            int count = count(n, prefix);
            if (cur + count > k) {
                // 找到了，prefix往下一层遍历
                prefix *= 10;
                //一直遍历到第 k个
                cur++;
            } else if (cur + count <= k) {
                // 不在当前子树
                // 去下一个prefix遍历
                prefix++;
                // 跨过了一整个prefix子树
                cur += count;
            }
        }
        // cur == k 刚好退出循环，找到了结果
        return prefix;
    }

    /**
     * 以这个前缀为根节点的所有子节点数总和
     *
     * @param n      上界n
     * @param prefix 前缀
     * @return 当前前缀下的所有子节点数总和
     */
    private int count(int n, int prefix) {
        //不断向下层遍历可能一个乘10就溢出了, 所以用long
        long cur = prefix;
        //下一个前缀
        long next = cur + 1;
        int count = 0;
        while (cur <= n) {
            //下一峰头减去此峰头
            // 当 next 的值大于上界 n的时候，那以这个前缀为根节点的十叉树就不是满十叉树
            // 所以不能直接用 count += next - cur
            // 加入 n = 12,算出以1位前缀的子节点数，
            //   1
            // / |  \
            //10 11 12
            // 一共4个节点 。
            // n = 12 ， 如果 count += Math.min(n, next) - cur;
            // 第一次计算 cur=1 ，next=2  count = 1 ,这里是根节点本身
            // cur = 10 next= 20 > n
            // Math.min(n,next)-cur =  12 - 10 =  2 + 根节点 = 3 少了一个。
            // 所以 count += Math.min(n, next) - cur;
            count += Math.min(n + 1, next) - cur;
            // 如果说刚刚prefix是1，next是2，那么现在分别变成10和20
            // 1为前缀的子节点增加10个，十叉树增加一层, 变成了两层

            // 如果说现在prefix是10，next是20，那么现在分别变成100和200，
            // 1为前缀的子节点增加100个，十叉树又增加了一层，变成了三层
            cur *= 10;
            next *= 10; //往下层走
        }
        return count;
    }
}
```