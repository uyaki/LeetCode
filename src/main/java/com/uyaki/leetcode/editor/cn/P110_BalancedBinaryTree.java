//给定一个二叉树，判断它是否是高度平衡的二叉树。 
//
// 本题中，一棵高度平衡二叉树定义为： 
//
// 
// 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：root = [1,2,2,3,3,null,null,4,4]
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：root = []
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 树中的节点数在范围 [0, 5000] 内 
// -10⁴ <= Node.val <= 10⁴ 
// 
// Related Topics 树 深度优先搜索 二叉树 👍 768 👎 0


package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;

/**
 * 平衡二叉树
 */
public class P110_BalancedBinaryTree {
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null) {
                return true;
            }
            boolean left = isBalanced(root.left);
            boolean right = isBalanced(root.right);
            int max = maxDepth(root);
            int min = minDepth(root);
            if (max - min > 1) {
                return false;
            }
            return left && right;
        }

        private int maxDepth(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int left = maxDepth(node.left);
            int right = maxDepth(node.right);
            // 最大深度 = 左右子树的最大深度的最大值+1（1为自身深度）
            return Math.max(left, right) + 1;
        }

        private int minDepth(TreeNode node) {
            if (node == null) {
                return 0;
            }
            if (node.left == null && node.right == null) {
                return 1;
            }
            int minDepth = Integer.MAX_VALUE;
            if (node.left != null) {
                minDepth = Math.min(minDepth(node.left), minDepth);
            }
            if (node.right != null) {
                minDepth = Math.min(minDepth(node.right), minDepth);
            }
            return minDepth + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
