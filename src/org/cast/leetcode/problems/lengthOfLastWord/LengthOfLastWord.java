package org.cast.leetcode.problems.lengthOfLastWord;

public class LengthOfLastWord {
	public static String PATTERN_1 = "Hello World";
	public static String PATTERN_2 = "characters only";

	public static void main(String[] args) {
		System.out.println(new Solution().lengthOfLastWord(PATTERN_1)); // 5

		System.out.println(new Solution().lengthOfLastWord(PATTERN_2)); // 4
	}
}