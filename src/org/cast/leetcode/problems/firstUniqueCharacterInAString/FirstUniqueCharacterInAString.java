package org.cast.leetcode.problems.firstUniqueCharacterInAString;

public class FirstUniqueCharacterInAString {
	public static String PATTERN_1 = "leetcode";
	public static String PATTERN_2 = "loveleetcode";
	public static String PATTERN_3 = "";
	public static String PATTERN_4 = "cc";

	public static void main(String[] args) {
		System.out.println(new Solution().firstUniqChar(PATTERN_1)); // 0

		System.out.println(new Solution().firstUniqChar(PATTERN_2)); // 2

		System.out.println(new Solution().firstUniqChar(PATTERN_3)); // -1

		System.out.println(new Solution().firstUniqChar(PATTERN_4)); // -1
	}
}