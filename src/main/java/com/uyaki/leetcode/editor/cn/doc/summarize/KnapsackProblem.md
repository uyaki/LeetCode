# 背包问题

- [背包问题](#背包问题)
  - [01背包问题](#01背包问题)
    - [题目](#题目)
    - [基本思路](#基本思路)
    - [优化](#优化)

## 01背包问题

### 题目

有N件物品 和一个容量V的背包。

第i件物品的体积是 ![1](http://latex.codecogs.com/svg.latex?v_i) ，价值是 ![2](http://latex.codecogs.com/svg.latex?w_i)

求将哪些物品装入背包的价值总和最大。

### 基本思路

> 特点：每种物品仅有一件，可以选择放或者不放

用自问题定义状态：即![1](http://latex.codecogs.com/svg.image?F[i,V]) 表示前i件物品放入一个容量为V的背包可以获得的最大价值

若只考虑第 i 件物品的策略（放或不放），那么就可以转化为一个只和前 i − 1 件物品相关的问题。

- 如果不放第 i 件物品，那么问题就转化为“前 i − 1 件物品放入容量为 V 的背包中”，价值为 ![1](http://latex.codecogs.com/svg.image?F[i-1,V])

- 如果放第 i 件物品，那么问题就转化为“前 i − 1 件物品放入剩下的容量为 ![1](http://latex.codecogs.com/svg.image?V-v_i)
  的背包中”，此时能获得的最大价值就是 ![1](http://latex.codecogs.com/svg.image?F[i-1,V-v_i]+w_i)

其状态转移方程为：

![3](./svg/01Knapsack.svg)

这个方程非常重要，基本上所有跟背包相关的问题的方程都是由它衍生出来的

```text
// n 物品总数 ， m背包体积
for(int i = 1; i <= n;i++){
    for(int j = 1; j <= m ; j++){
      if(j<v[i]){
          dp[i][j] = dp[i-1][j];
      }else{
          dp[i][j] = max{dp[i-1][j],dp[i-1][j-v[i]] + w[i]};
      }
    }
}
```

初始状态 f[0][0] = 0;

### 优化

> 后无效原则：当前状态只与上一个状态有关，与上上个状态无关。
>
如果在主循环中，逆序计算F[V], V <- V ...0，这样额能保证 计算F[V] 时，F[V-vi]保存的时F[i-1,V-vi]的值

```text
for(int i = 1; i <= n;i++){
  for(int j = m; j >= 1;j--){
    if(j>=v[i]){
      dp[j] = max{dp[j],dp[j-v[i]] + w[i]};
    }
  }
}
```
