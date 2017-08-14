package org.cast.leetcode.problems.countAndSay;

public class CountAndSay {
	public static int PATTERN_1 = 1;
	public static int PATTERN_2 = 11;
	public static int PATTERN_3 = 21;
	public static int PATTERN_4 = 1211;
	public static int PATTERN_5 = 111221;

	public static void main(String[] args) {
		System.out.println(new Solution().countAndSay(PATTERN_1)); // 11

		System.out.println(new Solution().countAndSay(PATTERN_2)); // 21

		System.out.println(new Solution().countAndSay(PATTERN_3)); // 1211

		System.out.println(new Solution().countAndSay(PATTERN_4)); // 1231

		System.out.println(new Solution().countAndSay(PATTERN_5)); // 2241
	}
}