package org.cast.leetcode.problems.validAnagram;

public class ValidAnagram {
	public static String[] PATTERN_1 = {"anagram", "nagaram"};
	public static String[] PATTERN_2 = {"rat", "car"};

	public static void main(String[] args) {
		System.out.println(new Solution().isAnagram(PATTERN_1[0], PATTERN_1[1])); // true

		System.out.println(new Solution().isAnagram(PATTERN_2[0], PATTERN_2[1])); // false
	}
}