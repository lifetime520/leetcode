package org.cast.leetcode.problems.addTwoNumbers;

public class Solution {
	final ListNode DEFAULT = new ListNode(0);

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum = l1.val + l2.val;
		final ListNode root = new ListNode(sum % 10);
		ListNode idx = root;
		int overflow = sum / 10;
		while (true) {
			l1 = l1.next == null ? DEFAULT : l1.next;
			l2 = l2.next == null ? DEFAULT : l2.next;
			if (overflow == 0 && (l1 == DEFAULT && l2 == DEFAULT))
				break;
			sum = l1.val + l2.val + overflow;
			idx = (idx.next = new ListNode(sum % 10)).next;
			overflow = sum / 10;
		}
		return root;
	}
}

class ArraySolution {
	final ListNode DEFAULT = new ListNode(0);
	final int[] calcTen = {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1};
	final int[] calcOne = {0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9};

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum = l1.val + l2.val;
		final ListNode root = new ListNode(calcOne[sum]);
		ListNode idx = root;
		int overflow = calcTen[sum];
		while (true) {
			l1 = l1.next == null ? DEFAULT : l1.next;
			l2 = l2.next == null ? DEFAULT : l2.next;
			if ((l1 == DEFAULT && l2 == DEFAULT) && overflow == 0)
				break;
			sum = l1.val + l2.val + overflow;
			idx.next = new ListNode(calcOne[sum]);
			overflow = calcTen[sum];
			idx = idx.next;
		}
		return root;
	}
}

class RecursiveSolution {
	ListNode DEFAULT = new ListNode(0);

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return add(null, l1, l2, 0);
	}

	private ListNode add(ListNode ans, ListNode l1, ListNode l2, int fixed) {
		int sum = l1.val + l2.val + fixed;
		DEFAULT.next = null;
		if (sum == 0 && ans != null && (l1.next == null && l2.next == null))
			return ans;
		if (l1.next == null)
			l1.next = DEFAULT;
		if (l2.next == null)
			l2.next = DEFAULT;
		if (ans == null) {
			return add(new ListNode(sum % 10), l1.next, l2.next, sum / 10);
		} else {
			ans.next = add(new ListNode(sum % 10), l1.next, l2.next, sum / 10);
			return ans;
		}
	}
}
