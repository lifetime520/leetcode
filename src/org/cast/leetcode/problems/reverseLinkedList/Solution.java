package org.cast.leetcode.problems.reverseLinkedList;

import java.util.Stack;

import org.cast.leetcode.datasturct.ListNode;

public class Solution {
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}

	public ListNode reverseListOfTwoLayer(ListNode head) {
		if (head == null) return head;
		Stack<ListNode> stack = new Stack<>();
		ListNode tmpNode = head;
		do {
			stack.push(tmpNode);
			tmpNode = tmpNode.next;
		} while (tmpNode != null);

		ListNode bottom = stack.pop();
		tmpNode = bottom;
		while (!stack.isEmpty()) {
			tmpNode.next = stack.pop();
			tmpNode = tmpNode.next;
		}
		tmpNode.next = null;
		return bottom;
	}
}