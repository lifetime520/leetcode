package org.cast.leetcode.problems.climbingStairs;

public class ClimbingStairs {
	public static int PATTERN_1 = 1;
	public static int PATTERN_2 = 2;
	public static int PATTERN_3 = 3;
	public static int PATTERN_4 = 9;

	public static void main(String[] args) {
		System.out.println(new Solution().climbStairs(PATTERN_1)); // 1

		System.out.println(new Solution().climbStairs(PATTERN_2)); // 2

		System.out.println(new Solution().climbStairs(PATTERN_3)); // 3

		System.out.println(new Solution().climbStairs(PATTERN_4)); // 55
	}
}