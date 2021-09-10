//给定一个二叉树，返回其节点值的锯齿形层序遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。 
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
// 返回锯齿形层序遍历如下： 
//
// 
//[
//  [3],
//  [20,9],
//  [15,7]
//]
// 
// Related Topics 树 广度优先搜索 二叉树 👍 513 👎 0


package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;

import java.util.*;

/**
 * 二叉树的锯齿形层序遍历
 */
public class P103_BinaryTreeZigzagLevelOrderTraversal {
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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            // 防止 queue.offer(root)空指针
            if (root == null) {
                return Collections.emptyList();
            }
            List<List<Integer>> ans = new ArrayList<>();
            Deque<TreeNode> queue = new ArrayDeque<>();
            queue.offer(root);
            zigzagLevelOrder(ans, queue, 0);
            return ans;
        }

        // 对于树
        // [[1],[2,3],[4,5,6,7],[8,9,10,11,12,13,14,15]]
        private void zigzagLevelOrder(List<List<Integer>> ans, Deque<TreeNode> queue, int level) {
            // 队列没有元素时，终止迭代
            if (queue.peek() == null) {
                return;
            }
            if (ans.size() < level + 1) {
                ans.add(new ArrayList<>());
            }
            Deque<TreeNode> temp = new ArrayDeque<>();
            while (queue.peek() != null) {
                TreeNode node = queue.pollLast();
                // level = 0 , queue : 1 ，取1
                // level = 1 , queue : 2->3 ，取3、 2
                // level = 2 , queue : 7->6->5->4 , 取 4、5、6、7
                // level = 3 ， queue : 8->9->10->11->12->13->14->15,取 15、14、13、12、11、10、9、8
                ans.get(level).add(node.val);
                if (level % 2 == 0) {
                    // level % 2 = 0 正向
                    // level = 0 ，node = 1 , left = 2 ,right = 3, temp : 2 -> 3
                    // level = 2 ，node = 4 -> 5 -> 6 -> 7 , temp : 8->9->10->11->12->13->14->15
                    if (node.left != null) {
                        temp.offer(node.left);
                    }
                    if (node.right != null) {
                        temp.offer(node.right);
                    }
                } else {
                    // level % 2 != 0 逆向
                    // level = 1 ,node = 3 -> 2 temp 7->6->5->4
                    if (node.right != null) {
                        temp.offer(node.right);
                    }
                    if (node.left != null) {
                        temp.offer(node.left);
                    }
                }
            }
            queue = temp;
            zigzagLevelOrder(ans, queue, level + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
