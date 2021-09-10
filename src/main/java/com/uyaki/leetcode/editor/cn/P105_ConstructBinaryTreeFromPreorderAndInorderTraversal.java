//给定一棵树的前序遍历 preorder 与中序遍历 inorder。请构造二叉树并返回其根节点。 
//
// 
//
// 示例 1: 
//
// 
//Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//Output: [3,9,20,null,null,15,7]
// 
//
// 示例 2: 
//
// 
//Input: preorder = [-1], inorder = [-1]
//Output: [-1]
// 
//
// 
//
// 提示: 
//
// 
// 1 <= preorder.length <= 3000 
// inorder.length == preorder.length 
// -3000 <= preorder[i], inorder[i] <= 3000 
// preorder 和 inorder 均无重复元素 
// inorder 均出现在 preorder 
// preorder 保证为二叉树的前序遍历序列 
// inorder 保证为二叉树的中序遍历序列 
// 
// Related Topics 树 数组 哈希表 分治 二叉树 👍 1200 👎 0


package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;

import java.util.Arrays;

/**
 * 从前序与中序遍历序列构造二叉树
 */
public class P105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder == null || preorder.length == 0) {
                return null;
            }
            //用来挂载根节点
            TreeNode root = new TreeNode(0);
            buildTree(preorder, inorder, root, 0);
            return root.left;
        }

        /**
         * 构建树
         *
         * @param preorder  前序遍历
         * @param inorder   中序遍历
         * @param curRoot   当前根节点
         * @param direction 方向 0：左子树 | 1：右子树
         */
        private void buildTree(int[] preorder, int[] inorder, TreeNode curRoot, int direction) {
            if (preorder == null || preorder.length == 0) {
                return;
            }
            // preorder中的第一个元素为根节点
            int rootValue = preorder[0];
            TreeNode node = new TreeNode(rootValue);
            if (direction == 0) {
                curRoot.left = node;
            } else {
                curRoot.right = node;
            }
            //切割数组
            int index = 0;
            for (int i = 0; i < inorder.length; i++) {
                if (rootValue == inorder[i]) {
                    index = i;
                }
            }
            // copyOfRange为 [start,end)区间
            //根据根节点值分割inorder，左边为左子树的inorder，右边为右之树的inorder
            int[] leftTreeInOrder = Arrays.copyOfRange(inorder, 0, index);
            int[] rightTreeInOrder = Arrays.copyOfRange(inorder, index + 1, inorder.length);
            //根据inorder的长度，可以去preorder中截取对应的左子树的preorder，右子树的preorder
            int[] leftTreePreOrder = Arrays.copyOfRange(preorder, 1, leftTreeInOrder.length + 1);
            int[] rightTreePreOrder = Arrays.copyOfRange(preorder, preorder.length - rightTreeInOrder.length, preorder.length);
            buildTree(leftTreePreOrder, leftTreeInOrder, node, 0);
            buildTree(rightTreePreOrder, rightTreeInOrder, node, 1);
        }

        /**
         * 解法2: 实际上可以不用切割数组，改为遍历的时候范围遍历
         */
        public TreeNode buildTree2(int[] preorder, int[] inorder) {
            return buildTree2(preorder, inorder, 0, 0, inorder.length - 1);
        }

        public TreeNode buildTree2(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd) {
            if (inStart > inEnd) {
                return null;
            }

            int currentVal = preorder[preStart];
            TreeNode current = new TreeNode(currentVal);

            int inIndex = 0;
            for (int i = inStart; i <= inEnd; i++) {
                if (inorder[i] == currentVal) {
                    inIndex = i;
                }
            }
            // 当前 preStart的下一个位置 = 左子树前序遍历的 preStart
            TreeNode left = buildTree2(preorder, inorder, preStart + 1, inStart, inIndex - 1);
            // 当前 preStart的下一个位置+ 左子树的长度 = 右子树前序遍历的 preStart
            TreeNode right = buildTree2(preorder, inorder, preStart + 1 + (inEnd - inIndex), inIndex + 1, inEnd);
            current.left = left;
            current.right = right;
            return current;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
