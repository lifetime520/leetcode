package org.cast.leetcode.problems.validParentheses;

public class ValidParentheses {
	public static String PATTERN_1 = "[";
	public static String PATTERN_2 = "";
	public static String PATTERN_3 = "(]";
	public static String PATTERN_4 = "()[()]{[()]}";
	public static String PATTERN_5 = "}";

	public static void main(String[] args) {
		System.out.println(new Solution().isValid(PATTERN_1)); // false

		System.out.println(new Solution().isValid(PATTERN_2)); // true

		System.out.println(new Solution().isValid(PATTERN_3)); // false

		System.out.println(new Solution().isValid(PATTERN_4)); // true

		System.out.println(new Solution().isValid(PATTERN_5)); // false
	}
}