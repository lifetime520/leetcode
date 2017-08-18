package org.cast.leetcode.problems.rangeSumQueryImmutable;

public class RangeSumQueryImmutable {
	public static int[][] PATTERN_1 = {{-2, 0, 3, -5, 2, -1}, {0, 2}};
	public static int[][] PATTERN_2 = {{-2, 0, 3, -5, 2, -1}, {2, 5}};
	public static int[][] PATTERN_3 = {{-2, 0, 3, -5, 2, -1}, {0, 5}};

	public static void main(String[] args) {
		NumArray numArray = new NumArray(PATTERN_1[0]);
		System.out.println(numArray.sumRange(PATTERN_1[1][0], PATTERN_1[1][1])); // 1

		System.out.println(numArray.sumRange(PATTERN_2[1][0], PATTERN_2[1][1])); // -1

		System.out.println(numArray.sumRange(PATTERN_3[1][0], PATTERN_3[1][1])); // -3
	}
}