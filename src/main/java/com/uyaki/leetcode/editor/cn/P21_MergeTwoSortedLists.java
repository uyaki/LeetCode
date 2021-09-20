//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
// 
//
// 示例 2： 
//
// 
//输入：l1 = [], l2 = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 两个链表的节点数目范围是 [0, 50] 
// -100 <= Node.val <= 100 
// l1 和 l2 均按 非递减顺序 排列 
// 
// Related Topics 递归 链表 👍 1920 👎 0


package com.uyaki.leetcode.editor.cn;

import com.uyaki.leetcode.editor.cn.base.ListNode;

/**
 * 合并两个有序链表
 */
public class P21_MergeTwoSortedLists {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode ans = new ListNode(0);
            ListNode temp = ans;
            while (l1 != null || l2 != null) {
                int num1 = Integer.MAX_VALUE;
                int num2 = Integer.MAX_VALUE;
                if (l1 != null) {
                    num1 = l1.val;
                }
                if (l2 != null) {
                    num2 = l2.val;
                }
                if (num1 < num2) {
                    l1 = l1.next;
                } else {
                    l2 = l2.next;
                }
                ListNode minNode = new ListNode(Math.min(num1, num2));
                temp.next = minNode;
                temp = temp.next;
            }
            return ans.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
