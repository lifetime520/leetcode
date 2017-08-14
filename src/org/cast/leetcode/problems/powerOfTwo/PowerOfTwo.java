package org.cast.leetcode.problems.powerOfTwo;

public class PowerOfTwo {
	public static int PATTERN_1 = 0;
	public static int PATTERN_2 = 1;
	public static int PATTERN_3 = 65536;
	public static int PATTERN_4 = 65538;
	public static int PATTERN_5 = 16777216;
	public static int PATTERN_6 = 167772168;

	public static void main(String[] args) {
		System.out.println(new Solution().isPowerOfTwo(PATTERN_1)); // true

		System.out.println(new Solution().isPowerOfTwo(PATTERN_2)); // true

		System.out.println(new Solution().isPowerOfTwo(PATTERN_3)); // true

		System.out.println(new Solution().isPowerOfTwo(PATTERN_4)); // false

		System.out.println(new Solution().isPowerOfTwo(PATTERN_5)); // true

		System.out.println(new Solution().isPowerOfTwo(PATTERN_6)); // false
	}
}