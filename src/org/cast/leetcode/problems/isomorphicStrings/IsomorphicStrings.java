package org.cast.leetcode.problems.isomorphicStrings;

public class IsomorphicStrings {
	public static String[] PATTERN_1 = {"egg", "add"};
	public static String[] PATTERN_2 = {"for", "bar"};
	public static String[] PATTERN_3 = {"paper", "title"};
	public static String[] PATTERN_4 = {"papper", "title"};
	public static String[] PATTERN_5 = {"queue", "banan"};

	public static void main(String[] args) {
		System.out.println(new Solution().isIsomorphic(PATTERN_1[0], PATTERN_1[1])); // true

		System.out.println(new Solution().isIsomorphic(PATTERN_2[0], PATTERN_2[1])); // true

		System.out.println(new Solution().isIsomorphic(PATTERN_3[0], PATTERN_3[1])); // true

		System.out.println(new Solution().isIsomorphic(PATTERN_4[0], PATTERN_4[1])); // false

		System.out.println(new Solution().isIsomorphic(PATTERN_5[0], PATTERN_5[1])); // true
	}
}