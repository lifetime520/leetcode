package org.cast.leetcode.problems.reverseInteger;

public class ReverseInteger {
	public static int PATTERN_1 = 0;
	public static int PATTERN_2 = -100;
	public static int PATTERN_3 = 1000000003;
	public static int PATTERN_4 = 123;
	public static int PATTERN_5 = -321;

	public static void main(String[] args) {
		System.out.println(new Solution().reverse(PATTERN_1)); // 0
		System.out.println(new Solution().reverse(PATTERN_2)); // -1
		System.out.println(new Solution().reverse(PATTERN_3)); // 0
		System.out.println(new Solution().reverse(PATTERN_4)); // 321
		System.out.println(new Solution().reverse(PATTERN_5)); // -123
	}
}