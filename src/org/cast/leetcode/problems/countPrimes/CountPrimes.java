package org.cast.leetcode.problems.countPrimes;

public class CountPrimes {
	public static int PATTERN_1 = 0;
	public static int PATTERN_2 = 11;
	public static int PATTERN_3 = 13;

	public static void main(String[] args) {
		System.out.println(new Solution().countPrimes(PATTERN_1)); // 0

		System.out.println(new Solution().countPrimes(PATTERN_2)); // 4

		System.out.println(new Solution().countPrimes(PATTERN_3)); // 5
	}
}