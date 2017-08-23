package org.cast.leetcode.problems.imageSmoother;

public class ImageSmoother {
	public static int[][] PATTERN_1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
	public static int[][] PATTERN_2 = {{1, 0}, {0, 1}, {1, 1}};
	public static int[][] PATTERN_3 = {{100, 0}, {0, 100}, {0, 100}, {100, 100}};
	public static int[][] PATTERN_4 = {{5, 5, 5, 5, 5}, {0, 5, 0, 5, 0}, {5, 5, 5, 5, 5}};

	public static void main(String[] args) {
		// {[0, 0, 0], [0, 0, 0], [0, 0, 0]}
		System.out.println(new Solution().imageSmoother(PATTERN_1));

		// [[0, 0], [0, 0], [0, 0]]
		System.out.println(new Solution().imageSmoother(PATTERN_2));

		// [[40, 40], [50, 50], [50, 50], [40, 40]]
		System.out.println(new Solution().imageSmoother(PATTERN_3));

		// [[3, 3, 3, 3, 3], [4, 3, 4, 3, 4], [3, 3, 3, 3, 3]]
		System.out.println(new Solution().imageSmoother(PATTERN_4));
	}
}