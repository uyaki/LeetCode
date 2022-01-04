# 快速幂

- [快速幂](#快速幂)
  - [本质](#本质)
    - [方法一：快速幂 + 递归](#方法一快速幂--递归)
    - [方法二：快速幂 + 迭代](#方法二快速幂--迭代)

## 本质

> 本质：分治算法。


e.g.

- 计算：x<sup>64</sup> 
    - 实际上是：<img src="https://latex.codecogs.com/svg.image?x\to&space;x^{2}\to&space;x^{4}\to&space;x^{8}\to&space;x^{16}\to&space;x^{32}\to&space;x^{64}"/>
    - 从 x 开始，每次直接把上一次的结果进行平方，计算 6 次就可以得到 x<sup>64</sup> 的值，而不需要对 x 乘 63 次 x。
- 计算：x<sup>77</sup> 
  - 实际上是：<img src="https://latex.codecogs.com/svg.image?x\to&space;x^{2}\to&space;x^{4}\to&space;x^{9}\to&space;x^{19}\to&space;x^{38}\to&space;x^{77}"/>
  - 特殊的 <img src="https://latex.codecogs.com/svg.image?x\to&space;x^{2}\to&space;x^{4}\to&space;x^{9}\to&space;x^{18}\cdot x\to&space;x^{38}\to&space;x^{76}\cdot x"/>
  - 对于，<img src="https://latex.codecogs.com/svg.image?x^{4}\to&space;x^{9},x^{9}\to&space;x^{19},x^{38}\to&space;x^{77}"/>把上一次的结果进行平方后，还要额外乘一个 x

直接从左到右进行推导看上去很困难，因为在每一步中，我们不知道在将上一次的结果平方之后，还需不需要额外乘 x。

但如果我们从右往左看，分治的思想就十分明显了。

### 方法一：快速幂 + 递归

- 步骤
  - 计算 x<sup>n</sup> 可以递归的计算 y= x <sup>⌊n/2⌋</sup> ，⌊a⌋ 表示对 a 向下取整
    - 如果 n 为偶数，那么 x<sup>n</sup> = y<sup>2</sup> 
    - 如果 n 为奇数，那么 x<sup>n</sup> = y<sup>2</sup> * x
  - 递归的边界为 n = 0，任意数的 0 次方均为 1 
- 复杂度分析
  - 由于每次递归都会使得指数减少一半，因此递归的层数为 O(logn)
  - 时间复杂度：O(\log n)O(logn)，即为递归的层数。
  - 空间复杂度：O(\log n)O(logn)，即为递归的层数。这是由于递归的函数调用会使用栈空间。
  
```java
class Solution {
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }
}
```

### 方法二：快速幂 + 迭代

计算：x<sup>77</sup>

- <img src="https://latex.codecogs.com/svg.image?x\to&space;x^{2}\to&space;x^{4}\to&space;^{+}x^{9}\to&space;^{+}x^{19}\to&space;x^{38}\to&space;^{+}x^{77}"/>

把需要额外乘 x 的步骤打上了 + 标记
- <img src="https://latex.codecogs.com/svg.image?x^{38}\to&space;^{+}x^{77}"/>中，__额外乘的x__ 在x<sup>77</sup>中贡献了x；
- <img src="https://latex.codecogs.com/svg.image?x^{9}\to&space;^{+}x^{19}"/>中，__额外乘的x__ 在之后被平方了2次，在x<sup>77</sup>中贡献了x<sup>2<sup>2</sup></sup> = x<sup>4</sup>；
- <img src="https://latex.codecogs.com/svg.image?x^{4}\to&space;^{+}x^{9}"/>中，__额外乘的x__ 在之后被平方了2次，在x<sup>77</sup>中贡献了x<sup>2<sup>3</sup></sup> = x<sup>8</sup>；
- 最初的x被平法了6次，在x<sup>77</sup>中贡献了x<sup>2<sup>6</sup></sup> = x<sup>64</sup>；

我们把这些贡献相乘 <img src="https://latex.codecogs.com/svg.image?x\cdot x^{4}\cdot x^{8}\cdot x^{64}=x^{77}"/>

而这些贡献的指数部分又是什么呢？

> 它们都是 2 的幂次，这是因为每个额外乘的 x 在之后都会被平方若干次。
> 而这些指数 1，4，8 和 64，恰好就对应了 77 的二进制表示 (1001101)<sub>2</sup> 中的每个 1

因此我们借助整数的二进制拆分，就可以得到迭代计算的方法，一般地，如果整数 n 的二进制拆分为

n = 2<sup>i<sub>0</sub></sup> + 2<sup>i<sub>1</sub></sup> + ... + 2<sup>i<sub>k</sub></sup>

那么

x<sup>n</sup> = x<sup>2<sup>i<sub>0</sub></sup></sup> * x<sup>2<sup>i<sub>1</sub></sup></sup> * ... * x<sup>2<sup>i<sub>k</sub></sup></sup>

- 步骤
  - 我们从 x 开始不断地进行平方，得到 x<sup>2</sup>, x<sup>4</sup>, x<sup>8</sup>, ... 如果 n 的第 k 个（从右往左，从 0 开始计数）二进制位为 1，那么我们就将对应的贡献 x<sup>2<sup>k</sup></sup> 计入答案
- 复杂度分析
  - 时间复杂度：O(logn)，即为对 n 进行二进制拆分的时间复杂度。
  - 空间复杂度：O(1)。

```java
class Solution {
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    public double quickMul(double x, long N) {
        double ans = 1.0;
        // 贡献的初始值为 x
        double x_contribute = x;
        // 在对 N 进行二进制拆分的同时计算答案
        while (N > 0) {
            if (N % 2 == 1) {
                // 如果 N 二进制表示的最低位为 1，那么需要计入贡献
                ans *= x_contribute;
            }
            // 将贡献不断地平方
            x_contribute *= x_contribute;
            // 舍弃 N 二进制表示的最低位，这样我们每次只要判断最低位即可
            N /= 2;
        }
        return ans;
    }
}
```


 