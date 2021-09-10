package com.uyaki.leetcode.editor.cn.base;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * 根据数组创建一棵树
     *
     * @param nums 数组
     * @return tree node
     */
    public static TreeNode create(Integer[] nums) {
        if (nums.length == 0) {
            return new TreeNode();
        }
        //使用双向队列存储节点
        Deque<TreeNode> nodeQueue = new LinkedList<>();
        //创建根节点
        TreeNode root = new TreeNode(nums[0]);
        nodeQueue.offer(root);
        TreeNode cur;
        //记录当前行节点的数量（注意不一定是2的幂，而是上一行非空节点*2）
        int lineNodeNum = 2;
        //记录当前行，数字在数组中的开始位置
        int startIndex = 1;
        //记录数组中剩余元素的数量
        int restLength = nums.length - 1;
        while (restLength > 0) {
            for (int i = startIndex; i < startIndex + lineNodeNum; i = i + 2) {
                //数字已经用完了
                if (i == nums.length) {
                    return root;
                }
                cur = nodeQueue.poll();
                if (nums[i] != null) {
                    cur.left = new TreeNode(nums[i]);
                    nodeQueue.offer(cur.left);
                }
                if (i + 1 == nums.length) {
                    return root;
                }
                if (nums[i + 1] != null) {
                    cur.right = new TreeNode(nums[i + 1]);
                    nodeQueue.offer(cur.right);
                }
            }
            startIndex += lineNodeNum;
            restLength -= lineNodeNum;
            lineNodeNum = nodeQueue.size() * 2;
        }
        return root;
    }

    /**
     * 前序遍历
     */
    public static void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 中序遍历
     */
    public static void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    /**
     * 后序遍历
     */
    public static void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }

    /**
     * 获取最大深度
     */
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    /**
     * 重写equals方法
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode node = (TreeNode) o;
        return val == node.val && Objects.equals(left, node.left) && Objects.equals(right, node.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}
