# 位运算

## 快速获得n位全1的二进制数对应的整数

```java
// 1<<n = 2^n
// 所以，4个1 的 15 = 2^4 - 1
class Solution {
    public int getNumByBit(int n) {
        return (1 << n) - 1;
    }
}
```

## 数字取补数

设数字的二进制的最高位为i，则掩码mask = 2^(i+1) -1，它是一个 i+1 位的二进制数，并且每一位都是 1。我们将 num 与 mask 进行异或运算，即可得到答案

例子：[P476_数字的补数](./../content/P476_NumberComplement.md)

```java
class Solution {
    public int findComplement(int num) {
        //首先找到 num 二进制表示最高位的那个 1，再将这个 1 以及更低的位进行取反
        //如果 num 二进制表示最高位的 1 是第 i(0≤i≤30) 位，那么一定有：2^i ≤ num < 2^(i+1)
        // 1<<i = 2^i
        int highBit = 0;
        for (int i = 1; i <= 30; ++i) {
            if (num >= 1 << i) {
                highBit = i;
            } else {
                break;
            }
        }
        //构造掩码 mask = 2^(i+1) - 1，它是一个 i+1 位的二进制数，并且每一位都是 1。我们将 num 与 mask 进行异或运算，即可得到答案
        int mask = highBit == 30 ? 0x7fffffff : (1 << (highBit + 1)) - 1;
        return num ^ mask;
    }
}
```