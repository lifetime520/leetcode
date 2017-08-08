package org.cast.leetcode.problems.interleavingString;

public class InterleavingString {
	public static String[] PATTERN_1 = {"aabcc", "dbbca", "aadbbcbcac"};
	public static String[] PATTERN_2 = {"", "", ""};
	public static String[] PATTERN_3 = {"a", "", "a"};
	public static String[] PATTERN_4 = {"", "", "a"};
	public static String[] PATTERN_5 = {"a", "a", ""};
	public static String[] PATTERN_6 = {
			"bbbbbabbbbabaababaaaabbababbaaabbabbaaabaaaaababbbababbbbbabbbbababbabaabababbbaabababababbbaaababaa",
			"babaaaabbababbbabbbbaabaabbaabbbbaabaaabaababaaaabaaabbaaabaaaabaabaabbbbbbbbbbbabaaabbababbabbabaab",
			"babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbbaaaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababbbbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabbbbbabbbbaabbabaabbbbabaaabbababbabbabbab"
	};
	public static String[] PATTERN_7 = {"a", "", "c"};
	public static String[] PATTERN_8 = {"db", "b", "cbb"};

	public static void main(String[] args) {
		System.out.println(new Solution().isInterleave(PATTERN_1[0], PATTERN_1[1], PATTERN_1[2])); // true

		System.out.println(new Solution().isInterleave(PATTERN_2[0], PATTERN_2[1], PATTERN_2[2])); // true

		System.out.println(new Solution().isInterleave(PATTERN_3[0], PATTERN_3[1], PATTERN_3[2])); // true

		System.out.println(new Solution().isInterleave(PATTERN_4[0], PATTERN_4[1], PATTERN_4[2])); // false

		System.out.println(new Solution().isInterleave(PATTERN_5[0], PATTERN_5[1], PATTERN_5[2])); // false

		System.out.println(new Solution().isInterleave(PATTERN_6[0], PATTERN_6[1], PATTERN_6[2])); // false

		System.out.println(new Solution().isInterleave(PATTERN_7[0], PATTERN_7[1], PATTERN_7[2])); // false

		System.out.println(new Solution().isInterleave(PATTERN_8[0], PATTERN_8[1], PATTERN_8[2])); // false
	}
}