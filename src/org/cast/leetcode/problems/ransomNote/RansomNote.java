package org.cast.leetcode.problems.ransomNote;

public class RansomNote {
	public static String[] PATTERN_1 = {"a", "b"};
	public static String[] PATTERN_2 = {"aa", "ab"};
	public static String[] PATTERN_3 = {"aa", "aab"};
	public static String[] PATTERN_4 = {"apple", "aple"};
	public static String[] PATTERN_5 = {"apple", "aplep"};

	public static void main(String[] args) {
		System.out.println(new Solution().canConstruct(PATTERN_1[0], PATTERN_1[1])); // false

		System.out.println(new Solution().canConstruct(PATTERN_2[0], PATTERN_2[1])); // false

		System.out.println(new Solution().canConstruct(PATTERN_3[0], PATTERN_3[1])); // true

		System.out.println(new Solution().canConstruct(PATTERN_4[0], PATTERN_4[1])); // false

		System.out.println(new Solution().canConstruct(PATTERN_5[0], PATTERN_5[1])); // true
	}
}