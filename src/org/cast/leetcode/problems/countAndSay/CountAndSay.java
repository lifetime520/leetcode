package org.cast.leetcode.problems.countAndSay;

public class CountAndSay {
	public static int PATTERN_1 = 1;
	public static int PATTERN_2 = 2;
	public static int PATTERN_3 = 3;
	public static int PATTERN_4 = 4;
	public static int PATTERN_5 = 5;
	public static int PATTERN_6 = 6;
	public static int PATTERN_7 = 7;
	public static int PATTERN_8 = 8;

	public static void main(String[] args) {
		System.out.println(new Solution().countAndSay(PATTERN_1)); // 1

		System.out.println(new Solution().countAndSay(PATTERN_2)); // 11

		System.out.println(new Solution().countAndSay(PATTERN_3)); // 21

		System.out.println(new Solution().countAndSay(PATTERN_4)); // 1211

		System.out.println(new Solution().countAndSay(PATTERN_5)); // 111221

		System.out.println(new Solution().countAndSay(PATTERN_6)); // 312211

		System.out.println(new Solution().countAndSay(PATTERN_7)); // 13112221

		System.out.println(new Solution().countAndSay(PATTERN_8)); // 1113213211
	}
}