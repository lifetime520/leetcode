package org.cast.leetcode.problems.excelSheetColumnTitle;

public class ExcelSheetColumnTitle {
	public static int PATTERN_1 = 1;
	public static int PATTERN_2 = 2;
	public static int PATTERN_3 = 3;
	public static int PATTERN_4 = 27;
	public static int PATTERN_5 = 28;

	public static void main(String[] args) {
		System.out.println(new Solution().convertToTitle(PATTERN_1)); // A

		System.out.println(new Solution().convertToTitle(PATTERN_2)); // B

		System.out.println(new Solution().convertToTitle(PATTERN_3)); // C

		System.out.println(new Solution().convertToTitle(PATTERN_4)); // AA

		System.out.println(new Solution().convertToTitle(PATTERN_5)); // AB
	}
}