# 算法基础

> 解题技巧？一些坑！

- [算法基础](#算法基础)
  - [mod运算](#mod运算)
  - [数组复制](#数组复制)
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


## 数组复制

看 JDK 源码的时候，Java 开发设计者在对数组的复制时，通常都会使用 System.arraycopy() 方法。

`System.arraycopy()` 的 API ：
```java
/**
 * 注意：src 和 dest都必须是同类型或者可以进行转换类型的数组
 * @param src 源数组
 * @param srcPos 源数组的起始位置
 * @param dest 目标数组
 * @param destPos 目标数组的起始位置
 * @param length 复制长度
 */
public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
```

## 堆栈溢出

> 使用 <strong>x/y >z</strong> 替代 <strong>y*z<x</strong> 的逻辑判断。

例子：

|难度|题目|代码|掌握度|
|:---:|:---|:---|:---|
|💚 |[P69_x 的平方根](./../content/P69_Sqrtx.md)  |[P69_Sqrtx.java](./../../P69_Sqrtx.java)|😄|

## 计算中间值时的数据溢出

> 计算中间值时，应该使用 <strong>(right - left) / 2 + left</strong> 而不是 <strong>(right + left)/2</strong>。

虽然数学上：

<img src="https://latex.codecogs.com/svg.image?(right-left)/2&plus;left=(right&plus;left)/2"/>

但是 java 中 int 的数据范围 

<img src="https://latex.codecogs.com/svg.image?int\in&space;[-2^{31},2^{31}-1],2^{31}=2147483648"/>

对于极值 Integer.MAX_VALUE = **2147483647** ，会导致以下结果：
1. `(right - left) / 2 + left = (2147483647 - 1) /2 + 1 = 1073741824`
2. `(right + left)/2=(2147483647+1)/2 = (-2147483648)/2 = -1073741824`。

显然，等式 2 结果数据溢出。

例子：

|难度|题目|代码|掌握度|
|:---:|:---|:---|:---|
|💚 |[P441_排列硬币](./../content/P441_ArrangingCoins.md)  |[P441_ArrangingCoins.java](./../../P441_ArrangingCoins.java)|😄|
