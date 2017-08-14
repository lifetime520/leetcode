package org.cast.leetcode.problems.powXN;

public class PowXN {
	public static Object[] PATTERN_1 = {8.0, 2};

	public static void main(String[] args) {
		System.out.println(new Solution().myPow((double) PATTERN_1[0], (int) PATTERN_1[1])); // 16.0
	}
}