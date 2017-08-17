package org.cast.leetcode.utils;

import org.cast.leetcode.datasturct.ListNode;

public class ListNodeUtils {
	public static ListNode generateListNode(int... vals) {
		ListNode node = null;
		ListNode head = null;
		for (int i : vals) {
			if (node == null) {
				head = new ListNode(i);
				node = head;
			} else {
				node.next = new ListNode(i);
				node = node.next;
			}
		}
		return head;
	}

	public static String listNodeToString(ListNode head) {
		if (head == null) return "[]";
		StringBuilder sb = new StringBuilder();
		do {
			sb.append(",").append(head.val);
			head = head.next;
		} while (head != null);
		return "[" + sb.substring(1) + "]";
	}
}