package org.cast.leetcode.problems.hummingDistance;

public class HummingDistance {
	public static int[] PATTERN_1 = {1, 4};
	public static int[] PATTERN_2 = {4, 4};
	public static int[] PATTERN_3 = {1, 32};

	public static void main(String[] args) {
		System.out.println(new Solution().hammingDistance(PATTERN_1[0], PATTERN_1[1])); // 2

		System.out.println(new Solution().hammingDistance(PATTERN_2[0], PATTERN_2[1])); // 0

		System.out.println(new Solution().hammingDistance(PATTERN_3[0], PATTERN_3[1])); // 5
	}
}