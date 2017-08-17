package org.cast.leetcode.problems.reverseLinkedList;

import org.cast.leetcode.utils.ListNodeUtils;

public class ReverseLinkedList {
	public static int[] PATTERN_1 = {1,2};
	public static int[] PATTERN_2 = {};
	public static int[] PATTERN_3 = {1};

	public static void main(String[] args) {
		System.out.println(ListNodeUtils.listNodeToString(new Solution().reverseList(ListNodeUtils.generateListNode(PATTERN_1)))); // [2,1]

		System.out.println(ListNodeUtils.listNodeToString(new Solution().reverseList(ListNodeUtils.generateListNode(PATTERN_2)))); // []

		System.out.println(ListNodeUtils.listNodeToString(new Solution().reverseList(ListNodeUtils.generateListNode(PATTERN_3)))); // [1]
	}
}