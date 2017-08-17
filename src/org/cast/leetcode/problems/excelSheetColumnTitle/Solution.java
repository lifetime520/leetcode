package org.cast.leetcode.problems.excelSheetColumnTitle;

import java.util.Stack;

public class Solution {
	private final static char[] titleArr= {
			'A', 'B', 'C', 'D', 'E', 
			'F', 'G', 'H', 'I', 'J', 
			'K', 'L', 'M', 'N', 'O', 
			'P', 'Q', 'R', 'S', 'T', 
			'U', 'V', 'W', 'X', 'Y', 'Z'
			};
	public String convertToTitle(int n) {
//		return n == 0 ? "" : convertToTitle(--n / 26) + titleArr[n % 26];
		String str = "";
		while (n-- != 0) {
			str = titleArr[n % 26] + str;
			n /= 26;
		}
		return str;
	}

	public String convertToTitleByTwoLayer(int n) {
		Stack<Character> stack = new Stack<>();
//		return n == 0 ? "" : convertToTitle(--n / 26) + titleArr[n % 26];
		while (n-- != 0) {
			stack.push(titleArr[n % 26]);
			n /= 26;
		}
		final char[] tmp = new char[stack.size()];
		int idx = 0;
		while (!stack.isEmpty()) {
			tmp[idx++] = stack.pop();
		}
		return String.valueOf(stack.toArray());
	}
}
