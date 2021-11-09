//你正在参与祖玛游戏的一个变种。 
//
// 在这个祖玛游戏变体中，桌面上有 一排 彩球，每个球的颜色可能是：红色 'R'、黄色 'Y'、蓝色 'B'、绿色 'G' 或白色 'W' 。你的手中也有一些
//彩球。 
//
// 你的目标是 清空 桌面上所有的球。每一回合： 
//
// 
// 从你手上的彩球中选出 任意一颗 ，然后将其插入桌面上那一排球中：两球之间或这一排球的任一端。 
// 接着，如果有出现 三个或者三个以上 且 颜色相同 的球相连的话，就把它们移除掉。
// 
// 如果这种移除操作同样导致出现三个或者三个以上且颜色相同的球相连，则可以继续移除这些球，直到不再满足移除条件。 
// 
// 
// 如果桌面上所有球都被移除，则认为你赢得本场游戏。 
// 重复这个过程，直到你赢了游戏或者手中没有更多的球。 
// 
//
// 给你一个字符串 board ，表示桌面上最开始的那排球。另给你一个字符串 hand ，表示手里的彩球。请你按上述操作步骤移除掉桌上所有球，计算并返回所需的
// 最少 球数。如果不能移除桌上所有的球，返回 -1 。 
//
// 
//
// 示例 1： 
//
// 
//输入：board = "WRRBBW", hand = "RB"
//输出：-1
//解释：无法移除桌面上的所有球。可以得到的最好局面是：
//- 插入一个 'R' ，使桌面变为 WRRRBBW 。WRRRBBW -> WBBW
//- 插入一个 'B' ，使桌面变为 WBBBW 。WBBBW -> WW
//桌面上还剩着球，没有其他球可以插入。 
//
// 示例 2： 
//
// 
//输入：board = "WWRRBBWW", hand = "WRBRW"
//输出：2
//解释：要想清空桌面上的球，可以按下述步骤：
//- 插入一个 'R' ，使桌面变为 WWRRRBBWW 。WWRRRBBWW -> WWBBWW
//- 插入一个 'B' ，使桌面变为 WWBBBWW 。WWBBBWW -> WWWW -> empty
//只需从手中出 2 个球就可以清空桌面。
// 
//
// 示例 3： 
//
// 
//输入：board = "G", hand = "GGGGG"
//输出：2
//解释：要想清空桌面上的球，可以按下述步骤：
//- 插入一个 'G' ，使桌面变为 GG 。
//- 插入一个 'G' ，使桌面变为 GGG 。GGG -> empty
//只需从手中出 2 个球就可以清空桌面。
// 
//
// 示例 4： 
//
// 
//输入：board = "RBYYBBRRB", hand = "YRBGB"
//输出：3
//解释：要想清空桌面上的球，可以按下述步骤：
//- 插入一个 'Y' ，使桌面变为 RBYYYBBRRB 。RBYYYBBRRB -> RBBBRRB -> RRRB -> B
//- 插入一个 'B' ，使桌面变为 BB 。
//- 插入一个 'B' ，使桌面变为 BBB 。BBB -> empty
//只需从手中出 3 个球就可以清空桌面。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= board.length <= 16 
// 1 <= hand.length <= 5 
// board 和 hand 由字符 'R'、'Y'、'B'、'G' 和 'W' 组成 
// 桌面上一开始的球中，不会有三个及三个以上颜色相同且连着的球 
// 
// Related Topics 字符串 回溯 👍 181 👎 0


package com.uyaki.leetcode.editor.cn;

import java.util.HashMap;

/**
 * 祖玛游戏
 */
public class P488_ZumaGame {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P488_ZumaGame().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        final int MAX_SCORE = 6;
        // <k,v> => < board+","+hand , score >
        HashMap<String, Integer> map = new HashMap<>();

        public int findMinStep(String board, String hand) {
            if (backtrack(new StringBuilder(board), new StringBuilder(hand)) == MAX_SCORE) {
                return -1;
            }
            return map.get(board + "," + hand);
        }

        /**
         * 路径：
         * 选择列表：hand
         * 结束条件：board.length ==0 hand.length == 0
         *
         * @param board
         * @param hand
         */
        private int backtrack(StringBuilder board, StringBuilder hand) {
            int score = MAX_SCORE;
            //完成条件
            //中断条件
            if (board.length() == 0) {
                return score;
            }
            String key = board + "," + hand;
            if (map.containsKey(key)) {
                return map.get(key);
            }
            //for循环
            //   选择
            //      递归消除
            //   回溯
            //   撤销选择
            for (int i = 0; i < hand.length(); i++) {
                for (int j = 0; j < board.length(); j++) {
                    board.insert(j, hand.charAt(i));
                    String newBoard = recur(board.toString());
                    if (newBoard.length() == 0) {
                        map.put(key, 1);
                        return 1;
                    }
                    hand.deleteCharAt(i);
                    score = Math.min(score, backtrack(new StringBuilder(newBoard), hand) + 1);
                    hand.insert(i, board.charAt(j));
                    board.deleteCharAt(j);
                }
            }
            map.put(key, score);
            return score;
        }

        /**
         * 递归消除
         *
         * @param board
         * @return
         */
        private String recur(String board) {
            int length = board.length();
            for (int left = 0, right = 0; right <= length; right++) {
                if (right < length && board.charAt(left) == board.charAt(right)) {
                    continue;
                }
                if (right - left > 2) {
                    return recur(board.substring(0, left) + board.substring(right));
                } else {
                    left = right;
                }
            }
            return board;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
