package org.cast.leetcode.problems.firstUniqueCharacterInAString;

public class FirstUniqueCharacterInAString {
	public static String PATTERN_1 = "leetcode";
	public static String PATTERN_2 = "loveleetcode";

	public static void main(String[] args) {
		System.out.println(new Solution().firstUniqChar(PATTERN_1)); // 0

		System.out.println(new Solution().firstUniqChar(PATTERN_2)); // 2
	}
}