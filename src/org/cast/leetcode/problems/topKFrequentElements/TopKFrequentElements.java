package org.cast.leetcode.problems.topKFrequentElements;

public class TopKFrequentElements {
	public static int[][] PATTERN_1 = {{1, 1, 1, 2, 2, 3}, {2}};
	public static int[][] PATTERN_2 = {{9, 2, 2, 2, 1, 9, 9, 9, 6, 6}, {2}};
	public static int[][] PATTERN_3 = {{2,3,4,1,4,0,4,-1,-2,-1}, {2}};

	public static void main(String[] args) {
		System.out.println(new Solution().topKFrequent(PATTERN_1[0], PATTERN_1[1][0])); // [1, 2]

		System.out.println(new Solution().topKFrequent(PATTERN_2[0], PATTERN_2[1][0])); // [9, 2]

		System.out.println(new Solution().topKFrequent(PATTERN_3[0], PATTERN_3[1][0])); // [4, -1]
	}
}