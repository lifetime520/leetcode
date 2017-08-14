package org.cast.leetcode.problems.mergeTwoSortedLists;

public class MergeTwoSortedLists {
	public static int[][] PATTERN_1 = {{},{}};
	public static int[][] PATTERN_2 = {{0,1,3},{2}};
	public static int[][] PATTERN_3 = {{0,1,3},{}};

	public static void main(String[] args) {
		System.out.println(new Solution().mergeTwoLists(generate(PATTERN_1[0][0]), generate(PATTERN_1[1][0]))); // []

		System.out.println(new Solution().mergeTwoLists(generate(PATTERN_2[0][0]), generate(PATTERN_2[1][0]))); // []

		System.out.println(new Solution().mergeTwoLists(generate(PATTERN_3[0][0]), generate(PATTERN_3[1][0]))); // []
	}

	public static ListNode generate(int... nums) {
		ListNode list = null;
		ListNode last = null;
		for (int i : nums) {
			if (list == null) {
				list = new ListNode(i);
				last = list;
			} else {
				last.next = new ListNode(i);
				last = last.next;
			}
		}
		return list;
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}