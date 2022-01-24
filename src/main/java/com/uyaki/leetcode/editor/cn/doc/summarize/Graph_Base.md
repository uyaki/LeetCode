# 图基础

图本质上是多叉树的延伸

## 图的逻辑结构与具体实现

图的构成要素
- 节点
- 边

```java
class Graph{
    int id;
    Graph[] neighbors;
}
```