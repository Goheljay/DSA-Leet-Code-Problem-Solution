package com.jay.leetCode.medium.sorting;

public class SortList {
    public static void main(String[] args) {

    }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode middle = findMiddle(head);
            ListNode rightList = middle.next;
            middle.next = null;
            ListNode left = sortList(head);
            ListNode right = sortList(rightList);
            return merge(left, right);
        }
    }

    public ListNode findMiddle(ListNode head) {
        ListNode current = head;
        ListNode ahead = head;
        while (ahead != null && ahead.next != null && ahead.next.next != null) {
            current = current.next;
            ahead = ahead.next.next;
        }
        return current;
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode mainNode = new ListNode();
        ListNode ahead = mainNode;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ahead.next = list1;
                list1 = list1.next;
                ahead = ahead.next;
            } else {
                ahead.next = list2;
                list2 = list2.next;
                ahead = ahead.next;
            }
        }
        ahead.next = list1 != null ? list1 : list2;
        return mainNode.next;
    }
}
