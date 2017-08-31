package org.cast.leetcode.problems.addBinary;

public class AddBinary {
	public static String[] PATTERN_1 = new String[] {"11", "1"};
	public static String[] PATTERN_2 = new String[] {"10111", "1001"};
	public static String[] PATTERN_3 = new String[] {"0", "1"};

	public static void main(String[] args) {
		System.out.println(new Solution().addBinary(PATTERN_1[0], PATTERN_1[1])); // 100

		System.out.println(new Solution().addBinary(PATTERN_2[0], PATTERN_2[1])); // 101111

		System.out.println(new Solution().addBinary(PATTERN_3[0], PATTERN_3[1])); // 1
	}
}