package org.cast.leetcode.problems.reverseVowelsOfAString;

public class ReverseVowelsOfAString {
	public static String PATTERN_1 = "hello";
	public static String PATTERN_2 = "leetcode";
	public static String PATTERN_3 = "apple";

	public static void main(String[] args) {
		System.out.println(new Solution().reverseVowels(PATTERN_1)); // holle

		System.out.println(new Solution().reverseVowels(PATTERN_2)); // leotcede

		System.out.println(new Solution().reverseVowels(PATTERN_3)); // eppla
	}
}