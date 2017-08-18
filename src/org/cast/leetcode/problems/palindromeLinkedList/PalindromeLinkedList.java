package org.cast.leetcode.problems.palindromeLinkedList;

import org.cast.leetcode.utils.ListNodeUtils;

public class PalindromeLinkedList {
	public static int[] PATTERN_1 = {1,2,1};
	public static int[] PATTERN_2 = {};
	public static int[] PATTERN_3 = {1};

	public static void main(String[] args) {
		System.out.println(new Solution().isPalindrome(ListNodeUtils.generateListNode(PATTERN_1))); // true

		System.out.println(new Solution().isPalindrome(ListNodeUtils.generateListNode(PATTERN_2))); // []

		System.out.println(new Solution().isPalindrome(ListNodeUtils.generateListNode(PATTERN_3))); // [1]
	}
}