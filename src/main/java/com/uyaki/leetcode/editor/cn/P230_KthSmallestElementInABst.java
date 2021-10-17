//给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [3,1,4,null,2], k = 1
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：root = [5,3,6,2,4,null,null,1], k = 3
//输出：3
// 
//
// 
//
// 
//
// 提示： 
//
// 
// 树中的节点数为 n 。 
// 1 <= k <= n <= 10⁴ 
// 0 <= Node.val <= 10⁴ 
// 
//
// 
//
// 进阶：如果二叉搜索树经常被修改（插入/删除操作）并且你需要频繁地查找第 k 小的值，你将如何优化算法？ 
// Related Topics 树 深度优先搜索 二叉搜索树 二叉树 👍 495 👎 0


package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;

import java.util.HashMap;

/**
 * 二叉搜索树中第K小的元素
 */
public class P230_KthSmallestElementInABst {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P230_KthSmallestElementInABst().new Solution();
    }
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
        // 最简单的做法是用中序遍历，但是我们这里优化一下。

        public int kthSmallest(TreeNode root, int k) {
            MyTreeNode node = new MyTreeNode(root);
            return node.kthSmallest(k);
        }

        class MyTreeNode {
            TreeNode root;
            HashMap<TreeNode, Integer> nodeNum;

            public MyTreeNode(TreeNode root) {
                this.root = root;
                this.nodeNum = new HashMap<>();
                countNodeNum(root);
            }

            /**
             * 搜索第k小的元素
             *
             * @param k
             * @return
             */
            public int kthSmallest(int k) {
                TreeNode node = root;
                while (node != null) {
                    int left = getNodeNum(node.left);
                    if (left == k - 1) {
                        // 如果左子树子节点个数 left == k-1，第k小节点为当前节点
                        break;
                    } else if (left > k - 1) {
                        // 如果左子树子节点个数 left > k-1，第k小节点在左子树
                        node = node.left;
                    } else {
                        // 如果左子树子节点个数 left < k-1，第k小节点在右子树
                        node = node.right;
                        // 此时k值应当 - left - currNode
                        k = k - left - 1;
                    }
                }
                return node.val;
            }

            /**
             * 统计以node为根节点的子节点个数
             *
             * @param node node
             * @return 个数
             */
            private int countNodeNum(TreeNode node) {
                if (node == null) {
                    return 0;
                }
                nodeNum.put(node, 1 + countNodeNum(node.left) + countNodeNum(node.right));
                return getNodeNum(node);
            }

            /**
             * 获取子节点个数
             *
             * @param node node
             * @return 个数
             */
            private int getNodeNum(TreeNode node) {
                return nodeNum.getOrDefault(node, 0);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
