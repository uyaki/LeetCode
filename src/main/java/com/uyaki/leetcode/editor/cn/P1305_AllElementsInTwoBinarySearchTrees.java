//给你 root1 和 root2 这两棵二叉搜索树。请你返回一个列表，其中包含 两棵树 中的所有整数并按 升序 排序。. 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：root1 = [2,1,4], root2 = [1,0,3]
//输出：[0,1,1,2,3,4]
// 
//
// 示例 2： 
//
// 
//
// 
//输入：root1 = [1,null,8], root2 = [8,1]
//输出：[1,1,8,8]
// 
//
// 
//
// 提示： 
//
// 
// 每棵树的节点数在 [0, 5000] 范围内 
// -10⁵ <= Node.val <= 10⁵ 
// 
// Related Topics 树 深度优先搜索 二叉搜索树 二叉树 排序 👍 133 👎 0


package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 两棵二叉搜索树中的所有元素
 */
public class P1305_AllElementsInTwoBinarySearchTrees{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1305_AllElementsInTwoBinarySearchTrees().new Solution();
	 }
	//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		List<Integer> ans = new ArrayList<>();
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		inorder(root1,l1);
		inorder(root2,l2);
		int p1 = 0, p2 = 0;
		while (true) {
			if (p1 == l1.size()) {
				ans.addAll(l2.subList(p2, l2.size()));
				break;
			}
			if (p2 == l2.size()) {
				ans.addAll(l1.subList(p1, l1.size()));
				break;
			}
			if (l1.get(p1) < l2.get(p2)) {
				ans.add(l1.get(p1++));
			} else {
				ans.add(l2.get(p2++));
			}
		}
		return ans;
    }

	private void inorder(TreeNode node, List<Integer> list) {
		if (node == null) {
			return;
		}
		inorder(node.left, list);
		list.add(node.val);
		inorder(node.right, list);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
