package org.cast.leetcode.articles.exclusiveTimeOfFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExclusiveTimeOfFunctions {
	public static String[] PATTERN_1 = {"0:start:0", "1:start:2", "1:end:5", "0:end:6"};
	public static String[] PATTERN_2 = {"0:start:0", "1:start:2", "1:end:5", "2:start:6", "2:end:7", "0:end:9"};
	public static String[] PATTERN_3 = {"0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7"};
	public static String[] PATTERN_4 = {"0:start:0", "0:start:2", "1:start:3", "1:end:3", "2:start:4", "2:end:4", "0:end:5", "0:start:6", "0:end:6", "0:end:7"};

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Arrays.stream(PATTERN_1).forEach(str -> list.add(str));
		System.out.println(Arrays.toString(new Solution().exclusiveTime(2, list))); // [3, 4]

		Arrays.stream(PATTERN_2).forEach(str -> list.add(str));
		System.out.println(Arrays.toString(new Solution().exclusiveTime(3, list))); // [4, 4, 2]

		Arrays.stream(PATTERN_3).forEach(str -> list.add(str));
		System.out.println(Arrays.toString(new Solution().exclusiveTime(1, list))); // [8]

		Arrays.stream(PATTERN_4).forEach(str -> list.add(str));
		System.out.println(Arrays.toString(new Solution().exclusiveTime(3, list))); // [8]
	}
}
