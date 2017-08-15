package org.cast.leetcode.problems.powXN;

public class PowXN {
	public static Object[] PATTERN_1 = {8.0, 2};
	public static Object[] PATTERN_2 = {2.0, 10};
	public static Object[] PATTERN_3 = {0.448, 0};
	public static Object[] PATTERN_4 = {0.00001, 2147483647};
	public static Object[] PATTERN_5 = {8.88023, 3};
	public static Object[] PATTERN_6 = {2.0, -2147483648};

	public static void main(String[] args) {
		System.out.println(new Solution().myPow((double) PATTERN_1[0], (int) PATTERN_1[1])); // 644.0

		System.out.println(new Solution().myPow((double) PATTERN_2[0], (int) PATTERN_2[1])); // 1024.0

		System.out.println(new Solution().myPow((double) PATTERN_3[0], (int) PATTERN_3[1])); // 1.0

		System.out.println(new Solution().myPow((double) PATTERN_4[0], (int) PATTERN_4[1])); // 0.0

		System.out.println(new Solution().myPow((double) PATTERN_5[0], (int) PATTERN_5[1])); // 700.28148

		System.out.println(new Solution().myPow((double) PATTERN_6[0], (int) PATTERN_6[1])); // 0
	}
}