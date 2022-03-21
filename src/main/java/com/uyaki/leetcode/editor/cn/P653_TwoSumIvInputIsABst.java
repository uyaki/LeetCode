//给定一个二叉搜索树 root 和一个目标结果 k，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。 
//
// 
//
// 示例 1： 
//
// 
//输入: root = [5,3,6,2,4,null,7], k = 9
//输出: true
// 
//
// 示例 2： 
//
// 
//输入: root = [5,3,6,2,4,null,7], k = 28
//输出: false
// 
//
// 
//
// 提示: 
//
// 
// 二叉树的节点个数的范围是 [1, 10⁴]. 
// -10⁴ <= Node.val <= 10⁴ 
// root 为二叉搜索树 
// -10⁵ <= k <= 10⁵ 
// 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉搜索树 哈希表 双指针 二叉树 👍 353 👎 0


package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 两数之和 IV - 输入 BST
 */
public class P653_TwoSumIvInputIsABst {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P653_TwoSumIvInputIsABst().new Solution();
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
        public boolean findTarget(TreeNode root, int k) {
            Set<Integer> set = new HashSet<>();
            return preOrder(root, set, k);
        }

        private boolean preOrder(TreeNode root, Set<Integer> set, int k) {
            if (root == null) {
                return false;
            }
            if (set.contains(root.val)) {
                return true;
            } else {
                set.add(k - root.val);
            }
            return preOrder(root.left, set, k) || preOrder(root.right, set, k);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
