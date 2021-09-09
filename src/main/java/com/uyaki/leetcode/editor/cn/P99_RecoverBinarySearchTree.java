//给你二叉搜索树的根节点 root ，该树中的两个节点被错误地交换。请在不改变其结构的情况下，恢复这棵树。 
//
// 进阶：使用 O(n) 空间复杂度的解法很容易实现。你能想出一个只使用常数空间的解决方案吗？ 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,3,null,null,2]
//输出：[3,1,null,null,2]
//解释：3 不能是 1 左孩子，因为 3 > 1 。交换 1 和 3 使二叉搜索树有效。
// 
//
// 示例 2： 
//
// 
//输入：root = [3,1,4,null,null,2]
//输出：[2,1,4,null,null,3]
//解释：2 不能在 3 的右子树中，因为 2 < 3 。交换 2 和 3 使二叉搜索树有效。 
//
// 
//
// 提示： 
//
// 
// 树上节点的数目在范围 [2, 1000] 内 
// -2³¹ <= Node.val <= 2³¹ - 1 
// 
// Related Topics 树 深度优先搜索 二叉搜索树 二叉树 👍 550 👎 0


package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


/**
 * 恢复二叉搜索树
 */
public class P99_RecoverBinarySearchTree{
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
	//t1,t2用于记录两个错误节点，pre用于记录前节点
	TreeNode t1,t2,pre;
    public void recoverTree(TreeNode root) {
		inOrder(root);
		int temp = t1.val;
		t1.val = t2.val;
		t2.val = temp;
		// 这2行代码只是为了验证结果
		// TreeNode.inOrder(root);
		// System.out.println("");
    }

	private void inOrder(TreeNode node) {
		if(node == null){
			return;
		}
		inOrder(node.left);
		// 前节点指针不为空，且前节点大于当前节点
		if(pre!=null && pre.val>node.val){
			if(t1 == null){
				t1 = pre;
			}
			t2 = node;
		}
		// 前节点指针移动到当前节点
		pre = node;
		inOrder(node.right);

	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
