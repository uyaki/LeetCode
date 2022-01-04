# P913 猫和老鼠

- [P913 猫和老鼠](#p913-猫和老鼠)
  - [博弈问题](#博弈问题)
  - [动态规划](#动态规划)

## 博弈问题

[博弈问题](./../summarize/GameProblem.md)

## 动态规划

使用三维数组 dp 表示状态，`dp[mouse][cat][turns]` 表示从老鼠位于节点 mouse、猫位于节点 cat、游戏已经进行了 turns 轮的状态开始，猫和老鼠都按照最优策略的情况下的游戏结果。

假设图中的节点数是 n，则有 0≤mouse,cat<n。

由于游戏的初始状态是老鼠位于节点 1，猫位于节点 2，因此 `dp[1][2][0]` 为从初始状态开始的游戏结果。

动态规划的边界条件为可以直接得到游戏结果的状态，包括以下三种状态：

- 如果 `mouse = 0`，老鼠躲入洞里，则老鼠获胜，因此对于任意 cat 和 turns 都有 `dp[0][cat][turns]=1`，该状态为老鼠的必胜状态，猫的必败状态。
- 如果 `cat = mouse`，猫和老鼠占据相同的节点，则猫获胜，因此对于任意 mouse、cat 和 turns 都有 `dp[mouse][cat][turns]=2`，该状态为老鼠的必败状态，猫的必胜状态。
  - 注意猫不能移动到节点 0，因此当 mouse = 0 时，一定有 cat / mouse
- 如果 `turns ≥ 2n`，则是平局，该状态为双方的必和状态
  - 如果游戏已经进行了 2n 轮，但是仍然没有任何一方获胜，此时猫和老鼠各移动了 n 次，该移动次数等于图中的节点数，因此一定存在一个老鼠到达过至少两次的节点，以及一定存在一个猫到达过至少两次的节点。
  - 对于老鼠而言，即使按照最优策略，也无法躲入洞内，而是只能回到一个已经到达过的节点。当老鼠回到一个在过去的某个回合已经到达过的节点时，猫可能回到在相同回合已经到达过的节点，也可能移动到一个更有利于猫获胜的节点，不可能移动到一个更有利于老鼠获胜的节点（否则猫就不是按照最优策略参与游戏）。如果猫回到在相同回合已经到达过的节点，则形成循环，因此是平局；如果猫移动到一个更有利于猫获胜的节点，则老鼠的获胜机会更小，因此老鼠无法获胜。 
  - 同理可知，如果猫按照最优策略也只能回到一个已经到达过的节点，则猫无法获胜。 
  - 因此当猫和老鼠分别回到一个已经到达过的节点时，猫和老鼠都无法获胜，游戏结果是平局。

动态规划的状态转移需要考虑当前玩家所有可能的移动，选择最优策略的移动。

由于老鼠先开始移动，猫后开始移动，因此可以根据游戏已经进行的轮数 turns 的奇偶性决定当前轮到的玩家
- 当 turns 是偶数时轮到老鼠移动
- 当 turns 是奇数时轮到猫移动

如果轮到老鼠移动，则对于老鼠从当前节点移动一次之后可能到达的每个节点，进行如下操作：

1. 如果存在一个节点，老鼠到达该节点之后，老鼠可以获胜，则老鼠到达该节点之后的状态为老鼠的必胜状态，猫的必败状态，因此在老鼠移动之前的当前状态为老鼠的必胜状态。 
2. 如果老鼠到达任何节点之后的状态都不是老鼠的必胜状态，但是存在一个节点，老鼠到达该节点之后，结果是平局，则老鼠到达该节点之后的状态为双方的必和状态，因此在老鼠移动之前的当前状态为双方的必和状态。 
3. 如果老鼠到达任何节点之后的状态都不是老鼠的必胜状态或必和状态，则老鼠到达任何节点之后的状态都为老鼠的必败状态，猫的必胜状态，因此在老鼠移动之前的当前状态为老鼠的必败状态。

如果轮到猫移动，则对于猫从当前节点移动一次之后可能到达的每个节点，进行如下操作：

1. 如果存在一个节点，猫到达该节点之后，猫可以获胜，则猫到达该节点之后的状态为猫的必胜状态，老鼠的必败状态，因此在猫移动之前的当前状态为猫的必胜状态。 
2. 如果猫到达任何节点之后的状态都不是猫的必胜状态，但是存在一个节点，猫到达该节点之后，结果是平局，则猫到达该节点之后的状态为双方的必和状态，因此在猫移动之前的当前状态为双方的必和状态。 
3. 如果猫到达任何节点之后的状态都不是猫的必胜状态或必和状态，则猫到达任何节点之后的状态都为猫的必败状态，老鼠的必胜状态，因此在猫移动之前的当前状态为猫的必败状态。

实现方面，由于双方移动的策略相似，因此可以使用一个函数实现移动策略，根据游戏已经进行的轮数的奇偶性决定当前轮到的玩家。对于特定玩家的移动，实现方法如下：
1. 如果当前玩家存在一种移动方法到达非必败状态，则用该状态更新游戏结果。 
   - 如果该移动方法到达必胜状态，则将当前状态（移动前的状态）设为必胜状态，结束遍历其他可能的移动。 
   - 如果该移动方法到达必和状态，则将当前状态（移动前的状态）设为必和状态，继续遍历其他可能的移动，因为可能存在到达必胜状态的移动方法。 
2. 如果当前玩家的任何移动方法都到达必败状态，则将当前状态（移动前的状态）设为必败状态。

特别地，如果当前玩家是猫，则不能移动到节点 0。

```java
class Solution {
    static final int MOUSE_WIN = 1;
    static final int CAT_WIN = 2;
    static final int DRAW = 0;
    int n;
    int[][] graph;
    int[][][] dp;

    public int catMouseGame(int[][] graph) {
        this.n = graph.length;
        this.graph = graph;
        this.dp = new int[n][n][n * 2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return getResult(1, 2, 0);
    }

    public int getResult(int mouse, int cat, int turns) {
        if (turns == n * 2) {
            return DRAW;
        }
        if (dp[mouse][cat][turns] < 0) {
            if (mouse == 0) {
                dp[mouse][cat][turns] = MOUSE_WIN;
            } else if (cat == mouse) {
                dp[mouse][cat][turns] = CAT_WIN;
            } else {
                getNextResult(mouse, cat, turns);
            }
        }
        return dp[mouse][cat][turns];
    }

    public void getNextResult(int mouse, int cat, int turns) {
        // 当前移动的是猫还是老鼠，偶数为老鼠，奇数为猫
        int curMove = turns % 2 == 0 ? mouse : cat;
        int defaultResult = curMove == mouse ? CAT_WIN : MOUSE_WIN;
        int result = defaultResult;
        int[] nextNodes = graph[curMove];
        for (int next : nextNodes) {
            if (curMove == cat && next == 0) {
                continue;
            }
            int nextMouse = curMove == mouse ? next : mouse;
            int nextCat = curMove == cat ? next : cat;
            int nextResult = getResult(nextMouse, nextCat, turns + 1);
            if (nextResult != defaultResult) {
                result = nextResult;
                if (result != DRAW) {
                    break;
                }
            }
        }
        dp[mouse][cat][turns] = result;
    }
}
```


