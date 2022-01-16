# 算法基础

> 解题技巧？一些坑！

- [算法基础](#算法基础)
    - [mod运算](#mod运算)
    - [堆栈溢出](#堆栈溢出)
    - [计算中间值时的数据溢出](#计算中间值时的数据溢出)

## mod运算

> 通常用于计算结果过大，需要求结果进行累加求模运算

- `a ^ b % p = ((a % p)^b) % p`
- 结合律
    - `((a+b) % p + c) % p = (a + (b+c) % p) % p`
    - `((a*b) % p * c)% p = (a * (b*c) % p) % p `
- 分配律
    - `(a + b) % p = (a % p + b % p) % p`
    - `(a - b) % p = (a % p - b % p ) % p`
    - `(a * b) % p = (a % p * b % p) % p`
    - `((a +b)% p * c) % p = ((a * c) % p + (b * c) % p) % p`

## 堆栈溢出

> 使用`x/y >z` 替代 `y*z<x`的逻辑判断。

例子：[💚 P69_x 的平方根](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P69_Sqrtx.md)

## 计算中间值时的数据溢出

> **计算中间值时，应该使用`(right - left) / 2 + left` 而不是 `(right + left)/2`。**

虽然数学上 `(right - left) / 2 + left = (right + left)/2`。

但是java中int的数据范围 `[-2^31,2^31-1]`，其中 `2^31 = 2147483648`。

这就导致了 `(2147483647 - 1) /2 + 1 = 1073741824` 而 `(2147483647+1)/2 = (-2147483648)/2 = -1073741824`。

结果出错。

例子：[💚 P441_排列硬币](./src/main/java/com/uyaki/leetcode/editor/cn/doc/content/P441_ArrangingCoins.md)
