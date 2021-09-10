//根据一棵树的中序遍历与后序遍历构造二叉树。 
//
// 注意: 
//你可以假设树中没有重复的元素。 
//
// 例如，给出 
//
// 中序遍历 inorder = [9,3,15,20,7]
//后序遍历 postorder = [9,15,7,20,3] 
//
// 返回如下的二叉树： 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
// Related Topics 树 数组 哈希表 分治 二叉树 👍 570 👎 0


package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;

import java.util.Arrays;

/**
 * 从中序与后序遍历序列构造二叉树
 */
public class P106_ConstructBinaryTreeFromInorderAndPostorderTraversal {
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
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            if (postorder == null || postorder.length == 0) {
                return null;
            }
            TreeNode root = new TreeNode(0);
            buildTree(inorder, postorder, root, 0);
            return root.left;
        }

        /**
         * 构建树
         *
         * @param inorder   中序遍历
         * @param postorder 后序遍历
         * @param curRoot   当前根节点
         * @param direction 方向 0：左子树 | 1：右子树
         */
        private void buildTree(int[] inorder, int[] postorder, TreeNode curRoot, int direction) {
            if (postorder == null || postorder.length == 0) {
                return;
            }
            // 后续遍历的最后一个元素为根节点
            int rootValue = postorder[postorder.length - 1];
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
            //根据inorder的长度，可以去postorder中截取对应的左子树的postorder，右子树的postorder
            int[] leftTreePostOrder = Arrays.copyOfRange(postorder, 0, leftTreeInOrder.length);
            int[] rightTreePostOrder = Arrays.copyOfRange(postorder, postorder.length - rightTreeInOrder.length - 1, postorder.length - 1);
            //构建左子树
            buildTree(leftTreeInOrder, leftTreePostOrder, node, 0);
            //构建右子树
            buildTree(rightTreeInOrder, rightTreePostOrder, node, 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
