package com.uyaki.leetcode.editor.cn.base;

import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * 快速创建链表
     *
     * @param nums 数组
     * @return 链表
     */
    public static ListNode create(int[] nums) {
        ListNode head = new ListNode();
        ListNode nextNode;
        nextNode = head;
        for (int num : nums) {
            ListNode node = new ListNode(num);
            nextNode.next = node;
            nextNode = nextNode.next;
        }
        return head.next;
    }

    /**
     * 打印链表
     *
     * @param listNode 链表
     */
    public static void print(ListNode listNode) {
        System.out.print("[");
        while (listNode != null) {
            System.out.print(listNode.val);
            listNode = listNode.next;
            if (listNode != null) {
                System.out.print(",");
            } else {
                System.out.print("]");
            }
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
