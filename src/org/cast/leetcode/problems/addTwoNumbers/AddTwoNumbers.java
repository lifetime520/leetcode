package org.cast.leetcode.problems.addTwoNumbers;

public class AddTwoNumbers {
	public static int[][] PATTERN_1 = {{2,4,3}, {5,6,4}};
	public static int[][] PATTERN_2 = {{1,6,0,3,3,6,7,2,0,1},{6,3,0,8,9,6,6,9,6,1}};
	public static int[][] PATTERN_3 = {{9,9,9}, {1}};
	public static int[][] PATTERN_4 = {{0}, {0}};
	public static int[][] PATTERN_5 = {{1,8}, {0}};

	public static void main(String[] args) {
		System.out.println(new Solution().addTwoNumbers(generate(PATTERN_1[0]), generate(PATTERN_1[1]))); // 7->0->8
		System.out.println(new Solution().addTwoNumbers(generate(PATTERN_2[0]), generate(PATTERN_2[1]))); // 7->9->0->1->3->3->4->2->7->2
		System.out.println(new Solution().addTwoNumbers(generate(PATTERN_3[0]), generate(PATTERN_3[1]))); // 0->0->0->1
		System.out.println(new Solution().addTwoNumbers(generate(PATTERN_4[0]), generate(PATTERN_4[1]))); // 0
		System.out.println(new Solution().addTwoNumbers(generate(PATTERN_5[0]), generate(PATTERN_5[1]))); // 1->8
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(val).concat(next != null ? "->".concat(next.toString()) : "");
	}
}