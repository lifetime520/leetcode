package org.cast.leetcode.problems.reverseInteger;

public class Solution {
	public int reverse(int x) {
		String inverse = new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString();
		if (x < 0) {
			inverse = "-".concat(inverse);
		}

		try {
			return Integer.valueOf(inverse);
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}
