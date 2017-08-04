package org.cast.leetcode.problems.reversePairs;

public class ReversePairs {
	public static int[] PATTERN_1 = {1, 3, 2, 3, 1};
	public static int[] PATTERN_2 = {2, 4, 3, 5, 1};
	public static int[] PATTERN_3 = {-5, -5};
	public static int[] PATTERN_4 = {2566,5469,1898,127,2441,4612,2554,5269,2785,5093,3931,2532,1195,1101,1334,2124,1156,3400,747,5046,3325,4039,1858,3655,4904,2255,1822,972,5175,2880,2776,4900,2172,3808,3441,4153,3969,3116,1913,5129,4839,4586,752,1804,1970,4052,5016,3781,5000,4331,2762,4886,826,1888,1175,2729,1610,1634,2773,543,2617,4990,3225,2962,4963,3575,3742,3424,3246,5067,133,2713};

	public static void main(String[] args) {
		System.out.println(new Solution().reversePairs(PATTERN_1)); // 2

		System.out.println(new Solution().reversePairs(PATTERN_2)); // 3

		System.out.println(new Solution().reversePairs(PATTERN_3)); // 1

		System.out.println(new Solution().reversePairs(PATTERN_4)); // 1
	}
}