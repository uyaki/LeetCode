//用字符串数组作为井字游戏的游戏板 board。当且仅当在井字游戏过程中，玩家有可能将字符放置成游戏板所显示的状态时，才返回 true。 
//
// 该游戏板是一个 3 x 3 数组，由字符 " "，"X" 和 "O" 组成。字符 " " 代表一个空位。 
//
// 以下是井字游戏的规则： 
//
// 
// 玩家轮流将字符放入空位（" "）中。 
// 第一个玩家总是放字符 “X”，且第二个玩家总是放字符 “O”。 
// “X” 和 “O” 只允许放置在空位中，不允许对已放有字符的位置进行填充。 
// 当有 3 个相同（且非空）的字符填充任何行、列或对角线时，游戏结束。 
// 当所有位置非空时，也算为游戏结束。 
// 如果游戏结束，玩家不允许再放置字符。 
// 
//
// 
//示例 1:
//输入: board = ["O  ", "   ", "   "]
//输出: false
//解释: 第一个玩家总是放置“X”。
//
//示例 2:
//输入: board = ["XOX", " X ", "   "]
//输出: false
//解释: 玩家应该是轮流放置的。
//
//示例 3:
//输入: board = ["XXX", "   ", "OOO"]
//输出: false
//
//示例 4:
//输入: board = ["XOX", "O O", "XOX"]
//输出: true
// 
//
// 说明: 
//
// 
// 游戏板 board 是长度为 3 的字符串数组，其中每个字符串 board[i] 的长度为 3。 
// board[i][j] 是集合 {" ", "X", "O"} 中的一个字符。 
// 
// Related Topics 数组 字符串 👍 40 👎 0


package com.uyaki.leetcode.editor.cn;

/**
 * 有效的井字游戏
 */
public class P794_ValidTicTacToeState{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P794_ValidTicTacToeState().new Solution();
	 }
	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validTicTacToe(String[] board) {
		//玩家轮流将字符放入空位中。第一个玩家总是放字符 "X"，且第二个玩家总是放字符 "O"。
		// 1. 因为第一个玩家总是先手，这就要求游戏板中字符 "X" 的数量一定是大于等于字符 "O" 的数量。
		int xCount = 0 , oCount = 0;
		for (String row: board			) {
			for (char ch : row.toCharArray()) {
				xCount = ch == 'X' ? xCount + 1 : xCount;
				oCount = ch == 'O' ? oCount + 1 : oCount;
			}
		}

		if (oCount != xCount && oCount != xCount - 1) {
			return false;
		}
		// 2. "X"和 "O"只允许放置在空位中，不允许对已放有字符的位置进行填充。
		// 3. 游戏板上不可能同时出现 3 个 "X" 在一行和 3 个 "O" 在另一行
		// 4. 如果第一个玩家获胜，由于第一个玩家是先手，则次数游戏板中 "X" 的数量比 "O" 的数量多 1
		// 5. 如果第二个玩家获胜，则 "X" 的数量与 "O" 的数量相同
		if(win(board,'X') && oCount != xCount -1){
			return false;
		}
		return !win(board, 'O') || oCount == xCount;
	}

		private boolean win(String[] board, char ch) {
			for (int i = 0; i < 3; i++) {
				// 同列
				if (ch == board[0].charAt(i) && ch == board[1].charAt(i) && ch == board[2].charAt(i)) {
					return true;
				}
				// 同行
				if (ch == board[i].charAt(0) && ch == board[i].charAt(1) && ch == board[i].charAt(2)) {
					return true;
				}
			}
			// 对角线
			if(ch == board[0].charAt(0) && ch == board[1].charAt(1) && ch == board[2].charAt(2)){
				return true;
			}
			return ch == board[0].charAt(2) && ch == board[1].charAt(1) && ch == board[2].charAt(0);
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}
