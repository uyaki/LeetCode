package com.uyaki.leetcode.editor.cn.base;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * n 叉树
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

    /**
     * 根据 null切割层级，第一个null表示
     *
     * @param nums 数组
     * @return root
     */
    public static Node create(Integer[] nums) {
        if (nums == null || nums.length == 0) {
            return new Node();
        }
        // 使用双向队列存储节点
        Deque<Node> nodeDeque = new LinkedList<>();
        Node root = new Node(nums[0]);
        nodeDeque.offer(root);
        Node cur;
        //记录上一行可被挂载节点数量
        int preLineNodeNum = 1;
        //记录当前行，数字在数组中的开始位置
        int index = 2;
        //记录数组中剩余元素的数量
        int restLength = nums.length - 2;
        // 取出一个节点用于挂载 childnode
        cur = nodeDeque.poll();
        while (restLength > 0) {
            // 记录当前行已经使用元素数量；
            int curLineNodeNum = 0;
            List<Node> list = new ArrayList<>();
            while (preLineNodeNum > 0 && index < nums.length) {

                if (nums[index] == null && nums[index - 1] == null) {
                    // 当前元素为null且上一个元素也为null，则说明cur.children == null
                    assert cur != null;
                    cur.children = null;
                    preLineNodeNum--;
                    // 可用父节点-1
                    cur = nodeDeque.poll();
                } else if (nums[index] == null && nums[index - 1] != null) {
                    // 当前元素为null且上一个不为null，则说明cur.children == list,清空list
                    assert cur != null;
                    cur.children = list;
                    preLineNodeNum--;
                    // 可用父节点-1
                    cur = nodeDeque.poll();
                    list = new ArrayList<>();
                } else {
                    Node node = new Node(nums[index]);
                    nodeDeque.offer(node);
                    list.add(node);
                    curLineNodeNum++;
                }
                if (index == nums.length - 1) {
                    assert cur != null;
                    cur.children = list;
                }
                index++;
                restLength--;
            }
            preLineNodeNum = curLineNodeNum;
        }
        return root;
    }

    /**
     * 前序遍历
     *
     * @param node
     */
    public static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrderChild(node);
    }

    private static void preOrderChild(Node node) {
        System.out.print(node.val + " ");
        for (Node child : node.children) {
            preOrderChild(child);
        }
    }

    /**
     * 后序遍历
     *
     * @param node
     */
    public static void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrderChild(node);
    }

    private static void postOrderChild(Node node) {
        for (Node child : node.children) {
            postOrderChild(child);
        }
        System.out.print(node.val + " ");
    }

    /**
     * 层序遍历
     *
     * @param node
     */
    public static void levelOrder(Node node) {
        if (node == null) {
            return;
        }
        int level = 0;
        Deque<Node> queue = new LinkedList<>();
        queue.offer(node);
        Node temp;
        while (!queue.isEmpty()) {
            System.out.print("level " + level + " : ");
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                temp = queue.pop();
                System.out.print(temp.val + " ");
                // 6. 将非空子树加入queue
                if (temp.children != null) {
                    for (Node item : temp.children) {
                        queue.offer(item);
                    }
                }

            }
            System.out.println();
            level++;
        }
    }

}
