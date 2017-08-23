package org.cast.leetcode.problems.judgeRouteCircle;

public class JudgeRouteCircle {
	public static String PATTERN_1 = "UD";
	public static String PATTERN_2 = "LL";
	public static String PATTERN_3 = "LDUR";
	public static String PATTERN_4 = "DUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUD";

	public static void main(String[] args) {
		System.out.println(new Solution().judgeCircle(PATTERN_1)); // true

		System.out.println(new Solution().judgeCircle(PATTERN_2)); // false

		System.out.println(new Solution().judgeCircle(PATTERN_3)); // true

		System.out.println(new Solution().judgeCircle(PATTERN_4)); // false
	}
}