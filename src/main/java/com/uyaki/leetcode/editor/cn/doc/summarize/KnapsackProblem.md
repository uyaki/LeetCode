# 背包问题

## 01背包问题

### 题目
有N件物品 和一个容量V的背包。

第i件物品的体积是 ![1](http://latex.codecogs.com/svg.latex?v_{i}) ，价值是 ![2](http://latex.codecogs.com/svg.latex?w_{i})

求将哪些物品装入背包的价值总和最大。
### 基本思路
> 特点：每种物品仅有一件，可以选择放或者不放

用自问题定义状态：即 F[i,V]表示前i件物品放入一个容量为V的背包可以获得的最大价值

![3](https://latex.codecogs.com/svg.image?F[i,V]=max\{F[i-1,V],F[i-1,V-v_i]+W_i\})



