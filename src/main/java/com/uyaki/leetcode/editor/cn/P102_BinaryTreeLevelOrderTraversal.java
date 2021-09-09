//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例： 
//二叉树：[3,9,20,null,null,15,7], 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层序遍历结果： 
//
// 
//[
//  [3],
//  [9,20],
//  [15,7]
//]
// 
// Related Topics 树 广度优先搜索 二叉树 👍 1000 👎 0


package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的层序遍历
 */
public class P102_BinaryTreeLevelOrderTraversal {
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            levelRecursion(root, result, 0);
            return result;
        }

        private void levelRecursion(TreeNode node, List<List<Integer>> result, int level) {
            if (node == null) {
                return;
            }
            // 说明还需要添加一行
            if (result.size() < level + 1) {
                result.add(new ArrayList<>());
            }
            result.get(level).add(node.val);
            levelRecursion(node.left, result, level + 1);
            levelRecursion(node.right, result, level + 1);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
