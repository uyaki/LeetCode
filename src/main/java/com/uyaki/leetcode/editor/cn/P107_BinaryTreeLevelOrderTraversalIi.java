//给定一个二叉树，返回其节点值自底向上的层序遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历） 
//
// 例如： 
//给定二叉树 [3,9,20,null,null,15,7], 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其自底向上的层序遍历为： 
//
// 
//[
//  [15,7],
//  [9,20],
//  [3]
//]
// 
// Related Topics 树 广度优先搜索 二叉树 👍 480 👎 0


package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 二叉树的层序遍历 II
 */
public class P107_BinaryTreeLevelOrderTraversalIi {

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
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            levelOrderBottom(root, ans, 0);
            //翻转list顺序
            Collections.reverse(ans);
            return ans;
        }

        private void levelOrderBottom(TreeNode node, List<List<Integer>> ans, int level) {
            if (node == null) {
                return;
            }
            if (ans.size() < level + 1) {
                ans.add(new ArrayList<>());
            }
            ans.get(level).add(node.val);
            levelOrderBottom(node.left, ans, level + 1);
            levelOrderBottom(node.right, ans, level + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
